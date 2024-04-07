package Encapsulation_getter_setter;

public class Getter_setterpro {
	 private  int age = 20;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Getter_setterpro v1=new Getter_setterpro();
		v1.setAge(12);
		System.out.println(v1.getAge());
		
    
	}

}
