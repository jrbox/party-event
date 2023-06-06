package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.repositories.PartyEventRepository;

public class PartyEventService {
    private PartyEventRepository partyEventRepository;

    public PartyEvent createPartyEvent(PartyEvent partyEvent){
        return partyEventRepository.save(partyEvent);
    }
}
