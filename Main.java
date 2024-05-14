import java.util.Stack;

public class Main{

    // Função recursiva para resolver as Torres de Hanói
    static void torresDeHanoi(int discos, char origem, char destino, char auxiliar) {
        if (discos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }

        torresDeHanoi(discos - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + discos + " de " + origem + " para " + destino);
        torresDeHanoi(discos - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        int discos = 3; // Número de discos
        char origem = 'A', destino = 'C', auxiliar = 'B'; // Pinos
        torresDeHanoi(discos, origem, destino, auxiliar);
    }
}
