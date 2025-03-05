package classic150.数组;

public class candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] res= new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=1;
        }
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                res[i]=res[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                res[i]=Math.max(res[i],res[i+1]+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            sum+=res[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] ratings={1,0,2};
        candy c=new candy();
        System.out.println(c.candy(ratings));
    }
}
