package pages.enums;

public enum Username {

    VALIDEMAIL("Dark_Angel_hXc@abv.bg"),
	WRONGEMAIL("Somebody@Example.com"),
	ADMIN("admin");

	private String username;
	
	Username(String username){
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

}
