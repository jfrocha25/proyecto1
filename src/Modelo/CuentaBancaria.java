
package Modelo;

public class CuentaBancaria {
    public String idCuenta;
    public String idTitular;
    public String nombreTitular;
    public String tipoCuenta;
    public String idSede;

    public CuentaBancaria(String idCuenta, String idTitular, String nombreTitular, String tipoCuenta,String idSede) {
        this.idCuenta = idCuenta;
        this.idTitular = idTitular;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.idSede = idSede;
    }
    
    public CuentaBancaria(){
        idCuenta = "";
        idTitular = "";
        nombreTitular = "";
        tipoCuenta = "";
        idSede = ""; 
    }

    public String getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }
    public String getIdTitular() {
        return idTitular;
    }
    public void setIdTitular(String idTitular) {
        this.idTitular = idTitular;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    } 

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }
    
}
