package com.partyevent.services;

import com.partyevent.models.PartyEvent;
import com.partyevent.models.User;
import com.partyevent.repositories.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;
    public User createUser(User user) {
        return userRepository.save(user);
    }




}
