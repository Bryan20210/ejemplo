package casoprogramado;

import javax.swing.JOptionPane;

public class Cliente {
    
    String nombre;
    String Cedula;
    String Direccion;
    String NumeroTelefono;
    
    public void Datos(){
    
    JOptionPane.showInputDialog("Digite el nombre del Cliente:" );
    JOptionPane.showInputDialog("Digite su numero de cedula: "); 
    JOptionPane.showInputDialog("Digite su direccion:");
    JOptionPane.showInputDialog("Digite su numero de telefono: ");
}
    public Cliente(String nombre, String Cedula, String Direccion, String NumeroTelefono) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    public String Mostrar() {
        return "Cliente{" + "nombre=" + nombre + ", Cedula=" + Cedula + ", Direccion=" + Direccion + ", NumeroTelefono=" + NumeroTelefono + '}';
    }
    
    
    
}
