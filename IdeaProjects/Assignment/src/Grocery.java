

public class Grocery {
      String[] fruits = {"Apple ","Banana ","Orange ", "Mango ","Grapes"};
      double[] price = {2.99,5.99,3.50,4.79,1.99};

      public double calculatePrice(String[] fruits,double[] price,String fruitName, double kilograms){
          for (int i=0;i<fruits.length;i++){
              if (fruits[i].equalsIgnoreCase(fruitName)){
                  return price[i]*kilograms;
              }
          }
          return -1;
      }

    }

