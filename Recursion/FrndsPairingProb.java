package Recursion;

public class FrndsPairingProb {

    public static int findToatalWays(int n){

        if(n==1 || n==2 ){
            return n;
        }

        //if single choice
        int fnm1=findToatalWays(n-1);

        //if pair choice
        int fnm2=findToatalWays(n-2);
        int pairWays=(n-1)*fnm2;

        int totalWays=fnm1+pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        
        int noOfFrnds=4;
        System.out.println(findToatalWays(noOfFrnds));
    }
}
