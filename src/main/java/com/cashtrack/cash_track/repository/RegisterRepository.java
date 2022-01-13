package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RegisterRepository implements UserRepository{

    @Override
    public User findOne(){
        User thisUser = new User();
        return thisUser;
    }

    @Override
    public List<User> findAll(){
        User thisUser = new User();
        List<User> thisList = new ArrayList<>();
        thisList.add(thisUser);
        return thisList;
    }

    @Override
    public int insertUser(){
        int resultInt = 0;
        return resultInt;
    }

    @Override
    public int deleteUser(){
        int resultInt = 0;
        return resultInt;
    }

}
