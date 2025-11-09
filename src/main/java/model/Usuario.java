package model;

public class Usuario {
    // variables donde se guardan los datos del usuario
    private String usuario;
    private String contraseña;
    
    // constructor
    // se usa para crear nuevos objetos Usuario y Contraseña
    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    // Metodos getters y setters
    public String getusuario() {
        return usuario;
    }
    
    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /*
    * Metodo toString()
    * sirve para mostrar la informacion del usuario como texto legible
    */
    @Override
    public String toString() {
        return "usuario: " + usuario;
    }
}
