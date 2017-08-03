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
public class RateValue {

    private final int rate;

    public RateValue(int rate) {
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.rate;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RateValue other = (RateValue) obj;
        if (this.rate != other.rate) {
            return false;
        }
        return true;
    }

}
