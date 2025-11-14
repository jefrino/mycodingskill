class Solution {
    public int maxOperations(String s) {
        int c=0;
        int t=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
        if(s.charAt(i)=='1')
        t++;
        if(s.charAt(i)=='0'&&i+1==n)
        c=c+t;
        else if(s.charAt(i)=='0'&&s.charAt(i+1)=='1')
        c=c+t;
    }
    return c;
}
}