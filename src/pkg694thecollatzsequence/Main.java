 
package pkg694thecollatzsequence;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author alexandre
 */


class Main {

    static String ReadLn (int maxLg)  // utility function to read from stdin
    {
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  // eof
        return (new String (lin, 0, lg));
    }
     
    public static void main(String[] args) {
        
        Main myWork = new Main(); 
        myWork.Begin();              
        System.exit(0);
        
    }
    
    void Begin()
    {
        
        long a;//valor pode passar para mais de um inteiro logo usar long.
        int b;
        int cont = 1;
        int contLoop = 0;
        long limite = 0;
        String inputLine ="";
        StringTokenizer idata;
        boolean checkStop = false;
        
        while(!checkStop){
            
             inputLine = Main.ReadLn (255);
             idata = new StringTokenizer (inputLine);
             a = Integer.parseInt (idata.nextToken());
             limite = a;
             b = Integer.parseInt (idata.nextToken());
             cont = 1;
             contLoop++;
             
             if (a != -1 && b != -1){
                 
                 while(a <= b && a > 1) {
                     
                     if(a % 2 == 0) {
                     
                     cont++;
                     a = a/2;
                     
                 } else {
                     
                     if(3*a + 1 <= b) {
                         
                         cont++;
                         a = 3*a + 1;
                         
                     } else {
                         
                         a = b + 1;
                         
                     }                   
                     
                  }   
                     
                 }
                 
                 System.out.println("Case " +contLoop + ": " +  "A = " +  limite + ", limit = " + b + ", number of terms = " + cont);
                 
             } else {
                 
                 checkStop = true;
                 
             }
            
            
        }
        
       
        
    }
    
}
