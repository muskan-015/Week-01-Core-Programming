import java.util.Scanner;

class CheckAge{
        
        public static void main(String[] args){
     //create a Scanner object
     Scanner sc = new Scanner(System.in);

//create a array to store ages of students
int age[] = new int[10];

//using for loop to input the ages from the user
for(int i=0;i<age.length;i++){
age[i] = sc.nextInt();
}
//Iterating through the array to display the results
for(int i=0;i<age.length;i++){
if(age[i]<0){
System.out.println("Invalid Age\n");}
else if(age[i]>=18){
System.out.println("The student with age "+age[i] +" can vote.\n");}
else{
System.out.println("The student with age "+age[i] +" cannot vote.\n");}
}
//close the scanner
sc.close();
}
}
