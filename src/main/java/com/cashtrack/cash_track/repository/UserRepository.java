package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUserId(String userId);

}
