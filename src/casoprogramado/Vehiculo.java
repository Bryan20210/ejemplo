package casoprogramado;

import javax.swing.JOptionPane;


public class Vehiculo {
    
     String Vehiculo;
     String TipodeVehiculo;
     String Anio;

     public void datos(){
     
         JOptionPane.showInputDialog("Digite el modelo del vehiculo: ");
         JOptionPane.showInputDialog("Digite el tipo de auto: ");
         JOptionPane.showInputDialog("Digite el anio del vehiculo: ");
     }
     
    public Vehiculo(String Vehiculo, String TipodeVehiculo, String Anio) {
        this.Vehiculo = Vehiculo;
        this.TipodeVehiculo = TipodeVehiculo;
        this.Anio = Anio;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getTipodeVehiculo() {
        return TipodeVehiculo;
    }

    public void setTipodeVehiculo(String TipodeVehiculo) {
        this.TipodeVehiculo = TipodeVehiculo;
    }


    public String Mostar() {
        return "Vehiculo{" + "Vehiculo=" + Vehiculo + ", TipodeVehiculo=" + TipodeVehiculo + ", Anio=" + Anio + '}';
    }
    
    
}
