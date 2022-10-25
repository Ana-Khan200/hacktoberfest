class Solution {
    public int minDistance(String word1, String word2) {
        char[] ch=word1.toCharArray();
        char[] ch1=word2.toCharArray();
        int [][] dp=new int[ch.length+1][ch1.length+1];
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++)
            {
                dp[i][0]=i;
            }
        for(int i=1;i<ch.length+1;i++)
        {
            for(int j=1;j<ch1.length+1;j++)
            {
                if(ch[i-1]==ch1[j-1])
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[ch.length][ch1.length];
        
    }
    int min(int a,int b,int c){
        int l=Math.min(a, b);
        return Math.min(l,c);
    }
}
