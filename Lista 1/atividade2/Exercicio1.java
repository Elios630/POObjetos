import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
	
        int n1;
        int n2;
        
        String  operacao = "";
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        n1 = Integer.parseInt(scann.nextLine());
        
        System.out.println("Digite o segundo numero: ");
        n2 = Integer.parseInt(scann.nextLine());
        
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = scann.nextLine();

        switch(operacao){
            case "+":
                System.out.println("O resultado da subtração é: " +(n1 + n2));
                break;
            
             case "-":
                System.out.println("O resultado da subtração é: " +(n1 - n2));
                break;

             case "*":
                System.out.println("O resultado da multiplicação é: " +(n1 * n2));
                break;

             case "/":
                System.out.println("O resultado da divisão é: " +(n1 / n2));
                break;
        }
        
    }
    
}
