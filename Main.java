import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int N = 5;
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double media;
        int i;
        int j = 0;
        int k = 0;
        int[] aprovado = new int[N];
        int[] reprovado = new int[N];

       for (i = 0; i < N; i++){
           int aux;
           System.out.println("Iniciar cadastro: 0\nParar cadastro: -1");
           aux = teclado.nextInt();

            if (aux == -1) {
                System.out.print("Sistema encerrado!");
                break;
            } else {
                System.out.print("Digite o "+ (i+1) +"º RM: ");
                rm[i] = teclado.nextInt();

                System.out.print("Digite a nota 1: ");
                nota1[i] = teclado.nextDouble();

                System.out.print("Digite a nota 2: ");
                nota2[i] = teclado.nextDouble();

                media = (nota1[i] + nota2[i]) / 2;

                System.out.println(i+1 +"º RM: "+ rm[i] + "\nNota 1: " + nota1[i] + "\nNota 2: " + nota2[i] + "\nMédia: " + media);

                if (media >= 6) {
                    System.out.println("Aluno Aprovado");
                    aprovado[j] = rm[i];
                    j++;
                } else {
                    System.out.println("Aluno reprovado");
                    reprovado[k] = rm[i];
                    k++;
                }

            }

        }
        System.out.println("Lista de aprovados:");
        for (j = 0; j <N; j++) {
            if (aprovado[j] > 0)
                System.out.println(aprovado[j]);
       }
        System.out.println("Lista de reprovado:");
        for (j = 0; j <N; j++) {
            if (reprovado[j] > 0)
                System.out.println(reprovado[j]);
        }
        teclado.close();
    }
}