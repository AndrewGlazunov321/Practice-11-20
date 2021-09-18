import java.util.Scanner;

public class Task16 {


    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.print("Результат: " + reverse(symbol));

    }

    private static String reverse(String symbol)
    {
        String result = "";
        for (int i = 0; i < symbol.length();i++)
        {
            result = symbol.charAt(i) + result;
        }
        return result;
    }

}
