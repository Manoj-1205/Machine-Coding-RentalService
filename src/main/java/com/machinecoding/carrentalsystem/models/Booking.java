package com.machinecoding.carrentalsystem.models;

import com.machinecoding.carrentalsystem.enums.BookingStatus;
import com.machinecoding.carrentalsystem.enums.City;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Booking extends BaseClass {

    //Uni-directional relationship
    @ManyToOne
    private User user;
    //Uni-directional. Mapped By needed only in a bidirectional relationship entities
    @OneToMany(fetch=FetchType.EAGER)
    private List<Car> cars=new ArrayList<>();
    private City location;
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime startTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime endTime;

}
