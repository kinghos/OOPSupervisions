package SV3;

public final class RankSingleton {
    private static RankSingleton instance;

    private RankSingleton() {

    }

    public RankSingleton getInstance() {
        if (instance == null) {
            instance = new RankSingleton();
        }
        return instance;
    }
}
