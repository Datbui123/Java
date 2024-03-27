package first;

public class TestStatic {
	public static void main(String[] args) {
		Static obj1 = new Static();
		obj1.iStatic = 10; obj1.iNonStatic = 11;
		System.out.println(obj1.iStatic + "," + obj1.iNonStatic);
		Static obj2 = new Static();
		System.out.println(obj2.iStatic + "," + obj2.iNonStatic);
		obj2.iStatic = 12;
		System.out.println(obj1.iStatic + "," + obj1.iNonStatic);
	}
}