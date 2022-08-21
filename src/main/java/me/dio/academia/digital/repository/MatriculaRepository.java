package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /**
     *
     * @param bairro: bairro dos alunos matriculados
     * @return lista com todas as matriculas com o bairro passada como parâmetro da função
     */
    List<Matricula> findByBairro(String bairro);
}
