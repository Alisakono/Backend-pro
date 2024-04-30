public class AudioRecorder extends AudioPlayer implements Playable, Recordable {
    @Override
    public void record(){
        System.out.println("Recording started");
    }
    public void stopRecording(){}
}
