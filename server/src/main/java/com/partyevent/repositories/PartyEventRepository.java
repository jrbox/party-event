package com.partyevent.repositories;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.PartyEventCategory;
import com.partyevent.models.PartyEventSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface PartyEventRepository extends JpaRepository<PartyEvent, String> {
//
//    List<PartyEvent> findPartyEventsByCriteria(PartyEventSearch partyEventSearch);
//
//
//    PartyEvent findByCriteria(PartyEventSearch partyEventSearch);
//
//    PartyEvent createPartyEvent(Long id, String name, String description,
//                                List<PartyEventCategory> partyEventCategories, Integer capacity, Date startDate, Date endDate);


    }