package com.xworkz.passportuser.update.get.method.user;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private int userId;
    private String userName;
    private int userAge;
    private String gender;
    private String userAddress;
    private long phoneNumber;
}
