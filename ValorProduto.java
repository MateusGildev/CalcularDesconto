import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class ValorProduto{
    public static void main(String args[]){
      double valor;
      double percentual;
      double valor_final;
      String nome; 
        
      Scanner ler = new Scanner(System.in);
      System.out.println("Nome do produto: ");
      nome = ler.nextLine();

      System.out.println("valor do "+nome+": ");
      valor = ler.nextInt();
      

      System.out.println("valor do desconto (%): ");
      percentual = ler.nextInt();

      valor_final = valor + ((percentual/100) * valor);
      
      System.out.println("O novo valor do produto é de R$"+valor_final);
      System.exit(0);
    }
  } 