package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    public User findOne();

    public List<User> findAll();

}
