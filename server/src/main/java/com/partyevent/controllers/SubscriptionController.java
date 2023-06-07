package com.partyevent.controllers;

import com.partyevent.models.Subscription;
import com.partyevent.services.SubscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {
    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/events/{eventId}/users/{userName}")
    public Subscription subscribe(@PathVariable("eventId") String eventId, @PathVariable("userName") String userName) {
        return subscriptionService.subscribe(userName, eventId);
    }

    @DeleteMapping("/{subscriptionId}")
    public void unsubscribe(@PathVariable("subscriptionId") String subscriptionId) {
        subscriptionService.unsubscribe(subscriptionId);
    }
}
