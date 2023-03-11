package org.example.services.usersecurity.service.presentation.api;

import lombok.RequiredArgsConstructor;
import org.example.services.usersecurity.interfaces.dto.UserDto;
import org.example.services.usersecurity.service.model.User;
import org.example.services.usersecurity.service.services.GetUser;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(
        value = {"/v1/users"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RequiredArgsConstructor
@RestController
public class UserController {

    private final GetUser getUser;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(
            @PathVariable("userId") Long userId) {
        User user = getUser.getUser(userId);
        return ResponseEntity.ok(user.userDto());
    }
}
