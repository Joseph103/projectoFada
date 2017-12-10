package Paquete;

import java.util.ArrayList;
import java.util.Arrays;

public class Villa {

    public ArrayList enemi;
    public ArrayList pais;
    public String[] villas;
    String[] X;
    int nP = 0;
    int nE = 0;

    public Villa(ArrayList enemi, ArrayList pais) {
        this.enemi = enemi;
        this.pais = pais;
        this.villas = new String[pais.size()];
    }

    public ArrayList getEnemi() {
        return enemi;
    }

    public void setEnemi(ArrayList enemi) {
        this.enemi = enemi;
    }

    public ArrayList getPais() {
        return pais;
    }

    public void setPais(ArrayList pais) {
        this.pais = pais;
    }

    public String newVilla(ArrayList l1) {
        String X = null;
        for (int i = 0; i < l1.size(); i++) {
            villas[i] = l1.get(i).toString();
            
            X = "villa" + i + " = " + villas[i] ;

            return X;
        }

        return "";
    }

    public String[] insertarVilla() {
        for (int i = 0; i < pais.size(); i++) {

            if (pais.get(i) != null) {

                nP = i;

            }
            if (enemi.get(i) != null) {

                nE = i;

            }
        }

        if (nE == nP) {

            System.out.println(this.newVilla(pais));

            for (int i = 1; i < pais.size(); i++) {

                X = new String[pais.size()];
                for (int j = 0; j < 10; j++) {
                String temp = enemi.get(j).toString();
                String Y =temp.replace("[", "");
                String Z = Y.replace("]", "");
                X = Z.split("",1);
                
                     
               
                System.out.println(Arrays.toString(X));
//                    if (pais.get(i)=)
            }
           }

        }

        return villas;
    }

}
