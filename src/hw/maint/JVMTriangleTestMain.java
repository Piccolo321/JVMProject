/**This class is the test main for Triangle.java
/* Dr. Frank Xu
 * Software Maintains
 * Fang Yuan
 * 9/9/2014
 */

package hw.maint;

public class JVMTriangleTestMain {

	public static void main(String[] args) {
		JVMTriangle triangleTest = new JVMTriangle(0,0,0);
		JVMTriangle triangleTest1 = new JVMTriangle(2,2,2);
		JVMTriangle triangleTest2 = new JVMTriangle(2,2,1);
		JVMTriangle triangleTest3 = new JVMTriangle(0,1,0);
		JVMTriangle triangleTest4 = new JVMTriangle(1,2,3);
		
		/*Equilateral Triangle return 1.
		Isosceles Triangle return 2.
			Scalene Triangle return 3.
				Not Triangle return 0.
		 */
		System.out.println(triangleTest.getType());
		System.out.println(triangleTest1.getType());
		System.out.println(triangleTest2.getType());
		System.out.println(triangleTest3.getType());
		System.out.println(triangleTest4.getType());
	}

}



