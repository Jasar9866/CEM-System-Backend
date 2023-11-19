package com.myindividual.Backend.service;

import com.myindividual.Backend.model.ProfitAndLoss;

import java.util.List;

public interface ProfitAndLossService {

    public ProfitAndLoss saveProfitAndLoss(ProfitAndLoss profitAndLoss);
    public List<ProfitAndLoss> getAllProfitAndLosses();
}
