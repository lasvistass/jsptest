package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.SpesaInvestimento;

@Repository
public interface SpesaInvestimentoRepository  extends JpaRepository<SpesaInvestimento, Integer>{


    @Query("select s from SpesaInvestimento s where s.sottoCategoria.sottoCategoria = ?1 ")
    List<SpesaInvestimento> findBySottoNome(String sottoNome);
    
    List<SpesaInvestimento> findBySpesaInvestimento(String nome);
    
    
}
