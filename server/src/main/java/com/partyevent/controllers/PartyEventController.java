package com.partyevent.controllers;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.services.PartyEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/party-events")
public class PartyEventController {

    public PartyEventService partyEventService;

    @GetMapping()
    public List<PartyEvent> findAllPartyEvents(){
        return partyEventService.findAllPartyEvents();
    }
//    @GetMapping()
//    public List<PartyEvent> findPartyEvents(PartyEventSearch partyEventSearch){
//        return partyEventService.findPartyEvents(partyEventSearch);
//    }

    @GetMapping("/{partyEventSearch}")
    public PartyEvent findPartyEvent(@PathVariable("partyEventSearch") PartyEventSearch partyEventSearch){
        return partyEventService.findPartyEvent(partyEventSearch);
    }

    @GetMapping("/{id}")
    public Optional<PartyEvent> findPartyEventById(@PathVariable("id") String id){
        return partyEventService.findPartyEventById(id);
    }
}
