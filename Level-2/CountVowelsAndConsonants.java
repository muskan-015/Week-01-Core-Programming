import java.util.Scanner;

class CountVowelsAndConsonants{
       public static void main(String[] args){
            Scanner sc =  new Scanner(System.in);
            String string = sc.next();
            int count = 0;
            string = string.toLowerCase();
            for(int i=0;i<string.length();i++){
                  char ch = string.charAt(i);
                  if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                       count++;}
            }
            System.out.println("count of vowels is : "+count);
            System.out.println("count of consonants is : "+ (string.length()-count));
       }
}

                       