public class ForestFires {
    private Tree[][] trees; // 2D array holding trees
    private Deque<Tree> treeDeque; // Deque holding trees that are on fire
    
    /**
     * Initialize a new forest fire simulation on a grid
     * @param N Number of points on the grid
     * @param fireCoords Locations of the starting coordinates of fires
     */
    public ForestFires(int N, int[][] fireCoords) {
        trees = new Tree[N][N];
        for (int i = 0; i < N; i++) {
            trees[i] = new Tree[N];
            for (int j = 0; j < N; j++) {
                trees[i][j] = new Tree(i, j);
            }
        }
        treeDeque = new Deque<>();
        for (int k = 0; k < fireCoords.length; k++) {
            int i = fireCoords[k][0];
            int j = fireCoords[k][1];
            trees[i][j].setState(Tree.ON_FIRE);
            treeDeque.addFirst(trees[i][j]);
        }
    }
    
    /**
     * Draw the entire forest with all of the trees their appropriate
     * colors
     * @param frameInterval Number of milliseconds to pause after draw
     */
    private void draw(int frameInterval) {
        StdDraw.clear();
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
                trees[i][j].draw(trees.length);
            }
        }
        StdDraw.show();
        StdDraw.pause(frameInterval);
    }
    
    /**
     * Perform a simulation of trees setting each other on fire
     * until the entire forest has burned down
     * @param frameInterval Number of milliseconds to pause after draw
     */
    private void doSimulation(int frameInterval) {
        System.out.println("Starting with " + treeDeque.size() + " fires");
        while(treeDeque.size() > 0) {
            // TODO: Fill this in
            draw(frameInterval);
        }
        System.out.println("Finished");
    }
    
    public static void main(String[] args) {
        int[][] onFire = {{10, 10}, {25, 25}};
        ForestFires fires = new ForestFires(50, onFire);
        fires.doSimulation(5);
    }
}
