package hw.maint;

public class Ireturn {
	public static int ireturn(){
		JVM.type = (int) JVM.systemStack.pop();
		return JVM.type;
	}
}
