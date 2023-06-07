package com.partyevent.controllers;

import com.partyevent.models.Subscription;
import com.partyevent.services.SubscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    private SubscriptionService subscriptionService;
    @PostMapping("/events/{eventId}/users/{userName}")
    public Subscription subscribe(@PathVariable("eventId") String eventId, @PathVariable("userName") String userName) {
        return subscriptionService.subscribe(userName, eventId);
    }

    @DeleteMapping("/{subscriptionId}")
    public void unsubscribe(@PathVariable("subscriptionId") String subscriptionId) {
        subscriptionService.unsubscribe(subscriptionId);
    }
}
