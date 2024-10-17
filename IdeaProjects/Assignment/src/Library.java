
public class Library {
     String[] books = {"Destiny", "The Last Snow", "The Nun", "1914 Story", "Mind", "Moms Life"};

     public void displayBooks(String[] books){
         System.out.println("Book available in the library :");
         for (String book : books){
             System.out.println(book);
         }
     }
     public void searchBook(String[] books,String title){
         boolean found = false;
         for (String book : books){
             if (book.equalsIgnoreCase(title)){
                 System.out.println("Book " + title + " is available in the library");
                 found = true;
                 break;
             }
         }
         if (!found){
             System.out.println("Book " + title + " is not available in the library");
         }
     }
     public void replaceBook(String[] books,String oldTitle , String newTitle){
         boolean replaced = false;
         for (int i=0;i<books.length;i++){
             if (books[i].equalsIgnoreCase(oldTitle)){
                 books[i] = newTitle;
                 System.out.println("Book " + oldTitle + " is replaced with " + newTitle);
                 replaced = true;
                 break;
             }
         }
         if (!replaced){
             System.out.println("Book " + oldTitle + " is not found in the library.");
         }
     }
}




