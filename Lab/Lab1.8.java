package Lab1;

import java.util.Scanner;

public class Lab1_8 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt(); 

     int[] num = new int[N];

     for (int i = 0; i < N; i++) {
         num[i] = sc.nextInt();
     }

     int max = num[0];
     for (int i = 1; i < N; i++) {
         if (num[i] > max) {
             max = num[i];
         }
     }

     System.out.println(max); 

     sc.close();
 }
 
}
