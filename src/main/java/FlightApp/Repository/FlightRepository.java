package FlightApp.Repository;

import FlightApp.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    @Query("FROM Flight WHERE departure_city_id= :departureCity")
    List<Flight> getAllFlightsByDepartureCityId(@Param("departureCity") int departureCityId);

    @Query("FROM Flight WHERE departure_city_id= :departureCity AND arrival_city_id= :arrivalCity")
    List<Flight> getAllFlightsByDeptAndArr(@Param("departureCity") int departureCityId,
                                           @Param("arrivalCity") int arrivalCityId);

}
