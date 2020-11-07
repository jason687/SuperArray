import java.util.Arrays;

public class Tester {
  public static void main (String [] args) {
    SuperArray arr = new SuperArray();
    System.out.println(arr.isEmpty());
    System.out.println();
//
    System.out.println(arr.add("does"));
    System.out.println(arr.add("this"));
    System.out.println(arr.add("work"));
    System.out.println(arr.get(0));
    System.out.println(arr.get(1));
    System.out.println(arr.get(2));
    System.out.println();
//
    System.out.println(arr.set(0, "element 0"));
    System.out.println(arr.set(1, "element 1"));
    System.out.println(arr.set(2, "element 2"));
    System.out.println(arr.get(0));
    System.out.println(arr.get(1));
    System.out.println(arr.get(2));
    System.out.println();
//
    System.out.println(arr.add("element 3"));
    System.out.println(arr.add("element 4"));
    System.out.println(arr.add("element 5"));
    System.out.println(arr.toString());
    arr.add(0, "new?");
    System.out.println(arr.add("element 6"));
    System.out.println(arr.add("element 7"));
    System.out.println(arr.add("element 8"));
    System.out.println(arr.add("element 9"));
    System.out.println();
    System.out.println(arr.get(0));
    System.out.println(arr.get(1));
    System.out.println(arr.get(2));
    System.out.println(arr.get(3));
    System.out.println(arr.get(4));
    System.out.println(arr.get(5));
    System.out.println(arr.get(6));
    System.out.println(arr.get(7));
    System.out.println(arr.get(8));
    System.out.println(arr.get(9));
    System.out.println(arr.get(10));
    System.out.println();
//
    System.out.println(arr.isEmpty());
//
    System.out.println(arr.toString());
    System.out.println();
//
    System.out.println(arr.contains("hello"));
    System.out.println(arr.contains("element 9"));
    arr.add(3, "food");
    System.out.println(arr.toString());
    System.out.println(arr.remove(1));
    System.out.println(arr.toString());
    System.out.println(arr.remove(4));
    System.out.println(arr.toString());
    System.out.println(arr.remove(9));
    System.out.println(arr.toString());
    System.out.println(arr.indexOf("element 4"));
    System.out.println(arr.indexOf("element 10"));
    arr.clear();
    System.out.println(arr.add("foo?"));
    System.out.println(arr.toString());
    String [] food = arr.toArray();
    food[0] = "change";
    String str = Arrays.toString(food);
    System.out.println(str);
    System.out.println(arr.toString());
    System.out.println();

    System.out.println(arr.add("element 9"));
    System.out.println(arr.add("element 9"));
    System.out.println(arr.add("element 9"));
    System.out.println(arr.add("element 9"));
    System.out.println(arr.add("element 9"));
    System.out.println(arr.add("element 9"));
    System.out.println(arr.toString());
    System.out.println(arr.lastIndexOf("element 9"));
    System.out.println(arr.lastIndexOf("foo?"));
    System.out.println(arr.lastIndexOf("elemen9"));
    // System.out.println(arr.add("foo?"));
    // System.out.println(arr.add("foo"));
    // System.out.println(arr.add("foo?"));
    // System.out.println(arr.add("foo?"));
    // System.out.println(arr.add("foo?"));
    // System.out.println(arr.add("foo"));
    // System.out.println(arr.toString());
    // SuperArray.removeDuplicates (arr);
    // System.out.println(arr.toString());
    // System.out.println();
    // SuperArray empty = new SuperArray (0);
    // System.out.println(empty.toString());
    // SuperArray.removeDuplicates (empty);
    // System.out.println(empty.toString());
    System.out.println();
  }
}
