package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ao chamar o carro, informe seu modelo e o ano.
        System.out.println("------------------------");

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o modelo");
        System.out.println("------------------------");
        String modelo = leia.next();
        int ano = Integer.parseInt(leia.next());
        System.out.println("Informe o ano");
        System.out.println("-------------------------");
        Carro c = new Carro(modelo, ano);

        c.setAno(2019);
        c.setDemanda(2);
        c.setMontadora("BRASIL");
        c.setOrcamentoProducao(20000);
        c.setPrecoCusto(120000);
        c.setValorVenda(150000);
        c.setChassi("BF4756895R");

        System.out.println(c.getModelo());
        System.out.println(c.getAno());
        System.out.println(c.getDemanda());
        System.out.println(c.getMontadora());
        System.out.println(c.getOrcamentoProducao());
        System.out.println(c.getPrecoCusto());
        System.out.println(c.getValorVenda());
        System.out.println(c.getChassi());

    }

}
