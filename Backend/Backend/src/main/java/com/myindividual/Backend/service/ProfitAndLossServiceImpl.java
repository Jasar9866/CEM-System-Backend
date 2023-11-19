package com.myindividual.Backend.service;

import com.myindividual.Backend.model.ProfitAndLoss;
import com.myindividual.Backend.repository.ProfitAndLossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfitAndLossServiceImpl implements ProfitAndLossService{

    @Autowired
    private ProfitAndLossRepository profitAndLossRepository;

    @Override
    public ProfitAndLoss saveProfitAndLoss(ProfitAndLoss profitAndLoss) {
        return profitAndLossRepository.save(profitAndLoss);
    }

    @Override
    public List<ProfitAndLoss> getAllProfitAndLosses(){
        return profitAndLossRepository.findAll();
    }


}