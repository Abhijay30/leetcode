class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int cus[]:accounts){
            int sres=0;
            for(int cash:cus){
                sres+=cash;
            }
            if(sres>res) res=sres;
        }
        return res;
    }
}
