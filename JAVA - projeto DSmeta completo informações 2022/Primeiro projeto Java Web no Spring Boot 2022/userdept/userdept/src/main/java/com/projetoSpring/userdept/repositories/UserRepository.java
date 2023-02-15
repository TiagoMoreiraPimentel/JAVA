package com.projetoSpring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.userdept.entities.User;

// implementação para editar banco de dados, salvar acrescentar, deletar e etc.
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
