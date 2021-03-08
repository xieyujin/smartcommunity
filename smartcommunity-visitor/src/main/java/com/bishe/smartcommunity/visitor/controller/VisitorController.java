package com.bishe.smartcommunity.visitor.controller;

import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import com.bishe.smartcommunity.visitor.domain.Visitors;
import com.bishe.smartcommunity.visitor.service.VisitorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitor")
public class VisitorController {
    private VisitorService visitorService;

    @PostMapping("/newVisitor")
    public R newVisitor(@RequestBody Visitors visitors){
        try {
            Visitors visitor = visitorService.newVisitor(visitors);
            return R.success(visitor);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }
}
