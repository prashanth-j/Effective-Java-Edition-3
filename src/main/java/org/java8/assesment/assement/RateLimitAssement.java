package org.java8.assesment.assement;

import java.util.ArrayList;
import java.util.List;

public class RateLimitAssement {

    private static int CAPACITY = 50;

    private static int refilFunnel = 10;

    private static int currentSizeTunnel = 0;
    /*
     *   refill gets increment only if it has capacity
     *
     *
     * */
    List<Integer> customerIds = new ArrayList<>();

    //

    public boolean rateLimit(int customerId) {
        if (customerIds.size() > CAPACITY && currentSizeTunnel > refilFunnel) {
            return false;
        }
        customerIds.add(customerId);
        refilFunnel--;
        currentSizeTunnel++;
        if(currentSizeTunnel< CAPACITY && refilFunnel < 10) {
            refilFunnel++;
        }
        return true;
    }

    public void refillFunnel() {
        if (currentSizeTunnel < CAPACITY && customerIds.size() < CAPACITY) {
            currentSizeTunnel++;
        }
    }
}
