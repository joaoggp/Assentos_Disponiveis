/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefinal;

/**
 *
 * @author João Vitor
 */
public class ex2 {

    public static void main(String[] args) {

        int posi, i, x, p, qtd_assentos, decisao, fim, cancel, cancelamentos;
        qtd_assentos = 0;
        decisao = 0;
        i = -1;
        fim = 0;
        cancelamentos = 0;

        qtd_assentos = Input.readInt("Quantos assentos existem no avião? ");
        int assentos[] = new int[qtd_assentos];

        while (fim != 1) {

            fim = Input.readInt("Digite 1 se quiser finalizar o código, 0 se quiser continuar: ");
            

            if (fim == 1) {
                System.out.println("───────────────");
                System.out.println("Código encerrado!");
                System.out.println("───────────────");
                System.out.println("♦Ultima Impressão dos Assentos♦");
                System.out.println("───────────────────────────");
                System.out.println("Assentos Cancelados: " + cancelamentos);
                System.out.println("───────────────────");
                for (x = 0; x < qtd_assentos; x++) {
                    i++;
                    System.out.print(assentos[x] + " ");
                    System.out.println(" | " + i + "° Assento");
                }
                System.out.println("───────────────");
                System.exit(0);
            }

            decisao = Input.readInt("1 - Para verificar ocupação do avião, 2 - Realizar reserva de um assento,3 - Cancelar reserva de um assento ");

            if (decisao == 1) {
                for (x = 0; x < qtd_assentos; x++) {
                    i++;
                    System.out.print(assentos[x] + " ");
                    System.out.println(" | " + i + "° Assento");
                }
            }
            if (decisao == 2) {
                System.out.println("Mapa de assentos: ");
                for (x = 0; x < qtd_assentos; x++) {
                    i++;
                    System.out.print(assentos[x] + " ");
                    System.out.println(" | " + i + "° Assento");
                }
                posi = Input.readInt("Qual é o assento que deseja sentar? ");

                if (assentos[posi] == 1) {
                    System.out.println("Este assento já está ocupado, favor escolha outro.");
                    posi = Input.readInt("Qual é o assento que deseja sentar? ");
                }

                assentos[posi] = 1;
            }

            if (decisao == 3) {
                for (x = 0; x < qtd_assentos; x++) {
                    i++;
                    System.out.print(assentos[x] + " ");
                    System.out.println(" | " + i + "° Assento");
                }
                cancel = Input.readInt("Qual é o assento que deseja câncelar? ");
                if (assentos[cancel] == 0) {
                    System.out.println("Este assento já está vazio");
                } else {
                    assentos[cancel] = 0;
                    cancelamentos++;
                }
            }

            i = -1;
        }
    }
}
