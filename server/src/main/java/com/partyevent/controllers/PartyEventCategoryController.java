package com.partyevent.controllers;

import com.partyevent.models.PartyEventCategory;
import com.partyevent.services.PartyEventCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class PartyEventCategoryController {

    private final PartyEventCategoryService partyEventCategoryService;

    public PartyEventCategoryController(PartyEventCategoryService partyEventCategoryService) {
        this.partyEventCategoryService = partyEventCategoryService;
    }

    @PostMapping("/categories")
    public PartyEventCategory createPartyEventCategory(@PathVariable PartyEventCategory partyEventCategory) {
        return partyEventCategoryService.createPartyEventCategory(partyEventCategory);
    }

    @GetMapping()
    public List<PartyEventCategory> findAllPartyEventCategories() {
        return partyEventCategoryService.findAllPartyEventCategories();
    }

    @GetMapping("/{id}")
    public Optional<PartyEventCategory> findPartyEventById(@PathVariable("id") String id) {
        return partyEventCategoryService.findPartyEventCategoryById(id);
    }

//    @GetMapping("/{id}")
//    public List<PartyEvent> findPartyEvent(PartyEventSearch partyEventSearch){
//       return partyEventService.findPartyEvent(partyEventSearch);
  //  }

}
