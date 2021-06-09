import java.util.Scanner;

public class PR6 {
    public static void main(String[] args) {

        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        //Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L
        //включительно.
        if(k==1){

            System.out.print("Введите длину массива: ");
            int n = nomer.nextInt();
            int a[]  = new int[n];
            int K;
            int L;

            while(true){
                System.out.println("Введите значение K: ");
                K = nomer.nextInt();
                System.out.println("Введите значение L: ");
                L = nomer.nextInt();
                if(K >= 1 & K <= L & L <= n){
                    break;
                }
                else{
                    System.out.println("0_0");
                }
            }

            for(int i = 0; i < n ;i++){
                a[i] = i;
                System.out.println("a["+ i +"] = " +i);

            }

            double sum = 0;
            for(int i = K; i<=L; i++){
                sum += a[i];
            }
            System.out.print(((sum)/(L-K+1)));

        }

        //Зеркальное отражение матрицы
        if(k==2){

            int N = 0;
            int M = 0;
            int pom = 0;
            int a[][];

            while(N <= 0)
            {
                System.out.print("Введите значение N: ");
                N = nomer.nextInt();
            }
            while (M <= 0)
            {
                System.out.print("Введите значение M: ");
                M = nomer.nextInt();
            }

            a = new int[N][M];

            System.out.println("Исходная матрица:");
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    a[i][j] = (int)(Math.random()*10);
                    a[i][j] = (int)(Math.random()*10);
                    System.out.print(" " +a[i][j]);
                }
                System.out.println("");
            }

            for (int i = 0; i < (N/2) ;i++ )
            {
                for (int j = 0; j < M; j++)
                {
                    pom = a[i][j];
                    a[i][j] = a[(N - i - 1)][j];
                    a[(N - i - 1)][j] = pom;
                }
            }

            System.out.println("Зеркальная матрица:");
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    System.out.print(" " +a[i][j]);
                }
                System.out.println("");
            }
        }

        //Четные нечётные
        if(k==3){

            int N = 0;

            while(N <= 0){
                System.out.println("Введите длинну массива: ");
                N = nomer.nextInt();
            }

            int a[] = new int[N];

            System.out.print("Исходный массив: ");

            for(int i = 0; i < a.length; i++){
                a[i] = (int)(Math.random()*10);
                System.out.print(i+" ");

            }

            System.out.println(" ");

            System.out.print("Чётные: ");

            for(int i = 0; i < a.length; i++){
                a[i] = (int)(Math.random()*10);
                if(i % 2 == 0){
                    System.out.print(i+" ");
                }
            }

            System.out.println();
            System.out.print("Нечётные: ");

            for(int i = 0; i > a.length-1; i--){
                a[i] = (int)(Math.random()*10);
                    if(i % 2 != 0) {
                        System.out.print(a[i] + " ");
                    }

            }

//            for (int i = a.length-1; i > 0; i--) {
//                a[i] = (int)(Math.random()*10);
//                if(i % 2 != 0) {
//                    System.out.print(a[i] + " ");
//                }
//            }


        }

        if (k==4){

            int N = 0;
            int M = 0;
            int pom = 0;
            int a[][];

            while(N <= 0)
            {
                System.out.print("Введите значение N: ");
                N = nomer.nextInt();
            }
            while (M <= 0)
            {
                System.out.print("Введите значение M: ");
                M = nomer.nextInt();
            }

            a = new int[N][M];

            System.out.println("Исходная матрица:");
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    a[i][j] = (int)(Math.random()*10);
                    a[i][j] = (int)(Math.random()*10);
                    System.out.print(" " +a[i][j]);
                }
                System.out.println("");
            }

            System.out.println("Изменённая матрица:");
            for(int i = 0; i < M; i++){

                for(int j = 0; j < M - i; j++){
                    System.out.print(" " +a[i][j]);
                }

                for(int j = i + 1; j < M; j++){
                    System.out.print(" " +a[M - i - 1][j]);
                }
                System.out.println("");
            }

        }

    }

}
