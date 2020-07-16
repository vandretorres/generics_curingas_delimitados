package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramCovariancia {

	/*
	 * EXEMPLO DE COVARIANCIA
	 * UMA LISTA DE UM TIPO GENERICO PODE RECEBER DADOS DE UM TIPO ESPECIFICO DESDE QUE SEJA EXTENDIDO
	 * POREM NÃO PODE ADICIONAR VALORES
	 * 
	 * GET OK
	 * PUT ERROR
	 */
	
	public static void main(String args[]) {
		
		
		// Declaração de lista tipo Inteiro
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(5);
		
		//Declaracao de lista do tipo generico que extende de Number ( Integer, double, fload )
		List<? extends Number> list = intList;
		
		System.out.println(list.get(0));
		
		// Não é possível adicionar valores pois não se sabe se o valor será do tipo inteiro
		//list.add(20);
	}
}
