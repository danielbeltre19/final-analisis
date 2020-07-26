 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class contactos {
    
    
    private Integer cid;
    private String nombre;
    private String apellido;
     private String grupo;
      private String tel;
       private String email;
        private String direccion;
         private byte[] foto;
          private int usuarioid;

    public contactos() { }
          
          

    public contactos(Integer cid, String nombre, String apellido, String grupo, String tel, String email, String direccion, byte[] foto, int usuarioid) {
        this.cid = cid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupo = grupo;
        this.tel = tel;
        this.email = email;
        this.direccion = direccion;
        this.foto = foto;
        this.usuarioid = usuarioid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }
      
          
       
    
    
    
}
