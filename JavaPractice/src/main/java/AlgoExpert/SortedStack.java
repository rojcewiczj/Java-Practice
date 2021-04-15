using System.Collections.Generic;
using System;


public class Program {

	public List<int> SortStack(List<int> stack) {
		if(stack.Count == 0){
			return stack;
		}
		
		int top = stack[stack.Count -1];
		stack.RemoveAt(stack.Count -1);
		
		SortStack(stack);
		
		insertInSortedOrder(stack, top);
		return stack;
	}
	
	public void insertInSortedOrder(List<int> stack, int value){
		if(stack.Count == 0 || (stack[stack.Count -1] <= value)){
			stack.Add(value);
			return;
		}
		
		int top = stack[stack.Count -1];
		stack.RemoveAt(stack.Count - 1);
		
		insertInSortedOrder(stack, value);
		
		stack.Add(top);
	}
}
