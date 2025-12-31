public class permutationProblem {
    static int count =0;

    public static void findPermutation(String str,String ans_str){
        

        //Base Case
        if(str.length()==0){
            System.out.println(ans_str);
            count=count+1;
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String updated_str=str.substring(0,i)+str.substring(i+1);// "abcde"="ab+"de"=>abde hence c is removed in this way
            findPermutation(updated_str, ans_str+currChar);
        }
        
    }
    public static void main(String[] args) {
        String str="abc";
        String ans_str="";
        findPermutation(str,ans_str);
        System.out.println("Total permutations is :"+ count);
    }
}


