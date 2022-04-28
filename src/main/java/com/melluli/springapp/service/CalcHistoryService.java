package com.melluli.springapp.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.melluli.springapp.model.CalcHistory;

public class CalcHistoryService {

    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(CalcHistory calcHistory) {
        Session currentSession = getSessionFactory().getCurrentSession();
        currentSession.save(calcHistory);
    }

}
