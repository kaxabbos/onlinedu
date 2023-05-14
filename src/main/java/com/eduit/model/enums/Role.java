package com.eduit.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    ADMIN("Директор"),
    MANAGER("Главный методист"),
    CLIENT("Ученик");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}

