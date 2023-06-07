package com.partyevent.controllers;

import com.partyevent.services.PartyEventCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class PartyEventCategoryController {

    private final PartyEventCategoryService partyEventCategoryService;

    public PartyEventCategoryController(PartyEventCategoryService partyEventCategoryService) {
        this.partyEventCategoryService = partyEventCategoryService;
    }

//    @GetMapping("/{id}")
//    public List<PartyEvent> findPartyEvent(PartyEventSearch partyEventSearch){
//       return partyEventService.findPartyEvent(partyEventSearch);
  //  }


}
