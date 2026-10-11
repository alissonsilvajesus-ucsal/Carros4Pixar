package corrida;

import java.util.Random;

public class Corrida {

    private static int distanciaMaxima = 118;
    private static int larguraPista = 120;
    private static int pausaMs = 300;

    public static void main(String[] args) {

        Random random = new Random();
        Veiculo carro1 = new Veiculo('#');
        Veiculo carro2 = new Veiculo('#');

        while (carro1.getDistancia() < distanciaMaxima && carro2.getDistancia() < distanciaMaxima) {
            carro1.avancar(random);
            carro2.avancar(random);
            imprimirPista(carro1, carro2);
            pausar(pausaMs);
        }

        anunciarResultado(carro1, carro2);
    }

    private static void imprimirPista(Veiculo v1, Veiculo v2) {
        String linha = "-".repeat(larguraPista);
        System.out.println(linha);
        System.out.println(v1.desenhar());
        System.out.println(v2.desenhar());
        System.out.println(linha);
        System.out.println();
    }

    private static void anunciarResultado(Veiculo v1, Veiculo v2) {
        int d1 = v1.getDistancia();
        int d2 = v2.getDistancia();

        if (d1 > d2) {
            System.out.println("O carro 1 venceu a corrida.");
        } else if (d2 > d1) {
            System.out.println("O carro 2 venceu a corrida.");
        } else {
            System.out.println("A corrida terminou em empate.");
        }
    }

    private static void pausar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {

        }
    }
}