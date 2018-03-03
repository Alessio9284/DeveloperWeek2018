/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asl.alpha;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j.manalo
 */
public class creaHTMLTest
{
    
    public creaHTMLTest()
    {
        
    }
    
    @Test
    public void test1()
    {
         creaHTML file = new creaHTML("../HTML/indexMANALO.html");
         assertEquals(file.getNomefile() , "../HTML/indexMANALO.html");     
    }
    
    @Test
    public void test2()
    {
         creaHTML file = new creaHTML("../HTML/indexMANALO.html");
         assertTrue(file.isEsiste());   
    }
    
    @Test
    public void test3()
    {
         creaHTML file = new creaHTML("");
         assertFalse(file.isEsiste());   
    }
}
