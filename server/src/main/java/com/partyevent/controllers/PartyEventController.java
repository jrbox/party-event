package com.partyevent.controllers;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.services.PartyEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/party-events")
public class PartyEventController {

    public PartyEventService partyEventService;

    @GetMapping()
    public List<PartyEvent> findPartyEvents(PartyEventSearch partyEventSearch){
        return partyEventService.findPartyEvents(partyEventSearch);
    }

    @GetMapping("/{id}")
    public PartyEvent findPartyEvent(PartyEventSearch partyEventSearch){
        return partyEventService.findPartyEvent(partyEventSearch);
    }

}
