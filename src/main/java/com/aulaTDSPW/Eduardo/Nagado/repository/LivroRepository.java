package com.aulaTDSPW.Eduardo.Nagado.repository;

import com.aulaTDSPW.Eduardo.Nagado.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
