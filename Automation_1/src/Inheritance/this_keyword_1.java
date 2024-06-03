
//this keyword

package Inheritance;

public class this_keyword_1 

{
	
	int age;
	String name;
	char r;
	float o;
	void student(int age,String name,char t)
	{
		this.age=age;
		this.name=name;
		this.r=t;
		this.o=t;
		
		System.out.println("asaf");
	}
	
	

	public static void main(String[] args) {
		this_keyword_1 h=new this_keyword_1();
		h.student(10, "roohi", 'k');
	System.out.println(h.age);
	System.out.println(h.name);
	System.out.println(h.r);
	System.out.println(h.o);


		
	}
	

}
