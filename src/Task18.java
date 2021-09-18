import java.util.Scanner;

public class Task18 {

    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.print("Результат: " + getXO(symbol));

    }

    private static boolean getXO(String symbol)
    {
        int kol = 0;
        int col = 0;
        for (String word : symbol.split(""))
        {
            String result = word.toLowerCase();
            if (result.equals("o"))
            {
                kol++;
            }
            if (result.equals("x"))
            {
                col++;
            }
        }
        if (kol == col || (kol == 0 && col == 0))
        {
            return true;
        }
        return false;
    }

}
