import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {

    private static String name;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите имя и фамилию человека: ");
        name = ui.nextLine();
        System.out.print("Результат: " + nameShuffle(name));

    }

    private static String nameShuffle(String name)
    {
        ArrayList<String> shuffle = new ArrayList<String>();
        String temp;
        for (String word : name.split(" "))
        {
            shuffle.add(word);
        }
        if (shuffle.size() > 2)
        {
            return "fail";
        }
        else {
            for (int i = 0; i < shuffle.size() - 1;i++) {
                temp = shuffle.get(i+1);
                shuffle.set(i+1,shuffle.get(i));
                shuffle.set(i,temp);
            }
            return shuffle.get(0) + " " + shuffle.get(1);
        }
    }
}
