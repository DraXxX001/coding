import java.util.Scanner;
public class maxdiff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.printf("Enter a String\n");
        String s=sc.nextLine();
        int len=s.length();
        int maxi=0,mini=len;
        int freq[]= new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]%2==1)
            {
                maxi=Math.max(maxi,freq[i]);
            }
            else if(freq[i]%2==0 && freq[i]>0)
            {
                mini=Math.min(mini,freq[i]);
            }
        }
        // return maxi-mini ;
    }
}
