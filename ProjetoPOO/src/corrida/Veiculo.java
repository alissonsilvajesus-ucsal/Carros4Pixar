package corrida;

import java.util.Random;

public class Veiculo {

    private int velocidade;
    private int distancia;
    private char simbolo;

    public Veiculo(char simbolo) {
        this.simbolo = simbolo;
        this.velocidade = 0;
        this.distancia = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void avancar(Random random) {
        this.velocidade = random.nextInt(1, 3);
        this.distancia += this.velocidade;
    }

    public String desenhar() {
        return " ".repeat(distancia) + simbolo;
    }
}