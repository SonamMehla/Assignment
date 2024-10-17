import java.util.Scanner;

public class Ass2_InventoryManage {
   String[] product = {"LED TV","Laptop","Mobile","SmartWatch","Tablet"};
    double[] price = {1700.99, 2000.49,1500.99,499.49,999.99};
    boolean found = false;

   public  void displayProducts(){
       System.out.println("Available Products are :");
       for (int i=0;i<product.length;i++){
           System.out.println(product[i] + " : $" + price[i]);
       }
       System.out.println();
   }

   public void searchProductPrice(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name of product you want to search :");
       String searchProduct = sc.nextLine();
       for (int i=0;i<product.length;i++){
           if (product[i].equalsIgnoreCase(searchProduct)){
               System.out.println("The price of " + product[i] + " is : $ " + price[i]  );
               found = true;
               break;
           }
       }
       if (!found){
           System.out.println("Product is not found .");
       }
   }


}

