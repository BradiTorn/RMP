import java.util.Scanner;

public class FS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int k = sc.nextInt();

        if(k == 1){
            System.out.print("Введите радиус: ");
            double radius = sc.nextDouble();
            double circumference= Math.PI * 2*radius;
            System.out.println("Длины окружности равна: " + circumference) ;
            double diametr = 2*radius;
            System.out.print("Диаметр окружности равен: " + diametr);
        }
        if(k==2){

            int A;
            int B;
            int X;
            int Y;
            double Res;
            double Res1;

            System.out.print("Введите X (кг конфет): ");
            X = sc.nextInt();
            System.out.print("Введите A (цена за X кг): ");
            A = sc.nextInt();

            System.out.print("Введите Y (кг ирисок): ");
            Y = sc.nextInt();
            System.out.print("Введите B (цена за Y кг): ");
            B = sc.nextInt();

            Res = A/X;
            Res1 = B/Y;
            System.out.println("1 кг конфет стоит: " + Res );
            System.out.println("1 кг ирисок стоит: " + Res1);
            if(Res1 > Res){
                System.out.println("Ириски дороже");
            }
            else {
                System.out.println("1 кг конфет стоит в " + Res/Res1 + " раз дороже, чем 1 кг ирисок");
            }
        }

        if(k==3){
            System.out.print("Введите значение a: ");
            int a = sc.nextInt();
            System.out.print("Введите значение b: ");
            int b = sc.nextInt();
            int rez;

            if (a != b) {
                rez = a + b;
                a = rez;
                b = rez;
            } else {
                a = b = 0;

            }
            System.out.println("a = " +a);
            System.out.println("b = " +b);
        }

        if(k==4){
            double R;
            double D;
            double L;
            double S;
            System.out.print(" 1. Радиус ");
            System.out.print("\n 2. Диаметр ");
            System.out.print("\n 3. Длина ");
            System.out.print("\n 4. Площадь круга ");

            int n;
            while(true){
                System.out.print("\n Введите значение: ");
                n = sc.nextInt();
                if(n >=1 & n <=4){
                    break;
                }
                else{
                    System.out.println("Вы ввели некоректное число. Введите его заново :) ");
                }
            }

            double pi = 3.14;

            switch (n){
                case 1:{

                    System.out.print("Введите значение R: ");
                    R = sc.nextDouble();
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
                    D = sc.nextDouble();
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
                    L = sc.nextDouble();
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
                    S = sc.nextDouble();
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

        if(k==5){

            Scanner nomer = new Scanner(System.in);
            System.out.println("Введите значение i: ");
            String p = "";
            int i = nomer.nextInt();
            if(i <= 999 & i >=1) {


            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;

            switch (a) {

                case 1: {
                    p = "Сто ";
                    break;
                }
                case 2: {
                    p = "Двести ";
                    break;
                }
                case 3: {
                    p = "Триста ";
                    break;
                }
                case 4: {
                    p = "Четыреста ";
                    break;
                }
                case 5: {
                    p = "Пятьсот ";
                    break;
                }
                case 6: {
                    p = "Шестьсот ";
                    break;
                }
                case 7: {
                    p = "Семьсот ";
                    break;
                }
                case 8: {
                    p = "Восемьсот ";
                    break;
                }
                case 9: {
                    p = "Девятьсот ";
                    break;
                }

            }

            switch (b) {

                case 1: {
                    p += "Десять ";
                    break;
                }
                case 2: {
                    p += "Двадцать ";
                    break;
                }
                case 3: {
                    p += "Тридцать ";
                    break;
                }
                case 4: {
                    p += "Сорок ";
                    break;
                }
                case 5: {
                    p += "Пятьдесят ";
                    break;
                }
                case 6: {
                    p += "Шестьдесят ";
                    break;
                }
                case 7: {
                    p += "Семьдесят ";
                    break;
                }
                case 8: {
                    p += "Восемьдесят ";
                    break;
                }
                case 9: {
                    p += "Девяносто ";
                    break;
                }

            }
            if (b != 1) {
                switch (c) {
                    case 1: {
                        p += "Один";
                        break;
                    }
                    case 2: {
                        p += "Два";
                        break;
                    }
                    case 3: {
                        p += "Три";
                        break;
                    }
                    case 4: {
                        p += "Четыре";
                        break;
                    }
                    case 5: {
                        p += "Пять";
                        break;
                    }
                    case 6: {
                        p += "Шесть";
                        break;
                    }
                    case 7: {
                        p += "Семь";
                        break;
                    }
                    case 8: {
                        p += "Восемь";
                        break;
                    }
                    case 9: {
                        p += "Девять";
                        break;
                    }
                }
            }
            System.out.println(p);
            }
            else{
                System.out.println("Вы ввели некоректное число:(");
            }
        }
    }
}