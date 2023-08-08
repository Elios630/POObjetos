import java.util.Scanner;

class VerificaNumeroPrimo{

    static public void main(String args[]){

        //int num = 977;

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
