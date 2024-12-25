package com.devsuperior.dsCamadaCrudExcVal.repositories;

import com.devsuperior.dsCamadaCrudExcVal.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
