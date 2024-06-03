package PCT01EX01;

import java.util.Random;
import java.util.Scanner;

public class jogotabuleiro {
    public static void main(String[] args) {
        Random dado = new Random();
        int soma1 = 0;
        int soma2 = 0;
        int resultfinal = 0;
        int jogadores = 1, numero;
        int [] reves = {3, 5, 8, 12, 16, 17, 21, 25, 28, 30};
        int [] sorte = {2, 7, 9, 11, 13, 18, 19, 22, 26, 29};

while ((jogadores != 0) && (soma1 <31) && (soma2 < 31)){
        Scanner jog = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo de Tabuleiro VIAGEM ESPACIAL");
        System.out.println("Ajude os astronautas a encontrarem o Planeta Roxo para salvarem seu territorio do fim do mundo!");
        System.out.println("Boa sorte!!!");
        System.out.println("De quem eh a vez: ");
        System.out.println("1 - Astronauta Americano");
        System.out.println("2 - Astronauta Russo");
        jogadores = jog.nextInt();
        switch (jogadores) {
            case 1:
                System.out.println("Insira o numero 2 para jogar o dado: ");
                numero = jog.nextInt();
                if (numero == 2) {
                    int dado1 = dado.nextInt(6)+1;
                    System.out.println("Voce tirou " + dado1);
                    soma1 += resultfinal;
                    resultfinal += dado1;
                    System.out.println("Voce esta na casa de posicao " + resultfinal);
                    if (resultfinal == reves[0] || resultfinal == reves[1] || resultfinal == reves[2] || resultfinal == reves[3] || resultfinal == reves[4] || resultfinal == reves[5] || resultfinal == reves[6] || resultfinal == reves[7] || resultfinal == reves[8] || resultfinal == reves[9]) {
                        resultfinal = resultfinal - 2;
                        System.out.println("Agora, depois de voltar duas casas, voce esta na casa posicao " + resultfinal);
                    } if (resultfinal == sorte[0] || resultfinal == sorte[1] || resultfinal == sorte[2] || resultfinal == sorte[3] || resultfinal == sorte[4] || resultfinal == sorte[5] || resultfinal == sorte[6] || resultfinal == sorte[7] || resultfinal == sorte[8] || resultfinal == sorte[9]) {
                        resultfinal = resultfinal + 2;
                        System.out.println("Agora, depois de avancar duas casas, voce esta na casa posicao " + resultfinal);
                    } if (resultfinal >= 31) {
                        System.out.println("PARABÉNS!! O Astronauta Americano ganhou o jogo VIAGEM ESPACIAL");
                    }
                        break;
                }
            case 2:
                System.out.println("Insira o numero 2 para jogar o dado: ");
                numero = jog.nextInt();
                if (numero == 2) {
                    int dado2 = dado.nextInt(6)+1;
                    System.out.println("Voce tirou " + dado2);
                    soma2 += resultfinal;
                    resultfinal += dado2;
                    System.out.println("Voce esta na casa de posicao " + resultfinal);
                    if (resultfinal == reves[0] || resultfinal == reves[1] || resultfinal == reves[2] || resultfinal == reves[3] || resultfinal == reves[4] || resultfinal == reves[5] || resultfinal == reves[6] || resultfinal == reves[7] || resultfinal == reves[8] || resultfinal == reves[9]) {
                        resultfinal = resultfinal - 2;
                        System.out.println("Agora, depois de voltar duas casas, voce esta na casa posicao " + resultfinal);
                    } if (resultfinal == sorte[0] || resultfinal == sorte[1] || resultfinal == sorte[2] || resultfinal == sorte[3] || resultfinal == sorte[4] || resultfinal == sorte[5] || resultfinal == sorte[6] || resultfinal == sorte[7] || resultfinal == sorte[8] || resultfinal == sorte[9]) {
                        resultfinal = resultfinal + 2;
                        System.out.println("Agora, depois de avancar duas casas, voce esta na casa posicao " + resultfinal);
                    } if (resultfinal >= 31) {
                        System.out.println("PARABÉNS!! O Astronauta Russo ganhou o jogo VIAGEM ESPACIAL");
                    }
                    break;
                }

             }
           }
        }
    }
