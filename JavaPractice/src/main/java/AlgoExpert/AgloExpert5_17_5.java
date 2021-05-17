package AlgoExpert;

public class AgloExpert5_17_5 {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n+1];
            ways[0] = 1;
            for(int denom : demons){
                for(int amount = 1; amount < n + 1; amount ++){
                    if(denom <= amount){
                        ways[amount] += ways[amount - denom]
                    }
                }
            }
        return -1;
      }
}
