package com.cm.MavenProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cm.MavenProject.model.AnagraficaModel;

@Repository
public interface AnagraficaRepository extends JpaRepository<AnagraficaModel, Long>{


}


