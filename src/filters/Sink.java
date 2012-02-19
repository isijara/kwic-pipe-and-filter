package filters;

import java.io.EOFException;

/**
 * 
 * @author Matthew A. Johnston
 * 
 */
public class Sink extends Filter {

	@Override
	public void run() {
		while(true) {
			try {
				System.out.print(read());
			} catch(EOFException e) {
				break;
			}
		}
	}

}
