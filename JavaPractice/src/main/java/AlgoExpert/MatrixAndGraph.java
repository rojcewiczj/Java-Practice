package AlgoExpert;


import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.AbstractQueue;
import java.util.ArrayList;
public  class MatrixAndGraph {
    public static int[][] Adj_array = new int[][]{{1,2},{1,3},{1,4},{2,3},{3,4},{4,5}};

    public static Hashtable<Integer, List<Integer>> Adj_dict = new Hashtable<Integer, List<Integer>>();


    public static void GenerateAdj_dict(){
        for(int[] pair : Adj_array){
            if(!Adj_dict.containsKey(pair[0])){
                Adj_dict.put(pair[0],new ArrayList<Integer>(){{add(pair[1]);}});
            }
            else{
                Adj_dict.get(pair[0]).add(pair[1]);
            }
            if(!Adj_dict.containsKey(pair[1])){
                Adj_dict.put(pair[1],new ArrayList<Integer>(){{add(pair[1]);}});
            }
            else{
                Adj_dict.get(pair[1]).add(pair[0]);
            }
        
    }
 }
    public static void TraverseBFT(){
        List<List<Integer>> queue = new ArrayList<List<Integer>>(){{add(new ArrayList<Integer>(){{add(1);}});}};
        List<Integer> visited = new ArrayList<Integer>();
        List<Integer> final_path = new ArrayList<>();
        while(queue.size() > 0){
            List<Integer> path = queue.remove(queue.size()-1);
            final_path = path;
            int current = path.get(path.size()-1);
            visited.add(current);
            if(current == 5){
                break;
            }
            else{
                for(int neighbor : Adj_dict.get(current)){
                    if(!visited.contains(neighbor)){
                        List<Integer> new_path = new ArrayList<Integer>(path);
                        new_path.add(neighbor);
                        queue.add(new_path);
                        break;
                    }
                }
            }
        }
        for(int node : final_path){
            System.out.println(node);
        }

        };

   
    }

