package FlightApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @OneToOne
    @JoinColumn(name = "departureCity_id")
    private City depatureCity;

    @Column
    private Time departureTime;

    @OneToOne
    @JoinColumn(name = "arrivalCity_id")
    private City arrivalCity;

    @Column
    private Time arrivalTime;
}
