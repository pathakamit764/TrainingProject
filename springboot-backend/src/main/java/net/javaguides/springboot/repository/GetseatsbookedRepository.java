package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Getseatsbooked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GetseatsbookedRepository extends JpaRepository<Getseatsbooked, String>{
}


