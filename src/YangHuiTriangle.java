public class YangHuiTriangle {
    static int outputLineNum=10;
    public static void main(String[] args) {
        int[]line=new int[1];
        for(int i=1;i<=outputLineNum;i++)
        {
            int[]oldLine=line.clone();
            line=new int[i];
            line[0]=1;
            line[line.length-1]=1;
            for(int j=1;j<line.length-1;j++)
                line[j]=oldLine[j]+oldLine[j-1];
            for(int num:line)
                System.out.print(num+" ");
            System.out.print("\n");
        }
    }
}
