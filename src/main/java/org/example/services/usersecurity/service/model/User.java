package org.example.services.usersecurity.service.model;

import lombok.Builder;
import lombok.Data;
import org.example.services.usersecurity.interfaces.dto.UserDto;

@Builder
@Data
public class User {
    private Long userId;

    public UserDto userDto(){
        return UserDto.builder()
                .userId(this.getUserId())
                .build();
    }
}
