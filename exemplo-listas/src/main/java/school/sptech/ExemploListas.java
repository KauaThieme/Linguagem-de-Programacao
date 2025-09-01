package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

    public static void main(String[] args) {

        // Só funciona com wrappers

        List<String> frutas = new ArrayList<String>();
        frutas.add("Goiaba");
        frutas.add("Melão");

        System.out.println(frutas);

        List<String> frutasComValores = new ArrayList<>(List.of("Maçã", "Abacaxi", "Abacate"));

        frutasComValores.add("Morango");
        frutasComValores.addAll(frutas);
        frutasComValores.addFirst("Jabuticaba"); // Vai adicionar no começo
        frutasComValores.addLast("Feijão"); // Vai adicionar no final
        frutasComValores.add(3, "Tangerina"); // Vai adicionar na posição solicitada
        frutasComValores.set(3, "Mamão Papaya"); // Vai substituir o item na posição desejada

        frutasComValores.remove("Morango"); // Remove pelo objeto
        frutasComValores.remove(0);  // Remove pelo índice
        frutasComValores.removeAll(frutas); // Remove uma lista usando de espelho a outra

        System.out.println(frutasComValores);
        System.out.println(frutasComValores.get(3)); // Acessar o índice desejado da lista


    }

}
