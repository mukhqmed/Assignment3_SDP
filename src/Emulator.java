public class Emulator implements PCGame{
    private final OS application;
    public Emulator(OS application){
        this.application = application;
    }

    @Override
    public void connectWithPC() {
        this.application.play();
        this.application.run();
    }
}
