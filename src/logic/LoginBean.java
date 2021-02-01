package logic;

public class LoginBean {

	private String username;
	private String password;
	
	private String name;
	private String surname;
	
	public LoginBean() {
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public boolean validate() {
		if(username == null || password == null || username == "" || password == ""){
			return false;
		}
		
		LoginBean validUser = LoginController.getInstance().login(username, password);
		return validUser != null;
	}
}
