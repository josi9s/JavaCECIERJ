/* Implemente e execute uma classe que constrói um array
 * de Strings inicializado com os nomes dos sete dias da
 * semana. Por exemplo:
 *
 * String dias[] = {"Segunda", "Terça", "Quarta", "Quinta",
 * "Sexta", "Sábado", "Domingo"};
 *
 * Após isso, na mesma casse, utilize um laço while para
 * imprimir o conteúdo desse array. Faça o mesmo com as
 * declarações do-while e for.
 * */
package aula4;

public class Atividade05 {
    public static void main(String[] args) {
        String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        // while
        int i = 0;

        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        System.out.println("");

        // do while
        int j = 0;

        do {
            System.out.println(dias[j]);
            j++;
        } while (j < dias.length);

        System.out.println("");

        // for
        for (int k = 0; k < dias.length; k++) {
            System.out.println(dias[k]);
        }
    }
}
