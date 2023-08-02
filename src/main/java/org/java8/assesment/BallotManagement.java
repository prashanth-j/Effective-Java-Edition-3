package org.java8.assesment;

import java.util.*;

public class BallotManagement {

    public List<String> getResults(List<Ballot> ballots) {
        List<String> voteCount = new ArrayList<>();
        Map<String, Integer> candidatePoint = new HashMap<>();
        ballots.stream().map(Ballot::getVote).forEachOrdered(vote -> {
            String can = vote.getCandidate();
            Integer point = vote.getPoints();
            if (candidatePoint.containsKey(can)) {
                candidatePoint.put(can, candidatePoint.get(can) + point.intValue());
            } else {
                candidatePoint.put(can, point);
            }
        });
        // decreasing order of the points
        // Sort techniquie -- decreasing order

        List<Map.Entry<String, Integer>> list = new ArrayList<>(candidatePoint.entrySet());

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        // 5, 4, 3
        // b, a, c
        list.forEach(x -> voteCount.add(x.getKey()));

        return voteCount;
    }
}
