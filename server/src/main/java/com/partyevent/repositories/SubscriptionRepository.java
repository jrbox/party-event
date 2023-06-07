package com.partyevent.repositories;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.Subscription;
import com.partyevent.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, String> {
    Subscription findByUserAndEvent(User user, PartyEvent event);

    List<Subscription> findByEvent(PartyEvent event);
}
