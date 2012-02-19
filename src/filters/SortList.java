package filters;

import java.io.EOFException;
import java.util.concurrent.ConcurrentSkipListSet;


/**
 * 
 * @author Matthew A. Johnston
 * 
 */
public class SortList extends Filter {
	
	private ConcurrentSkipListSet<String> buffer;
	public SortList() {
		buffer = new ConcurrentSkipListSet<String>(String.CASE_INSENSITIVE_ORDER);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String s = read();
				buffer.add(s);
			} catch(EOFException e) {
				break;
			}
		}
		
		while(!buffer.isEmpty())
			write(buffer.pollFirst());
		
		write(null);
	}
	
}
