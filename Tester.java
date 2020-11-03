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
    System.out.println(arr.add("element 6"));
    System.out.println(arr.add("element 7"));
    System.out.println(arr.add("element 8"));
    System.out.println(arr.add("element 9"));
    System.out.println();
    System.out.println(arr.add("element 10"));
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
    System.out.println(arr.get(11));
    System.out.println();
//
    System.out.println(arr.isEmpty());
//
    System.out.println(arr.toString());
  }
}
