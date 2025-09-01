package school.sptech;

import java.util.Arrays;

public class ExemploVetores {

    public static void main(String[] args) {

        // Primitivo

        int[] numeros = new int[5]; // Inicialização com tamanho
        int[] numerosComValores = new int[] { 10, 20, 30, 40, 50 };
        // int[] numerosComValores = { 10, 20, 30, 40, 50 };

        // int[][][] matriz = new int[10][10][10];

        // Wrappers / Estes serão utilizados na prova

        Integer[] numeroWrappers = new Integer[10];
        String[] frutas = new String[] {"Maça", "Melão", "Goiaba"};

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosComValores));

        numeros[2] = 100;
        // numeros[1000] = 100;

        System.out.println("Ìndice 2: " + numeros[2]);
        System.out.println(Arrays.toString(numeros));

        System.out.println("Interando números");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numerosComValores[i]);
        }

        // FOR Aprimorado

        System.out.println("For Aprimorado");
        for (int numeroDaVez : numerosComValores) {
            System.out.println(numeroDaVez);
        }

    }

}
