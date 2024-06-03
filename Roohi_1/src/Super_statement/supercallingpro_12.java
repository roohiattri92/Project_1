package Super_statement;
class grandparent65_12{
	grandparent65_12(){
 System.out.println("ram");
}
class parent1_123 extends grandparent65_12
{
	parent1_123(){
	System.out.println("roop");
}
class child41_123 extends parent1_123
	{
		child41_123(){
			System.out.println("mom");
		}
	
	public class supercallingpro_12 extends child41_123
{

	public static void main(String[] args) {
		System.out.println("dad");
		grandparent65_12 t1=new grandparent65_12();

	}

}
}
