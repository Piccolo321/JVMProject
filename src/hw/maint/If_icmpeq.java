package hw.maint;

public class If_icmpeq {
	public static void if_icmpeq(){
		if(JVM.side1 == JVM.side2 || JVM.side1 == JVM.side3 || JVM.side2 == JVM.side3){
			Goto.goTo();
		}
	}
}
