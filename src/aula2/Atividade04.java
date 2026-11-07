/* Crie um programa que elabore o orçamento de uma construtora
 * para o cálculo do valor total de construção de uma piscina. O valor
 * total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
 * que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
 * programa para ver se está tudo funcionando corretamente.
 * */

package aula2;

public class Atividade04 {
    public static void main(String[] args) {
        double cubagem = 15;
        double orcamento = cubagem * 100;

        System.out.println("O orçamento da piscina de " + cubagem + "m³ é de R$" + orcamento);
    }
}
