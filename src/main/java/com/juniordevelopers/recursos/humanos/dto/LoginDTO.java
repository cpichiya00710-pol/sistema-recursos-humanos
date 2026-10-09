package main.java.com.juniordevelopers.recursos.humanos.dto;

public class LoginDTO {
    
    private String correo;
    private String contrasena;
    
    public LoginDTO(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString() {
        return "LoginDTO{" +
                "correo='" + correo + '\'' +
                '}';
    }
}
