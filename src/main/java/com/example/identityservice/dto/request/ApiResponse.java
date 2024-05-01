package com.example.identityservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)

// nếu triển khai thành công những thuộc tính
// nào thành công( trả về null ) sẽ ko hiển thị
public class ApiResponse<T> {
    int code = 1000;
    String message;
    T result;
}
