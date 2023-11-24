package data;

import java.util.Comparator;

public class SrBallComporator<T extends SrBall> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getSrBall(), o2.getSrBall());
    }
}
