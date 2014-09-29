package hw.maint;

public class Aload {
	public static void aload() {
		JVM.systemStack.add(JVM.side1);
		JVM.systemStack.add(JVM.side2);
		JVM.systemStack.add(JVM.side3);
	}
}
