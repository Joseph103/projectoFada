package Paquete;

import java.util.ArrayList;

public class Villa {

    public ArrayList enemi;
    public ArrayList pais;
    public String[] villa;
    int nP = 0;
    int nE = 0;

    public Villa(ArrayList enemi, ArrayList pais) {
        this.enemi = enemi;
        this.pais = pais;
        this.villa = new String[pais.size()];
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
    
    public Villa newVilla(){
       Villa x = new Villa(enemi, pais);
        return x;
    }

    public String[] insertarVilla() {
        for (int i = 0; i < pais.size(); i++) {
           

            if (pais.get(i) != null) {
                
                nP = i;
                
            }
            if (enemi.get(i) != null) {
             
                nE = i;
                
            }
            
            if (nE==nP){
                for (int j = 0; j < 10; j++) {
                    if(villa[j]==enemi.get(j)){
                        this.newVilla();
                            
                    }else{
                        villa[j]=enemi.get(i).toString();
                    }
                }
                villa[i]=pais.get(i).toString();
            }

        }
 
        return villa;
    }

}
