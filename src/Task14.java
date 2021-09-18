import java.util.Scanner;

public class Task14 {

    private static int value;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество символов в массиве: ");
        value = ui.nextInt();
        int[] mas = new int[value];
        for (int i =0;i < mas.length;i++)
        {
            mas[i] = (int) Math.round((Math.random() * 100) - 30);
        }
        System.out.print("\n Результат: " + differenceMaxMin(mas));

    }

    private static float differenceMaxMin(int[] mas)
    {
        int max = mas[0];
        int min = mas[0];
        System.out.print("Исходная таблица: ");
        for (int i = 1;i<mas.length;i++)
        {
            max = Math.max(max,mas[i]);
            min = Math.min(min,mas[i]);
            System.out.print(mas[i] + " ");
        }
        System.out.print("\nМаксимальное значение: " + max);
        System.out.print("\nМинимальное значение: " + min);
        return max - min;
    }

}
