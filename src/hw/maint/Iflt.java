package hw.maint;

public class Iflt {
	public static void iflt(){
		if(JVM.side1 <0){
			Goto.goTo();
		}else if(JVM.side2 <0){
			Goto.goTo();
		}else if(JVM.side3 <0){
			Goto.goTo();
		}
	}
}
