package pages.enums;

public enum Username {
	ADMIN("admin"),
	GUESTUSER("milen"),
	TEACHERUSER("milentheteacher"),
	BULLSHITUSER("sdlkjfasdlfkjads");
	
	private String username;
	
	private Username(String username){
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
	
	
}
