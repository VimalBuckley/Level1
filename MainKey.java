// The key to the Main.java file !

class MainKey {
  public static void main(String... args) {
    BookKey myBook = new BookKey();
    
    // Accessing Attributes - name
    System.out.println("Book: " + myBook.name);
    
    // Accessing Attributes - numPages, read
    System.out.println("Total Number of Pages: " + myBook.getNumPages());
    System.out.println("Is Book Read? " + myBook.isRead());

    // Accessing Attributes - setting percentRead
    myBook.setPercentRead(0.344);

    // Accessing Attributes - percentRead
    System.out.println("Percent of Book Read: " + myBook.getPercentRead());
    System.out.println("Number of Pages Read: " + myBook.getNumPages() * myBook.getPercentRead());
    System.out.println("Number of Pages Left: " + myBook.getNumPages() * (1 - myBook.getPercentRead()));

    // Accessing Attributes - toString
    // doesnt work initally because toString was not overriden.
    System.out.println(myBook);
  }
}