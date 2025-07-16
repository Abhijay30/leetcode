class Solution {
    public int primePalindrome(int n) {
        if(n==1) return 2;
        if( n==2 || n==3 || n==5 || n==7 || n==11) return n;
        if(n>7 && n<11) return 11;
        int num=n;
        while(true){
            if(plain(num) && prime(num)) return num;
            else num+=1;
             if (num > 11 && iseven(num)) {
                num = (int)Math.pow(10, String.valueOf(num).length());
            }
        }
    }
    public boolean iseven(int n){
         return String.valueOf(n).length() % 2 == 0;
    }
    public boolean plain(int n){
        int n1=n,pld=0;
        while(n1>0){
                pld=(pld*10)+(n1%10);
                n1=n1/10;
            }
        if(pld==n) return true;
        else return false;
    }
    public boolean prime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
    }
}
