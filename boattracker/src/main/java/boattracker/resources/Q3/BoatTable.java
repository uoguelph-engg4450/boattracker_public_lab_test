package boattracker;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

public class BoatTable {
    // maps boats to a list of users
    private HashMap hm = new HashMap();

    public void addPair(Boat boat, Employee employee){
	//create new list if it doesn't exist
	ArrayList<Employee> boatlist = (ArrayList)hm.get(boat);
	if (boatlist == null){
	    ArrayList<Employee> l = new ArrayList<Employee>();
	    l.add(employee);
	    hm.put(boat, l);
	}
	else {
	    boatlist.add(employee);
	}
    }
    
    public void removePair(Boat boat, Employee employee){
	ArrayList<Employee> boatlist = (ArrayList)hm.get(boat);
	boatlist.remove(employee);
	if (boatlist.isEmpty()) {
	    hm.remove(boat);
	}
    }


    public ArrayList<Employee> getUserList(Boat boat){
	// return a list of employees assigned to a boat
	return (ArrayList<Employee>) hm.get(boat);
    }

    public ArrayList<Boat> getBoatList(Employee employee){
	//return a list of boats assigned to a user
	ArrayList<Boat> l = new ArrayList<Boat>();
	Iterator it = hm.entrySet().iterator();
	while (it.hasNext()) {
	    Map.Entry entry = (Map.Entry) it.next();
	    Boat key = (Boat) entry.getKey();
	    Employee value = (Employee) entry.getValue();
	    if (value == employee)
		l.add(key);
	}
	return l;
    }
        
    
}
