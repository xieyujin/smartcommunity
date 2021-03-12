package com.bishe.smartcommunity.property.service.impl;

import com.bishe.smartcommunity.property.domain.Voting;
import com.bishe.smartcommunity.property.mapper.PropertyMapper;
import com.bishe.smartcommunity.property.mapper.VotingMapper;
import com.bishe.smartcommunity.property.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {
    @Autowired
    PropertyMapper propertyMapper;
    @Autowired
    VotingMapper votingMapper;

    @Override
    public Voting newVote(Voting voting) {
        int insert = votingMapper.insert(voting);

        return voting;
    }

    @Override
    public List<Voting> allVotings() {
        List<Voting> allVotings = votingMapper.findAllVotings();
        return allVotings;
    }
}
