package ru.ld.Manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ld.Manager.model.User;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {

}