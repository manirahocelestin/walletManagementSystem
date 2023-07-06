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
    @Column(name = "vehicle_type", nullable = true)
    private String vehicleType;
    @Column(name = "usage_type", nullable = true)
    private String usageType;
    @Column(name = "vehicle-manufactured-year", nullable = true)
    private String vehicleManufacturedYear;
    @Column(name = "vehicle_brand", nullable = true)
    private String vehicleBrand;
    @Column(name = "Vehicle_model", nullable = true)
    private String vehicleModel;
    @Column(name = "vehicle_chassis_number", nullable = true)
    private String vehicleChassisNumber;
    @Column(name = "vehicle_seatCapacity", nullable = true)
    private String vehicleSeatCapacity;
    @Column(name = "duration", nullable = true)
    private String duration;
    @Column(name = "territory", nullable = true)
    private String territory;
    @Column(name = "declared_value_sum_insured", nullable = true)
    private String declaredValueSumInsured;
    @Column(name = "number_of_occupant_covered", nullable = true)
    private String numberOfOccupantCovered;
    @Column(name = "sum_Insured_per_occupant", nullable = true)
    private String sumInsuredPerOccupant;
    @Column(name = "third_party", nullable = true)
    private boolean thirdParty;
    @Column(name = "own_damage", nullable = true)
    private boolean ownDamage;
    @Column(name = "theft", nullable = true)
    private boolean theft;
    @Column(name = "fire", nullable = true)
    private boolean fire;
    @Column(name = "occupant", nullable = true)
    private boolean occupant;
    @Column(name = "tpl", nullable = true)
    private boolean tpl;
    @Column(name = "starting_date", nullable = true)
    private String startDate;
    @Column(name = "ending_date", nullable = true)
    private String endingDate;

    // additionals
    @Column(name = "premium_base", nullable = true)
    private String premiumBase;
    @Column(name = "net_premium_one", nullable = true)
    private String netPremiumOne;
    @Column(name = "waive_of_excess", nullable = true)
    private String waiveOfExcess;
    @Column(name = "total_premium_rwanda", nullable = true)
    private String totalPremiumRwanda;
    @Column(name = "extension_comesa", nullable = true)
    private String extensionCOMESA;
    @Column(name = "net_premium_two", nullable = true)
    private String netPremiumTwo;
    @Column(name = "motor_guaranty_fund", nullable = true)
    private String motorGuarantyFund;
    @Column(name = "policy_fees", nullable = true)
    private String policyFees;
    @Column(name = "taxable_premium", nullable = true)
    private String tAXABLEPREMIUM;
    @Column(name = "vatal18percent", nullable = true)
    private String vATat18percent;
    @Column(name = "total_premium_payable", nullable = true)
    private String totalPremiumPayable;
    @Column(name = "transaction_status", nullable = true)
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
