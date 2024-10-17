import java.util.Scanner;

public class Main_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;
        System.out.println("Welcome to library Management System");
        do {
            System.out.println("Press \n1. Display Book \n2. Search for Book \n3. Replace a Book \n4.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                   library.displayBooks(library.books);
                   break;
                case 2 :
                    System.out.print("Enter the book title you want to search :");
                    String searchTitle = sc.nextLine();
                    library.searchBook(library.books, searchTitle);
                    break;
                case 3:
                    System.out.print("Enter the book title you want to replace :");
                    String oldName = sc.nextLine();
                    System.out.print("Enter the new title :");
                    String newName = sc.nextLine();
                    library.replaceBook(library.books,oldName,newName);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!= 4);
    }
}