package data;

public class SrBall implements Comparable<SrBall>{
    private int srBall;

    public SrBall(int srBall) {
        this.srBall = srBall;
    }
    public int getSrBall() {
        return srBall;
    }
    public int compareTo(SrBall o) {
        if (this.srBall == o.getSrBall())
            return 0;
        if(this.srBall > o.srBall)
            return 1;
        return -1;
    }
}

// Использовался принцип SRP, был вынесен отдельно класс
// средний балл и метод его расчета, чтобы у класса студент
// была только 1 причина, приводящая к изменению класса
// + дописан новый компоратор