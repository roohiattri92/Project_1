package Encapsulation_getter_setter;

public class Encapsulation_hid_sensitive_info 


{
	private String email="roohikohli21@gmail.com";
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	Encapsulation_hid_sensitive_info K1=new Encapsulation_hid_sensitive_info();
     K1.setEmail("rohihjgfhagfgf@hmail.com");
     System.out.println(s1.getEmail());			
		
		}
}
