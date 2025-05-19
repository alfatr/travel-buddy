package com.travelbuddy.pathfinder.model.repository;

import com.travelbuddy.pathfinder.model.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripsRepository extends JpaRepository<Trip, Long> {
}
