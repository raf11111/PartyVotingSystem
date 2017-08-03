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
class VoterId<T> {

    private final T voterName;

    VoterId(T voterName) {
        this.voterName = voterName;
    }

}
