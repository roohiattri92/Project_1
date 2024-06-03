package Access_Specifier_package3;

import Acess_specifier_subclass.Class1_subclass_outsidepackage;//need to import other package and class(packagename.class)

public class Class_2 extends Class1_subclass_outsidepackage
//two different package have different classes how to access one package subclass into another package class
{

	public static void main(String[] args) {
		Class_2 d1=new Class_2();
	//	d1.add();// private
		d1.sum();
		d1.rab();
	//	d1.hum();//package/default
	}

}
