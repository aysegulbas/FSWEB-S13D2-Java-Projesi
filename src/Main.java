

public class Main {

    public static boolean isPalindrome(int number){
        int reverse=0;
        int remainder;
        int original=number;
        while(number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;

        }
        if(original==reverse) {return true;}
        return false;
        //return original==reverse

    }
    public static boolean isPalindrome2(int num){
        num=Math.abs(num);
        char[]digits=String.valueOf(num).toCharArray();
        String reversed="";
        for(int i=digits.length-1;i>=0;i--){
            reversed+=digits[i];
        }
        //return Integer.parseInt(reversed)==num
        return reversed.equals(String.valueOf(num));
    }
   public static boolean isPerfectNumber(int number){
       if(number<=0){return false;}
           int sum=0;
            for(int i=1;i<=number/2;i++){
               if(number%i==0) {sum+=i;}
            }
           return number==sum;
   }
   public static String numberToWords(int number){
       if (number < 0) {
           return "Invalid Value";
       }
       char[] numArray=String.valueOf(number).toCharArray();
        String [] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String [] wordArr=new String[numArray.length];
        for(int i=0;i<numArray.length;i++){
            wordArr[i]=words[Integer.parseInt(String.valueOf(numArray[i]))];
        }
        return String.join(" ",wordArr);
   }
    public static String numberToWords2(int number){
        if (number < 0) {
            return "Invalid Value";
        }
        char[] numArray=String.valueOf(number).toCharArray();
        String text="";
        for(char digit:numArray){
            switch (digit){
                case '0':
                    text+="Zero ";
                case '1':
                    text+="One ";
                    break;
                case '2':
                    text+="Two ";
                    break;
                case '3':
                    text+="Three ";
                    break;
                case '4':
                    text+="Four ";
                    break;
                case '5':
                    text+="Five ";
                    break;
                case '6':
                    text+="Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return text.trim();
    }
    public static int getEventNumber(int number){
        char [] numArr=String.valueOf(number).toCharArray();
        int sum=0;
        for(char i:numArr){
            int sayi=Integer.parseInt(String.valueOf(i));
            if(sayi%2==0){sum+=sayi;}
        }
        return sum;
    }
    public static int getEventNumber2(int number){
        int sum=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                sum+=digit;
            }
            number=number/10;
        }
        return sum;
    }
    public static int getFirstDigitAndLastDigit(int num){
        int last=num%10;
        char[] numArr=String.valueOf(num).toCharArray();
        Integer.parseInt(String.valueOf(num).substring(0, 1));
        return last+ Integer.parseInt(String.valueOf(numArr[0]));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int first=num1%10;
        int second=num2%10;
        int third=num3%10;
        return (first==second||
                first==third||
                second==third);
    }
    public static boolean hasSameLastDigitOptional(int ...nums){
        int []digits=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            digits[k]=nums[k]%10;}
            for(int i=0;i<digits.length;i++){
                for(int j=i+1;j<digits.length;j++){
                    if(digits[i]==digits[j]){
                        return true;
                    }
                }

            }
        return false;
        }


    public static void main(String[] args){
        System.out.println("isPalindrome................");

        System.out.println(isPalindrome(-1221));
        System.out.println("isPalindrome................");
        System.out.println(isPalindrome2(-1221));
        System.out.println("isPerfectNumber................");
        System.out.println(isPerfectNumber(6));
        System.out.println("numberToWords................");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(567));
        System.out.println("numberToWords2................");
        System.out.println(numberToWords2(123));
        System.out.println(numberToWords2(567));
        System.out.println("getEventNumber................");
        System.out.println(getEventNumber(12345678));
        System.out.println("getEventNumber2................");
        System.out.println(getEventNumber2(12345678));
        System.out.println("getFirstDigitAndLastDigit................");
        System.out.println(getFirstDigitAndLastDigit(12345678));
        System.out.println("hasSameLastDigitOptional------------------------");
        System.out.println(hasSameLastDigitOptional(12, 132, 20, 45));
        System.out.println(hasSameLastDigitOptional(1, 12, 3));
        System.out.println(hasSameLastDigitOptional(10, 19, 35, 99));

    }

}