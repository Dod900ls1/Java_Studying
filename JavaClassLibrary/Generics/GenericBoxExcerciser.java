package Generics;

public class GenericBoxExcerciser {

	public GenericBoxExcerciser() {
	}
	
	public static void main(String[] args) {
		GenericBox<Integer> inst1 = new GenericBox<>();
		GenericBox<String> inst2 = new GenericBox<>();
		
		inst1.setT(10);
		inst2.setT("Hello world");
		
		System.out.println(inst1.getT());
		System.out.println(inst2.getT());
	}

}
