package com.bishe.smartcommunity.property.controller;

import com.bishe.smartcommunity.property.domain.Voting;
import com.bishe.smartcommunity.property.service.PropertyService;
import com.bishe.smartcommunity.property.service.VoteService;
import com.bishe.smartcommunity.property.utils.NoticeVo;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class PropertyController {

    PropertyService propertyService;
    VoteService voteService;

    @PostMapping("/noticeboard")
    public R noticeboard(@RequestBody NoticeVo vo){
        try {
            if(vo.getProperty().getPropertyState()==0){
                String noticeboard = propertyService.noticeboard(vo.getProperty(),vo.getStr());

                return R.success(noticeboard);
            }else {
                return R.error("权限不够，操作失败");
            }
        } catch (Exception e) {
            return R.error(e.getMessage());
        }

    }

    @PostMapping("/newvote")
    public R newVote(@RequestBody Voting voting){
        try {
            Voting newVote = voteService.newVote(voting);
            return R.success(newVote);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

}
