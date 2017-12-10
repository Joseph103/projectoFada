package Paquete;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Tony
 */
public class Archivos {

   
    java.util.List<String> newList;
    java.util.List<String> newList2;
    String[] array;
    String[] arrayx;
    ArrayList<String> arrayPais = new ArrayList<>();
    ArrayList<String> enemigos = new ArrayList<>();
    ArrayList<String> arrayEnemigo = new ArrayList<>();

    public Archivos() {

    }

    public void lerrTxt(String direccion) { //direccion del archivo

        try {

            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            //String temp = "";
            String bfRead = bf.readLine();

            do { //Realiza el ciclo, mientras bfRead tiene datos

                // temp = temp + bfRead;           //Guardado el texto del archivo
                //System.out.println(bfRead);
                array = bfRead.split(" ");
                arrayx = bfRead.split(" ");
//                System.out.println(Arrays.toString(array));
                for (int i = 0; i < 1; i++) {
                    arrayPais.add(arrayx[0]);
                    
                }
                array = ArrayUtils.removeElement(array, array[0]);
                newList = Arrays.asList(array);
                
                
                    
                for (int i = 0; i < 1; i++) {
                    
                    arrayEnemigo.add(newList.toString());
                    

                }

               
                

                

            } while ((bfRead = bf.readLine()) != null);
            
            System.out.println("Paises = "+arrayPais);
            System.out.println("Enemigos = "+arrayEnemigo);
            
            
            Villa villa = new Villa(arrayEnemigo, arrayPais);
            
            System.out.println(Arrays.toString(villa.insertarVilla()));

        } catch (Exception e) {

        }

    }

}
