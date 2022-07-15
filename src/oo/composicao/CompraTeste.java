package oo.composicao;

public class CompraTeste {

    public static void main(String[] arg){

        Compra compra1 = new Compra();
        compra1.cliente  = "Sr. Watson";
        compra1.adicionarItem(new Item("Bengala de madeira com espada", 1, 7.45));
        compra1.adicionarItem(new Item("Chapéu", 1, 25.75));
        compra1.adicionarItem(new Item("Smoking", 1, 180.90));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getvalorTotal());

        // Só pra mostrar a relação bidirecional!
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getvalorTotal();
        System.out.println("O total é R$" + total);
    }
}
