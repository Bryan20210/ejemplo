package casoprogramado;

import javax.swing.JOptionPane;

public class Repuesto {
    
    String ModeloVehiculo;
    String TipodeRepuesto;
    String Garantia;

    public void datos(){
    
        JOptionPane.showInputDialog("Digite su tipo de modelo de vehiculo: ");
        JOptionPane.showInputDialog("Digite su tipo de repuesto: ");
        JOptionPane.showInputDialog("Digite los anios de garantia: ");
    }
    
    public Repuesto(String ModeloVehiculo, String TipodeRepuesto, String Garantia) {
        this.ModeloVehiculo = ModeloVehiculo;
        this.TipodeRepuesto = TipodeRepuesto;
        this.Garantia = Garantia;
    }

    public String getModeloVehiculo() {
        return ModeloVehiculo;
    }

    public void setModeloVehiculo(String ModeloVehiculo) {
        this.ModeloVehiculo = ModeloVehiculo;
    }

    public String getTipodeRepuesto() {
        return TipodeRepuesto;
    }

    public void setTipodeRepuesto(String TipodeRepuesto) {
        this.TipodeRepuesto = TipodeRepuesto;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public String Mostar() {
        return "Repuesto{" + "ModeloVehiculo=" + ModeloVehiculo + ", TipodeRepuesto=" + TipodeRepuesto + ", Garantia=" + Garantia + '}';
    }
    
    
}

