public class Tracinhos implements Cloneable
{
    private char texto[];

    public Tracinhos (int qtd) throws Exception
    {
        if(qtd < 0)
        {
            throw new Exception("Quantidade nao pode ser negativa");
        }
        else
        {
            texto = new char[qtd];

            for(int indice = 0; indice < qtd; indice++)
            {
                this.texto[indice] = '_';
            }
        }
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if(posicao < 0 || posicao > this.texto.length)
        {
            throw new Exception("Posicao nao existe");
        }
        else
        {
            this.texto[posicao] = letra;
        }
    }

    public boolean isAindaComTracinhos()
    {
        boolean isTrue = false;

        for(int i = 0; i < this.texto.length; i++)
        {
            if(this.texto[i] == '_')
            {
                isTrue = true;
            }
        }
        return isTrue;
    }

    @Override
    public String toString ()
    {
        String palavraTracinho = "";

        for(int i = 0; i < this.texto.length; i++)
        {
            palavraTracinho += this.texto[i] + " ";
        }

        return palavraTracinho;
    }

    
    @Override
    public boolean equals (Object obj)
    {
        if (this==obj)    
        {
            return true;
        }

        if (obj==null)  
        {
            return false;
        }

        if (obj.getClass() != Tracinhos.class) 
        {
            return false;
        }

        if (this.texto != ((Tracinhos)obj).texto)
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode ()
    {      
        int ret=10;
        
        ret = 7*ret + new String (this.texto).hashCode();
        
        if (ret<0) ret = -ret;
        
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception
    {
        if(t == null)
            throw new Exception("Erro 404 Tracinhos");

        this.texto =  t.texto;
    }

    public Object clone ()
    {
        Tracinhos ret=null;

        try
        {
            ret = new Tracinhos (this);
        }
        catch (Exception erro)
        {} 

        return ret;
    }
}
