package calculadorazip;

import java.util.Scanner;

public class CalculadoraZip {
    // Esta calculadora e não utilizei métodos. fiz direto no main.
    // Utilizei o System.out para interação que tem um procedimento diferendo do JOption.pane.

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
        double num1, num2;
        double soma, subtracao, divisao, multiplicacao, quadrado, sair;
        Scanner entrada = new Scanner(System.in);
         // Ao utilizar o System.out é necessário importa o java.util.Scanner para que a máquina leia o que for digitado pelo usuário.
        // por esta razão, é feito o objeto de entrada do Scanner.
        int opcao;
        opcao = 1;

            do{ 
            System.out.println(" ### Escolha uma Operação ### ");
            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Subtrair");
            System.out.println("4 - Dividir");
            System.out.println("5 - Ao Quadrado");
            System.out.println("0 - SAIR");
            System.out.println("Digite a opção desejada ");
            opcao = entrada.nextInt();
            // Observe que qua a váriavel opçãp foi declarada como inteiro.
            // por esta razão o entrada.nextInt para que a leitura seja feita corretamente.
             
          
            switch (opcao) {
                case 1:
                   System.out.println(" ### Calculadora ###");
                   System.out.println("Informe o primeiro número: ");
                   num1 = entrada.nextDouble();
                   System.out.println("Informe o segundo número: ");
                   num2 = entrada.nextDouble();
                   soma = num1 + num2;
                   System.out.println("A Soma: " + soma);
                   break;

                case 2:
                   System.out.println(" ### Calculadora ###");
                   System.out.println("Informe o primeiro número: ");
                   num1 = entrada.nextDouble();
                   System.out.println("Informe o segundo número: ");
                   num2 = entrada.nextDouble();
                   multiplicacao = num1 * num2;
                   System.out.println("A Multiplicação é: " + multiplicacao);
                   break;

                case 3:
                    System.out.println(" ### Calculadora ###");
                    System.out.println("Informe o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    num2 = entrada.nextDouble();
                    subtracao = num1 - num2;
                    System.out.println("A Subtração é: " + subtracao);
                    break;

                case 4:
                    System.out.println(" ### Calculadora ###");
                    System.out.println("Informe o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    num2 = entrada.nextDouble();
                    if (num1 < num2) {
                        System.out.println("Não foi possivel realizar o calculo!");
                   } else {
                        divisao = num1 / num2;
                        System.out.println("A Divisão é: " + divisao);
                    }
                    break;

                case 5:
                    System.out.println(" ### Calculadora ###");
                    System.out.println("Informe um número: ");
                    num1 = entrada.nextDouble();
                    quadrado = num1*num1;
                    System.out.println("Ao quadrado é: " + quadrado);
                    break;

                case 0:
                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Operação Inválida!");

            } 
            }   while (opcao != 0);
                
        }
    }
