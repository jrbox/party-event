package com.partyevent.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Date closeDate;
    private Date openDate;

    @ManyToOne
    private User user;

    @ManyToOne
    private PartyEvent event;

}
