import java.util.Scanner;

class CheckTheNumbers{
        
        public static void main(String[] args){
     //create a Scanner object
     Scanner sc = new Scanner(System.in);

//create a array to store Numbers
int number[] = new int[5];

//using for loop to input the number from the user
for(int i=0;i<number.length;i++){
number[i] = sc.nextInt();
}
//Iterating through the array to display the results
for(int i=0;i<number.length;i++){
if(number[i]<0){
System.out.println("Negative\n");}
else if(number[i]==0){
System.out.println("Zero\n");}
else{
if(number[i]%2==0){
System.out.println("the number is positive and even\n");}
else{
System.out.println("the number is positive and odd\n");}
}
}
//comparing first and last element
if(number[0]==number[number.length-1]){
System.out.println("Equal\n");}
else if(number[0]>number[number.length-1]){
System.out.println("First number is greater than the last element\n");}
else{
System.out.println("First number is smaller than the last element\n");}


//close the scanner
sc.close();
}
}
