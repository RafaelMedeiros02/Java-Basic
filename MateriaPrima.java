/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Windows
 */
public class MateriaPrima extends Produto {
    
    private String PecasMotor;
    private String PecasLataria;
    private String Estetica;

    public String getPecasMotor() {
        return PecasMotor;
    }

    public void setPecasMotor(String PecasMotor) {
        this.PecasMotor = PecasMotor;
    }

    public String getPecasLataria() {
        return PecasLataria;
    }

    public void setPecasLataria(String PecasLataria) {
        this.PecasLataria = PecasLataria;
    }

    public String getEstetica() {
        return Estetica;
    }

    public void setEstetica(String Estetica) {
        this.Estetica = Estetica;
    }
    
    
    
}
