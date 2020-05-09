class Solution {
    
    /*
    Runtime: 8 ms, faster than 82.19% of Java online submissions for Minimum Index Sum of Two Lists.
Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Minimum Index Sum of Two Lists.
*/
    public String[] findRestaurant(String[] list1, String[] list2) {
      HashMap<String,Integer> list1Map = new HashMap<>();

        
        for(int i = 0 ; i < list1.length ;i ++)list1Map.put(list1[i],i);

        ArrayList<String> nears = new ArrayList<>();
        
        int curNearIndex = Integer.MAX_VALUE;
        
        for(int i = 0; i < list2.length ;i ++)
        {
         if(list1Map.containsKey(list2[i]))
         {
           if( curNearIndex >  i + list1Map.get(list2[i]))
           {
               curNearIndex = i + list1Map.get(list2[i]);
               nears = new ArrayList<>();
               nears.add(list2[i]);
           }
           else if( curNearIndex == i + list1Map.get(list2[i]))
           {
               nears.add(list2[i]);
           }
             
         }
        }
        
       return nears.toArray(new String[nears.size()]);

    }
}