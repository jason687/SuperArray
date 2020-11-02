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
    size = count;
    return count;
  }

  public boolean add (String element) {
    for (int i = 0; i <= data.length; i++) {
      if (i == data.length) {
        resize();
      }
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

  public String set (int index, String element) {
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize () {
    String [] newData = new String [data.length + 10];
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }
}
