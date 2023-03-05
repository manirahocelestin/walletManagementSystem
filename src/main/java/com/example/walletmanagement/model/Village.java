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
public class Village {
    @Id
    private String  village_List;
    private String village_List_Description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cell_id")
    private Cell cell_List;
    private String cell_List_Description;
}
