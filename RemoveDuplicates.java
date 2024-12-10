package HW5.Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {
	
	/**
	 * @param lst the list from which duplicates will be removed
	 * @requires lst != null
	 * @requires lst elements of type which correctly implements equals()
	 */
	public static void removeDuplicates(List lst) {
	    if (lst == null || lst.size() == 0) return;
	    List copy = new ArrayList(lst);
	    Iterator elements = copy.iterator();
	    Object pre = elements.next();
	    while(elements.hasNext()) {
	        Object nex = elements.next();
	        if (pre.equals(nex)) lst.remove(nex);
	        else pre = nex;
	    }
	}
}
