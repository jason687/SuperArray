import java.util.Arrays;

public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray () {
    data = new String [10];
  }

  public SuperArray (int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException ("Initial capacity " + initialCapacity + " cannot be negative");
    }
    data = new String [initialCapacity];
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
        size += 1;
        return true;
      }
    }
    return false;
  }

  public String get (int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException ("Index is out of bounds (index = " + index + ")");
    }
    return data[index];
  }

  public String set (int index, String element) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException ("Index is out of bounds (index = " + index + ")");
    }
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize () {
    String [] newData = new String [data.length * 2];
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean isEmpty () {
    boolean bool = true;
    for (int i = 0; i < data.length; i++) {
      bool = bool && (data[i] == null);
    }
    return bool;
  }

  public String toString () {
    String str = "[";
    boolean first = true;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        if (first == true) {
          str = str + data[i];
          first = false;
        } else {
          str = str + ", " + data[i];
        }
      }
    }
    str = str + "]";
    return str;
  }

  public boolean contains (String s) {
    for (int i = 0; i < data.length; i++) {
      if ((data[i] != null) && (s != null)) {
        if (s.equals(data[i])) {
          return true;
        }
      }
    }
    return false;
  }

  public void add (int index, String element) {
    String temp1 = "";
    String temp2 = element;
    boolean complete = false;
    for (int i = index; i < data.length; i++) {
      if (!complete && i == data.length - 1 && data[i] != null) {
        resize();
      }
      if (data[i] != null) {
        temp1 = data[i];
        data[i] = temp2;
        temp2 = temp1;
      } else {
        data[i] = temp2;
        i = data.length;
        complete = true;
      }
    }
    size();
  }

  public void clear () {
    for (int i = 0; i < data.length; i++) {
      data[i] = null;
    }
    size();
  }

  public String remove (int index) {
    String delValue = data[index];
    for (int i = index; i < data.length - 1; i++) {
      data[i] = data[i + 1];
    }
    data[data.length - 1] = null;
    size();
    return delValue;
  }

  public int indexOf (String s) {
    int index = 0;
    if (contains(s)) {
      for (int i = 0; i < data.length; i++) {
        if (s.equals(data[i])) {
          return index;
        } else {
          index += 1;
        }
      }
    }
    return -1;
  }

  public String[] toArray() {
    size();
    String [] arr = new String [size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = data[i];
    }
    return arr;
  }

  public int lastIndexOf (String value) {
    for (int i = size() - 1; i > -1; i--) {
      if (get(i) != null) {
        if (get(i).equals(value)) {
          return i;
        }
      }
    }
    return -1;
  }

  public boolean equals (SuperArray other) {
    if (other.size() != size()) {
      return false;
    }
    for (int i = 0; i < Math.min(size(), other.size()); i++) {
      if (data[i] != null && other.get(i) != null) {
        if (!(data[i].equals(other.get(i)))) {
          return false;
        }
      } else {
        if ((data[i] == null && other.get(i) != null) || (data[i] != null && other.get(i) == null)) {
          return false;
        }
      }
    }
    for (int i = Math.min(data.length, other.data.length); i < Math.max(data.length, other.data.length); i++) {
      if (Math.max(data.length, other.data.length) == data.length && data.length != other.data.length) {
        if (data[i] != null) {
          return false;
        }
      } else {
        if (other.get(i) != null && data.length != other.data.length) {
          return false;
        }
      }
    }
    return true;
  }
}
