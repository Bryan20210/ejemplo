package casoprogramado;

import javax.swing.JOptionPane;

public class Reparacion {
    
     String ProblemaVehiculo;
     String ReparacionAdicional;
     String Mantenimiento;
     
     public void datos(){
     
         JOptionPane.showInputDialog("Digite su problema del vehiculo: ");
         JOptionPane.showInputDialog("Digite su tipo de reparacion: ");
         JOptionPane.showInputDialog("Digite el tipo de mantenimiento: ");
         
     }

    public Reparacion(String ProblemaVehiculo, String ReparacionAdicional, String Mantenimiento) {
        this.ProblemaVehiculo = ProblemaVehiculo;
        this.ReparacionAdicional = ReparacionAdicional;
        this.Mantenimiento = Mantenimiento;
    }

    public String getMantenimiento() {
        return Mantenimiento;
    }

    public void setMantenimiento(String Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    public String getProblemaVehiculo() {
        return ProblemaVehiculo;
    }

    public void setProblemaVehiculo(String ProblemaVehiculo) {
        this.ProblemaVehiculo = ProblemaVehiculo;
    }

    public String getReparacionAdicional() {
        return ReparacionAdicional;
    }

    public void setReparacionAdicional(String ReparacionAdicional) {
        this.ReparacionAdicional = ReparacionAdicional;
    }

    public String Mostrar() {
        return "Reparacion{" + "ProblemaVehiculo=" + ProblemaVehiculo + ", ReparacionAdicional=" + ReparacionAdicional + ", Mantenimiento=" + Mantenimiento + '}';
    }
    
    
    
}
