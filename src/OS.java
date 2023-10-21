public interface OS {
    void run();
    default void play(){
        System.out.println("Now you can play Brawl Stars in your PC!");
    }
}
