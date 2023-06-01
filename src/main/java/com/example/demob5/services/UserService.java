package com.example.demob5.services;

import com.example.demob5.entity.User;
import com.example.demob5.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IuserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}
