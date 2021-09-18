import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task11 {

    private static int valueNumberHouse = 0;
    private static  int sizeStreet = 0;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Номер дома: ");
        valueNumberHouse = ui.nextInt();
        System.out.print("Длина улицы: ");
        sizeStreet = ui.nextInt();
        System.out.print("Результат: " + oppositeHouse(valueNumberHouse,sizeStreet));

    }

    private static int oppositeHouse(int valueNumberHouse,int valueStreet )
    {
        ArrayList<Integer> chetValue = new ArrayList<Integer>();
        ArrayList<Integer> notchetValue = new ArrayList<Integer>();
        int temp;
        for (int i = 1;i <= sizeStreet * 2; i++)
        {
            if (i % 2 != 0)
            {
                chetValue.add(i);
            }
            else {
                notchetValue.add(i);
            }
        }
        Collections.reverse(notchetValue);
        if (valueNumberHouse % 2 == 0)
        {
            return chetValue.get(notchetValue.indexOf(valueNumberHouse));
        }
        return notchetValue.get(chetValue.indexOf(valueNumberHouse));
    }


}
