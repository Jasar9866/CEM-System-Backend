package com.myindividual.Backend.controller;

import com.myindividual.Backend.model.ProfitAndLoss;
import com.myindividual.Backend.service.ProfitAndLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profitAndLoss")
@CrossOrigin
public class ProfitAndLossController {

    @Autowired
    private ProfitAndLossService profitAndLossService;

    @PostMapping("/add")
    public String add(@RequestBody ProfitAndLoss profitAndLoss){
        profitAndLossService.saveProfitAndLoss(profitAndLoss);
        return "New report created";
    }

    @GetMapping("getAll")
    public List<ProfitAndLoss> getAllProfitAndLosses(){return profitAndLossService.getAllProfitAndLosses();}

}
