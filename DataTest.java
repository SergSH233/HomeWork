package Pages;

import SQL.dbSQL;


public class DataTest {
	
	String login;
	String password;
	String recepient;
	String messagesubject;
	
	dbSQL request = new dbSQL();
	
	public DataTest (String id) {
		this.login = request.getValueParam(login, id);
		this.password = request.getValueParam(password, id);
		this.recepient = request.getValueParam(recepient, id);
		this.messagesubject = request.getValueParam(messagesubject, id);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRecepient() {
		return recepient;
	}

	public void setRecepient(String recepient) {
		this.recepient = recepient;
	}

	public String getMessagesubject() {
		return messagesubject;
	}

	public void setMessagesubject(String messagesubject) {
		this.messagesubject = messagesubject;
	}

	public dbSQL getRequest() {
		return request;
	}

	public void setRequest(dbSQL request) {
		this.request = request;
	}
	
}
