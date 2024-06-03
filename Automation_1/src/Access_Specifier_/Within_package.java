package Access_Specifier_;

public class Within_package {

	public static void main(String[] args) {
		Within_class h1=new Within_class();
		//h1.add();//only private cannot access within different package.
		h1.sum();
		h1.rab();
		h1.hum();

	}

}
