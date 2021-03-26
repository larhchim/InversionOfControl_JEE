package Presentation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IDAO;
import Metier.IMetier;
import Metier.Entity.Produits;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Controller() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
Scanner sc = new Scanner(new File("D:\\Module JEE\\LARHCHIM ISMAIL TPIOC\\config.txt"));
		
		String classname =sc.nextLine();
		Class cdao;
		try {
			cdao = Class.forName(classname);
			IDAO dao = (IDAO) cdao.newInstance();
			
			String classmetier =sc.nextLine();
			Class cmetier =Class.forName(classmetier);
			IMetier metier =(IMetier) cmetier.newInstance();
			
			java.lang.reflect.Method m=cmetier.getMethod("setDao", IDAO.class);
			m.invoke(metier, dao);
			System.out.println(metier.Calcul());
			
			java.util.List<Produits> arr =dao.afficherProduits();
			
			request.setAttribute("listeProd", arr);
			request.setAttribute("var", (metier.Calcul()));
			
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       
		
	}

}
