package hw.maint;

public class Getfield {
	public static void getfield(){
		
		JVM.jvmTemp1 = (int) JVM.systemStack.pop();
		JVM.jvmTemp2 = (int) JVM.systemStack.pop();
	}
}
