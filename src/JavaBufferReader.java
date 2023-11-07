import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaBufferReader {

	public static void main(String[] args) {
		
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in));) {
			
			System.out.print("What is your name? ");
			String name = input.readLine();
			
			System.out.println("hello, " + name);
			
			input.close();
			
		} catch (IOException e) {
			System.err.println(e);
		}
		
		
		
		
		
		
	}
}
