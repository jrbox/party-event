package com.partyevent.repositories;

import com.partyevent.models.PartyEventCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyEventCategoryRepository  extends JpaRepository<PartyEventCategory, String> {
}
