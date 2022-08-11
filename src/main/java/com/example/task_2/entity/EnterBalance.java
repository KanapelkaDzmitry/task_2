package com.example.task_2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnterBalance extends BaseEntity {

    private double active;
    private double passive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "summary_balance_id")
    private SummaryBalance summaryBalance;
}
