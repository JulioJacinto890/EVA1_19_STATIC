/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author hp
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Utilerias utileria=new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        
        
        Saludo2();// si no es estatico y no se ha creado un objeto, el metodo no existe
        
    }
    
    public void Saludo2(){
        System.out.println("hola2");
    }
    
}
class Utilerias{
       
        public void Saludo(){
            System.out.println("hola");
        }
        
        //este metodo existe en el momento que el programa arranca
        // inicia su ejecucion, no necesita que se cree un objeto de la clase para poder utilizar
        public static void otroSaludo(){
            System.out.println("otro saludo");
        }
    }
    
    class OtraClase{
        
    }