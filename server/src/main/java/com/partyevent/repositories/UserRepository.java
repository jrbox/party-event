package com.partyevent.repositories;

import com.partyevent.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

}