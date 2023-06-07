package com.partyevent.controllers;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.services.PartyEventCategoryService;
import com.partyevent.services.PartyEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class PartyEventCategoryController {

    public PartyEventCategoryService partyEventCategoryService;

//    @GetMapping("/{id}")
//    public List<PartyEvent> findPartyEvent(PartyEventSearch partyEventSearch){
//       return partyEventService.findPartyEvent(partyEventSearch);
  //  }


}
