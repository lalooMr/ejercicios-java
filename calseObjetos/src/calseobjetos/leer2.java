
package leer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leer2 {
     private static  InputStreamReader lalo= new InputStreamReader(System.in);
   static BufferedReader lp = new BufferedReader( lalo ) ;
          

    public static int pediriInt() {

        try {
            return Integer.parseInt(lp.readLine());
    }      catch (IOException E) {
            return 0;
    }
    }

    public static float pedirFloat() {

        try {
            return Float.parseFloat(lp.readLine());
    }      catch (IOException E) {
            return 0;
    }

    }

    public static double pediriDouble() {

        try {
            return Double.parseDouble(lp.readLine());
    }      catch (IOException E) {
            return 0;
    }
    }

    public static String pedirString() {

        try {
            return lp.readLine();
    }      catch (IOException E) {
            return "";
    }
    }

    public static char pedirChar() {

        try {
            return char.class.cast(lp.readLine());
        }  catch (IOException E) {
            return 0;
        }

    }
        public  static boolean pedirBoolean() {

        try {
            return  Boolean.parseBoolean(lp.readLine());
        }  catch (IOException E) {
            return false;
        }
        }


}     




    