package pekan7_2511532024;

public class Akun {

	private String username, password, email;
	private int pin;
	
	// Setter
	public void setUsername (String username) {
		this.username = username;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public void setPin (int pin) {
		this.pin = pin;
	}

	// Getter
	public String getUsername () {
		return username;
	}
	public String getPassword () {
		return password;
	}
	public String getEmail () {
		return email;
	}
	public int getPin () {
		return pin;
	}
	
	// Validasi Password
	public boolean isPasswordValid () {
		return password != null && password.length() >= 8;
	}
	
	// Validasi Email
	public boolean isEmailValid () {
		if (email == null) return false;
		return email.contains("@") && email.contains(".");
	}

	
}
