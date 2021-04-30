package AlgoExpert;

public class BreadthFirstJava {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Array.sort(array);
            List<Integer[]> triplets new ArrayList<Integer[]>();
            for(int i = 0; i < array.length -2; i++){
                int left = i + 1;
                int right = array.length -1;
                while(left < right){
                    int currentSum = array[i] + array[left] + array[right];
                    if(currentSum == targetSum){
                        Integer[] newTriplet = {array[i], array[left], array[right]};
                        triplets.add(newTriplet);
                        left++;
                        right--;
                    }else if(currentSum < targetSum){
                        left++;
                    } else if(currentSum > targetSum){
                        right--;
                    }
                }
            }
        return triplets;
      }
}
