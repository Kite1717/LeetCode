class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Isomorphic Strings.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Isomorphic Strings.
*/
    public boolean isIsomorphic(String s, String t) {
    	
      char [] s1=s.toCharArray(), t1=t.toCharArray();
      int L=s.length(), i=0, cur1=0, cur2=0;
      int [] cal1=new int [135]; //mapping ... s.charAt(i) ---> t.charAt(i);
      int [] cal2=new int [135]; //mapping ... s.charAt(i) <--- t.charA(i);	

      Arrays.fill(cal1, -1);
      Arrays.fill(cal2, -1);
      
      while( i<L )
      {
    	cur1=s1[i]-' ';  
    	cur2=t1[i]-' ';
    	
    	if( cal1[cur1]<0 ) //source -> target mapping
    	{
    	  if( cal2[cur2]<0 ) // target -> source mapping
    	  {
    	    cal1[cur1]=cur2;
    	    
    	    cal2[cur2]=cur1;
    	  }else
    		return false;
    	}
    	else if( cal1[cur1]!=cur2 )
    	  return false;
    	
        i++;	  
      }
      return true; 
      
    }
}