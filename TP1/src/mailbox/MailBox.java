package mailbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Pattern_Observer.Observer;
import Pattern_Observer.Subject;



public class MailBox extends Subject{

	
	private MailBox(){
		
	}
	private static MailBox instance = null;
	
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	List<Mail> mail = new ArrayList<Mail>();
	
	
	public void addMail(Mail m ){
		
		this.mail.add(m);
		this.notifyObservers();
		}


	public Mail getLastMail() {
		
		return this.mail.get(mail.size()-1);

	}


	public Integer getNbreMail() {
		return mail.size();
	}
	
	public boolean isEmpty(){
		return this.getNbreMail()==0;
	}

		
	
	
}
