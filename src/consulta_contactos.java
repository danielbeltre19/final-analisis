
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class consulta_contactos {
    
    
    public void insertar_contactos(contactos cont){
  
        Connection con = conector.getConnection();
            PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO `mi-contactos`(`nombre`, `apellido`, `grupo`, `telefono`, `email`, `direccion`, `foto`, `usuarioid`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(2,cont.getApellido());
              ps.setString(1,cont.getNombre());
                ps.setString(3,cont.getGrupo());
                  ps.setString(4,cont.getTel());
                    ps.setString(6,cont.getEmail());
                      ps.setString(5,cont.getDireccion());
                        ps.setBytes(7,cont.getFoto());
                          ps.setInt(8,cont.getUsuarioid());
              if(ps.executeUpdate()!=0){
                     JOptionPane.showMessageDialog(null,"Nueva contacto Creado");
           
              }else{
                        JOptionPane.showMessageDialog(null,"No se pudo Crear");
                   }           
            
        } catch (SQLException ex) {
            Logger.getLogger(consulta_contactos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
      
    public void editar_contactos(contactos cont, boolean withImage){
  
        Connection con = conector.getConnection();
            PreparedStatement ps;
            String editar="";
        if(withImage == true){
            
            editar="UPDATE `mi-contactos` SET `nombre`=?,`apellido`=?,`grupo`=?,`telefono`=?,`email`=?,`direccion`=?,`foto`=? WHERE `id`=?";
            
             try {
            ps = con.prepareStatement(editar);
            ps.setString(2,cont.getApellido());
              ps.setString(1,cont.getNombre());
                ps.setString(3,cont.getGrupo());
                  ps.setString(4,cont.getTel());
                    ps.setString(6,cont.getEmail());
                      ps.setString(5,cont.getDireccion());
                        ps.setBytes(7,cont.getFoto());
                          ps.setInt(8,cont.getCid());
              if(ps.executeUpdate()!=0){
                     JOptionPane.showMessageDialog(null,"Actualizado");
           
              }else{
                        JOptionPane.showMessageDialog(null,"No se pudo Crear");
                   }           
            
        } catch (SQLException ex) {
            Logger.getLogger(consulta_contactos.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }
        
        else{
            try {
            ps = con.prepareStatement(editar);
            ps.setString(2,cont.getApellido());
              ps.setString(1,cont.getNombre());
                ps.setString(3,cont.getGrupo());
                  ps.setString(4,cont.getTel());
                    ps.setString(6,cont.getEmail());
                      ps.setString(5,cont.getDireccion());
                          ps.setInt(8,cont.getCid());
              if(ps.executeUpdate()!=0){
                     JOptionPane.showMessageDialog(null,"holssss");
           
              }else{
                        JOptionPane.showMessageDialog(null,"No se pudo Crear");
                   }           
            
        } catch (SQLException ex) {
            Logger.getLogger(consulta_contactos.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }
    
    }
    
       public void eliminar_contactos(int cid){
  
        Connection con = conector.getConnection();
            PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM `mi-contactos` WHERE `id`=?");
           ps.setInt(1, cid);
            
              if(ps.executeUpdate()!=0){
                     JOptionPane.showMessageDialog(null,"contacto eliminado");
           
              }else{
                        JOptionPane.showMessageDialog(null,"No se pudo Crear");
                   }           
            
        } catch (SQLException ex) {
            Logger.getLogger(consulta_contactos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
    
    
    
    
  //crear lista de contactos
    public ArrayList <contactos> lista_contactos(int usuarioid ){
        
        ArrayList<contactos> clist =new ArrayList<>();
        
        Connection con = conector.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
             rs=st.executeQuery("SELECT `id`, `nombre`, `apellido`, `grupo`, `telefono`, `email`, `direccion`, `foto` FROM `mi-contactos` WHERE  usuarioid ="+usuarioid);
      
             contactos ct;
             
             while(rs.next()){
                 ct = new contactos(rs.getInt("id"),
                      rs.getString("nombre"),
                          rs.getString("apellido"),
                        rs.getString("grupo"),
                          rs.getString("telefono"),
                          rs.getString("email"),
                          rs.getString("direccion"),
                          rs.getBytes("foto"),
                         usuarioid);        
                 
                 clist.add(ct);
             }
        
        } catch (SQLException ex) {
            Logger.getLogger(consulta_contactos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return clist;
    }
}
 