package com.jong.yeop.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginVO {

    private String idx;

    private String id;

    private String password;

    private String email;

    private String hint;
}
