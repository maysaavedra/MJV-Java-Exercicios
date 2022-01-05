package form.util;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Set;

import form.model.Formulario;

public class GravarDados {
	private Formatter arquivo;

    public void abrir()
    {
        try
        {
            arquivo = new Formatter("Registro de Dados do Formulario.txt");
        }
        catch( SecurityException semPermissao) 
        {
            System.err.println(" Sem permissao para escrever no arquivo ");
            System.exit(1); //exit(0) é sucesso, outro número significa que terminou com problemas
        }
        catch( FileNotFoundException arquivoInexistente )
        {
            System.err.println(" Arquivo inexistente ou arquivo não pode ser criado");
            System.exit(1);
        }
    }
     
    public void escrever(Set<Formulario> formularios)
    {
        try
        {
            arquivo.format("" + formularios);
            System.out.println("Impressão em arquivo realizada com sucesso");
        }
        catch(FormatterClosedException formatoDesconhecido)
        {
                    System.err.println("Erro ao escrever");
                    return;
        }
        catch(NoSuchElementException excecaoElemento)
        {
            System.err.println("Entrada invalida. Por exemplo, era pra ser uma string, mas foi um inteiro");
        }
     
    }
 
   public void fechar()
   {
       arquivo.close();
 }


}
