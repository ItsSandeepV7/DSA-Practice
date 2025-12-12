package Recursion;

public class PrintBinStringsProb {

    public static void findBinString(int n,int LP, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        findBinString(n-1, 0, str+"0");
        if(LP==0){
            findBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n=4;
        findBinString(n,0,"");
    }
}
