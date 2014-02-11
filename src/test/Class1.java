package test;

public class Class1 {
	
	private int int1;
	private int int2;
	private String string1;
	private String string2; 
	
	public Class1(){
		int1 = 0;
		int2 = 1;
		string1 = "coucou";
		string2 = "salut";		
	}
	
	public String toString(){
		return new String("Class1 : " + int1 + ", " + int2 + ", \"" + string1 + "\", \"" + string2 +"\"");
	}
}
