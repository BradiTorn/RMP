import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class MAtrixFedia {
    public static void main(String[] args) {

        var nomer = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        if (k == 1) {


            int sum = 0;
            int m = 0;


            while (m<=0) {
                System.out.println("Введие m :");
                m = nomer.nextInt();
            }
            int[][] a = new int[m][m];
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Введите число массива "+i +","+j+": ");
                    a[i][j] = nomer.nextInt();
                }
            }
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");

                }
                System.out.println();
            }
            for (int j = 1; j <m; j++) {
                sum = 0;
                for (int i = 0; i<j; i++) {
                    sum = sum + a[i][j-i-1];
                }
                System.out.println(sum);
            }

            for (int j = m-1;j>0;j--) {
                sum = 0;
                for (int i = 0; i < j; i++) {
                    sum = sum + a[m - j + i][m - i-1];
                }
                System.out.println(sum);
            }
        }
        else if(k == 2){
            int z = nomer.nextInt();
            int i=0;
            int ara[] = new int [z];
            for(int j = 0;j<z;j++){
                ara[j] = nomer.nextInt();
            }
           for(int j = 0;j<ara.length;j++){
                System.out.println(i +" : "+ara[i]);
                System.out.println(z-i-1 +" : "+ ara[z-i-1]);
                i++;
            }
        }
    }


}