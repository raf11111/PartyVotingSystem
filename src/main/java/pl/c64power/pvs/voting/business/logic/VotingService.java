/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.c64power.pvs.voting.business.logic;

/**
 *
 * @author michal
 */
public class VotingService {

    private final VotingRepository votingRepository;

    VotingService(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    public void vote(VoterId voterId, RateValue rateValue) {
        Voter voter = findBy(voterId);

        if (unregistered(voter)) {
            return;
        }
        Rate rate = createBy(rateValue);

        votingRepository.store(voter, rate);

    }

    private Voter findBy(VoterId voterId) {
        return votingRepository.findBy(voterId);
    }

    private boolean unregistered(Voter voter) {
        return voter == null;
    }

    private Rate createBy(RateValue rateValue) {
        return new Rate(rateValue);
    }

}
