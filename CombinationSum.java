
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tracker = new ArrayList<>();
        
            //helper function
        
        backtrack(candidates,0,target,tracker,res);
        return res;
    }

    static void backtrack(int[] arr, int idx,  int k, List<Integer> tracker, List<List<Integer>> res){
      //base condition
      if(idx== arr.length){
        //if condition satisfies
          if (k==0){
              res.add(new ArrayList<>(tracker));
          }

              return;

      }
   //making choices
     if (arr[idx]<=k){
       //going forward with the choice
         tracker.add(arr[idx]);
         backtrack(arr,idx,k-arr[idx],tracker,res);
       //removing the choice
         tracker.remove(tracker.size()-1);
     }
//going without the choice
     backtrack(arr,idx+1,k,tracker,res);

        }




    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println( combinationSum(arr,7));
    }
}
