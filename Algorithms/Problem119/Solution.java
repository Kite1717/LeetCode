class Solution {
    /*
    Runtime: 1 ms, faster than 89.13% of Java online submissions for Pascal's Triangle II.
Memory Usage: 33.9 MB, less than 6.17% of Java online submissions for Pascal's Triangle II.
*/
    public List<Integer> getRow(int rowIndex) {
        
        
        List<Integer> prev = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        List<Integer> next;

        prev.add(1);
        if(rowIndex == 0) return  prev;

        current.add(1); current.add(1);
        if(rowIndex == 1) return  current;

        for(int i = 2; i <= rowIndex ; i++)
        {
            next = new ArrayList<>();
            
            next.add(1);
            for(int j = 0 ; j < current.size() ;j++)
            {
                if(j != current.size() -1){
                    next.add(current.get(j) + current.get(j+1));
                }
            }
           next.add(1);
            
           prev = current;
           current = next;
        }


       return  current;
    }
}