package org.example.services.identity.service.presentation.api;


import lombok.RequiredArgsConstructor;
import org.example.services.identity.interfaces.dto.TokenDto;
import org.example.services.identity.service.model.Token;
import org.example.services.identity.service.services.GetToken;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(
        value = {"/v1/user-token"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RequiredArgsConstructor
@RestController
public class TokenController {
    private final GetToken getToken;

    @GetMapping("/{userId}")
    public ResponseEntity<TokenDto> getTokenByUserId(
            @PathVariable("userId") Long userId) {
        Token token = getToken.getUserTokenByUserId(userId);
        return ResponseEntity.ok(token.tokenDto());
    }
}
