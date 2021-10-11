package com.company.calcium_collision;

public class Main {

    public static void main(String[] args) {
        primeNums(1,100);

    }

    public static void primeNums(int minNumber,
                                 int maxNumber){


        for (int a = minNumber; a < maxNumber; a++){

            for (int d = 2; d<=a; d++){
                if (d == a){
                    System.out.print(a + " ");
                }
                if (a % d == 0){
                    break;
                }
            }
        }

    }

}