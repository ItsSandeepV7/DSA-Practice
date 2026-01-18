//logic: primary diagonal ke elemts ki possition wo hogi where i==j hoga and
// seconadry diagonal elemts ki position waha hogi where i+j == m(matrix.length)

// ye logic is for when order of matrix is odd (or even)



public class BruteForceMethod {

    public static int getDiagonalSum(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int diagonalSum=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    diagonalSum=diagonalSum+matrix[i][j];
                }
                else { if(i+j==m-1){
                    diagonalSum=diagonalSum+matrix[i][j];
                }}
               
            }
        }
        return diagonalSum;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };

        System.out.println(getDiagonalSum(matrix));
    }
}
