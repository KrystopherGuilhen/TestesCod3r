package streams;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;
    final double valorfrete;

    public Produto(String nome, double preco, double desconto, double valorfrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorfrete = valorfrete;
    }
}
