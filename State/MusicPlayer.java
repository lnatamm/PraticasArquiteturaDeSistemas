package State;

public class MusicPlayer {
    private ReprodutionState currentState;

    public MusicPlayer(){
        currentState = new PausingState();
    }

    public void setCurrentState(ReprodutionState currentState) {
        this.currentState = currentState;
    }

    public void play(){
        currentState.play();
        if(currentState instanceof PausingState){
            setCurrentState(new PlayingState());
        }
    }

    public void pause(){
        currentState.pause();
        if(currentState instanceof PlayingState){
            setCurrentState(new PausingState());
        }
    }

    public void resume(){
        currentState.resume();
    }

    public void stop(){
        currentState.stop();
        setCurrentState(new StoppingState());
    }

}
