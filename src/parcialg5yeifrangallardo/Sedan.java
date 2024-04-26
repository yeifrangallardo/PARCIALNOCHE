/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialg5yeifrangallardo;
public class Sedan extends Automovil {
    private final double motor;
    private final boolean frenos;

    public Sedan(String placa, int modelo, double precio, double motor, boolean frenos) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    
    public String frenosABS() {
        if (frenos) {
            return "El automóvil tiene frenos ABS";
        } else {
            return "El automóvil no tiene frenos ABS";
        }
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    
    
    }