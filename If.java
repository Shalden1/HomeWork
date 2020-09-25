package HomeWork1;
import java.util.Scanner;
public class If {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        String str1 = "Вася";
        String str2 = "Анастасия";
        System.out.println("Введите имя:");
        String name = in.next();

        if (name.equals(str1)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (name.equals(str2)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals(str1) && !name.equals(str2)){    // пока так, лучше ничего еще не придумал.
            System.out.println("Добрый день, а вы кто?");
        }


    }
}