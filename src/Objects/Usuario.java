package Objects;


public class Usuario {
	public String user;
	public String password;
	public Usuario(String user, String password) {
		this.user = user;
		this.password = password;
		System.out.println(user + " " + password);
	}
	public String getUser() {
		System.out.println("Exe 1");
		return user;
	}
	public void setUser(String user) {
		System.out.println("Exe 2");
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario(){};
	
}
