package lk.ijse.gdse66.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Car {

    @Id
    @Column(name = "car_id",length = 50)
    private String carId;

    @Column(name = "car_number",length = 50)
    private String carNumber;

    @Column(name = "car_brand",length = 50)
    private String carBrand;
    private String model;
    private Integer year;
    private Double rate;
    private Boolean isRentable;
    private Double depositAmount;

}
