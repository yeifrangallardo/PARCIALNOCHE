/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialg5yeifrangallardo;
import javax.swing.JOptionPane;
/**
 *
 * @author Yeifran Gallardo
 */
public class ParcialG5YeifranGallardo {

public static void main(String[] args) {
        
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                ****** CONCESIONARIO CAUCANA DE VEHICULOS S.A.******
                ******* REGISTRO DE VEHICULOS VENDIDOS********
                1. Registro de automoviles
                2. Registro de motos
                3. Vendedor
                4. Salir"""));

            switch (opcion) {
                case 1 -> registrarAutomovil();
                case 2 -> registrarMoto();
                case 3 -> mostrarVendedor();
                case 4 -> JOptionPane.showMessageDialog(null, "Su proceso a finalizado");
                default -> JOptionPane.showMessageDialog(null, "Esta opción no es válida.");
            }
        } while (opcion != 4);
    }

    public static void registrarAutomovil() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del automóvil:");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del automóvil:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del automóvil:"));
        double motor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la potencia del motor del automóvil:"));
        boolean frenos = Boolean.parseBoolean(JOptionPane.showInputDialog("¿El automóvil tiene frenos ABS? (true/false)"));

        Sedan sedan = new Sedan(placa, modelo, precio, motor, frenos);
        JOptionPane.showMessageDialog(null, """
                Autom\u00f3vil registrado:
                Placa: """ + sedan.getPlaca() + "\n" +
                "Modelo: " + sedan.getModelo() + "\n" +
                "Precio: " + sedan.getPrecio() + "\n" +
                "Potencia del motor: " + sedan.getMotor() + "\n" +
                sedan.frenosABS());
    }

    public static void registrarMoto() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa de la moto:");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo de la moto:"));
        int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje de la moto:"));
        String motor = JOptionPane.showInputDialog("Ingrese el tipo de motor de la moto:");
        String potencia = JOptionPane.showInputDialog("Ingrese la potencia de la moto:");
        String tanque = JOptionPane.showInputDialog("Ingrese el tipo de tanque de la moto:");

        Sport sport = new Sport(placa, modelo, cilindraje, motor, potencia, tanque);
        JOptionPane.showMessageDialog(null, """
                                            Moto registrada:
                                            Placa: """ + sport.getPlaca() + "\n" +
                                            "Modelo: " + sport.getModelo() + "\n" +
                                            "Cilindraje: " + sport.getCilindraje() + "\n" +
                                            "Tipo de motor: " + sport.getMotor() + "\n" +
                                            "Potencia: " + sport.getPotencia() + "\n" +
                                            "Tipo de tanque: " + sport.getTanque() + "\n" +
                                            sport.motorGarantia());
    }

    public static void mostrarVendedor() {
        JOptionPane.showMessageDialog(null, "YEIFRAN GALLARDO, ERIC SANCHEZ");
    }
}