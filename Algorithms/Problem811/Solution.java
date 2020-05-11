
import java.util.*;
public  class  Solution
{
    /*Runtime: 25 ms, faster than 30.01% of Java online submissions for Subdomain Visit Count.
    Memory Usage: 39 MB, less than 62.68% of Java online submissions for Subdomain Visit Count.
    */
    public List<String> subdomainVisits(String[] cpdomains) {
            HashMap<String,Integer> map = new HashMap<>();
         for (String domain : cpdomains) {
             String[] dcount = domain.split("\\s+");
             String[] address = dcount[1].split("\\.");
             int count = Integer.valueOf(dcount[0]);
             String current = "";
             for (int i = address.length - 1; i >= 0; i--) {
                 current = address[i] + (i < address.length - 1 ? "." : "") + current;
                 map.put(current, map.getOrDefault(current, 0) + count);

             }
         }
           List<String> list = new ArrayList<>();
            for(String dom : map.keySet())
            {
                list.add(map.get(dom) + " " + dom);
            }
        return list;
         }
    }

