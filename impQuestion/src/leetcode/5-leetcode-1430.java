
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1704734468/

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for ( int i : candies){
            if(i>max){
                max =i;
            }
        }

       
    
    List<Boolean> res  = new ArrayList<>();
     for ( int i : candies){
            if ( i + extraCandies >=  max){
                res.add(true);
            }
            else{
                res.add(false);

            }

            
        }
        return res;
}   }