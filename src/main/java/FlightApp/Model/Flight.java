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

    @Column
    private int airlineId;

    @Column
    private int departureCity;

    @Column
    private Time departureTime;

    @Column
    private int arrivalCity;

    @Column
    private Time arrivalTime;
}
