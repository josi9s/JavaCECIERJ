/* Implemente a classe que está apresentada
 * anteriormente; depois, teste o exemplo e veja se você
 * conseguiu visualizar melhor o exemplo explicado, compre
 * endendo os conceitos associados.
 * Caso ainda tenha dúvidas sobre esses conceitos, interaja
 * com seu tutor ou coloque suas dúvidas no fórum.
 *
 */

package aula5;

public class Atividade01 {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");

        System.out.println("Frase 1: "+frase1);
        System.out.println("Frase 2: "+frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R:"+(frase1==frase2));

    }
}
