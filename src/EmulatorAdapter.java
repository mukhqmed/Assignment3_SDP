public class EmulatorAdapter implements PCGame{
    private final OperatingSystem application;
    public EmulatorAdapter(OperatingSystem application){
        this.application = application;
    }

    @Override
    public void connectWithPC() {
        this.application.run();
        this.application.play();
    }
}
