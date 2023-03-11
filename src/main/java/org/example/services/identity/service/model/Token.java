package org.example.services.identity.service.model;

import lombok.Builder;
import lombok.Data;
import org.example.services.identity.interfaces.dto.TokenDto;

@Builder
@Data
public class Token {
    private Long tokenId;
    private Long userId;

    public TokenDto tokenDto(){
        return TokenDto.builder()
                .tokenId(this.getTokenId())
                .userId(this.getUserId())
                .build();
    }
}
