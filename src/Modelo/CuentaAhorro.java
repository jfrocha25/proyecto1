
package Modelo;


public class CuentaAhorro {
     private double idsaldo;

    public CuentaAhorro(double idsaldo) {
        this.idsaldo = idsaldo;
    }

    
    
    
     public void retirar(double valor){
        setIdsaldo(getIdsaldo() - valor);
    }
    public void consignar(double valor){
        setIdsaldo(getIdsaldo() + valor);
    }
     
    public void consultar(){
        System.out.println("Su saldo es: "+getIdsaldo());
    } 

   

    
    public double getIdsaldo(){
        return idsaldo;
    }
    public void setIdsaldo(double idsaldo){
        if(idsaldo<0){
            this.idsaldo = 0;
        }else if(idsaldo > 1000000000){
            this.idsaldo = 1000000000;
        }else{
            this.idsaldo = idsaldo;
        }
    } 
    
    
}
