package com.geovannycode;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AppUserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String firstname;
    private String lastName;
    private String email;
    private LocalDate birthdate;
}
