package com.bishe.smartcommunity.visitor.service.impl;

import com.bishe.smartcommunity.visitor.domain.Visitors;
import com.bishe.smartcommunity.visitor.mapper.VisitorsMapper;
import com.bishe.smartcommunity.visitor.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;

public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorsMapper visitorsMapper;

    @Override
    public Visitors newVisitor(Visitors visitors) {
       visitors.setVisitorState(1);
        int insert = visitorsMapper.insert(visitors);
        System.out.println(insert);
        return visitors;
    }
}
