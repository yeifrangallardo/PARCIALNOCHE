/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialg5yeifrangallardo;
public class Sport extends Moto{
     private final String motor;
    private final String potencia;
    private final String tanque;

    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    
    public String motorGarantia() {
         return switch (motor) {
             case "4T" -> "La garantía de la moto es por 2 años";
             case "monocilindrico" -> "La garantía de la moto es por 1 año";
             default -> "Elija la opcion 4T O monocilindrico";
         };
    }

    
    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }
}