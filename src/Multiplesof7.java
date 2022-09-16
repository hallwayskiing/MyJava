public class Multiplesof7 {
    public static void main(String[] args) {
        int sum=0;
        int num=0;
        for(int i=1;i<100;i++)
        {
            if(i%7==0)
            {
                num++;
                sum+=i;
            }
        }
        System.out.println("Number of Multiples of 7:"+num
                          +"\nSum of Multiples of 7:"+sum);
    }
}
