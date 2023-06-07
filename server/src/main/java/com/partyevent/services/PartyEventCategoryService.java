package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventCategory;
import com.partyevent.models.PartyEventSearch;
import com.partyevent.repositories.PartyEventCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyEventCategoryService {

    private final PartyEventCategoryRepository partyEventCategoryRepository;

    public PartyEventCategoryService(PartyEventCategoryRepository partyEventCategoryRepository) {
        this.partyEventCategoryRepository = partyEventCategoryRepository;
    }

    public PartyEventCategory createPartyEventCategory(PartyEventCategory partyEventCategory){
        return partyEventCategoryRepository.save(partyEventCategory);
    }

    public List<PartyEventCategory> findPartyEventCategories(PartyEventSearch partyEventSearch) {
        return partyEventCategoryRepository.findAll();
    }

    public Optional<PartyEventCategory> findPartyEventCategoryById(String id) {
        return partyEventCategoryRepository.findById(id);
    }

    public List<PartyEventCategory> findAllPartyEventCategories() {
        return partyEventCategoryRepository.findAll();
    }

}
