package oo.desafio;

public class Sistema {

    public static void main (String[] args){

        Compra compra1 = new Compra();
        compra1.adicionarItem("suporte de espada", 9000, 1);
        compra1.adicionarItem(new Produto("Bengala de idoso rustica", 2000), 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Chapéu estiloso", 199, 1);
        compra2.adicionarItem(new Produto("Armadura de smoking disfarçada", 12000), 1);

        Cliente cliente = new Cliente("Dr Watsong dos songs of songneritos calvos");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.getValorTotal());

    }
}
