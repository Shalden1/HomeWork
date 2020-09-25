package HomeWork1;
import java.util.Scanner;
public class OperatorIfElse {
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
        else if (name.equals(str2)){
            System.out.println("Я тебя так долго ждал");
        }
        else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

