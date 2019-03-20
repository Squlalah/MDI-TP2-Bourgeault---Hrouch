package mailbox;

import javax.swing.JLabel;

import Pattern_Observer.Observer;
import Pattern_Observer.Subject;

public class MailObserver extends JLabel implements Observer {
		String subject="";
		String body="";
	@Override
	public void update(Subject s) {
		this.subject=((MailBox)s).getLastMail().getSubject();
		this.body=((MailBox) s).getLastMail().getBody();
		setText("subject: "+subject+"body: "+body);

	}

}
