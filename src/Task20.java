import java.util.Scanner;

public class Task20 {

    private static String symbolOne;
    private static String symbolTwo;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Напишите текст: ");
        symbolOne = ui.nextLine();
        System.out.print("Напишите текст: ");
        symbolTwo = ui.nextLine();
        System.out.print("Результат: " + sameAscii(symbolOne,symbolTwo));

    }

    private static boolean  sameAscii(String symbolOne,String symbolTwo)
    {
        int symbolOneAscii = 0;
        int symbolTwoAscii = 0;
        for (int i = 0; i < symbolOne.length();i++)
        {
            char res = symbolOne.charAt(i);
            symbolOneAscii = symbolOneAscii + (int) res;
        }
        for (int i = 0; i < symbolTwo.length();i++)
        {
            char res = symbolTwo.charAt(i);
            symbolTwoAscii = symbolTwoAscii + (int) res;
        }
        if (symbolOneAscii == symbolTwoAscii)
        {
            return true;
        }
        return false;
    }

}
