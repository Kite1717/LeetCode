using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P8
{
    public class Solution
    {
        public  static int MyAtoi(string str)
        {
            int start = 0;
            bool isPositive = true;
            long ret = 0;
            for (int i = 0; i < str.Length; i++) // deleting leading spaces
            {
                if (str[i] == ' ')
                {
                    str = str.Remove(i, 1);
                    i--;
                }
                else break;
            }
            if (str.Length == 0) return 0; // 0 size control
            if (!Char.IsDigit(str[0]) && str[0] != '-' && str[0] != '+') return 0; // start to letter or another mark control


            if (str.Substring(0, 1).Contains('-')) // negative control
            { isPositive = false; start = 1; }

            if (str.Substring(0, 1).Contains('+')) start = 1; // positive control



            foreach (char c in str.Substring(start)) // number control of each element
            {

                if (Char.IsDigit(c))
                {
                    ret += (int)Char.GetNumericValue(c);
                    // to maximum count value is greater than the number
                    if (isPositive && ret > Int32.MaxValue) return Int32.MaxValue;
                    if (!isPositive && -ret < Int32.MinValue) return Int32.MinValue;


                    ret *= 10;
                }
                else break;
            }
            ret /= 10; // I got back to extra multiplied by ten
            if (!isPositive) ret *= -1; // check sıng control
            return (int)ret;

        }
    }
}
