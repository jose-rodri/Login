package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ModeloUsuario;
import Entidad.Usuario;

/**
 * Servlet implementation class ServletRegistroUsuario
 */
public class ServletRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistroUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int accion = Integer.parseInt(request.getParameter("accion"));
		switch (accion) {
		case 1 : registrarUsuario(request,response);break;
		}
	}
	
	
	protected void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		ModeloUsuario usu = new ModeloUsuario();
		
		Usuario u = new Usuario();
		
		u.setNombre(request.getParameter("txtnombre"));
		u.setApellido(request.getParameter("txtapellido"));
		u.setEmail(request.getParameter("txtemail"));
		u.setMovil(request.getParameter("txtmovil"));
		u.setDni(request.getParameter("txtdni"));
		u.setClave(request.getParameter("txtclave"));
		
		 usu.AgregarUsuario(u);
		 
		 response.sendRedirect("portalLogin.jsp");
		 
	}

}
