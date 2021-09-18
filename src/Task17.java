import java.util.Scanner;

public class Task17 {

    private static int value;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        int[] mas = new int[3];
        for (int i =0;i < mas.length;i++)
        {
            while(true)
            {
                System.out.print("Зарплата программисту под номером №" + i + " ");
                value = ui.nextInt();
                if (value > 0)
                {
                    mas[i] = value;
                    break;
                }
            }
        }
        System.out.print("\n Результат: " + programmers(mas));

    }

    private static int programmers(int[] mas)
    {
        int max = mas[0];
        int min = mas[0];
        System.out.print("Исходная таблица: ");
        for (int i = 1;i<mas.length;i++)
        {
            max = Math.max(max,mas[i]);
            min = Math.min(min,mas[i]);
        }
        return max - min;
    }


}
