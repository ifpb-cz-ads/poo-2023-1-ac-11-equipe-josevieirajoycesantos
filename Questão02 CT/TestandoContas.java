package Questão02;

import java.util.Scanner;
import java.util.ArrayList;

public class TestandoContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        int mantedor = 0;

        while (mantedor == 0) {
            Scanner menu1 = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("------------MENU------------");
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Criar nova Conta");
            System.out.println("2 - Extrato");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("Informe a opção desejada:");
            int number = menu1.nextInt();

            switch (number) {
                case 1:
                    Scanner menu2 = new Scanner(System.in);
                    System.out.println(" ");
                    System.out.println("------------MENU------------");
                    System.out.println("Informe o tipo de conta:");
                    System.out.println("1 - Conta Especial");
                    System.out.println("2 - Conta Poupança");
                    System.out.println("Informe a opção desejada:");
                    int number2 = menu2.nextInt();
                    switch (number2) {
                        case 1:
                            Scanner name2 = new Scanner(System.in);
                            System.out.println("Insira o nome do titular: ");
                            String nome2 = name2.next();

                            Scanner num2 = new Scanner(System.in);
                            System.out.println("Insira o numero da conta: ");
                            int numero2 = num2.nextInt();

                            Scanner value2 = new Scanner(System.in);
                            System.out.println("Insira o valor do saldo inicial da conta: ");
                            Double valor2 = value2.nextDouble();

                            ContaBancaria conta2 = new ContaEspecial(nome2, numero2, valor2, true);
                            listaContas.add(conta2);
                            break;

                        // ContaPoupança conta = (ContaPoupança) conta2;
                        // conta.reajustar(valor2);

                        case 2:
                            Scanner name3 = new Scanner(System.in);
                            System.out.println("Insira o nome do titular: ");
                            String nome3 = name3.next();

                            Scanner num3 = new Scanner(System.in);
                            System.out.println("Insira o numero da conta: ");
                            int numero3 = num3.nextInt();

                            Scanner value3 = new Scanner(System.in);
                            System.out.println("Insira o valor do saldo inicial da conta: ");
                            Double valor3 = value3.nextDouble();

                            ContaBancaria conta3 = new ContaPoupança(nome3, numero3, valor3, false);
                            listaContas.add(conta3);
                            break;

                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                case 2:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Informe o numero da conta: ");
                    int contaExtrato = entrada.nextInt();

                    for (int i = 0; i < listaContas.size(); i++) {
                        ContaBancaria conta = listaContas.get(i);
                        if (conta.getNumConta() == contaExtrato) {
                            conta.extrato();
                        }
                    }
                    break;
                case 3:
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Informe o numero da conta: ");
                    int contaExtrato2 = entrada2.nextInt();

                    Scanner depositar = new Scanner(System.in);
                    System.out.println("Informe o valor a ser depositado: ");
                    Double deposito = depositar.nextDouble();

                    for (int i = 0; i < listaContas.size(); i++) {
                        ContaBancaria conta = listaContas.get(i);
                        if (conta.getNumConta() == contaExtrato2) {
                            conta.depositar(deposito);
                        }
                    }
                    break;
                case 4:
                    Scanner entrada3 = new Scanner(System.in);
                    System.out.println("Informe o numero da conta: ");
                    int contaSaque = entrada3.nextInt();

                    Scanner sacar = new Scanner(System.in);
                    System.out.println("Informe o valor a ser depositado: ");
                    Double saque = sacar.nextDouble();

                    for (int i = 0; i < listaContas.size(); i++) {
                        ContaBancaria conta = listaContas.get(i);
                        if (conta.getNumConta() == contaSaque) {
                            if (conta.getEspecial() == true) {
                                conta.sacar(saque);
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}