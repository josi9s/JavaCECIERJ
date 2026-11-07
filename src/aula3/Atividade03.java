/* Utilizando a classe BufferedReader, faça um programa que lê
 * três notas de um aluno inseridas via teclado e imprime sua média,
 * dizendo se o mesmo foi aprovado na disciplina caso a nota seja maior
 * do que cinco ou reprovado, caso contrário.
 * */

package aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade03 {
    public static void main(String[] args) {
        BufferedReader datEnt = new BufferedReader(new InputStreamReader(System.in));
        double notaBase = 0;

        // loop para solicitar 3 médias e somar o valor a variável notaBase

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite uma nota: ");
            try {
                double novaNota = Double.parseDouble(datEnt.readLine());
                notaBase = Double.sum(notaBase, novaNota);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        double media = notaBase / 3;

        System.out.println("Média: " + media);

        if (media >= 5.0) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

    }

}
