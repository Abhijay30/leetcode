class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        if(flowerbed.length>1){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                c+=1;
                flowerbed[0]=1;
            }
            for(int i=2;i<flowerbed.length-1;i++){
                if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                    c+=1;
                    flowerbed[i]=1;
                    i++;
                } 
            }

            if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                flowerbed[flowerbed.length-1]=1;
                c+=1;
            }
        }
        else if(flowerbed[0]==0) c+=1;
        return c>=n;
    }

}
