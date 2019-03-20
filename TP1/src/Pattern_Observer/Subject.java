package Pattern_Observer;

import java.util.*;

public abstract class Subject {

	private List<Observer> list=new ArrayList<Observer>();
	
	public void attach(Observer ob) {
		list.add(ob);
		notifyObservers();
	}
	
	public void detach() {
		list.clear();
	}

	public void notifyObservers() {
		for(Observer ob: list) {
			ob.update(this);
		}
	
	}
}
