package com.partyevent.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private Date birthday;
    private String mail;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;

}
