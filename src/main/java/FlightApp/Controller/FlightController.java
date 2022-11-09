package FlightApp.Controller;

import FlightApp.Model.Flight;
import FlightApp.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("flights")
public class FlightController {

    FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping()
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    /**
     * HTTP Get Request - Retrieve ALL flights from the provided departureCityId
     * @param departureCityId - indicates which city the user would like to search up
     * @return - a List of Flights from the database that corresponds with the parameters provided
     */
    @GetMapping("/{departureCityId}")
    public List<Flight> getAllFlightsByDepartureCityId(@PathVariable ("departureCityId") int departureCityId) {
        return flightService.getAllFlightsByDepartureCityId(departureCityId);
    }

    @GetMapping("/{departureCityId}/{arrivalCityId}")
    public List<Flight> getAllFlightsByDeptAndArr  (@PathVariable ("departureCityId") int departureCityId,
                                                    @PathVariable ("arrivalCityId") int arrivalCityId) {
        return flightService.getAllFlightsByDeptAndArr(departureCityId,arrivalCityId);
    }

}
