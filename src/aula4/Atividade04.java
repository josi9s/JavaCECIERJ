/* Execute uma nova classe semelhante à da Atividade 1,
 * mas desta vez modifique os parâmetros da estrutura
 * for para forçar a saída de um erro no sistema, forçando
 * o lançamento de uma Exception (vide caixa de ênfase
 * anterior).
 */

package aula4;

public class Atividade04 {
    public static void main(String[] args) {
        int inteiros[] = new int[100];

        for (int i = 0; i <= 100; i++) {
            inteiros[i] = i;
            System.out.println(inteiros[i]);
        }
    }
}
