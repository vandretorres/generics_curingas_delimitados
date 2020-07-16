package application;

import java.util.ArrayList;
import java.util.List;


/*
 * EXCEMPL DE CONTRAVARIANCIA
 * 
 * 
 * PUT OK
 * GET ERROR
 */
public class ProgramContravariancia {
	
	public static void main(String args[]) {
		
		List<Object> myObj = new ArrayList<Object>();
		myObj.add("Maria");
		myObj.add("Eduardo");
		
		List<? super Number> myNums = myObj;
		
		myNums.add(10);
		myNums.add(7.5);
		
		Object x = myNums.get(0);
		
		System.out.println(x);
		
		// Não é possível fazer esta operação pois a lista myNums é uma subclasse de Object.
		//Number y = myNums.get(0);
		
		
	}

}
