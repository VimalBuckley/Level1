
/**
 * A class that represents a Book. :p
 */
public class Book {
  public String name;
  public int numPages;
  private boolean read;
  private double percentRead;

  public Book() {
    name = "DefaultName";
    numPages = 100;
    read = false;
    percentRead = 0.0;
  }

  public Book(String nameNew, int numPagesNew, boolean readNew) {
    this.name = nameNew;
    this.numPages = numPagesNew;
    this.read = readNew;
    this.percentRead = 0;
  }

  /* MODIFIERS */

  /* GETTERS */

}
