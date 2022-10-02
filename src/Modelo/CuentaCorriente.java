
package Modelo;


public class CuentaCorriente extends TitularCuenta{
    /*Viene con una tarjeta débito, con la que podrá manejar su 
    dinero, hacer pagos en establecimientos comerciales y disponer de 
    efectivo a través de un cajero automático. Puede autorizar pagos de 
    servicios y desembolsos a su cuenta.*/
    private String tarjeta;
    private String tarjetaC;/*TARJETA CREDITO*/

    public CuentaCorriente(String tarjeta, String tarjetaC, String id, String nombre, char sexo, String telefono) {
        super(id, nombre, sexo, telefono);
        this.tarjeta = tarjeta;
        this.tarjetaC = tarjetaC;
    }

    public CuentaCorriente(String tarjeta, String tarjetaC) {
        this.tarjeta = tarjeta;
        this.tarjetaC = tarjetaC;
    }

    public String getTarjetaC() {
        return tarjetaC;
    }

    

    public String getTarjeta() {
        return tarjeta;
    }
    
    
    
}
