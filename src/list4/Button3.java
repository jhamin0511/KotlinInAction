package list4;

public class Button3 implements View {
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }

    static public class ButtonState implements State {
    }
}
