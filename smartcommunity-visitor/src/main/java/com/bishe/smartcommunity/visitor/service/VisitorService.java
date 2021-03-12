package com.bishe.smartcommunity.visitor.service;

import com.bishe.smartcommunity.visitor.domain.Visitors;

import java.util.List;

public interface VisitorService {
    Visitors newVisitor(Visitors visitors);

    List<Visitors> allVisitors();
}
