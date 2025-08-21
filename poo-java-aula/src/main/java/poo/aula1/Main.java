package poo.aula1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++){
            System.out.println();
            System.out.printf("Digite nome do cliente [%d]:\n" , i + 1);
            String nome = sc.nextLine();
            System.out.println("Digite a idade do cliente:");
            int idade = sc.nextInt();
            sc.nextLine();
            Usuario usuario = new Usuario(nome,idade);
            listaUsuarios.add(usuario);
        }

        for(Usuario usuario: listaUsuarios){
            System.out.println(usuario);
        }

    }
}