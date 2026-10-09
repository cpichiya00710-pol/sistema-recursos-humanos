package main.java.com.juniordevelopers.recursos.humanos.model;

public class User {

    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correo;
    private String contrasena;
    private int numCel;
    private String direccion;
    private int edad;
    private int idRole;
    private Role role;
    

    public User() {
    }

    public User(int idUsuario, String nombreUsuario, String apellidoUsuario, String correo, String contrasena, int numCel, String direccion, int edad, int idRole) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.numCel = numCel;
        this.direccion = direccion;
        this.edad = edad;
        this.idRole = idRole;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
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

    public int getNumCel() {
        return numCel;
    }

    public void setNumCel(int numCel) {
        this.numCel = numCel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{"
                + "idUsuario=" + idUsuario
                + ", nombreUsuario='" + nombreUsuario + '\''
                + ", apellidoUsuario='" + apellidoUsuario + '\''
                + ", correo='" + correo + '\''
                + ", numCel='" + numCel + '\''
                + ", direccion='" + direccion + '\''
                + ", edad='" + edad + '\''
                + ", idRole=" + idRole
                + '}';
    }
}
