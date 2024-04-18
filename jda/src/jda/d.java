package jda;

import java.util.Scanner;

public class d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        int cho, score = 0;
        int temp = 0;
        int lengk1, lengk2, lengk3, lengk4, lengk5;

        System.out.print("횟수 입력: ");
        cho = sc.nextInt();

        for(int i = 0 ; i < cho ; i++) {

            for(int j = 0; j<a.length ; j++) {
                a[j] = (int)(Math.random() * 6) + 1; 
            }//j

            for(int j = 0; j<=5 ; j++) {
                for(int e = 0; e<=5; e++) {
                    if(a[j] == a[e])
                        temp++;
                }
                //여기서 막힘
            }

            System.out.print(i+1 + "회 결과: ");

            for(int j = 0; j<a.length ; j++) {
                System.out.print(a[j] + " "); 
            }//j

            System.out.println();
        }//i
        
    }
}