package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramCovariancia {

	/*
	 * EXEMPLO DE COVARIANCIA
	 * UMA LISTA DE UM TIPO GENERICO PODE RECEBER DADOS DE UM TIPO ESPECIFICO DESDE QUE SEJA EXTENDIDO
	 * POREM N�O PODE ADICIONAR VALORES
	 * 
	 * GET OK
	 * PUT ERROR
	 */
	
	public static void main(String args[]) {
		
		
		// Declara��o de lista tipo Inteiro
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(5);
		
		//Declaracao de lista do tipo generico que extende de Number ( Integer, double, fload )
		List<? extends Number> list = intList;
		
		System.out.println(list.get(0));
		
		// N�o � poss�vel adicionar valores pois n�o se sabe se o valor ser� do tipo inteiro
		//list.add(20);
	}
}
