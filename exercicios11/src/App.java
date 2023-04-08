
// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// o produto do dobro do primeiro com metade do segundo .
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        int soma;
        double nr2;
        double cubo;
        double soma2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o numero inteiro");
        n1 = teclado.nextInt();
        System.out.println("qual o proximo numero");
        n2 = teclado.nextInt();
        System.out.println("qual o numero real");
        nr2 = teclado.nextDouble();
        soma = (n1 * 2) + n2 / 2;
        soma2 = (n1 * 3) + nr2;
        cubo = Math.pow(nr2, 3);
        System.out.println(" o produto do dobro do primeiro com metade do segundo é " + soma);
        System.out.println(" o resultado da soma do triplo do primeiro com o terceiro " + soma2);
        System.out.println(" terceiro elevado ao cubo " + cubo);
        teclado.close();
    }
}
