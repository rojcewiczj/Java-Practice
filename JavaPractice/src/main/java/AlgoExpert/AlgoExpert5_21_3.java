import java.util.*;

class Program {

  public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
    ArrayList<ArrayList<Integer>> pairedTasks = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> taskDurationsToIndices = getTaskDurationsToIndices(tasks);
		
		ArrayList<Integer> sortedTasks = tasks;
		Collections.sort(sortedTasks);
		
		for(int idx = 0; idx < k; idx++){
			int task1Duration = sortedTasks.get(idx);
			ArrayList<Integer> indicesWithTask1Duration = taskDurationsToIndices.get(task1Duration);
			int task1Index = indicesWithTask1Duration.remove(indicesWithTask1Duration.size()-1);
			
			int task2SortedIndex = tasks.size() -1 - idx;
			int task2Duration = sortedTasks.get(task2SortedIndex);
			ArrayList<Integer> indicesWithTask2Duration = taskDurationsToIndices.get(task2Duration);
			int task2Index = indicesWithTask2Duration.remove(indicesWithTask2Duration.size()-1);
			
			ArrayList<Integer> pairedTask = new ArrayList<Integer>();
			pairedTask.add(task1Index);
			pairedTask.add(task2Index);
			pairedTasks.add(pairedTask);
		}
    return pairedTasks;
  }
	
	public HashMap<Integer, ArrayList<Integer>> getTaskDurationsToIndices(ArrayList<Integer> tasks){
		HashMap<Integer, ArrayList<Integer>> taskDurationsToindices = new HashMap<Integer, ArrayList<Integer>>():
		
		for(int idx = 0; idx < task.size(); idx++){
    	int taskDuration = tasks.get(idx);
			if(taskDurationsToIndices.containsKey(taskDuration)){
				taskDurationsToIndices.get(taskDuration).add(idx);
			} else{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(idx);
				taskDurationsToIndices.put(taskDuration, temp);
			}
		}
	}
}