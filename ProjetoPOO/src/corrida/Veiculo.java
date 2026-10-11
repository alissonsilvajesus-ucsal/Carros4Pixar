package corrida;

//importei o dado de sortear numeros aleatoerios
import java.util.Random;

public class Veiculo {

    private int velocidade;
    private int distancia;//quanto ele ja andou no total
    private char simbolo;
    private Random random;

    //construtor
    public Veiculo(char simbolo, Random random) {
        this.simbolo = simbolo;
        this.random = random;
        this.velocidade = 0;
        this.distancia = 0;
    }

    //getters and setters

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    //metodos
    public void avancar() {
        velocidade = random.nextInt(3) + 1;
        distancia += velocidade;
    }

    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distancia; i++) {
            sb.append(' ');
        }
        sb.append(simbolo);
        return sb.toString();
    }
}