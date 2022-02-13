package ru.iitdgroup.temperaturegames;

import java.util.Collections;
import java.util.List;

public class csvDTO {

    // Member variables of class
    public List max;
    public List min;
    public List avg;


    // Creating a constructor of the class
    csvDTO(List max, List min, List avg) {


        this.max = max;
        this.min = min;
        this.avg = avg;
    }

    public List getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = Collections.singletonList(max);
    }

    public List getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = Collections.singletonList(min);
    }

    public List getAvg() {
        return avg;
    }


    public void setAvg(String avg) {
        this.avg = Collections.singletonList(avg);
    }
}