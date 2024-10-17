import java.util.Arrays;
import java.util.Scanner;

public class Main_Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grocery grocery = new Grocery();
        System.out.println("Avaliable fruits are :" + Arrays.toString(grocery.fruits));
        System.out.print("Enter the fruit name :");
        String fruitName = sc.nextLine();
        System.out.print("Enter the kilograms :");
        double kilograms = sc.nextDouble();

        double totalPrice =  grocery.calculatePrice(grocery.fruits, grocery.price,fruitName,kilograms);
        grocery.calculatePrice(grocery.fruits, grocery.price,fruitName,kilograms);
        if (totalPrice>=0){
            grocery.calculatePrice(grocery.fruits, grocery.price,fruitName,kilograms);
            System.out.println("Total price of " + fruitName + " of " + kilograms + "kg is : $" + totalPrice);
        }
        else {
            System.out.println("This fruit is not available");
        }

    }
}
