package hw.maint;

public class Goto {
	public static void goTo() {
		for (int i = 0; i < ByteCodeInput.records.size(); i++) {
			JVM.newLineNumber = ByteCodeInput.records.get(i).substring(10, 13);

			if (JVM.newLineNumber == ByteCodeInput.records.get(i).substring(0,
					4)) {
				JVM.bytecode = ByteCodeInput.records.get(i).substring(5);
			}
		}
	}
}
