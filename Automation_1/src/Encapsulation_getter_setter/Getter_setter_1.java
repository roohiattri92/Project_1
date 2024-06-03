package Encapsulation_getter_setter;

public class Getter_setter_1 {
	private String email= "roohikohli92@gmail.com" ;
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static void main(String[] args) {

		Getter_setter_1 s1=new Getter_setter_1();
		s1.setEmail("roohisiddique92@gmail.com");
		System.out.println(s1.getEmail());
		System.out.println(Math.subtractExact(23, 10));//MATH CLASS 
		}

}
