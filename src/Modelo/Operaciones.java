
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operaciones {    
    
    
     
    CuentaBancaria cuenta = new CuentaBancaria();
    
    ArrayList<CuentaBancaria>listaCuenta = new ArrayList();
    
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public void IngresardatosCuenta(){
        String idCuenta = Input("Numero de la cuenta");
        String idTitular = Input("Numero de identificacion del titular de la cuenta");
        String nombreTitular = Input("Nombre del titular de la cuenta");
        String tipoCuenta = Input("Tipo de Cuenta 'CORRIENTE' - 'AHORRO'");
        String idSede = Input("Numero de identificacion del banco de la cuenta");
        cuenta.setIdCuenta(idCuenta);
        cuenta.setIdTitular(idTitular);
        cuenta.setNombreTitular(nombreTitular);
        cuenta.setTipoCuenta(tipoCuenta);
        cuenta.setIdSede(idSede);
        listaCuenta.add(cuenta); 
    }
    public void ImprimirListaCuenta(){
        String string = "";
        for (int i=0;i<listaCuenta.size();i++){
            string+="Lista de Cuentas"+(i+1)+"\n";
            string+="Identificacion del Banco: "+listaCuenta.get(i).getIdSede()+"\n";
            string+="Nombre del titular de la cuenta: "+listaCuenta.get(i).getNombreTitular()+"\n";
            string+="Numero de identificacion del titular de la cuenta: "+listaCuenta.get(i).getIdTitular()+"\n";
            string+="Tipo de cuenta: "+listaCuenta.get(i).getTipoCuenta()+"\n";
        }
        JOptionPane.showMessageDialog(null, string);
    }
    
    ArrayList<TitularCuenta> listaTitulares = new ArrayList();
    
    
    public void IngresarDatosTitular(){
        
        String id = Input("Identificacion del titular de la cuenta");
        String nombre = Input("Nombre del titular de la cuenta ");
        char sexo =(JOptionPane.showInputDialog ("Sexo del titular de la cuenta")).charAt(0);
        String telefono = Input("Telefono del titular de la cuenta");
        TitularCuenta titular = new TitularCuenta();
        titular.setId(id);
        titular.setNombre(nombre);                           
        titular.setSexo(sexo);
        titular.setTelefono(telefono);
        listaTitulares.add(titular);
    }
    public void ImprimirListaTitular(){
        String string = "";
        for (int i=0;i<listaTitulares.size();i++){
            string+="Lista de Titulares"+(i+1)+"\n";
            string+="Identificacion del titular de la cuenta: "+listaTitulares.get(i).getId()+"\n";
            string+="Nombre del titular de la cuenta: "+listaTitulares.get(i).getNombre()+"\n";
            string+="Sexo del titular de la cuenta: "+listaTitulares.get(i).getSexo()+"\n";
            string+="telefono del Banco: "+listaTitulares.get(i).getTelefono()+"\n";
        }
        JOptionPane.showMessageDialog(null, string);
    }
    
    public void CuentaAhorros(){
        
        char respuesta = sc.next().charAt(0);
        
        if (respuesta == 'c'){
            System.out.println("Que valor desea consignar");
            cuenta.consignar(sc.nextDouble());
            
        }else if(respuesta == 'r'){
            System.out.println("Que valor desea retirar");
            cuenta.retirar(sc.nextDouble());
            
        }else {
            System.out.println("Opcion no valida");
        }
         JOptionPane.showMessageDialog(null, string);
    }
    
    public void CuentaCorriente(){
        /*SOLO ES PONER UN CONDCIONAL QUE DIGA SI QUIERE O NO LAS TARJETAS*/
        
    }
   
}
