package midi.sound;

import javax.sound.midi.MidiChannel;

public class Channel {

    private MidiChannel channel;

    private int velocity;
    private int pressure;
    private int bend;
    private int reverb;
    private int num;

    public MidiChannel getChannel() { return channel; }

    public Channel(MidiChannel channel, int num) {
        this.channel = channel;
        this.num = num;
        velocity = 64;
        pressure = 64;
        bend = 64;
        reverb = 64;
    }
}