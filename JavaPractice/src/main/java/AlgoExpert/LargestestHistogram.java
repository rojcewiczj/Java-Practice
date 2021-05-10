package AlgoExpert;
import java.util.Stack;
public class LargestestHistogram {
    
    public static int getMaxArea(int[] hist, int n){
        Stack<Integer> s = new Stack<>();

        int max_area = 0;
        int top;
        int area_with_top;
        
        int i = 0;
        while(i < n)
        {
            if(s.empty() || hist[s.peek()] <= hist[i]){
                s.push(i++);
            }
            
            else{
                top = s.peek();
                s.pop();

                area_with_top = hist[top] * (s.empty() ? i : i - s.peek() -1);

                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        while(s.empty() == false)
        {
            top = s.peek();
            s.pop();
            area_with_top = hist[top] * (s.empty() ? i : i - s.peek() -1);
            if(max_area < area_with_top)
            max_area = area_with_top;
        }
        return max_area;

    }
}
