public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax < 0)
        {
            throw new Exception("Quantidada maximo de erros negativa");
        }
        else
        {
            this.qtdMax = qtdMax;
        }
    }

    public void registreUmErro () throws Exception
    {
        if(this.qtdErr == this.qtdMax)
            throw new Exception("Quantidade max de erros atingido");
        else
            this.qtdErr = this.qtdErr + 1;
    }

    public boolean isAtingidoMaximoDeErros()
    {
        if(this.qtdErr == this.qtdMax)
            return true;
        else
            return false;
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(this==obj)
        {
            return true;
        }

        if(obj==null)
        {
            return false;
        }

        if(obj.getClass() != ControladorDeErros.class)
        {
            return false;
        }

        if(this.qtdMax != ((ControladorDeErros)obj).qtdMax)
        {
            return false;
        }

        if(this.qtdErr != ((ControladorDeErros)obj).qtdErr)
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode ()
    {      
        int ret=10;

        ret = 5*ret + new Integer (this.qtdErr).hashCode();
        ret = 7*ret + new Integer (this.qtdMax).hashCode();
        
        if (ret<0) ret = -ret;
        
        return ret;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
        if(c == null)
            throw new Exception("Erro 404 ControladorDeErro");
        
        this.qtdErr = c.qtdErr;
        this.qtdMax = c.qtdMax;
    }

    public Object clone ()
    {
        ControladorDeErros ret=null;

        try
        {
            ret = new ControladorDeErros (this);
        }
        catch (Exception erro)
        {} 

        return ret;
    }
}
