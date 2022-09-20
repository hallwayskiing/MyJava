public class Matrix {
    static int[][] addMatrix(int[][]matrixA, int[][]matrixB)
    {
        int row=matrixA.length;
        int column=matrixA[0].length;
        int [][]result=new int[row][column];

        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                result[i][j]=matrixA[i][j]+matrixB[i][j];

        return result;
    }
    static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB)
    {
        int row=matrixA.length;
        int column=matrixB[0].length;
        int [][]result=new int[row][column];

        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                for(int k=0;k<matrixA[0].length;k++)
                    result[i][j]+=matrixA[i][k]*matrixB[k][j];

        return result;
    }

    public static void main(String[] args) {

        int[][]matrixA=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][]matrixB=new int[][]{{2,2,2},{1,1,1},{3,3,3}};
        int[][]result;

        result =addMatrix(matrixA,matrixB);
        for(int[]line:result)
            for(int num:line)
                System.out.println(num);

        result= multiplyMatrix(matrixA,matrixB);
        for(int[]line:result)
            for(int num:line)
                System.out.println(num);
    }
}
