package br.ulbra.classe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Ex19 {

    public static void main(String[] args) {

        ArrayList<String> criancas = new ArrayList<String>();
        int op = 0, index = -1;
        String name = "";

        Scanner input = new Scanner(System.in);

        while (op != 6) {
            System.out.println("1 - Adicionar nome;\n"
                    + "2 - Alterar nome;\n"
                    + "3 - Excluir nome;\n"
                    + "4 - Listar todos os nomes;\n"
                    + "5 - Pesquisar um nome desejado;\n"
                    + "6 - Sair do programa.");
            System.out.println("Digite a sua opção:");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Insira o nome:");
                    input.nextLine();
                    break;
                case 2:
                    if (criancas.isEmpty()) {
                        System.out.println("Não existem crianças");
                    } else {
                        System.out.println("Insira o nome que você quer alterar: ");
                        name = input.nextLine();
                        for (int i = 0; i < criancas.size(); i++) {
                            if (criancas.get(i).equals(name)) {
                                index = i;
                            } else {
                                System.out.println("Nome não encontrado");
                                index = -1;
                            }
                        }
                        if (index != -1) {
                            System.out.println("Insira o novo nome:");
                            criancas.set(index, name);
                        } else {
                            System.out.println("Saindo da função");
                        }
                    }
                case 3:
                    if (criancas.isEmpty()) {
                        System.out.println("Não existem crianças");
                    } else {
                        System.out.println("Insira o nome que você quer excluir: ");
                        name = input.nextLine();
                        for (int i = 0; i < criancas.size(); i++) {
                            if (criancas.get(i).equals(name)) {
                                index = i;
                            } else {
                                System.out.println("Nome não encontrado");
                                index = -1;
                            }
                        }
                        if (index != -1) {
                            criancas.remove(index);
                            System.out.println("Excluido:");

                        } else {
                            System.out.println("Saindo da função");
                        }
                    }
                case 4:
                    if (criancas.isEmpty()) {
                        System.out.println("Nada no array");
                    } else {
                        for (int i = 0; i < criancas.size(); i++) {
                            System.out.println("Nome [" + i + "]" + criancas.get(i));
                        }
                    }
                case 5:
                    if (criancas.isEmpty()) {
                        System.out.println("Não existem crianças");
                    } else {
                        System.out.println("Insira o nome que você quer pesquisar: ");
                        name = input.nextLine();
                        for (int i = 0; i < criancas.size(); i++) {
                            if (criancas.get(i).equals(name)) {
                                index = i;
                            } else {
                                System.out.println("Nome não encontrado");
                                index = -1;
                            }
                        }
                        if (index != -1) {
                            System.out.println("A criança está em:" + (index + 1) + "º posição");
                        } else {
                            System.out.println("Saindo da função");
                        }
                    }
                case 6:
                    System.out.println("Saindo");
                default:
                    System.out.println("Número inválido");
            }
        }
    }
}
