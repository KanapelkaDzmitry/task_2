package com.example.task_2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY)
    private List<EnterBalance> enterBalances;

    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY)
    private List<ProceedBalance> proceedBalances;

    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY)
    private List<MoneyFlow> moneyFlows;

    private String fileName;
}
