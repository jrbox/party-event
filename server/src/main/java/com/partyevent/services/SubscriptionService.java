package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.Subscription;
import com.partyevent.models.User;
import com.partyevent.repositories.PartyEventRepository;
import com.partyevent.repositories.SubscriptionRepository;
import com.partyevent.repositories.UserRepository;

public class SubscriptionService {
    private SubscriptionRepository subscriptionRepository;

    private UserRepository userRepository;

    private PartyEventRepository partyEventRepository;

    public Subscription subscribe(String userName, String eventPartyEvent) {
        User user = userRepository.findByUserName(userName);
        PartyEvent event = partyEventRepository.findById(eventPartyEvent).orElse(null);

        if (user != null && event != null) {
            Subscription subscription = new Subscription();
            subscription.setUser(user);
            subscription.setEvent(event);
            return subscriptionRepository.save(subscription);
        }

        return null;
    }

    public void unsubscribe(String userName, String eventId) {
        User user = userRepository.findByUserName(userName);
        PartyEvent event = partyEventRepository.findById(eventId).orElse(null);

        if (user != null && event != null) {
            Subscription subscription = subscriptionRepository.findByUserAndEvent(user, event);
            if (subscription != null) {
                subscriptionRepository.delete(subscription);
            }
        }
    }

}
