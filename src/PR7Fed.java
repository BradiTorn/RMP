import java.util.Scanner;

public class PR7Fed {
    public static void main(String[] args) {
        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        if(k==1){

            Scanner console = new Scanner(System.in);
            String text;
            text = console.nextLine();
            int before = text.length();
            int after = text.replaceAll("[,.]", "").length();
            System.out.println("Количество знаков препинания: " + (before - after));

        }

        if(k==2){

            Scanner text = new Scanner(System.in);

            String str = text.nextLine();
            int n = 0;
            for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                n += (str.charAt(i) - '0') * j;
            }
            System.out.println("\"" + str + "\" -> " + n);
        }

        if(k==3){
            Scanner sc = new Scanner(System.in);
            //int p = Integer.parseInt(sc.nextLine());
            char[] mass = {'а','е','у','ё','ы','о','э','я','ю','и'};
            int index = 0;

            //for(int a = 0; a < k; a++)
             String arr = sc.nextLine();



                for(int z = 0; z < arr.length(); z++)//перебор символов в строке
                    for(int y = 0; y < mass.length; y++){//перебор символов гласных
                        if(mass[y]==arr.charAt(z)){
                            index++;
                        }
                    }
                System.out.print(index + " ");
                index = 0;

        }
    }
}
