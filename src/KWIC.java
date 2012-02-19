import filters.CircularShifter;
import filters.NoiseWordRemoval;
import filters.Pipeline;
import filters.Pump;
import filters.Sink;
import filters.SortList;

/**
 * This is the launcher...nothing too fancy here
 * 
 * @author Matthew A. Johnston
 * 
 */
public class KWIC {
	public static void main(String[] args) {
		/*
     * I chose this ordering because it made the most
     * sense. The noise word removal is a pretty simple
     * class that only writes what it likes :-D
     *
     * The sort list class was fun. I was torn between
     * using TreeSet or ConcurrentLinked for the line
     * structure. Both sorted when you insert into it
     * however the Concurrent class is meant to be used
     * in multi threaded applications and I could use
     * a custom comparator to compare lines of strings
     * 
     * All in all, this is VERY fast setup.
     */
    (new Pipeline(
			new Pump(),
			new CircularShifter(),
			new NoiseWordRemoval(),
			new SortList(),
			new Sink()
		)).run();
	}
}
