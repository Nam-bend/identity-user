package com.example.identityservice.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class AuthenticationResponse {
    String token;

    boolean authenticated ;  // biến này true thì cung cấp đúng user and passwword và ngược lại

}
