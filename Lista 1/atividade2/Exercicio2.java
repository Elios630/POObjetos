import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
	
        double celsius, fahrenheit;
        
        int  op = 0;
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Conversao voltado para: ");
        System.out.println("1 - Celsius: ");
        System.out.println("2 - Fahrenheit: ");
        op = Integer.parseInt(scann.nextLine());
        
        switch(op){
            case 1:
            System.out.println("Digite o Fahrenheit: ");
            fahrenheit = (scann.nextDouble());
            celsius = (fahrenheit - 32)/1.8;
            System.out.println("O resultado é: " +(celsius) + " celsius");
                break;
            
             case 2:
                System.out.println("Digite o celsius: ");
                celsius = (scann.nextDouble());
                fahrenheit = (celsius * 1.8) + 32;
                System.out.println("O resultado é: " +(fahrenheit) + " fahrenheit");
                break;
        }
        
    }
}
