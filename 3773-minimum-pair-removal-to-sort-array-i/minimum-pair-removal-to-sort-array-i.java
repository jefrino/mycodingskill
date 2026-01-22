class Solution {
    int check(int[] nums,int y)
    {
        for(int i=0;i<y-1;i++)
        {
         if(nums[i]>nums[i+1])
         {
         return 0;
         }
        }
        return 1;
    }
    public int minimumPairRemoval(int[] nums) {
        
        int o=0;
        int x=nums.length;
        int y=x;
        while(check(nums,y)==0)
        {
            int ls=nums[0]+nums[1];
        int k=0;

     for(int i=1;i<y-1;i++)
     {
       if(nums[i]+nums[i+1]<ls)
       {
        ls=nums[i]+nums[i+1];
        k=i;
       }
     } 
     nums[k]=ls;
     for(int j=k+1;j<y-1;j++)
     {
       nums[j]=nums[j+1];
     }
     y-=1;
     o++;
    }
    return o;
    }
}
