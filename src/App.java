import java.util.Scanner;
 //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double media1;
  double media2;
  double media3;
  double media4;
  double soma;
  double mediaTotal;

    //Passo 1: fazer a entrada dos dados
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a sua primeira nota: ");
    media1 = teclado.nextDouble();
      System.out.println("Digite a sua segunda nota: ");
    media2 = teclado.nextDouble();
      System.out.println("Digite a sua terceira nota: ");
    media3 = teclado.nextDouble();
      System.out.println("Digite a sua quarta nota: ");
    media4 = teclado.nextDouble();

    //Passo 2: Fazer primeiro calculo
    soma  = media1 + media2 + media3 + media4;
    
    //Passo 3: Fazer o segundo calculo
    mediaTotal = soma / 4;
    
    //Passo 4: exibir a resposta pro usuário
    System.out.println("A soma total de suas notas é de: " + soma);
      System.out.println("A média de suas notas é de: " + mediaTotal);
  }
  
}