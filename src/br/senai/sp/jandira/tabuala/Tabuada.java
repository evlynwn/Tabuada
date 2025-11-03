package br.senai.sp.jandira.tabuala;

import java.util.Scanner;

public class Tabuada {

    public int multiplicando;
    public int multiplicandoInicial;
    public int multiplicandoFinal;
    public String[] tabuada;

        public void Coletardados(){
            Scanner leitor = new Scanner(System.in);

            System.out.println("Qual é o valor do mutiplicando?");
            multiplicando = leitor.nextInt();

            System.out.println("Qual o valor inicial do mutiplicando?");
            multiplicando = leitor.nextInt();

            System.out.println("Qual o valor final do mutiplicando?");
            multiplicando = leitor.nextInt();

        }

        public void calculatTabuada(){

            int apoio = 0;
            if (multiplicandoFinal < multiplicandoInicial){
                apoio = multiplicandoFinal;
                multiplicandoFinal = multiplicandoInicial;
                multiplicandoInicial = apoio;
            }
            int tamanho = multiplicandoFinal - multiplicandoInicial + 1;
            tabuada = new String[tamanho];

            int i = 0;
            while (i < tamanho) {
                int produto = multiplicando * multiplicandoInicial;
                tabuada[i] = multiplicando + " X " + multiplicandoInicial + " = " + produto;
                multiplicandoInicial = multiplicandoInicial + 1;
                i = i + 1;





            }
            exibirTabuada();


        }
        public void exibirTabuada(){
            System.out.println("Resultado da sua tabuada");

            int i = 0;
            while (i < tabuada.length) {
                System.out.println(tabuada[i]);
                i++; // i = i + 1
            }


        }

}