class Solution {
    public int reverse(int x) {
        int res=0;
        if(x>0) res=rev(x);
        else res=-1*rev(-1*x);

        return res;
    }
    public int rev(int x){
        int x1=0;
        while(x>0){
            if (x1 > Integer.MAX_VALUE/10) return 0;
            x1=(x1*10)+(x%10);
            x=x/10;
        }
        return (x1);
    }
}
