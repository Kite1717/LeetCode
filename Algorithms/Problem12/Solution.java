class Solution {
    public String intToRoman(int num) {
       //1 -3999
        //1 - 9
        //10 - 90 (10x)
        //100 - 900 (100x)
        //1000 - 4000 (1000x)
        String[][] data = {{"I","II","III","IV","V","VI","VII","VIII","IX"},
                           {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                           {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                           {"M","MM","MMM"}};

        if(!(num >=1 && num <= 3999)) return null;
        StringBuilder sb = new StringBuilder();
        byte step=0;

        while(num!=0)
        {

            if(num % 10 != 0) sb.insert(0,data[step][(num%10)-1]);
            num /=10 ;
            step ++;
        }


        return  sb.toString() ;

    }
}