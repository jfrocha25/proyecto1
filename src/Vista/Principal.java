
package Vista;

import Modelo.Operaciones;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
       
        
        Operaciones registroCuenta = new Operaciones();
        
        int opcion;
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(
            "Menu Principal\n"                    
                    
                    + "1. Registrar un titular de cuenta al banco\n"
                    + "2. Imprimir la lista de titulares de cuenta\n"
                    + "3. Registrar una cuenta al banco\n"
                    + "4. Imprimir la de cuentas del banco\n"
                    + "5. Salir"));
            switch(opcion){                
                case 1:
                    registroCuenta.IngresarDatosTitular();
                    break;
                    
                case 2:    
                    registroCuenta.ImprimirListaTitular();
                    break;    
                    
                    
                case 3:
                    registroCuenta.IngresardatosCuenta();
                    break;
                    
                case 4:
                    registroCuenta.ImprimirListaCuenta();
                    break;                   
                
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Error de aplicacion");
                    break;
            }
        }while(opcion != 7);
    }  
}
