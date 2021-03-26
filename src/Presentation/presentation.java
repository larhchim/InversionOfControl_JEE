package Presentation;

import java.io.File;
import java.util.Scanner;

import DAO.IDAO;
import Metier.IMetier;

public class presentation {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(new File("config.txt"));
		
		String classname =sc.nextLine();
		Class cdao =Class.forName(classname);
		IDAO dao = (IDAO) cdao.newInstance();
		
		String classmetier =sc.nextLine();
		Class cmetier =Class.forName(classmetier);
		IMetier metier =(IMetier) cmetier.newInstance();
		
		java.lang.reflect.Method m=cmetier.getMethod("setDao", IDAO.class);
		m.invoke(metier, dao);
		
		System.out.println(metier.Calcul());
		
		
		

	}

}
