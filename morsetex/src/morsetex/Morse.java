package morsetex;

import java.util.Scanner;
 
 
public class Morse
{
    public static void main ( String [] args )

    {
        Scanner input = new Scanner( System.in );
        System.out.print( "¿Te gustaría traducir el texto a Morse (sí o no)?" );
        String p1 = input.nextLine();
        if( p1.equals( "si" ) )
        {
        System.out.println( "Por favor, introduzca el texto que desea traducir a código Morse" );
        String texto = input.nextLine();
        System.out.println( stringToMorse( texto ) );
        }
        if (p1.equalsIgnoreCase( "no" ) )
        {
            System.out.print( "Morse a texto? " );
            String p2 = input.nextLine();
            if (p2.equalsIgnoreCase( "si" ) )
            {
                System.out.println( "Por favor ingrese el código Morse que desea traducir a texto" );
                String code = input.nextLine();
                System.out.println( stringTotexto(code ) );
            }
        }
    }
 
    public static String codigom (String letra)
    {
        String morse = letra;
 
        if (letra.equalsIgnoreCase("a"))
            morse = ".-";
        if (letra.equalsIgnoreCase("b"))
            morse = "-...";
        if (letra.equalsIgnoreCase("c"))
            morse = "-.-.";
        if (letra.equalsIgnoreCase("d"))
            morse = "-..";
        if (letra.equalsIgnoreCase("e"))
            morse = ".";
        if (letra.equalsIgnoreCase("f"))
            morse = "..-.";
        if (letra.equalsIgnoreCase("g"))
            morse = "--.";
        if (letra.equalsIgnoreCase("h"))
            morse = "....";
        if (letra.equalsIgnoreCase("i"))
            morse = "..";
        if (letra.equalsIgnoreCase("j"))
            morse = ".---";
        if (letra.equalsIgnoreCase("k"))
            morse = "-.-";
        if (letra.equalsIgnoreCase("l"))
            morse = ".-..";
        if (letra.equalsIgnoreCase("m"))
            morse = "--";
        if (letra.equalsIgnoreCase("n"))
            morse = "-.";
        if (letra.equalsIgnoreCase("o"))
            morse = "---";
        if (letra.equalsIgnoreCase("p"))
            morse = ".--.";
        if (letra.equalsIgnoreCase("q"))
            morse = "--.-";
        if (letra.equalsIgnoreCase("r"))
            morse = ".-.";
        if (letra.equalsIgnoreCase("s"))
            morse = "...";
        if (letra.equalsIgnoreCase("t"))
            morse = "-";
        if (letra.equalsIgnoreCase("u"))
            morse = "..-";
        if (letra.equalsIgnoreCase("v"))
            morse = "...-";
        if (letra.equalsIgnoreCase("w"))
            morse = ".--";
        if (letra.equalsIgnoreCase("x"))
            morse = "-..-";
        if (letra.equalsIgnoreCase("y"))
            morse = "-.--";
        if (letra.equalsIgnoreCase("z"))
            morse = "--..";
        if (letra.equalsIgnoreCase("0"))
            morse = "-----";
        if (letra.equalsIgnoreCase("1"))
            morse = ".----";
        if (letra.equalsIgnoreCase("2"))
            morse = "..---";
        if (letra.equalsIgnoreCase("3"))
            morse = "...--";
        if (letra.equalsIgnoreCase("4"))
            morse = "....-";
        if (letra.equalsIgnoreCase("5"))
            morse = ".....";
        if (letra.equalsIgnoreCase("6"))
            morse = "-....";
        if (letra.equalsIgnoreCase("7"))
            morse = "--...";
        if (letra.equalsIgnoreCase("8"))
            morse = "---..";
        if (letra.equalsIgnoreCase("9"))
            morse = "----.";
        if (letra.equalsIgnoreCase("."))
            morse = ".-.-";
        if (letra.equalsIgnoreCase(","))
            morse = "--..--";
        if (letra.equalsIgnoreCase("?"))
            morse = "..--..";
 
        return morse;
    }
 
    public static String codigoatext (String cod) {
        String morse = cod;
 
        if (cod.equalsIgnoreCase(".- "))
            morse = "a";
        if (cod.equalsIgnoreCase("-..."))
            morse = "b";
        if (cod.equalsIgnoreCase("-.-."))
            morse = "c";
        if (cod.equalsIgnoreCase("-.."))
            morse = "d";
        if (cod.equalsIgnoreCase("."))
            morse = "e";
        if (cod.equalsIgnoreCase("..-."))
            morse = "f";
        if (cod.equalsIgnoreCase("--."))
            morse = "g";
        if (cod.equalsIgnoreCase("...."))
            morse = "h";
        if (cod.equalsIgnoreCase(".."))
            morse = "i";
        if (cod.equalsIgnoreCase(".---"))
            morse = "j";
        if (cod.equalsIgnoreCase("-.-"))
            morse = "k";
        if (cod.equalsIgnoreCase(".-.."))
            morse = "l";
        if (cod.equalsIgnoreCase("--"))
            morse = "m";
        if (cod.equalsIgnoreCase("-."))
            morse = "n";
        if (cod.equalsIgnoreCase("---"))
            morse = "o";
        if (cod.equalsIgnoreCase(".--."))
            morse = "p";
        if (cod.equalsIgnoreCase("--.-"))
            morse = "q";
        if (cod.equalsIgnoreCase(".-."))
            morse = "r";
        if (cod.equalsIgnoreCase("..."))
            morse = "s";
        if (cod.equalsIgnoreCase("-"))
            morse = "t";
        if (cod.equalsIgnoreCase("..-"))
            morse = "u";
        if (cod.equalsIgnoreCase("...-"))
            morse = "v";
        if (cod.equalsIgnoreCase(".--"))
            morse = "w";
        if (cod.equalsIgnoreCase("-..-"))
            morse = "x";
        if (cod.equalsIgnoreCase("-.--"))
            morse = "y";
        if (cod.equalsIgnoreCase("--.."))
            morse = "z";
        if (cod.equalsIgnoreCase("-----"))
            morse = "0";
        if (cod.equalsIgnoreCase(".----"))
            morse = "1";
        if (cod.equalsIgnoreCase("..---"))
            morse = "2";
        if (cod.equalsIgnoreCase("...--"))
            morse = "3";
        if (cod.equalsIgnoreCase("....-"))
            morse = "4";
        if (cod.equalsIgnoreCase("....."))
            morse = "5";
        if (cod.equalsIgnoreCase("-...."))
            morse = "6";
        if (cod.equalsIgnoreCase("--..."))
            morse = "7";
        if (cod.equalsIgnoreCase("---.."))
            morse = "8";
        if (cod.equalsIgnoreCase("----."))
            morse = "9";
        if (cod.equalsIgnoreCase(" "))
            morse = "";
 
        return morse;
    }
 
    public static String stringToMorse( String text )
    {
 
        String newText = "";
        String selecionChar;
        String convertitChar;
        for (int i = 0; i < text.length(); i++)
        {
 
        
            selecionChar = text.charAt(i) + "";
 
           
            convertitChar = codigom(selecionChar);
 
            if (convertitChar.equals(" ")) 
            {
                newText = newText + "| ";
            }
          
            else
            {
                newText = newText + convertitChar;
                if (!convertitChar.equals(" "))
                {
                    newText = newText + " ";
                }
            }
        }
 
        return newText;
    }
 
    public static String stringTotexto( String text )
    {
        return null;

    }
}