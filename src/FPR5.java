import java.util.Scanner;

public class FPR5 {
    public static void main(String[] args) {
        var nomer = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int k = nomer.nextInt();

        if(k==1){
            int N;
            System.out.println("Введите число N: ");
            N = nomer.nextInt();
            int rez = 1;
            int g = 1;
            do{
                g++;
                rez = rez + g;
            }while(rez<=N);

            System.out.println("Число: " +g);
            System.out.println("Сумма: " +rez);
        }

    }
}
