package hw.maint;

public class JVMDriver {
	public static void main(String[] args) throws Exception {
		ByteCodeInput b = new ByteCodeInput();
		String filename = "C:/Users/XiaoPP/Desktop/xu's works/bytecodeInput.txt";
		System.out.println(b.readFile(filename));
	}
}
