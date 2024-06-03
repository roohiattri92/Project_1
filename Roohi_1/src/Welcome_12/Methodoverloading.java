package Welcome_12;

public class Methodoverloading {
	
	void add() {
		System.out.println("u");
	}
	static void sub()
	{
		System.out.println("y");
	}
       void add(int y) 
       {
   System.out.println("j");
}
  
       Methodoverloading()
       {
    	   System.out.println("l");
       }
       
       Methodoverloading(int r)
       {
    	   System.out.println("m");
       }
       public static void main(String[] args) {
    	   
sub();
Methodoverloading i1=new Methodoverloading();
i1.add();
i1.add(0);
Methodoverloading p1=new Methodoverloading();
Methodoverloading k1=new Methodoverloading(65);



	}

}
