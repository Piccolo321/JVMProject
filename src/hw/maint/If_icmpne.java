package hw.maint;

public class If_icmpne {
	public static void if_icmpne(){
		if(JVM.side1 != JVM.side2 || JVM.side1 != JVM.side3 || JVM.side2 != JVM.side3){
			Goto.goTo();
		}
	}
}
