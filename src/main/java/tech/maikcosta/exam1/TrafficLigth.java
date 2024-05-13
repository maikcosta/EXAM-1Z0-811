package tech.maikcosta.exam1;

import java.util.ArrayList;
import java.util.List;

public class TrafficLigth {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(0, "RED");
        trafficLight.add(1, "YELLOW");
        trafficLight.add(2, "GREEN");

        trafficLight.remove((Integer) 1);

        System.out.println(trafficLight);
    }
}
