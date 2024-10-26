package com.mysticarts.amazon.customer;

import lombok.*;

@ToString
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private  int cus_Id;
    private String cus_Name;
    private String cus_Address;
    private  Gender gender;
    private long cus_Contact;
}
