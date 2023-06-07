package com.partyevent.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartyEventSearch {

    private Long id;
    private String name;
    private Date startEnd;
    private Date endDate;
}
