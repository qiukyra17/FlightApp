package FlightApp.Service;

import FlightApp.Model.Flight;
import FlightApp.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightService {
    FlightRepository flightRepository;
    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getAllFlightsByDepartureCityId(int departureCityId) {
        return flightRepository.getAllFlightsByDepartureCityId(departureCityId);

    }

    public List<Flight> getAllFlightsByDeptAndArr(int departureCityId, int arrivalCityId) {
        return flightRepository.getAllFlightsByDeptAndArr(departureCityId,arrivalCityId);
    }
}
