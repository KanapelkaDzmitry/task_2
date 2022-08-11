package com.example.task_2.repository;

import com.example.task_2.entity.MoneyFlow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoverRepository extends JpaRepository<MoneyFlow,Long> {
}
