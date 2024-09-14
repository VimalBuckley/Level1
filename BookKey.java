
/**
 * A class that represents a Book. :p
 */
public class BookKey {
  public String name;
  public int numPages;
  private boolean read;
  private double percentRead;

  public BookKey() {
    name = "DefaultName";
    numPages = 100;
    read = false;
    percentRead = 0.0;
  }

  public BookKey(String nameNew, int numPagesNew, boolean readNew) {
    this.name = nameNew;
    this.numPages = numPagesNew;
    this.read = readNew;
    this.percentRead = 0;
  }

  /* MODIFIERS */

  public void setPercentRead(double percentReadNew) {
    percentRead = percentReadNew;
    if (percentRead >= 1) read = true;
  }

  /* GETTERS */

  public int getNumPages() {
    return numPages;
  }

  public boolean isRead() {
    return read;
  }

  public double getPercentRead() {
    return percentRead;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nPages: " + numPages;
  }

}
