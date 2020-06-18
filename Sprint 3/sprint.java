import java.util.Scanner;

public class sprint{
    public static void main(String[] args) {
    System.out.println("Enter the number of rows to display. Enter a value between 1 and 26");
        Scanner input = new Scanner(System.in);
        
        int rows = input.nextInt();
        if(rows<1 || rows>26){
            System.out.println("Invalid value entered. Exiting program.");
            System.exit(0);
        }
        System.out.println("");

        String[] alphabet = new String[26];
        int index = 0;

            System.out.println("Would you like the output to be in lowercase or uppercase letters? Please enter 'lower' or 'upper'.");
            String reply = input.next();
            
            System.out.println("");
            if (reply.equals("lower")){
                for (int i = 97; i <= 122; i++) {
                    alphabet[index] = ("" + (char) i);
                    index++;
                }
            }
            else if (reply.equals("upper")) {
                for (int i = 97; i <= 122; i++) {
                    alphabet[index] = ("" + (char) i).toUpperCase();
                    index++;
                }
            }
      
        String output = "";

        for(int i = 0; i<rows; i++){
            output += alphabet[i];
            System.out.println(output);
        } 
        input.close();
    }
}