package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Economic_Sub_Sector_Code_ISIC {
    @Id
    private String   eCONOMIC_SUB_SECTOR_CODE_ISIC;
    private String  eCONOMIC_SUB_SECTOR_CODE_ISIC_DESC;
}
