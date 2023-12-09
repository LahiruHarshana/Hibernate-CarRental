package lk.ijse.gdse66.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Car {
    private String carId;
    private String carNumber;
    private String carBrand;
    private String model;

    private Integer year;


}
