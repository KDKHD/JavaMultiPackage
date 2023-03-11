package org.example.services.identity.interfaces.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TokenDto {
    private Long tokenId;
    private Long userId;
}
