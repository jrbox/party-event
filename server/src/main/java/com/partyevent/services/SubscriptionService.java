package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.Subscription;
import com.partyevent.models.User;
import com.partyevent.repositories.PartyEventRepository;
import com.partyevent.repositories.SubscriptionRepository;
import com.partyevent.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;

    private UserRepository userRepository;

    private PartyEventRepository partyEventRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository, UserRepository userRepository, PartyEventRepository partyEventRepository) {
        this.subscriptionRepository = subscriptionRepository;
        this.userRepository = userRepository;
        this.partyEventRepository = partyEventRepository;
    }

    public Subscription subscribe(String name, String eventPartyEvent) {
        User user = userRepository.findByName(name);
        PartyEvent event = partyEventRepository.findById(eventPartyEvent).orElse(null);

        if (user != null && event != null) {
            Subscription subscription = new Subscription();
            subscription.setUser(user);
            subscription.setEvent(event);
            return subscriptionRepository.save(subscription);
        }

        return null;
    }

    public void unsubscribe(String eventId) {
        PartyEvent event = partyEventRepository.findById(eventId).orElse(null);

        if (event != null) {
            List<Subscription> subscriptions = subscriptionRepository.findByEvent(event);
            subscriptionRepository.deleteAll(subscriptions);
        }

}}
