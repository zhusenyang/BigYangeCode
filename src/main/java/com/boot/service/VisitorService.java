package com.boot.service;

import com.boot.dao.VisitorDao;
import com.boot.entity.VisitorHistory;
import com.boot.utile.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@Service
public class VisitorService {
    @Autowired
    VisitorDao visitorDao;

    public boolean addVisitorHistory(VisitorHistory visitorHistory, HttpServletRequest request){
        visitorHistory.setVisitor_ip(AddressUtil.getRealIp(request));
        String  area =AddressUtil.getAddressByIP(visitorHistory.getVisitor_ip()).getAddress();
        if (area==null){
            area="未知";
        }
        visitorHistory.setArea(area);
        return visitorDao.insertVisitorHistory(visitorHistory)>0;
    }
}
