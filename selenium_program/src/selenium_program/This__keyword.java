package selenium_program;

public class This__keyword {
	static int age;
   static String name;
   static  char y;
    
      void add(int age,String name, char y)
    {
    	this.age=age;
    	this.name=name;
    	this.y= y;
    	 
    	System.out.println("raman");
    	
    }

	public static void main(String[] args) 
	{     This__keyword c1=new This__keyword();
		c1.add(10,"raman",'h');
		System.out.println(age);
		System.out.println(name);
		System.out.println(y);
		  

	}

}
