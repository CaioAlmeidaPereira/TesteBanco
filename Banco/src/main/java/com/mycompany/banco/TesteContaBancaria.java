/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

import java.util.Scanner;

/**
 *
 * @author calme
 */
public class TesteContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira seu titular: ");
        String titular = sc.nextLine();

        System.out.println("insira sua agencia: ");
        String agencia = sc.nextLine();

        System.out.println("insira numero de cartão: ");
        String numero = sc.nextLine();

        BancoConstrutor conta = new BancoConstrutor( titular, agencia, numero );

        while (true) {
            System.out.println("\n Escolha uma opção: ");
            System.out.println(" 1 - Depósito ");
            System.out.println(" 2 - Saque ");
            System.out.println(" 3 - Conferir saldo ");
            System.out.println(" 4 - Sair ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" Digite um valor para o depósito:  ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println(" Digite um valor para sacar:  ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println(" Informações da conta:  ");
                    System.out.println(" Titular: " + conta.getTitular());
                    System.out.println(" Agencia: " + conta.getAgencia());
                    System.out.println(" Numero: " + conta.getNumero());
                    System.out.println(" Saldo: " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println(" Encerrando o programa  ");
                    sc.close();
                    return;
                    
                default:
                    System.out.println(" valor invalido ");
                    break;
            }
        }
    }
}
