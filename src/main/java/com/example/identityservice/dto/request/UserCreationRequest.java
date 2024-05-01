package com.example.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import jdk.jfr.DataAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    String userName;
    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;

// khi sử dụng @size(validate) thì ngoại lệ sẽ trả về exception Method....
    // và trả về message nếu lỗi
}
