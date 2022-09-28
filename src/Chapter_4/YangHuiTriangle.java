package Chapter_4;

public class YangHuiTriangle {
    static int outputLineNum=10;//输出杨辉三角形的行数
    public static void main(String[] args) {
        int[]line=new int[1];
        for(int i=1;i<=outputLineNum;i++)
        {
            int[]oldLine=line.clone();//保存上一行的数据

            line=new int[i];//分配多1个空间的数组
            line[0]=1;//首尾置1
            line[line.length-1]=1;

            for(int j=1;j<line.length-1;j++)
                line[j]=oldLine[j]+oldLine[j-1];

            for(int num:line)
                System.out.print(num+" ");
            System.out.print("\n");
        }
    }
}
