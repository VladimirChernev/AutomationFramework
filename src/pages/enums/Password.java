package pages.enums;

public enum Password {
	ADMINPASSWORD("parola"),
	GUESTPASSWORD("asdfasdfsadf"),
	TEACHERPASSWORD("asdfsdafsadfadsf"),
	BULLSHITPASSWORD("sdafsadfasdf");
	
	private String password;
	
	private Password(String password){
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
