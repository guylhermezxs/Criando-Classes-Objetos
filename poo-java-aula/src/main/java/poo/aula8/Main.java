package poo.aula8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as especificações do PC:");
        System.out.println();
        System.out.println("Informe a especificação da placa mãe:");
        System.out.print("Digite a marca da placa mãe:");
        String marcaPlacaMae = sc.nextLine();
        System.out.print("Digite o modelo da placa mãe:");
        String modeloPlacaMae = sc.nextLine();
        System.out.print("Digite o soquete da placa mãe:");
        String soquetePlacaMae = sc.nextLine();
        PlacaMae placaMae = new PlacaMae(marcaPlacaMae,modeloPlacaMae,soquetePlacaMae);
        System.out.println();
        System.out.println("Informe a especificação do processador:");
        System.out.print("Digite a marca do processador:");
        String marcaProcessador = sc.nextLine();
        System.out.print("Digite o modelo do processador:");
        String modeloProcessador = sc.nextLine();
        System.out.print("Digite a frequência do processador:");
        String frequenciaProcessador = sc.nextLine();
        Processador processador = new Processador(marcaProcessador,modeloProcessador,frequenciaProcessador);
        System.out.println();
        System.out.println("Informe a especificação da memória:");
        System.out.print("Digite a marca da memória:");
        String marcaMemoria = sc.nextLine();
        System.out.print("Digite o modelo da memória:");
        String modeloMemoria = sc.nextLine();
        System.out.print("Digite a capacidade de armazenamento da memória:");
        String capacidadeDeArmazenamentoMemoria = sc.nextLine();
        Memoria memoria = new Memoria(marcaMemoria,modeloMemoria,capacidadeDeArmazenamentoMemoria);
        System.out.println();
        System.out.println("Informe a especificação do dispositivo de armazenamento:");
        System.out.print("Digite a marca do dispositivo de armazenamento:");
        String marcaDispositivoArmazenamento = sc.nextLine();
        System.out.print("Digite o modelo do dispositivo de armazenamento:");
        String modeloDispositivoArmazenamento = sc.nextLine();
        System.out.print("Digite capacidade de armazenamento do dispositivo de armazenamento:");
        String capacidadeDeArmazenamentoDispositivo = sc.nextLine();
        System.out.print("Digite o tipo de conexão do dispositivo de armazenamento:");
        String tipoConexaoDispositivo = sc.nextLine();
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento(marcaDispositivoArmazenamento,modeloDispositivoArmazenamento,capacidadeDeArmazenamentoDispositivo,tipoConexaoDispositivo);
        System.out.println();

        System.out.println("Especificações do PC");
        System.out.println("Dados da Placa Mãe: " + placaMae);
        System.out.println("Dados do Processador: " + processador);
        System.out.println("Dados da Memória: " + memoria);
        System.out.println("Dados do Dispositivo de armazenamento " + dispositivoDeArmazenamento);
    }
}
