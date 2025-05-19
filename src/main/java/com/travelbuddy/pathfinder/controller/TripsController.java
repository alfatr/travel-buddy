package com.travelbuddy.pathfinder.controller;

import com.travelbuddy.pathfinder.api.Trips;
import com.travelbuddy.pathfinder.model.dto.CreateTripRequest;
import com.travelbuddy.pathfinder.model.dto.GetTripsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trips")
public class TripsController {
    @Autowired
    Trips trips;

    @PostMapping("/create")
    public void createTrip(@RequestBody @Validated CreateTripRequest request){
        trips.createTrip(request);
    }

    @GetMapping("/list")
    public GetTripsResponse getTrips() {
        return trips.getAllTrips();
    }
}
