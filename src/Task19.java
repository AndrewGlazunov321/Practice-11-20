import java.util.Scanner;

public class Task19 {

    private static String symbol;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbol = ui.nextLine();
        System.out.print("Результат: " + getXO(symbol));

    }

    private static String  getXO(String symbol)
    {
        for (String word : symbol.split("[ ]|[!]|[,]|[?]"))
        {
            String result = word.toLowerCase();
            if (result.equals("bomb"))
            {
                return "DUCK!";
            }
        }
        return "Relax, there's no bomb";
    }
}
