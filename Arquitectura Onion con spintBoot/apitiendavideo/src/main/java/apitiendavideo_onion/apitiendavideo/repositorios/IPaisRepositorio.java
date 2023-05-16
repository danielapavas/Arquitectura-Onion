package apitiendavideo_onion.apitiendavideo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo_onion.apitiendavideo.modelos.Pais;

@Repository
public interface IPaisRepositorio extends JpaRepository<Pais, Long> {

    @Query("SELECT p FROM Pais p WHERE p.pais LIKE '%' || ?1 || '%'")
    List<Pais> buscar(String nombre);

}