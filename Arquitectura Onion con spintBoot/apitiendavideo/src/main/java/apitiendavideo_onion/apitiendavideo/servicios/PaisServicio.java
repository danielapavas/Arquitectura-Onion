package apitiendavideo_onion.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo_onion.apitiendavideo.interfaces.IPaisServicio;
import apitiendavideo_onion.apitiendavideo.modelos.Pais;
import apitiendavideo_onion.apitiendavideo.repositorios.IPaisRepositorio;

@Service
public class PaisServicio implements IPaisServicio {

    @Autowired // esto para qeu con JPA me haga la implementación
    IPaisRepositorio repositorio;

    @Override
    public List<Pais> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pais obtener(long id) {
        var pais = repositorio.findById(id);
        return pais.isEmpty() ? null : pais.get();
    }

    @Override
    public List<Pais> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Pais guardar(Pais pais) {
        return repositorio.save(pais);
    }

    @Override
    public boolean eliminar(long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

}
