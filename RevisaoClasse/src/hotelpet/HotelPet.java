package hotelpet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class HotelPet {

    public static void main(String[] args) {

        List<Animal> hospedes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Check in");
            System.out.println("2 - Check out");
            System.out.println("3 - Sair");
            System.out.println("EScolha uma opcao:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Check in:");
                    System.out.println("1 - para gato, 2 - cachorro:");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a raca: ");
                    String raca = sc.nextLine();
                    if(escolha == 1){
                        Gato g = new Gato(nome, raca);
                        hospedes.add(g);
                    }else{
                        Cachorro c = new Cachorro(nome, raca);
                        hospedes.add(c);
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("opcao invalida!");
                    break;
            }

        } while (opcao != 3);
        
    }
}
