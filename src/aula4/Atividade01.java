/* Implemente e execute uma classe que construa um array com
 * capacidade de armazenar 100 inteiros. Inicialize então cada
 * elemento do array com os números de 0 até 99 e imprima-os
 * por intermédio de uma estrutura for, como foi exemplificado.
 * */

package aula4;

import java.util.Arrays;

public class Atividade01 {
    public static void main(String[] args) {
        int inteiros[] = new int[100];

        for (int i = 0; i <= 99; i++) {
            inteiros[i] = i;
            System.out.println(inteiros[i]);
        }

        System.out.println(Arrays.toString(inteiros));

    }
}
