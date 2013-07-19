package Final;

public class test {
	public static String function1(){
		System.out.println("function1");
		return "return from function1";
	}
	
	public static String cauculate(){
		int x=0;
		int y=5;
		try{
			System.out.println("Start try");
			int b = y/x;
			System.out.println("end try");
			return "try return";
		}catch (Exception e){
			System.out.println("catch");
			return "catch return";
		}finally{
			System.out.println("finally");
			//return "finally return";
		}
	}
	
	public static void mainFunction(){
		System.out.println("main function start");
		String result = cauculate();
		System.out.println(result);
		System.out.println("main function end");
	}

	
	public static void main(String [] args){
		mainFunction();
	}
	
	
}
