package oo.heranca.desafio;

public class TesteAceleramento {
    public static void main(String[] args) {

        WatsonMovel c1 = new WatsonMovel();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        CalvosMovel c2 = new CalvosMovel(500);
        c2.ligarTurbo();

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);
    }
}
