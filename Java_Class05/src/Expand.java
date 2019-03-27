import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) throws IOException {
	
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number string combination");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String stg = buff.readLine();
        char ch[] = stg.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            
                if (ch[i] >= '0' && ch[i] <= '9') {
                    for (int p = 0; p < ch[i]-'0'; p++) {
                        System.out.print(ch[i - 1]);

                    
                }
                
            }
        }
        System.out.println("");

		
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
	}
	
}
