package filters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the pump
 * 
 * @author Matthew A. Johnston
 *
 */
public class Pump extends Filter {
	
	private BufferedReader reader;
	
	public Pump() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public void run() {	
		try {
			String read;
			while(true) {
				read = reader.readLine();
				if(read == null) {
					write(null);
					break;
				}
				write(read + "\n");
			}
		} catch (IOException e) {
			System.err.println("IOException caught in Filter::StandardIn");
		}
	}

}
