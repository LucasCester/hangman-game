public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas()
    {
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        boolean isTrue = false;

        for(int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            if(letrasJaDigitadas.charAt(i) == letra)
            {
                isTrue = true;
            }
        }
        return isTrue;
    }

    public void registre (char letra) throws Exception
    {
        if(this.isJaDigitada(letra))
        {
            throw new Exception("Voce ja digitou essa letra, por favor tente outra");
        }
        else
        {
            this.letrasJaDigitadas += letra + "," + " ";
        }
    }

    @Override
    public String toString()
    {
        return this.letrasJaDigitadas;
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

        if (obj.getClass() != ControladorDeLetrasJaDigitadas.class)
        {
            return false;
        }

        if (this.letrasJaDigitadas != ((ControladorDeLetrasJaDigitadas)obj).letrasJaDigitadas)
        {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode ()
    {
        int ret=10;
        
        ret = 7*ret + new String (this.letrasJaDigitadas).hashCode();
        
        if (ret<0) ret = -ret;
        
        return ret;
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception
    {
        if (controladorDeLetrasJaDigitadas==null)
            throw new Exception ("Erro 404 controladorDeLetrasJaDigitadas");

        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas ret=null;

        try
        {
            ret = new ControladorDeLetrasJaDigitadas (this);
        }
        catch (Exception erro)
        {} 

        return ret;
    }
}
