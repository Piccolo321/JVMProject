package hw.maint;

import java.util.Iterator;
import java.util.LinkedList;

public class JVM {
	
	public static String bytecode = "null";
	public static String lineNumber = "null";
	public static String newLineNumber = "null";
		
	public static int side1 = 0;
	public static int side2 = 0;
	public static int side3 = 0;
	public static int type = 0;
	public static int jvmTemp1 = 0;
	public static int jvmTemp2 = 0;
	
	
	public static LinkedList<Object> systemStack = new LinkedList<Object>();
	
//	Iterator<String> iterator = ByteCodeInput.records.iterator();
	
	public JVM(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public int iteratorBytecode(){ 
		int i;
		for(i = 0; i<ByteCodeInput.records.size(); i++){
			bytecode = ByteCodeInput.records.get(i).substring(5);
			
			if(bytecode == "aload_0 [this]"){
				Aload.aload();
			}else if(bytecode == "getfield hw.maint.JVMTriangle.side2 : int [16]" || 
					bytecode == "getfield hw.maint.JVMTriangle.side3 : int [18]" || 
							bytecode == "getfield hw.maint.JVMTriangle.side2 : int [20]"){
				Getfield.getfield();
			}else if(bytecode == "ifle 21"){
				Ifle.goToNewLine();
			}else if(bytecode == "ifgt 29"){
				Ifgt.goToNewLine();
			}else if(bytecode == "iconst_0"){
				Iconst_0.iconst_0();
			}else if(bytecode == "iconst_1"){
				Iconst_1.iconst_1();
			}else if(bytecode == "iconst_2"){
				Iconst_2.iconst_2();
			}else if(bytecode == "putfield hw.maint.JVMTriangle.type : int [22]"){
				Putfield.putfield();
			}else if(bytecode == "goto 170"){
				Goto.goTo();
			}else if(bytecode == "iflt 170"){
				Iflt.iflt();
			}else if(bytecode == "if_icmpne 91"){
				If_icmpne.if_icmpne();
			}else if(bytecode == "if_icmpeq 124"){
				If_icmpeq.if_icmpeq();
			}else if(bytecode == "ireturn"){
				Ireturn.ireturn();
			}
		}
		return type;
	}
}
