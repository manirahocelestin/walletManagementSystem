package com.example.walletmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {
    @Id
    @Column(unique = true,name = "plante_number")
    private String plateNumber;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "usage_type")
    private String usageType;
    @Column(name = "vehicle-manufactured-year")
    private String vehicleManufacturedYear;
    @Column(name = "vehicle_brand")
    private String vehicleBrand;
    @Column(name = "Vehicle_model")
    private String vehicleModel;
    @Column(name = "vehicle_plate_number")
    private String vehiclePlateNumber;
    @Column(name = "vehicle_chassis_number")
    private String vehicleChassisNumber;
    @Column(name = "vehicle_seatCapacity")
    private String vehicleSeatCapacity;
    @Column(name = "duration")
    private String duration;
    @Column(name = "territory")
    private String territory;
    @Column(name = "declared_value_sum_insured")
    private String declaredValueSumInsured;
    @Column(name = "number_of_occupant_covered")
    private String numberOfOccupantCovered;
    @Column(name = "sum_Insured_per_occupant")
    private String sumInsuredPerOccupant;
    @Column(name = "third_party")
    private boolean thirdParty;
    @Column(name = "own_damage")
    private boolean ownDamage;
    @Column(name = "theft")
    private boolean theft;
    @Column(name = "fire")
    private boolean fire;
    @Column(name = "occupant")
    private boolean occupant;
    @Column(name = "tpl")
    private boolean tpl;
    @Column(name = "starting_date")
    private String startDate;
    @Column(name = "ending_date")
    private String endingDate;

    // additionals
    @Column(name = "premium_base")
    private String premiumBase;
    @Column(name = "net_premium_one")
    private String netPremiumOne;
    @Column(name = "waive_of_excess")
    private String waiveOfExcess;
    @Column(name = "total_premium_rwanda")
    private String totalPremiumRwanda;
    @Column(name = "extension_comesa")
    private String extensionCOMESA;
    @Column(name = "net_premium_two")
    private String netPremiumTwo;
    @Column(name = "motor_guaranty_fund")
    private String motorGuarantyFund;
    @Column(name = "policy_fees")
    private String policyFees;
    @Column(name = "taxable_premium")
    private String tAXABLEPREMIUM;
    @Column(name = "vatal18percent")
    private String vATat18percent;
    @Column(name = "total_premium_payable")
    private String totalPremiumPayable;
    @Column(name = "transaction_status")
    private String transactionStatus;

    /*
     private boolean thirdParty;
    private boolean ownDamage;
    private boolean theft;
    private boolean fire;
    private boolean occupant;
    private boolean tpl;
     */
}
