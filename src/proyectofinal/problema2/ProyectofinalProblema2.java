/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.problema2;
import javax.swing.JOptionPane;
/**
 *
 * @author danii
 */
public class ProyectofinalProblema2 {    

    /**
     * @param args the command line arguments
     * 
     * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
     */
    public static void main(String[] args) {
    
        boolean flag = true;
      int tamano=1;
      double suma=0;
      double arreglo[] = new double [100];
      do{
      
        for (int i=0; i<tamano;i++){      
         arreglo[i]= solicitadouble("Teclea un número: ");
        
        if(arreglo[i]>=0){
            suma=suma+arreglo[i];
            tamano=tamano+1;
            flag=true;
        }
        else{
            flag=false;
            
        }
        }
      }
      while(flag);
      
      JOptionPane.showMessageDialog(null, "El total de los número es: \n"+suma,"Total",1);
}
    
   
    
    
public static double solicitadouble(String men){
        double num=0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag=false;
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "No tecleaste un número","Error",0);
                flag=true;
            }
        }
        while(flag);
        return num;
    }
}
