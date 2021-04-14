import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        var nomer = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        if(k==1){

            System.out.print("Введите значение A: ");
            int A = nomer.nextInt();
            System.out.print("Введите значение B: ");
            int B = nomer.nextInt();
            int rez = 0;

            if(A != B){
                rez = A+B;
                A = rez;
                B = rez;
            }
            else{
                A = 0;
                B = 0;
            }

            System.out.println("A = "+A);
            System.out.println("B = "+B);


        }
        else if(k==2){

            double R;
            double D;
            double L;
            double S;
            System.out.print(" 1. Радиус ");
            System.out.print("\n 2. Диаметр ");
            System.out.print("\n 3. Длина ");
            System.out.print("\n 4. Площадь круга ");
            System.out.print("\n Введите значение: ");
            int n = nomer.nextInt();
            double pi = 3.14;

            switch (n){
                case 1:{

                    System.out.print("Введите значение R: ");
                    R = nomer.nextDouble();
                    D = 2*R;
                    L = 2*pi*R;
                    S = pi*Math.pow(R, 2);
                    System.out.print(" Радиус равен:  "+R);
                    System.out.print("\n Диаметр равен:  "+D);
                    System.out.print("\n Длина равна: "+L);
                    System.out.print("\n Площадь круга равна:  "+S);
                    break;
                }
                case 2:{

                    System.out.print("Введите значение D: ");
                    D = nomer.nextDouble();
                    R = D/2;
                    L = 2*pi*R;
                    S = pi*Math.pow(R, 2);
                    System.out.print(" Радиус равен:  "+R);
                    System.out.print("\n Диаметр равен:  "+D);
                    System.out.print("\n Длина равна: "+L);
                    System.out.print("\n Площадь круга равна:  "+S);
                    break;
                }
                case 3:{

                    System.out.print("Введите значение L: ");
                    L = nomer.nextDouble();
                    R = L/(2*pi);
                    D = 2*R;
                    S = pi*Math.pow(R, 2);
                    System.out.print(" Радиус равен:  "+R);
                    System.out.print("\n Диаметр равен:  "+D);
                    System.out.print("\n Длина равна: "+L);
                    System.out.print("\n Площадь круга равна:  "+S);
                    break;
                }
                case 4:{

                    System.out.print("Введите значение S: ");
                    S = nomer.nextDouble();
                    R = Math.sqrt(S/pi);
                    D = 2*R;
                    L = 2*pi*R;
                    System.out.print(" Радиус равен:  "+R);
                    System.out.print("\n Диаметр равен:  "+D);
                    System.out.print("\n Длина равна: "+L);
                    System.out.print("\n Площадь круга равна:  "+S);
                    break;
                }

            }
        }




        else{
            System.out.println("ОшибОчка");
        }






    }
}
