import java.util.Scanner;

public class Task13 {


    private static float price;
    private static float discount;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Цена продукта: ");
        price = ui.nextFloat();
        System.out.print("Скидка на данный продукт: ");
        discount = ui.nextFloat();
        System.out.print("Цена со скидкой: " + discount(price,discount));

    }

    private static float discount(float price,float discount)
    {
        return price - ((price * discount)/100);
    }

}
