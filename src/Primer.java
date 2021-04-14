import java.util.Scanner;

public class Primer {
    public static void main(String[] args) {

        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания:");

        int k = nomer.nextInt();
        if (k==1){

            //Задание №27

            var num = new Scanner(System.in);
            var a = num.nextInt();
            int otv = 0;
            otv = a+a;
            System.out.println(otv);
            otv = (otv+otv)*a;
            System.out.println(otv);
            otv = (otv+otv)*(a*a);
            System.out.println(otv);

        }

        else if (k==2){

            //Задание №13

            var num = new Scanner(System.in);
            System.out.print("Первый радиус: ");
            double r1 = num.nextDouble();
            System.out.print("Второй радиус: ");
            double r2 = num.nextDouble();
            double pi = 3.14;
            double S1 = 0;
            double S2 = 0;
            double S3= 0;
            if(r1 <= r2){
            System.out.println("Введи значение r1 так, чтобы оно было больше r2 ;)");

        }
            else{
            S1 = pi * Math.pow(r1,2);
            System.out.println("Первая площадь равна: " + S1);
            S2 = pi * Math.pow(r2,2);
            System.out.println("Вторая площадь равна: " + S2);
            S3 = S1 - S2;
            System.out.println("Третья площадь равна: " + S3);

        }
        }

        else if(k==3){

            //Задание №3

            var num = new Scanner(System.in);
            System.out.print("Введите длину стороны: ");
            double a = num.nextDouble();
            double S = 0;

            S = Math.pow(a, 2);
            System.out.println("Площадь равна: " + S);
        }

        else if(k==4){
            //Задание 21:

            var num = new Scanner(System.in);

            System.out.print("Введите значение x1: ");
            var x1= num.nextDouble();
            System.out.print("Введите значение x2: ");
            var x2= num.nextDouble();
            System.out.print("Введите значение x3: ");
            var x3= num.nextDouble();
            System.out.print("Введите значение y1: ");
            var y1= num.nextDouble();
            System.out.print("Введите значение y2: ");
            var y2= num.nextDouble();
            System.out.print("Введите значение y3: ");
            var y3= num.nextDouble();

            double a, b, c, p, S, P;

            a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            System.out.println("a = " + a);
            b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
            System.out.println("b = " + b);
            c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
            System.out.println("c = " + c);

            P = a + b + c;
            System.out.println("P = " + P);
            p = P / 2;
            System.out.println("p = " + p);
            S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("S = " + S);

        }

        else if(k==5) {

            //Задание 14:

            var num = new Scanner(System.in);
            System.out.print("Введите значение L: ");
            double L = num.nextDouble();
            double R, S;
            var pi = 3.14;

            R = L/(2 * pi);
            System.out.println("R = " + R);
            S = pi * Math.pow(R,2);
            System.out.println("S = " + S);

        }
    }
}
