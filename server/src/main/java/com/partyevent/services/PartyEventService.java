package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.repositories.PartyEventRepository;

import java.util.List;
import java.util.Optional;

public class PartyEventService {
    private PartyEventRepository partyEventRepository;

    public PartyEvent createPartyEvent(PartyEvent partyEvent){
        return partyEventRepository.save(partyEvent);
    }

    public List<PartyEvent> findPartyEvents(PartyEventSearch partyEventSearch) {
        return partyEventRepository.findAll();
    }

    public Optional<PartyEvent> findPartyEventById(String id) {
        return partyEventRepository.findById(id);
    }

    public List<PartyEvent> findAllPartyEvents() {
        return partyEventRepository.findAll();
    }


}
