/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion.logica;

import iniciosesion.dto.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class LogicaUsuarios {
    
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    
    public static void anadirUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    
}
