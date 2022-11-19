import java.util.ArrayList;
class Solution {

    public static int myAtoi(String s) {

        String value = s.replaceAll("^\\s+", "");
        if (value == null || value.length() < 1) {
            return 0;
        }



        boolean flag=false;//проверка на минус
        if(value.contains("-") && value.charAt(0)=='-'){
            flag=true;
        }
        boolean flag_pr=false;//проверка на 1 символ
        double result=0;
        int start=0;
        if(value.charAt(0)=='-'){
            start++;
        }else if(value.charAt(0)=='+'){
            start++;
        }else if(value.charAt(0)>='0' && value.charAt(0)<='9'){
            flag_pr=true;
        }else {
            return 0;
        }
        while (start < value.length() && value.charAt(start) >= '0' && value.charAt(start) <= '9') {
            result = result * 10 + (value.charAt(start) - '0');
            start++;
        }

        if(flag){
            result=-result;
        }else{
            result=result;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("   -123+125"));
    }
}

