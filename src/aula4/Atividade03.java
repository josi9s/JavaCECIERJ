/* Implemente e execute uma classe que construa um array com
 * capacidade de armazenar 100 inteiros; inicialize então cada
 * elemento do array com os números de 0 até 99 e imprima-os por
 * meio de uma estrutura for como já foi exemplificado, mas em
 * vez de definir explicitamente o intervalo do looping, utilize
 * o atributo length do array para definir o seu tamanho.
 */

package aula4;

import java.util.Arrays;

public class Atividade03 {
    public static void main(String[] args) {
        int inteiros[] = new int[100];

        for (int i = 0; i<inteiros.length; i++){
            inteiros[i] = i;
            System.out.println(inteiros[i]);

        }


        System.out.println(Arrays.toString(inteiros));

    }
}
