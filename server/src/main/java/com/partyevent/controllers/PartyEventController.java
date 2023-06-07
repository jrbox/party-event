package com.partyevent.controllers;

import com.partyevent.models.PartyEvent;
import com.partyevent.services.PartyEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/party-events")
public class PartyEventController {

    public final PartyEventService partyEventService;

    public PartyEventController(PartyEventService partyEventService) {
        this.partyEventService = partyEventService;
    }

    @PostMapping()
    public PartyEvent createPartyEvent(@RequestBody PartyEvent partyEvent) {
        return partyEventService.createPartyEvent(partyEvent);
    }

    @GetMapping()
    public List<PartyEvent> findAllPartyEvents() {
        return partyEventService.findAllPartyEvents();
    }

    @GetMapping("/{id}")
    public Optional<PartyEvent> findPartyEventById(@PathVariable("id") String id) {
        return partyEventService.findPartyEventById(id);
    }

    //    @PostMapping("/party-events")
//    public PartyEvent createPartyEvent(@PathVariable("id") Long id, @PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("categories")List<PartyEventCategory> partyEventCategories,
//                                  @PathVariable("capacity") Integer capacity, @PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate) {
//        return partyEventService.createPartyEvent(id,name,description,partyEventCategories,capacity,startDate,endDate);
//    }


    //    @GetMapping()
//    public List<PartyEvent> findPartyEvents(PartyEventSearch partyEventSearch){
//        return partyEventService.findPartyEvents(partyEventSearch);
//    }

//    @GetMapping("/{partyEventSearch}")
//    public PartyEvent findPartyEvent(@PathVariable("partyEventSearch") PartyEventSearch partyEventSearch){
//        return partyEventService.findPartyEvent(partyEventSearch);
//    }
}
