package com.partyevent.services;

import com.partyevent.repositories.PartyEventCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class PartyEventCategoryService {

    private final PartyEventCategoryRepository partyEventCategoryRepository;

    public PartyEventCategoryService(PartyEventCategoryRepository partyEventCategoryRepository) {
        this.partyEventCategoryRepository = partyEventCategoryRepository;
    }
}
