
package com.alanviana.clinica.repository;

import com.alanviana.clinica.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cadastros extends JpaRepository<Cadastro, Long>{
    
}
