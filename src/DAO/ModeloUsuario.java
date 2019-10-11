package DAO;
import java.sql.*;


import Entidad.Usuario;
import Cn.Conectar;
public class ModeloUsuario {
	
	public Usuario iniciarSesion(String usu, String pass ){
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Usuario obj = null;
		try {
			conn = new  Conectar().getConectar();
			String sql ="select * from usuarios where dni = ? and clave =? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, usu);
			pstm.setString(2, pass);
			rs = pstm.executeQuery();
			while(rs.next()){
				obj = new Usuario();
				obj.setId(rs.getInt("id"));
				obj.setNombre(rs.getString("nombre"));
				obj.setApellido(rs.getString("apellido"));
				obj.setNombre(rs.getString("nombre"));
				obj.setEmail(rs.getString("email"));
				obj.setMovil(rs.getString("movil"));
				obj.setDni(rs.getString("dni"));
				obj.setClave(rs.getString("clave"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!= null) rs.close();
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return obj;
		
	}
	
	
	
		public int AgregarUsuario(Usuario usuario){
		
		
			Connection cn= null;
			PreparedStatement pstm = null;
			
		
			int respuesta = 0;
		
		try {
			
			cn = new Conectar().getConectar();
			String sql = "insert into usuarios(nombre,apellido,email,movil,dni,clave) values (?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario.getNombre());
			pstm.setString(2, usuario.getApellido());
			pstm.setString(3, usuario.getEmail());
			pstm.setString(4, usuario.getMovil());
			pstm.setString(5, usuario.getDni());
			pstm.setString(6, usuario.getClave());
			respuesta = pstm.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			
			try {
				
				if(cn !=null) cn.close();
				if(pstm !=null) pstm.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		
		
		
		return respuesta;
		
	}
	
	
	
	
}