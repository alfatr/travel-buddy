package com.travelbuddy.pathfinder.api;

import com.travelbuddy.pathfinder.model.dto.CreateTripRequest;
import com.travelbuddy.pathfinder.model.dto.GetTripsResponse;
import com.travelbuddy.pathfinder.model.entity.Trip;
import com.travelbuddy.pathfinder.model.repository.TripsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
public class TripsService implements Trips {
    @Autowired
    private TripsRepository tripsRepository;

    @Override
    public GetTripsResponse getAllTrips() {
        GetTripsResponse response = new GetTripsResponse();
        response.setTrips(tripsRepository.findAll());
        return response;
    }

    @Override
    public void createTrip(CreateTripRequest request) {
        Trip trip = new Trip();
        trip.setTitle(request.getTitle());
        trip.setCreateDate(new Date());
        tripsRepository.save(trip);
    }
}
