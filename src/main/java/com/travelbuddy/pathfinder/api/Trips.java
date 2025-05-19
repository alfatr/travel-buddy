package com.travelbuddy.pathfinder.api;


import com.travelbuddy.pathfinder.model.dto.CreateTripRequest;
import com.travelbuddy.pathfinder.model.dto.GetTripsResponse;

public interface Trips {
    GetTripsResponse getAllTrips();

    void createTrip(CreateTripRequest request);
}
