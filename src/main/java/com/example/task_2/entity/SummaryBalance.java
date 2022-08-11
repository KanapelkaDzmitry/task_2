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
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SummaryBalance extends BaseEntity{

    @OneToMany(mappedBy = "summaryBalance", fetch = FetchType.LAZY)
    private List<EnterBalance> enterBalanceList;

    @OneToMany(mappedBy = "summaryBalance", fetch = FetchType.LAZY)
    private List<ProceedBalance> proceedBalances;

    @OneToMany(mappedBy = "summaryBalance", fetch = FetchType.LAZY)
    private List<MoneyFlow> moneyFlowList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id")
    private File file;
}
