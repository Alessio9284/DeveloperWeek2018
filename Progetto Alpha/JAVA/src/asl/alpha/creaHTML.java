package asl.alpha;

import java.io.*;

/**
 *
 * @author j.manalo
 */
public class creaHTML {
        
    public String nomefile;
    private boolean esiste;
  
    public creaHTML(String nomefile)
    {
        this.nomefile = nomefile;
        
        try
        {
            PrintStream scrivi = new PrintStream(new FileOutputStream(nomefile));
            scrivi.println("<html> <head><title>PROVA</title></head> <body><h1>PROOOOVAAAA</h1></body> </html>");
            esiste = true;
        }
        catch(FileNotFoundException e)
        {
            esiste = false;
            System.out.println(e.fillInStackTrace());
        }
    }

    public String getNomefile()
    {
        return nomefile;
    }

    public boolean isEsiste()
    {
        return esiste;
    }
}