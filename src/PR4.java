import java.util.Scanner;

public class PR4 {
    public static void main(String[] args){

        var nomer = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int k = nomer.nextInt();



        if(k==1) {
            //Задание №3

            System.out.println("Введите значение a: ");
            int a = nomer.nextInt();

            if (a > 0) {
                a += 1;
            } else if (a < 0) {
                a -= 2;

            } else {
                a = 10;
            }
            System.out.println("a = " + a);
        }

        else if(k==2){
            //Задание №18
            String p = "";
            int i;

            while (true){
            System.out.println("Введите значение i: ");

            i = nomer.nextInt();

            if(i >= 1 & i <= 999){

            int a = i/100;
            int b = i/10%10;
            int c = i%10;

            switch (a){

                case 1:{
                    p = "Сто ";
                    break;
                }
                case 2:{
                    p = "Двести ";
                    break;
                }
                case 3:{
                    p = "Триста ";
                    break;
                }
                case 4:{
                    p = "Четыреста ";
                    break;
                }
                case 5:{
                    p = "Пятьсот ";
                    break;
                }
                case 6:{
                    p = "Шестьсот ";
                    break;
                }
                case 7:{
                    p = "Семьсот ";
                    break;
                }
                case 8:{
                    p = "Восемьсот ";
                    break;
                }
                case 9:{
                    p = "Девятьсот ";
                    break;
                }

            }
            switch (b){

                case 1:{
                    if(c == 1 & b == 1){
                        p += "Одинадцать ";
                    }
                    else if(c == 2 & b == 1){
                        p += "Двенадцать ";
                    }
                    else if(c == 3 & b == 1){
                        p += "Тринадцать ";
                    }
                    else if(c == 4 & b == 1){
                        p += "Четырнадцать ";
                    }
                    else if(c == 5 & b == 1){
                        p += "Пятнадцать ";
                    }
                    else if(c == 6 & b == 1){
                        p += "Шестнадцать ";
                    }
                    else if(c == 7 & b == 1){
                        p += "Семнадцать ";
                    }
                    else if(c == 8 & b == 1){
                        p += "Восемнадцать ";
                    }
                    else if(c == 9 & b == 1){
                        p += "Девятнадцать ";
                    }
                    else{
                        p += "Десять ";
                    }
                    break;
                }
                case 2:{
                    p += "Двадцать ";
                    break;
                }
                case 3:{
                    p += "Тридцать ";
                    break;
                }
                case 4:{
                    p += "Сорок ";
                    break;
                }
                case 5:{
                    p += "Пятьдесят ";
                    break;
                }
                case 6:{
                    p += "Шестьдесят ";
                    break;
                }
                case 7:{
                    p += "Семьдесят ";
                    break;
                }
                case 8:{
                    p += "Восемьдесят ";
                    break;
                }
                case 9:{
                    p += "Девяносто ";
                    break;
                }

            }
             if(b!=1) {
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
             break;
        }
            else{
                System.out.println("Вы ввели некоректное число :)");
            }
            }
        }

        else if(k==3){

            //Задание №26

            System.out.println("Введите значение x: ");
            double x = nomer.nextDouble();

            if(x <= 0){

                x = -x;

            }
            else if(x > 0 && x < 2){

                x = (Math.pow(x, 2));

            }
            else if(x >= 2){

                x = 4;

            }
            System.out.println("Функция равна " +x);
        }

        else if(k==4){

            //Задание №5

            System.out.print("Введите значение A: ");
            double A = nomer.nextDouble();
            System.out.print("Введите значение B: ");
            double B = nomer.nextDouble();
            double rez;
            if(B!=0){
                System.out.print("Введите знак ( +, -, *, / ): ");
                String znak = nomer.next();
                switch(znak){
                    case "+":{
                        rez = A+B;
                        System.out.println("A + B = " +rez);
                        break;
                    }
                    case "-":{
                        rez = A-B;
                        System.out.println("A - B = " +rez);
                        break;
                    }
                    case "*":{
                        rez = A*B;
                        System.out.println("A * B = " +rez);
                        break;
                    }
                    case "/":{
                        rez = A/B;
                        System.out.println("A / B = " +rez);
                        break;
                    }
                    default:
                        System.out.println("Вы ввели не то");
                }
            }
            else
                System.out.println("Error");


        }

    }
}
