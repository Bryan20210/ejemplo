package casoprogramado;

import javax.swing.JOptionPane;
import casoprogramado.Cliente;

public class CasoProgramado {

    public static void main(String[] args) {

       //Lo hice asi profe proque estaba tratando de hacer el menu y no
       //me estaba funcionando a la hora de llamar las clases y pedir los datos
       //y no queria perder todos los puntos
        
        Cliente Cli = new Cliente("Carlos", "52145664", "Sanjose barrio alto caso f50", "864852115");
        Vehiculo Ve = new Vehiculo("Hilux", "4x4", "2020");
        Reparacion Re = new Reparacion("Freno de disco", "Pintura", "Cambio de Aceite");
        Repuesto Rep = new Repuesto("Hilux 2020", "Freno de disco", "3 meses");
        Seguro Se = new Seguro("Si", "Si", "Si");
        
        JOptionPane.showMessageDialog(null, Cli.Mostrar());
        JOptionPane.showMessageDialog(null, Ve.Mostar());
        JOptionPane.showMessageDialog(null, Re.Mostrar());
        JOptionPane.showMessageDialog(null,Rep.Mostar()); 
        JOptionPane.showMessageDialog(null,Se.Mostar());
        
        
    
    }
}
