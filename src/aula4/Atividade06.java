/* Implemente e execute uma classe que, por meio do Scanner, solicita
 * 10 números inteiros ao usuário. Então utilize um array para armaze
 * nar o valor desses números, imprima todos eles e por último mostre
 * o número de maior valor
 * */

package aula4;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];
        int maiorDoArray = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();

            if (nums[i] > maiorDoArray) {
                maiorDoArray = nums[i];
            }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println("O maior número do Array é: "+maiorDoArray);

    }
}
