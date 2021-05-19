import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    HashSet<Integer> seen = new HashSet<Integer>();
		for (int value : array){
			if (seen.contains(value)) return value;
			seen.add(value);
		}
    return -1;
  }
}
