public class Demo {
  public static void removeDuplicates (SuperArray s) {
    boolean del = false;
    boolean tempDel = false;
    String [] unique = new String [s.size()];
    for (int i = 0; i < s.size(); i++) {
      for (int j = 0; j <= s.size(); j++) {
        if (j == s.size() && (del == false)) {
          for (int k = 0; k < s.size(); k++) {
            if (unique[k] == null) {
              unique[k] = s.get(i);
              k = s.size();
            }
          }
          j += 1;
        } else {
          if (j == s.size()) {
            j += 1;
          }
        }
        if (j < s.size() && !(s.get(i) == null || unique[j] == null)) {
          if (s.get(i).equals(unique[j])) {
            s.remove(i);
            del = true;
            i -= 1;
            j = s.size() + 1;
          }
        }
      }
      del = false;
    }
  }

  public static SuperArray findOverlap (SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray(Math.min(a.size(), b.size()));
    for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < b.size(); j++) {
        if (a.get(i) != null && b.get(j) != null) {
          if (a.get(i).equals(b.get(j))) {
            if (!overlap.contains(a.get(i))) {
              overlap.add(a.get(i));
            }
          }
        }
      }
    }
    return overlap;
  }

  public static void main (String [] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    System.out.println();
    SuperArray a = new SuperArray();
    a.add("9");
    a.add("1");
    a.add("2");
    a.add("2");
    a.add("3");
    a.add("4");
    SuperArray b = new SuperArray();
    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("9");
    SuperArray overlap = findOverlap(a, b);
    System.out.println(overlap);
  }
}
