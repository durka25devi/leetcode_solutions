class Solution {
    public boolean isHappy(int n) {
        
        int slow=n,fast=n;

      do{
            slow=sumOfSquare(slow);
            fast=sumOfSquare(sumOfSquare(fast));
         }
     while(slow!=fast);
        return slow==1;
        
    }

    public int sumOfSquare(int value) {
        int total=0;
        while(value!=0){
            int rem = value%10;
            int square = rem*rem;
            total+=square;
            value=value/10;
        }
        return total;
    }
}