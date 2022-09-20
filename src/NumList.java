public class NumList {
    public int[]nums;
    public void insertNumber(int number)
    {
        int []oldNums=nums.clone();
        nums=new int[nums.length+1];
        boolean isFirst=true;
        for (int i=0,j=0;i< oldNums.length;i++,j++)
        {
            if(number<=oldNums[i]&&isFirst)
            {
                nums[j]=number;
                j++;
                isFirst=false;
            }
            nums[j]=oldNums[i];
        }
    }
    public static void main(String[] args) {
        NumList myList=new NumList();
        myList.nums=new int[]{44,25,83,32,4,57,62,18,96,72};
        for(int i=0;i< myList.nums.length;i++)
            for(int j=i+1;j< myList.nums.length;j++)
        {
            if(myList.nums[j]<myList.nums[i])
            {
                int temp=myList.nums[j];
                myList.nums[j]=myList.nums[i];
                myList.nums[i]=temp;
            }
        }
        myList.insertNumber(1);
        for (int num : myList.nums)
        {
            System.out.println(num);
        }
    }
}
