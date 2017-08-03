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
 interface VotingRepository {

    RateValue getVotingResultBy(WorkId workId);

    public void store(Voter voter, Rate rate);

    public Voter findBy(VoterId voterId);
}
