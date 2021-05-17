package AlgoExpert;

public class AlgoExpert5_17_3 {
    import java.util.*;

class Program {
  public static int minNumberOfJumps(int[] array) {
  	int[] jumps = new int[array.length];
		Arrays.fill(jumps, Integer.MAX_VALUE);
		jumps[0] = 0;
		for(int i =1; i < array.length; i++){
			for(int j = 0; j < i; j++){
				if(array[j] >= i - j){
					jumps[i] = Math.min(jumps[j] + 1, jumps[i]);
				}
			}
		}
    return jumps[jumps.length - 1];
  }
}
}
