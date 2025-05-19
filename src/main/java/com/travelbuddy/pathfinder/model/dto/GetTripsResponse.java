package com.travelbuddy.pathfinder.model.dto;

import com.travelbuddy.pathfinder.model.entity.Trip;
import lombok.Data;

import java.util.List;

@Data
public class GetTripsResponse {
    private List<Trip> trips;
}
