package palabras;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 
 * @author Alumnos
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    }

    public static void leer(File a) {
        // TODO code application logic here public static void leer()

        FileReader fr = null;
        BufferedReader br;
        int numTokens = 0;
       ArrayList c =new  ArrayList();
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            a = new File("archivo.txt");
            fr = new FileReader(a);
            br = new BufferedReader(fr);
            String s2;

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            StringTokenizer st = new StringTokenizer(linea);

            // bucle por todas las palabras
            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                c.add(c);
                numTokens++;
                System.out.println("    Palabra " + numTokens + " es: " + s2);
            }
        } catch (IOException e) {
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }

    public static void contarp(ArrayList a) {
        HashSet<String> h = new HashSet(a);
         Iterator iterator = h.iterator(); 
         String palabra;
         int contador=0;
         while (iterator.hasNext()) {
               palabra=(String) iterator.next();
             for (int i = 0; i < a.size(); i++) {
                 if (palabra.equals(a.get(i))) {
                     contador++;
                 }
             }
             System.out.println(palabra+" "+contador);
             contador=0;
             }
         
      }

    }

