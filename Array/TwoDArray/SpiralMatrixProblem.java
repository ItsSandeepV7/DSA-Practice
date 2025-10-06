public class SpiralMatrixProblem {
    

    public static void getSpiralMatrix(int[][] matrix){

        int m=matrix.length;
        int n=matrix[0].length;

        //first of all, we need four variables- re,re,cs and ce
        int rs=0, re=m-1;
        int cs=0, ce=n-1;

        while(rs<=re && cs<=ce){
            
           //to print top boundary
           for(int col= cs;col<=ce;col++){
                System.out.print(matrix[rs][col]+" ");
            }

            //to print right boundary
            for(int row=rs+1;row<=re;row++){
                System.out.print(matrix[row][ce]+" ");
            }

            //to print bottom boundary
            
            if (rs < re) {  // only if more than one row left
                for (int col = ce - 1; col >= cs; col--) {
                    System.out.print(matrix[re][col] + " ");
                }
            }

            //to print left boundary
             if (cs < ce) {  // only if more than one column left
                for (int row = re - 1; row > rs; row--) {
                    System.out.print(matrix[row][cs] + " ");
                }
            }

            rs++;
            re--;
            cs++;
            ce--;
            System.out.println();

        }
        
    }
    public static void main(String args[]){

        int[][] matrix=
        {
            {1,5,7,9},{10,11,6,10},{12,13,20,21}
        };

        getSpiralMatrix(matrix);


    }

}
