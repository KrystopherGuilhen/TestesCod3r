package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMISTICA;
    int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaximistica){
        VELOCIDADE_MAXIMISTICA = velocidadeMaximistica;
    }

    public void acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMISTICA){
            velocidadeAtual = VELOCIDADE_MAXIMISTICA;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void frear() {
        if (velocidadeAtual >= 5){
            velocidadeAtual -=5;
        }else{
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
