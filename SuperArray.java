public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray () {
    data = new String [10];
  }

  public int size () {
    int count = 0;
    for (int i = 0; i < data.length; i+=) {
      if (!(data[i].equals(null))) {
        count += 1;
      }
    }
    return count;
  }
}
