import java.util.*;

public class Teams {

  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    Map<String, Integer> dicti = new HashMap<String, Integer>();
		Map<Integer, Integer> res_dict = new HashMap<Integer, Integer>(){{put(0, 1);put(1, 0);}};
		
		for(int i = 0; i < results.size(); i ++){
			if(!dicti.containsKey(competitions.get(i).get(rest_dict.get(results.get(i))))){
				dicti.put(competitions.get(i).get(rest_dict.get(results.get(i))), 3);
			}
			else{
				dicti.get(competitions.get(i).get(rest_dict.get(results.get(i)))) += 3;
			}
		}
		
		Integer winning_score = 0;
		String winner = " ";
		
		for(Map.Entry<String, Integer> entry: dicti.entrySet()){
			if(entry.getValue() > winning_score){
				winning_core = entry.getValue();
				winner = entry.getKey();
			}
			
		}
		
    return winner;
  }
}