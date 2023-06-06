package com.partyevent.controllers;

import com.partyevent.models.Subscription;
import com.partyevent.services.SubscriptionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    private SubscriptionService subscriptionService;
    @PostMapping("/subscribe")
    public Subscription subscribe(@RequestParam("userName") String userName, @RequestParam("eventPartyEvent") String eventPartyEvent) {
        return subscriptionService.subscribe(userName, eventPartyEvent);
    }

    @PostMapping("/unsubscribe")
    public void unsubscribe(@RequestParam("userName") String userName, @RequestParam("event") String eventId) {
        subscriptionService.unsubscribe(userName, eventId);
    }
}
