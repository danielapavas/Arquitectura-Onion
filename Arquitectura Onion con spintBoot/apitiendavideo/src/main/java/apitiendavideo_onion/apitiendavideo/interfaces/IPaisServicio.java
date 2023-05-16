package apitiendavideo_onion.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo_onion.apitiendavideo.modelos.Pais;

public interface IPaisServicio {

    List<Pais> listar();

    Pais obtener(long id);

    List<Pais> buscar(String nombre);

    Pais guardar(Pais pais);

    boolean eliminar(long id);

}