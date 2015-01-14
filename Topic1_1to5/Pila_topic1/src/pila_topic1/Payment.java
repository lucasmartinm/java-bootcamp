package pila_topic1;

public class Payment {
	public int option, credit_number;
	private String email, name, password;

	public Payment(int option, int credit_number, String email, String name, String password) {

	}

	public Payment() {
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public int getCredit_number() {
		return credit_number;
	}

	public void setCredit_number(int credit_number) {
		this.credit_number = credit_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
