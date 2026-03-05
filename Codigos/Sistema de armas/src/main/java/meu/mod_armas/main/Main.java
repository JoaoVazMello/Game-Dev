package meu.mod_armas.main;

import meu.mod_armas.api.Entity;
import meu.mod_armas.api.IWeapon;

import java.util.ArrayList;
import java.util.Scanner;

import static meu.mod_armas.weapons.internal.WeaponFactory.*;

public class Main {

    static void main() {

        Scanner leitor = new Scanner(System.in);

        Entity zumbi = new Entity("zumbi", 20, 10, false, new ArrayList<>());
        Entity player = new Entity("player", 20, 10, false, new ArrayList<>());

        int opcao = 0;

        // simulaçao de gameloop
        while (opcao != -1) {
            System.out.println("Digite uma opçao para derrotar o zumbi ");
            System.out.println("Vida do zumbi: " + zumbi.getHealth());

            System.out.println("========================================");
            System.out.println(" 1) Adicionar armamento ");
            System.out.println(" 2) Remover armamento ");
            System.out.println(" 3) ListarArmamentos");
            System.out.println(" 4) Causar Dano");
            System.out.println(" 5) Sair");
            System.out.println("========================================");

            System.out.print(" Digite alguma opçao: ");
            System.out.print(" ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    int numeroArmamento;

                    System.out.println("    1) Fire Sword");
                    System.out.println("    2) Ice Sword");
                    System.out.println("    3) Poison Sword");
                    System.out.println("    4) Nao adicionar armamento");

                    System.out.print("  Escolha o armamento: ");
                    numeroArmamento = leitor.nextInt();

                    if(numeroArmamento == 1){
                        player.AdicionarArmamento(player, getFireSword());
                        System.out.println("Armamento adicionado com sucesso!");
                        System.out.println("============================================");
                        System.out.println(" ");

                    }else if(numeroArmamento == 2){
                        player.AdicionarArmamento(player, geticeSword());
                        System.out.println("Armamento adicionado com sucesso!");
                        System.out.println("============================================");
                        System.out.println(" ");

                    }else if(numeroArmamento == 3){
                        player.AdicionarArmamento(player, getPoisonSword());
                        System.out.println("Armamento adicionado com sucesso!" + player.getArmaPorNome("Poison Sword"));
                        System.out.println("============================================");
                        System.out.println(" ");

                    }else if(numeroArmamento >= 4){
                        System.out.println("nada adicionado");
                        System.out.println("============================================");
                        System.out.println(" ");
                    }

                    break;

                case 2:
                    System.out.println("Em desenvolvimento");
                    break;

                case 3:
                    player.listarArmamento(player);
                    break;

                case 4:
                    int numeroArmamento2;

                    System.out.println("        Selecione qual armamento utilizar");

                    System.out.println("        =================================");
                    System.out.println("        1) Fire Sword");
                    System.out.println("        2) Ice Sword");
                    System.out.println("        3) Poison Sword");

                    System.out.print("      Digite numero do armamento: ");
                    numeroArmamento2 = leitor.nextInt();

                    IWeapon armaEncontrada;

                    switch(numeroArmamento2){

                        case 1:
                            armaEncontrada = player.getArmaPorNome("Fire Sword");

                            if (armaEncontrada != null) {
                                zumbi = player.CausarDemage(zumbi, armaEncontrada);
                                System.out.println("Ataque realizado!");
                            } else {
                                System.out.println("Você não possui a Fire Sword no inventário!");
                                System.out.println("============================================");
                                System.out.println(" ");
                            }
                        break;

                        case 2:

                            armaEncontrada = player.getArmaPorNome("Ice Sword");

                            if (armaEncontrada != null) {
                                zumbi = player.CausarDemage(zumbi, armaEncontrada);
                                System.out.println("Ataque realizado!");
                            } else {
                                System.out.println("Você não possui a Fire Sword no inventário!");
                                System.out.println("============================================");
                                System.out.println(" ");
                            }
                        break;

                        case 3:
                            armaEncontrada = player.getArmaPorNome("Poison Sword");

                            if (armaEncontrada != null) {
                                zumbi = player.CausarDemage(zumbi, armaEncontrada);
                                System.out.println("Ataque realizado!");
                            } else {
                                System.out.println("Você não possui a Fire Sword no inventário!");
                                System.out.println("============================================");
                                System.out.println(" ");
                            }
                        break;

                        default:
                            System.out.println("Opçao invalida");
                        break;
                    }
                break;

                case 5:
                    opcao = -1;
                    break;

                default:
                    System.out.println("Decisao Invalida");
                    break;
            }

            if(zumbi.getHealth() <= 0){
                System.out.println("Monstro derrotado");
                opcao = -1;
            }
        }
    }
}