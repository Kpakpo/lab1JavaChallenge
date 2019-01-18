
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        System.out.print("Enter your sentence: "); //Taking user sentence inputs. 
        Scanner scanner = new Scanner(System.in);
        String strName = scanner.nextLine();  //scan the next token of the input as a String.
        StringBuilder Stringreverse = new StringBuilder(); // Creating modifiable strings. 

        String[] words = strName.split(" ");  //separates the words into an array on the basis of space between each 
 
        for (String word : words)   //iterates through each element of the array "words"
        {
            String reverseWord = new StringBuilder(word).reverse().toString();  //reverses each word in the array
            Stringreverse.append(reverseWord + " ");    //add the reversed words together                
        }
 
        System.out.println( Stringreverse.toString().trim() );      //verify reversed string
    
}
    
}
