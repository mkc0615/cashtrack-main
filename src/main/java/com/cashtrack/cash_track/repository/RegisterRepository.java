package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class RegisterRepository{

    private final EntityManager em;

    public User findOne(){
        User thisUser = new User();
        return thisUser;
    }

    public List<User> findAll(){
        User thisUser = new User();
        List<User> thisList = new ArrayList<>();
        thisList.add(thisUser);
        return thisList;
    }

    public int insertUser(User user){
        em.persist(user);
        return user.getUserNo();
    }

    public int deleteUser(){
        int resultInt = 0;
        return resultInt;
    }

}
