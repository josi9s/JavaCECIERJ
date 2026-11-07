/* Utilizando a classe BufferedReader, capture cinco palavras digitadas
 * pelo usuário e mostre-as como uma única frase numa única linha.
 * Exemplo:
 * Palavra 1: Ola,
 * Palavra 2: bem
 * Palavra 3: vindo
 * Palavra 4: ao
 * Palavra 5: Java
 *
 * Saída: Ola, bem vindo ao Java
 * */

package aula3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade01 {
    public static void main(String[] args) {
        BufferedReader datEnt = new BufferedReader(new InputStreamReader(System.in));
        String nome = "";

        for (int i = 1; i <= 5; i++) {
            System.out.print("Palavra " + i + ": ");

            try {
                if (nome.isEmpty()) {
                    nome = datEnt.readLine();
                } else {
                    nome += " " + datEnt.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println(nome);


    }
}
