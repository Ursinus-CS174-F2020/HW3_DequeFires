public class Tree {
    public static final int HEALTHY = 0;
    public static final int ON_FIRE = 1;
    public static final int BURNT = 2;
    private int state;
    private int i, j;
    public Tree(int i, int j) {
        state = HEALTHY;
        this.i = i;
        this.j = j;
    }
    public int getState() {
        return this.state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public int geti() {
        return i;
    }
    public int getj() {
        return j;
    }
    public void draw(int gridSize) {
        switch(state) {
            case HEALTHY:
                StdDraw.setPenColor(StdDraw.GREEN);
                break;
            case ON_FIRE:
                StdDraw.setPenColor(StdDraw.RED);
                break;
            case BURNT:
                StdDraw.setPenColor(StdDraw.BLACK);
        }
        StdDraw.setPenRadius(0.5/gridSize);
        double fuzz = 0.5/gridSize;
        StdDraw.point(j/(double)gridSize + fuzz, i/(double)gridSize + fuzz);
    }
    public String toString() {
        String[] types = {"Healthy", "Fire", "Burnt"};
        return types[state] + " at (" + i + ", " + j + ")";
    }
}