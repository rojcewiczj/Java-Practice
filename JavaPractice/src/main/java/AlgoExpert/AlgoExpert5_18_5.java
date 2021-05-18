import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
		
		int currentChangeCreated = 0;
		for(int coin : coins){
			if(coin > currentChangeCreated + 1){
      	return currentChangeCreated + 1;
			}
			currentChagneCreated += coin;
		}
    return -1;
  }
}