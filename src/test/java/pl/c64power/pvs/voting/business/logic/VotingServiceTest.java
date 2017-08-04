
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.c64power.pvs.voting.business.logic;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michal
 */
public class VotingServiceTest {

    private VotingService votingService;
    private VotingRepository votingRepository;
    private Map<String, VoterId> voters;
    private Map<String, WorkId> works;

    public VotingServiceTest() {
    }

    @Before
    public void setUp() {
        votingRepository = new MockVotingRepository();
        votingService = new VotingService(votingRepository);
        voters = new HashMap<>();
        works = new HashMap<>();
    }

    @Test
    public void vote_custom() {
        //given
        voters("Rafal");
        voters("Michal");
        work("demo of Prince of Persia");

        //when
        vote("Rafal", 1);
        vote("Michal", 2);

        //then
        summarizeResultIs("demo of Prince of Persia", 3);

    }

    private void voters(String voterName) {
        voters.put(voterName, new VoterId(voterName));
    }

    private void work(String workByName) {
        works.put(workByName, new WorkId(workByName));
    }

    private void vote(String voterName, int rate) {
        votingService.vote(voters.get(voterName), new RateValue(rate));
    }

    private void summarizeResultIs(String workByName, int summarizedRate) {
        assertEquals(new RateValue(summarizedRate), votingRepository.getVotingResultBy(new WorkId(workByName)));
    }

}
