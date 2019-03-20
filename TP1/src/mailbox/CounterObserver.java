package mailbox;

import javax.swing.JLabel;

import Pattern_Observer.Observer;
import Pattern_Observer.Subject;

@SuppressWarnings("serial")
public class CounterObserver extends JLabel implements Observer {

	int nbMail=0;
	


	@Override
	public void update(Subject s) {

		nbMail=((MailBox) s).getNbreMail();
		setText("nombre de mails: "+nbMail);

	}

	
	

}
