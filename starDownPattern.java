public class starUpPattern {
    public static void main(String args[]){
        String str = "shiva";
        for(int i = 0; i<str.length();i++){
            for(int j = 0;j<=str.length()-1;j++){
                if(j<=i){
                    System.out.print(str.charAt(j)+" ");
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    
}
}

