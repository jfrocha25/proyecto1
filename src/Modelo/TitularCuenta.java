
package Modelo;

public class TitularCuenta {
    public String id;
    public String nombre;
    public char sexo;
    public String telefono;

    public TitularCuenta(String id, String nombre, char sexo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
    }
    
    public TitularCuenta(){
        id="";
        nombre="";
        sexo=0;
        telefono = "";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
      
}
