package AlgoExpert;
import java.util.*;

public class AlgoExpert6_14_1 {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
		int[] ways = new int[n+1]
		ways[0] = 1;
		for(int denom : denoms){
    	for(int amount = 1; amount < n + 1; amount++){
				if(denom <= amount){
					ways[amount] += ways[amount - denom]
       }
			}
		}
    return ways[n];
  }
}
