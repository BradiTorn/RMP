import java.util.Scanner;

public class PR7 {

    public static void main(String[] args) {


        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        //Дана строка-предложение на русском языке. Подсчитать количество
        //содержащихся в строке знаков препинания.

        if (k == 1) {

            Scanner console = new Scanner(System.in);
            String text;
            text = console.nextLine();
            int before = text.length();
            int after = text.replaceAll("[,.]", "").length();
            System.out.println("Количество знаков препинания: " + (before - after));

        }

        if (k == 2) {

            Scanner text = new Scanner(System.in);

            int n;
            System.out.print("N: ");
            n = nomer.nextInt();
            String str;
            str = String.valueOf(n);
            StringBuilder sb = new StringBuilder(str);
            sb = sb.reverse();
            str = String.valueOf(sb);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i > 0) {
                    result.append(" ");
                }
                result.append(str.charAt(i));
            }

            System.out.println(result.toString());
        }

        if(k==3){

            Scanner text = new Scanner(System.in);
            String s;
            s = text.nextLine();
            String s1;
            s1 = text.nextLine();
            String s2;
            s2 = text.nextLine();
            s = s.replaceAll(s1, s2);
            System.out.println(s);
        }
    }
}
