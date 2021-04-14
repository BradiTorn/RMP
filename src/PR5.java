import java.util.Scanner;

public class PR5 {
    public static void main(String[] args) {
        var nomer = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int k = nomer.nextInt();

        if (k == 1) {

            System.out.print("Введите цену за 1 кг: ");
            double cena1 = nomer.nextDouble();
            double rez;
            double kg = 1.0;
            double i;
            double cena2 = cena1;

            for (; kg <= 1.8; ) {


                kg = kg + 0.2;
                rez = (0.2 * cena1) + cena2;
                cena2 = rez;

                System.out.println(kg + " - кг, цена - " + cena2);
            }

        }

        if (k == 2) {

            while (true) {

                System.out.print("Введите число: ");
                int N = nomer.nextInt();
                int rez = 1;

                if (N > 0) {

                    while (N >= 2) {
                        rez = rez * N;
                        N = N - 2;
                    }

                    System.out.println("Двойной факториал равен: " + rez);
                    break;

                } else {
                    System.out.println("Вы ввели некоректное число");
                }

            }

        }

        if (k == 3) {

            System.out.print("Введите цену за 1 кг: ");
            double cena1 = nomer.nextDouble();
            double rez;
            double kg = 1.0;
            double i;
            double cena2 = cena1;
            for (; kg < 10; ) {


                kg = kg + 1;
                rez = (1 * cena1) + cena2;
                cena2 = rez;

                System.out.println(kg + " - кг, цена - " + cena2);
            }

        }

        if (k == 4) {

            System.out.print("Введите N: ");
            int N = nomer.nextInt();
            int rez1;
            int rez2;
            boolean l = false;

                while (N > 0) {


                    rez1 = N % 10;
                    N = N / 10;

                    if (rez1 % 2 != 0) {
                        l = true;
                    }

                }
            System.out.println(l);


        }



    }


}



