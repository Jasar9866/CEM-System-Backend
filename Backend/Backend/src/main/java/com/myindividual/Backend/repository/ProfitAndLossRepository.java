package com.myindividual.Backend.repository;


import com.myindividual.Backend.model.ProfitAndLoss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfitAndLossRepository extends JpaRepository<ProfitAndLoss, Long> {
}
