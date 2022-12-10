package com.example.hibernatevalidatorpractice.presentation;

import com.example.hibernatevalidatorpractice.annotation.Latitude;
import com.example.hibernatevalidatorpractice.business.LocationService;
import com.example.hibernatevalidatorpractice.dto.LocationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public ResponseEntity<LocationResponse> findLocation(
            @RequestParam @Valid @Latitude double latitude
    ) {

    }

}
