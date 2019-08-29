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
public class ProdutoAcabado extends Produto {
    
    private String Montadora;
    private float PrecoCusto;

    public String getMontadora() {
        return Montadora;
    }

    public void setMontadora(String Montadora) {
        this.Montadora = Montadora;
    }

    public float getPrecoCusto() {
        return PrecoCusto;
    }

    public void setPrecoCusto(float PrecoCusto) {
        this.PrecoCusto = PrecoCusto;
    }
    
    
    
}
