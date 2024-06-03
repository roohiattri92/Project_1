package Access_Specifier_package2;

import Access_Specifier_.Within_class;//without becoming subclass

public class Outside_package {

	public static void main(String[] args) {

		Within_class h1=new Within_class();
		//h1.add();// 
		h1.sum();// only public access specifier can access withoutside the package
		//h1.rab();
		//h1.hum();
	}

}
