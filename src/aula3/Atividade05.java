// Faça um programa que imprima os números pares de 0 a 100.
package aula3;

public class Atividade05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
