import java.util.Scanner;

class VerificaNumeroPrimo{

    static public void main(String args[]){

        System.out.println("informe o numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int confirma = verificaNumeroPrimo(num);
        System.out.println(confirma);
    }

    static int verificaNumeroPrimo(Integer n){
        for(int i = 2; i<n ;i++){
            if(n % i ==0){
                return 0;
            }
        }
        return 1;
    }
}
