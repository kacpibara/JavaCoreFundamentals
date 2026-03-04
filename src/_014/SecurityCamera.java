package _014;

public class SecurityCamera implements SmartDevice {
    boolean isRecording;
    String resolution;

    public SecurityCamera(boolean isRecording, String resolution) {
        this.isRecording = isRecording;
        this.resolution = resolution;
    }

    @Override
    public String getStatus() {
        return "Camera (" + resolution +  ") Recording mode is " + isRecording;
    }
}
