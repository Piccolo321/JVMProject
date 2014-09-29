package hw.maint;

public class Ifle {
	static int j = 0;
	
	public static String ifle(){
		String ifle = "null";
		
		for (int i = 0; i < ByteCodeInput.records.size(); i++){
			
			JVM.bytecode = ByteCodeInput.records.get(i).substring(5, 9);
			ifle = ByteCodeInput.records.get(i).substring(5, 9);
			JVM.newLineNumber = ByteCodeInput.records.get(i).substring(0, 4);
			
			for(j=0; j<ByteCodeInput.records.size(); j++){
				if(ifle == "ifle"){
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
			ifle();
			JVM.bytecode = ByteCodeInput.records.get(j).substring(5);
		}
	}
}
