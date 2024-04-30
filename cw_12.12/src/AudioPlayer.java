class AudioPlayer implements Playable{
    String trackName;
    @Override
    public void play(String trackName){
        this.trackName = trackName;
    }
    @Override
    public void stop(){
        trackName = null;
        System.out.println("No playing tracks now.");
    }
    @Override
    public String getCurrentTrack(){
        return trackName;
    }
}