package Controlador;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.ModeloUsuario;

import Entidad.Usuario;
/**
 * Servlet implementation class ServletUusario
 */

	


@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ModeloUsuario u=new ModeloUsuario();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usu = request.getParameter("txtLogin");
		String pas = request.getParameter("txtPassword");
		
		Usuario usuario=u.iniciarSesion(usu,pas);
		
		if(usuario==null){
			request.setAttribute("msj","Error usuario y/o clave");
			request.getRequestDispatcher("portalLogin.jsp").forward(request,response);
		}
		else {
			response.sendRedirect("index.jsp");
		}
		
		
		
	}
	
	
	
	
	
	

	
	
	
	

	
}
