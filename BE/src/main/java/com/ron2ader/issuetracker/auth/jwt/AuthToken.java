package com.ron2ader.issuetracker.auth.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthToken {

    private static final String BEARER = "Bearer";

    private String tokenType;
    private String token;

    public static AuthToken from(String tokenHeader) {
        String[] split = tokenHeader.split(" ");
        if (split.length != 2) {
            throw new IllegalArgumentException();
        }
        validateToken(tokenHeader);
        return new AuthToken(split[0], split[1]);
    }

    private static void validateToken(String tokenType) {
        if (tokenType.matches(BEARER)) {
            throw new IllegalArgumentException();
        }
    }

}
