package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.repositories.PartyEventRepository;

import java.util.List;

public class PartyEventService {
    private PartyEventRepository partyEventRepository;

    public PartyEvent createPartyEvent(PartyEvent partyEvent){
        return partyEventRepository.save(partyEvent);
    }

    public List<PartyEvent> findPartyEvents(PartyEventSearch partyEventSearch) {
        return partyEventRepository.findPartyEventsByCriteria(partyEventSearch);
    }
    public PartyEvent findPartyEvent(PartyEventSearch partyEventSearch) {
        return partyEventRepository.findByCriteria(partyEventSearch);
    }
}
