class Solution {
    
    /*
    Runtime: 1 ms, faster than 99.30% of Java online submissions for Permutation Sequence.
Memory Usage: 37.3 MB, less than 20.83% of Java online submissions for Permutation Sequence.
*/
    public static final int[] perm = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320,362880};

    public String getPermutation(int n, int k)
    {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> data = dataGen(n);

        for(int i = n,index; i > 0;i--)
        {
           
          if(k % perm[i] == 0)
              index = i;
          else
              index = (int)(Math.ceil(((k % perm[i]) * 1.0) / (perm[i-1] * 1.0) ));
           sb.append(data.get(index-1));
           data.remove(index-1);
    }

        return sb.toString();
    }
    private ArrayList<Integer> dataGen(int n)
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int i =1 ; i <=n; i++)
          data.add(i);
        return data;

    }

}