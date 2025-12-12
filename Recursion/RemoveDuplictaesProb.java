package Recursion;

public class RemoveDuplictaesProb {

    public static void removeDuplicateFunc(String str, int indx, StringBuilder newStr, boolean[] map){

        int n=str.length();
        if(indx==n){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(indx);
        if(map[currChar - 'a']==true){
            removeDuplicateFunc(str, indx+1, newStr, map);
        }else{
            map[currChar - 'a']=true;
            removeDuplicateFunc(str, indx+1, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicateFunc(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
