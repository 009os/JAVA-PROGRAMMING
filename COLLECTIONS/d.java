//Write a program for the following HashSet 
//• copy another collection object to HashSet object.
//• delete all entries at one call from HashSet.
//• search user defined objects from HashSet

import java.util.*;

public class d {
   public static void main(String[] args) {
      // Create a List object
      List<String> list = new ArrayList<>();
      list.add("Apple");
      list.add("Banana");
      list.add("Cherry");
      list.add("Date");

      // Create a HashSet and copy the List to it
      Set<String> set = new HashSet<>(list);
      System.out.println("HashSet after copying List: " + set);

      // Remove all entries from the HashSet
      set.clear();
      System.out.println("HashSet after clearing all entries: " + set);

      // Create a user-defined class
      class Book {
         String title;
         String author;

         Book(String title, String author) {
            this.title = title;
            this.author = author;
         }

         // Override the equals() method to compare Book objects
         @Override
         public boolean equals(Object obj) {
            if (obj instanceof Book) {
               Book other = (Book) obj;
               return title.equals(other.title) && author.equals(other.author);
            }
            return false;
         }

         // Override the hashCode() method to generate hashcode of Book objects
         @Override
         public int hashCode() {
            return Objects.hash(title, author);
         }
      }

      // Create a HashSet of Book objects
      Set<Book> books = new HashSet<>();
      books.add(new Book("The Alchemist", "Paulo Coelho"));
      books.add(new Book("The Catcher in the Rye", "J. D. Salinger"));
      books.add(new Book("To Kill a Mockingbird", "Harper Lee"));

      // Search for a Book object in the HashSet
      Book book = new Book("The Alchemist", "Paulo Coelho");
      if (books.contains(book)) {
         System.out.println("The book is found in the HashSet.");
      } else {
         System.out.println("The book is not found in the HashSet.");
      }
   }
}
