import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class JavaBufferReader {

	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
			
			while (reader.readLine() != null) {
				System.out.println(reader.readLine());
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
