package com.bishe.smartcommunity.property.controller;

import com.bishe.smartcommunity.property.domain.Voting;
import com.bishe.smartcommunity.property.service.VoteService;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vote")
public class VotingController {
    @Autowired
    private VoteService voteService;

    @PostMapping("/allVoting")
    public R allVotings(){
        try {
            List<Voting> allVotings = voteService.allVotings();
            return R.success(allVotings);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }
}
