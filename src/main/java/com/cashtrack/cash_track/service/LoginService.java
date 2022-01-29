package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.repository.UserRepository;
import com.cashtrack.cash_track.service.components.UserDetailComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{

        User user = userRepository.findByUserId(userId);

        if(user == null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new UserDetailComponents(user);
    }


//    public User findOne(){
//        User thisUser = new User();
//        return thisUser;
//    }


}
