package it.iiscorni.alternanza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ro.pippo.core.Application;

public class PippoApplication extends Application
{
    @Override
    protected void onInit()
    {
        addPublicResourceRoute();
        addWebjarsResourceRoute();
        ArrayList<Registrazione> r = new ArrayList();
        
        try
        {
            File file = new File("../../../resources/public/index.html");
            PrintWriter scrivi = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            
            //PARTE INIZIALE
            scrivi.println("<!DOCTYPE html>\n" +
                            "<html lang='it-IT'>\n" +
                            "    <head>\n" +
                            "        <title>Home Page</title>\n" +
                            "    </head>\n" +
                            "    <body>\n" +
                            "        <h1>ciao1</h1>");
            
            //REGISTRAZIONI DA INSERIRE
            /*
            while(true)
            {
                r1.leggi();
                r.add(e);
            }
            
            for(Registrazione a : r)
            {
                scrivi.println("<td>" + a.idregistrazione + "</td>);
                scrivi.println("<td>" + a.data + "</td>);
                scrivi.println("<td>" + a.tipo + "</td>);
                scrivi.println("<td>" + a.importo + "</td>);
                scrivi.println("<td>" + a.idazienda + "</td>);
                scrivi.println("<td>" + a.azienda + "</td>);
            }
            */
            
            //PARTE FINALE
            scrivi.println("</body>"
                    + "</html>");
            
            scrivi.flush();
            scrivi.close();
        }
        catch (IOException e)
        {
            System.out.println(e.fillInStackTrace());
        }
        
        GET("/public", routeContext -> {
            Registrazione r1 = new Registrazione(0, "", "", 0, 0, "");
            r1.setIdregistrazione(routeContext.getParameter("ID").toInt());
            r1.setData(routeContext.getParameter("D").toString());
            r1.setTipo(routeContext.getParameter("T").toString());
            r1.setImporto(routeContext.getParameter("I").toFloat());
            r1.setIdazienda(routeContext.getParameter("IDA").toInt());
            r1.setAzienda(routeContext.getParameter("A").toString());
            
            try
            {
                PrintWriter scrivi = new PrintWriter(new BufferedWriter(new FileWriter(new File("file.json"), true)));
                scrivi.println(routeContext.json().toString());
            }
            catch (IOException ex) { System.out.println(ex.fillInStackTrace()); }
        });
    }
}