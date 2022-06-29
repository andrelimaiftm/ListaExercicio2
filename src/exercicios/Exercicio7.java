package exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //pedimos para o usuario digitar a quantidade de numeros a ser digitado
        System.out.println("Digite a quantidade de numero a ser digitado:");
        int tamanho = entrada.nextInt();

        //declaramos um vetor do tipo inteiro com tamanho informado pelo usuario
        int[] vetor = new int[tamanho];

        float media = 0.0f;
        int contadorM = 0;
        int soma = 0;
        int numero = 0;

        for (int i = 0; i < tamanho ; i++) {
            //int numero = -1;
            do {//while (numero < 0){
                //recebe os valor inteiros informados pelo usuario
                System.out.println("Digite num numero inteiro e positivo");
                numero = entrada.nextInt();
                if (numero < 0) {
                    System.out.println("Numero digitado é negativo! Digite um numero positivo");
                }
                //}
            }while (numero < 0);

            //verifica se o numero digitado é >= 0
            if(numero >= 0){
                vetor[i] = numero;
                //verifica se o numero multiplo de 3
                if(vetor[i] % 3 == 0){
                    soma = soma+vetor[i];
                    //contadoM++
                    contadorM = contadorM + 1;
                }
            }
        }
        media = ((float) soma)/contadorM;
        System.out.println("O valor da média é: " + media);
    }
}
