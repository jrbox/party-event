package com.partyevent.repositories;

import com.partyevent.models.PartyEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyEventRepository extends JpaRepository<PartyEvent, String> {
    // Ajoutez ici les méthodes de recherche personnalisées si nécessaire
}