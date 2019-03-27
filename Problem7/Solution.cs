using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Solution
{
    class Solution
    {

        public static int Reverse(int x)
        {
            bool isPositive = true;
            Int64 result = x; // To understand if the type exceeds the size of Int64 turned it on

            if (result < 0) // detect positive negative temporarily so that the sign of the number as the character I made
            {
                result *= -1;
                isPositive = false;
            }
            //1. I got the opposite of converting the string to number 
            // 2. a brief description of the link aggregate so that you can understand the method 
            // https://stackoverflow.com/questions/7105505/linq-aggregate-algorithm-explained

            result =  Int64.Parse(result.ToString().Reverse().Aggregate("", (s, c) => s + c));
            // 1. negative controls and within limits
            if (!isPositive) result *= -1;
             if (result > 0 && Int32.MaxValue < result) return 0;
             else if (result < 0 && Int32.MinValue > result) return 0;
             else return (int)result; 
             
        }
    }
}
