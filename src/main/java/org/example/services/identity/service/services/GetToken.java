package org.example.services.identity.service.services;

import lombok.RequiredArgsConstructor;
import org.example.services.identity.service.model.Token;
import org.example.services.usersecurity.interfaces.dto.UserDto;
import org.example.services.usersecurity.service.presentation.api.UserController;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetToken {
    private final UserController userController;

    public Token getUserTokenByUserId(Long userId){
        UserDto userDto = userController.getUser(userId).getBody();
        return Token.builder().tokenId(1L).userId(userDto.getUserId()).build();
    }
}
