/* Implemente a classe já mostrada; depois, teste o exemplo e veja se
 * você conseguiu visualizar melhor o exemplo explicado, compreendendo
 * os conceitos associados.
 */

package aula5;

public class Atividade03 {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");

        System.out.println("Frase 1: "+frase1);
        System.out.println("Frase 2: "+frase2);

        System.out.println("Frase 1 e Frase 2 possuem o mesmo conteúdo? R:"+ (frase1.equals(frase2)));
    }
}
