package Chapter_4;

import java.util.Arrays;

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
        int []oldNums=nums.clone();//复制原数组

        nums=new int[oldNums.length+1];//创建长度+1的新数组

        //拷贝数据
        for(int i=0;i<oldNums.length;i++)
            nums[i]=oldNums[i];

        nums[nums.length-1]=number;//添加新数据

        sortList();//添加后再排序
    }

    public void sortList()
    {
        //冒泡排序
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
