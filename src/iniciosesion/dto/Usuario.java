/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion.dto;

/**
 *
 * @author alumno
 */
public class Usuario {
    
    private String trato;
    private String usuario;
    private String contrasena;
    private String contrasena2;
    private int edad;
    private String nacimiento;
    private String rutaImagen;
    private String fecharegistro;

    public Usuario(String trato, String usuario, String contrasena, String contrasena2, int edad, String nacimiento, String rutaImagen, String fecharegistro) {
        this.trato = trato;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.contrasena2 = contrasena2;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.rutaImagen = rutaImagen;
        this.fecharegistro = fecharegistro;
    }

   

    

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTrato() {
        return trato;
    }

    public void setTrato(String trato) {
        this.trato = trato;
    }

    public String getContrasena2() {
        return contrasena2;
    }

    public void setContrasena2(String contrasena2) {
        this.contrasena2 = contrasena2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    
    
}
