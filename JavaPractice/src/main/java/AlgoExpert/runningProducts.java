import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
  	int[] products = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
			int runningProduct = 1;
			for(int j = 0; j < array.length; j++){
				if(i != j){
					runningProduct *= array[j];
				}
				products[i] = runningProduct;
			}
		}
    return products;
  }
}