package pages.enums;

public enum Password {

	VALIDPASSWORD("123456ytrewq"),
    WRONGPASSWORD("12tonight465"),
	ADMINPASSWORD("Password");
	
	private String password;
	
	private Password(String password){
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
