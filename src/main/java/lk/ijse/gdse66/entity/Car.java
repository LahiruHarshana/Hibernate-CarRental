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

    @Column(name = "car_model",length = 50)
    private String model;

    @Column(name = "year",length = 50)
    private Integer year;

    @Column(name = "rate",length = 50)
    private Double rate;

    @Column(name = "isRentble",length = 50)
    private Boolean isRentable;
    private Double depositAmount;

}
