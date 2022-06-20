package com.ron2ader.issuetracker.auth.jwt;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConstructorBinding
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private final String issuer;
    private final String accessSubject;
    private final String refreshSubject;
    private final long accessExpirationTime;
    private final long refreshExpirationTime;

}
