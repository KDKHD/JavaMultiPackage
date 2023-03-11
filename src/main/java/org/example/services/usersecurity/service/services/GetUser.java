package org.example.services.usersecurity.service.services;

import lombok.RequiredArgsConstructor;
import org.example.services.usersecurity.service.model.User;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetUser {
    public User getUser(Long userId){
        return User.builder().userId(userId).build();
    }
}
