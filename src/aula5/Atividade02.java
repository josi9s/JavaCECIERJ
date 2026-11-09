/* Implemente a classe já apresentada; depois, teste
 * o exemplo e veja se você conseguiu visualizar melhor
 * o exemplo explicado, compreendendo os conceitos asso-
 * ciados. Caso ainda tenha dúvidas sobre esses conceitos,
 * interaja com seu tutor ou coloque suas dúvidas no fórum.
 */

package aula5;

public class Atividade02 {
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;

        System.out.println("Frase 3: "+frase3);
        System.out.println("Frase 4: "+frase4);
        System.out.println("Frase 3 e Frase 4 possuem a mesma referencia? R: "+(frase3==frase4));

    }
}
