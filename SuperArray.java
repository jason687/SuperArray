public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray () {
    data = new String [10];
  }

  public int size () {
    int count = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        count += 1;
      }
    }
    return count;
  }

  public boolean add (String element) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null) {
        data[i] = element;
        return true;
      }
    }
    return false;
  }

  public String get (int index) {
    return data[index];
  }
}
