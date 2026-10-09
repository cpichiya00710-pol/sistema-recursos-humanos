package main.java.com.juniordevelopers.recursos.humanos.model;

//Aspirante y Usuario
public class Role {

    private String idRol;
    private String nombreRol;

    public Role() {
    }

    public Role(String nombreRol, String idRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;

    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return "Role{" + "idRole=" + idRol + ", nombreRol=" + nombreRol + '}';
    }
}
