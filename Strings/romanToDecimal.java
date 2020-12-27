package Strings;


public class romanToDecimal {
    
        public static int value(char val) {
            if (val == 'I')
                return 1;
            if (val == 'V')
                return 5;
            if (val == 'X')
                return 10;
            if(val=='L')
              return 50;
            if(val=='C')
              return 100;
            if(val=='D')
              return 500;
            if(val=='M')
              return 1000;    

            return -1;
        }

        public static void main(String[] args) {
            String romanNumber = "DXLVIII";
            System.out.println(romanConvert(romanNumber));

        }

        private static int romanConvert(String romanNumber) {
            int len = romanNumber.length();
            int result = 0;
            int v1, v2;
            for (int i = 0; i < len; i++) {

                v1 = value(romanNumber.charAt(i));
                if(i+1<len)
                {
                    v2=value(romanNumber.charAt(i+1));
                    if(v1>=v2)
                      result+=v1;
                      else
                      {
                          result+=v2 - v1;
                          i++;
                      }  
                }
                else{
                    result+=v1;
                }
        }

        return result;
    }
}
