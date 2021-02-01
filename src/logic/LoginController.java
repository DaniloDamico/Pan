package logic;

public class LoginController {
	 // dummy method
	
	//singleton
	private static LoginController instance = null;
	
	private LoginController() {}
	
	public static LoginController getInstance() {
		if(instance == null) {
			instance = new LoginController();
		}
		
		return instance;
	}
		
		
	//fine implementazione singleton
			
	public LoginBean login(String username, String password) {
				
	// se dati corretti restituisci nome, cognome
	// else restituisci null
				
	LoginBean loginBean = new LoginBean();
	
	// delegare ad una classe DAO			
	if(Math.random()>0.5) {
		loginBean.setName("Mario");
		loginBean.setSurname("Rossi");
	} else {
		loginBean = null;
	}
				
		return loginBean;
	}
	
}
