package net.itinajero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
	

}
