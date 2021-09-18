import java.util.Scanner;

public class Task15 {


    private static int valueOne;
    private static int valueTwo;
    private static int valueThree;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Первое значение: ");
        valueOne = ui.nextInt();
        System.out.print("Второе значение: ");
        valueTwo = ui.nextInt();
        System.out.print("Третье значение: ");
        valueThree = ui.nextInt();
        System.out.print("\n Результат: " + equal( valueOne, valueTwo, valueThree));

    }

    private static int equal(int valueOne,int valueTwo,int valueThree)
    {
        int[] mas = new int[3];
        int col = 0;
        mas[0] = valueOne;
        mas[1] = valueTwo;
        mas[2] = valueThree;
        for (int i = mas.length-1; i>0; i--)
        {
            for (int j = 0; j<i; j++)
            {
                if (mas[j] > mas[j+1])
                {
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        int temp = mas[0];
        for (int i = 0; i < mas.length-1;i++)
        {
            if (temp == mas[i+1])
            {
                if (col == 0)
                {
                    col=2;
                }
                else
                {
                    col++;
                }
            }
            if (mas[i] > temp)
            {
                temp = mas[i];
            }
        }
        return col;
    }

}
