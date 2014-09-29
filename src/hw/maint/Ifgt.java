package hw.maint;

public class Ifgt {
	static int j =0;
	
	public static String ifgt(){
		String ifgt = "null";
		for (int i = 0; i < ByteCodeInput.records.size(); i++){
			
			JVM.bytecode = ByteCodeInput.records.get(i).substring(5, 9);
			ifgt = ByteCodeInput.records.get(i).substring(5, 9);
			JVM.newLineNumber = ByteCodeInput.records.get(i).substring(0, 4);
			
			for(j=0; i<ByteCodeInput.records.size(); i++){
				if(ifgt == "ifgt"){
					if(JVM.newLineNumber==Integer.toString(j)){
						JVM.newLineNumber = Integer.toString(j);
					}
				}
			}	
		}
		return JVM.newLineNumber;
	}
	
	public static void goToNewLine(){
		for(int i=0; i<ByteCodeInput.records.size(); i++){
			ifgt();
			JVM.bytecode = ByteCodeInput.records.get(j).substring(5);
		}
	}
}
