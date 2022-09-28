package Chapter_4;

public class NumList {
    public int[]nums;
    public static void main(String[] args) {
        NumList myList=new NumList();
        myList.nums=new int[]{44,25,83,32,4,57,62,18,96,72};

        myList.sortList();

        myList.insertNumber(33);

        for (int num : myList.nums)
            System.out.println(num);
    }

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

        if(isFirst)
            nums[nums.length-1]=number;
    }

    public void sortList()
    {
        for(int i=0;i< nums.length;i++)
            for(int j=i+1;j< nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
    }
}
