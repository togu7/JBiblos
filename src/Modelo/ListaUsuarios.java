package Modelo;

import java.util.*;

public class ListaUsuarios {

    private HashMap<Integer, Usuario> listaUsuarios;

    public void alta(Usuario usuario) {
        
    }

    public void baja(int dni) {
        
    }

    public void modificar(int dni) {
        throw new UnsupportedOperationException();
    }

    public Map<Integer, Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void init(List<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            this.listaUsuarios.put(usuario.getDni(), usuario);
        }
    }
}