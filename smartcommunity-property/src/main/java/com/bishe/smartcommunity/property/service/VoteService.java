package com.bishe.smartcommunity.property.service;

import com.bishe.smartcommunity.property.domain.Voting;

import java.util.List;

public interface VoteService {
    Voting newVote(Voting voting);

    List<Voting> allVotings();
}
