
package app;


public class Carro extends ProdutoAcabado {
    
   private int Ano;
   private String Modelo;
   private float ValorVenda;
   
   public Carro(String Modelo, int Ano) {
   this.Modelo =  Modelo;
   this.Ano = Ano;
   }
    

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }
   
   
   
    
}
