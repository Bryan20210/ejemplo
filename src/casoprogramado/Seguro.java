package casoprogramado;

import javax.swing.JOptionPane;


public class Seguro {
    
    String Seguro;
    String Papelesaldia;
    String Poliza;

    public void datos(){
    
        JOptionPane.showInputDialog("Digite si cuenta con seguro: ");
        JOptionPane.showInputDialog("Digite si esta con los papeles al dia: ");
        JOptionPane.showInputDialog("Digite si cuenta con poliza: ");
    
    }
    public Seguro(String Seguro, String Papelesaldia, String Poliza) {
        this.Seguro = Seguro;
        this.Papelesaldia = Papelesaldia;
        this.Poliza = Poliza;
    }

    public String getPoliza() {
        return Poliza;
    }

    public void setPoliza(String Poliza) {
        this.Poliza = Poliza;
    }

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String Seguro) {
        this.Seguro = Seguro;
    }

    public String getPapelesaldia() {
        return Papelesaldia;
    }

    public void setPapelesaldia(String Papelesaldia) {
        this.Papelesaldia = Papelesaldia;
    }
   
    public String Mostar() {
        return "Seguro{" + "Seguro=" + Seguro + ", Papelesaldia=" + Papelesaldia + ", Poliza=" + Poliza + '}';
    }
    
    
}
