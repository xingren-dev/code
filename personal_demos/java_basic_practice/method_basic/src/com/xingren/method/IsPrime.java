package com.xingren.method;

public class IsPrime {
    public static void main(String[] args) {
        /*
        System.out.println(isPrime(1));//false
        System.out.println(isPrime(2));//true
        System.out.println(isPrime(9));//false
        System.out.println(isPrime(17));//true
         */
        printPrime(2,50);



    }
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }

        }

        return true;
    }

    public static void printPrime(int m,int n) {
        for (int i = m; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
