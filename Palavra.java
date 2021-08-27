public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if (texto.length() < 0 || texto == null)
        {
            throw new Exception ("Nenhuma palavra foi encontrada");
        }
        else
        {
            this.texto = texto;
        }
    }

    public int getQuantidade (char letra)
    {
        int count = 0;
        for(int i = 0; i < this.texto.length(); i++)
        {
            if(this.texto.charAt(i) != ' ' && this.texto.charAt(i) == letra)
            {
                count++;
            }
        }
        return count;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int metaLetra = -1;

        for(int indice = 0; indice < this.getTamanho(); indice++)
        {
            if(this.texto.charAt(indice) == letra)
            {
                metaLetra++;
            }

            if(metaLetra == i)
            {                
                return this.texto.indexOf(letra, indice);
            }
        }

        throw new Exception("Erro 404, Iézima aparição not found");
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
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

        if (obj.getClass() != Palavra.class)
        {
            return false;
        }

        if (this.texto != ((Palavra)obj).texto)
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

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
