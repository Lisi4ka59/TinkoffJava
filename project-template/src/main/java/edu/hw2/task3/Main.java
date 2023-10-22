package edu.hw2.task3;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        ConnectionManager manager = new DefaultConnectionManager();
        @SuppressWarnings("MagicNumber")
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);
        executor.updatePackages();
    }
}
