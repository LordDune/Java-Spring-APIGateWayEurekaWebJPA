package ru.ld.Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ld.Client.model.User;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {

}