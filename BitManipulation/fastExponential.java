// import java.util.*;

// public class fastExponential{

//     public static int findExpo(int num, int power){
//         int ans=1;

//         while(power>0){
//             if((power&1)!=0){
//                 ans=ans*num;
//             }

//             num=num*num;
//             power=power>>1;
//         }

//         return ans;
//     }
//     public static void main(String args[]){
//         int num=3;
//         int power=5;

//         System.out.println(findExpo(num, power));
//     }
// }

import java.util.*;

public class fastExponential {

    public static int findExpo(int num, int power) {
        int ans = 1;

        while (power > 0) {
            // If power is odd
            if ((power & 1) != 0) {
                ans = ans * num;
            }

            // Square the base
            num = num * num;

            // Right shift the power (divide by 2)
            power = power >> 1;
        }

        return ans;
    }

    public static void main(String args[]) {
        int num = 2;
        int power = 10;

        System.out.println(findExpo(num, power)); // Output: 243
    }
}
