/* Utilizando a classe BufferedReader, solicite um número ao usu-
* ário entre 0 e 10 e imprima seu valor por extenso. Caso o usuário
* imprima um valor inválido, escreva a mensagem "Valor inválido".
* */

package aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade02 {
    public static void main(String[] args) {
        BufferedReader datEnt = new BufferedReader(new InputStreamReader(System.in));
        int num;

        System.out.print("Digite um número de 0 a 10: ");

        try {
            num = Integer.parseInt(datEnt.readLine());
            switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Três");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Sete");
                    break;
                case 8:
                    System.out.println("Oito");
                    break;
                case 9:
                    System.out.println("Nove");
                    break;
                case 10:
                    System.out.println("Dez");
                    break;
                default:
                    System.out.println("Valor inválido.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
