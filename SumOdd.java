public class SumOddRange {
    public static boolean isOdd(int number){
        if(number&lt;0){
            return false;
        }else{
            if(number%2==0){
                return false;
            }else{
                return true;
            }
        }
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if(start&lt;=0 || end &lt;=0 || start&gt;end){
            return -1;
        }else{
            for(int i=start;i&lt;=end;i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
            return sum;
        }
    }
}
