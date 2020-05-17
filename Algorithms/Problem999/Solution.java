
public class Solution{

    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
    Memory Usage: 34 MB, less than 100.00% of Java online submissions for Available Captures for Rook.
            */
    public int numRookCaptures(char [][] board) {

        StringBuilder ver = new StringBuilder();
        String hor = "";
        int index = 0;
        //first I found the horizontal axis and rook location
       for(char [] item : board)
       {
           index = new String(item).indexOf('R');
           if( index  != -1)
           {
                hor  = new String(item);
                break;
           }
       }
        // I've created the vertex axis using of the location of rook
       for (int i= 0; i< 8;i++)ver.append(board[i][index]);
       //first ý check vertex axis
        int count = helper(ver.toString());
   // and last one ý check horizontal axis
      return  count += helper(hor);
    }

    private  int helper(String s)
    {
        //two pieces checker
        int count = 0;
        String[] splits = s.split("R");
        //left piece
        for(int i = splits[0].length() -1; i >=0;i--)
        {
            if(splits[0].charAt(i) == 'p')
            {
                count++;
                break;
            }
            if(splits[0].charAt(i) == 'B') break;

        }
        //right piece
        for(int i= 0 ; i< splits[1].length();i++)
        {
            if(splits[1].charAt(i) == 'p')
            {
                count++;
                break;
            }
            if(splits[1].charAt(i) == 'B') break;
        }

        return  count;
    }

}
