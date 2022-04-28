package com.melluli.springapp.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.melluli.springapp.model.CalcHistory;
import com.melluli.springapp.service.CalcHistoryService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

    @Autowired
    private CalcHistoryService calcHistoryService;

    public CalcHistoryService getCalcHistoryService() {
        return calcHistoryService;
    }

    public void setCalcHistoryService(CalcHistoryService calcHistoryService) {
        this.calcHistoryService = calcHistoryService;
    }

    @Override
    public String execute() {
        CalcHistory calcHistory = new CalcHistory();
        calcHistory.setName("Amigo");
        calcHistoryService.save(calcHistory);
        return SUCCESS;
    }
}
