package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1016 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distancia,tempoGasto;
        
        distancia = entrada.nextInt();
        
        tempoGasto = distancia *2;
        
        System.out.printf("%d minutos\n", tempoGasto);
        
        
    }
}
