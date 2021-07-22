package structural.adapter;

public class Mp4Player implements IAdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // TODO:
        
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: " + fileName);
    }
    
}
