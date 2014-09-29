/* Dr. Frank Xu
 * Software Maintains
 * Fang Yuan
 * 9/11/2014
 */

package hw.maint;

public class JVMTriangle {
	private int side1 = 0;
	private int side2 = 0;
	private int side3 = 0;
	private int type = 0;
	
	public JVMTriangle(int side1, int side2, int side3) {
		setSides(side1, side2, side3);
	}

	public void setSides(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/*Equilateral Triangle return 1.
		Isosceles Triangle return 2.
			Scalene Triangle return 3.
				Not Triangle return 0.
	*/
	public int getType(){
		if(side1<=0 || side2 <=0 || side3 <=0){
			type = 0;
		}
		else if(side1>=0 && side2>=0 && side3>=0){
			if(side1==side2 && side2==side3 && side3==side1){
				type = 1;
			}else if(side1==side2 || side2==side3 || side1==side3){
				type = 2;
			}else if(side1 != side2 && side1 != side3 && side2 != side3){
				type = 3;
			}
		}
		return type;
	}
}





