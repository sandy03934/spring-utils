package com.sandy03934.controller;

import com.sandy03934.entities.UserPreference;
import com.sandy03934.repositories.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserPreferenceController {

    @Autowired
    UserPreferenceRepository preferenceRepository;

    @RequestMapping(value = "/users/preferences", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String updatePreferences(Authentication authentication, @RequestParam("theme") String theme) {
        if (authentication.isAuthenticated()) {
            User userdetails = (User) authentication.getPrincipal();

            UserPreference userPreference = new UserPreference();
            userPreference.setUsername(userdetails.getUsername());
            userPreference.setTheme(theme);
            this.preferenceRepository.save(userPreference);
        }
        return "redirect:/";
    }

}
