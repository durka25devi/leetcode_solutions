class Solution {
    public String convert(String s, int numRows) {

        if(numRows>s.length()||numRows==1) return s;

        StringBuilder[] rows=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        boolean isdown=true;

        for(int i=0;i<s.length();i++){
            rows[row].append(s.charAt(i));

            if(row==0) isdown=true;
            else if(row==numRows-1) isdown=false;

            if(isdown){
                row++;
            }
            else{
                row--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            res.append(rows[i]);

        }
        return res.toString();
    }
}