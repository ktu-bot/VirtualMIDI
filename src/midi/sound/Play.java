package midi.sound;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Synthesizer;
import java.util.HashMap;
import java.util.Map;

public class Play {

    private Synthesizer synthesizer;
    public static int instrument;
    private Channel channels[];

    public Channel getSpecialisedChannel(int index){
        return channels[index];
    }

    // EFFECTS: synthesizes sound given instrument, note, and velocity
    public void play(int instrument, int note, int velocity){
        Channel channelData = getChannelData(instrument);
        MidiChannel midiChannel = channelData.getChannel();
        midiChannel.noteOn(note, velocity);
    }

    // EFFECTS: stops playback of the given instrument
    public void stop(int instrument, int note){
        Channel channelData = getChannelData(instrument);
        MidiChannel midiChannel = channelData.getChannel();
        midiChannel.noteOff(note, 0);
    }

    // EFFECTS: returns the channel associated with the given instrument, stored in HashMap
    private Channel getChannelData(int instrument) {
        Map<Integer, Channel> channelMap = new HashMap<Integer, Channel>();
        Channel channelData = channelMap.get(instrument);
        if (channelData == null) {
            channelData = getSpecialisedChannel(channelMap.size());
            MidiChannel midiChannel = channelData.getChannel();
            midiChannel.programChange(instrument);
            channelMap.put(instrument, channelData);
        }
        return channelData;
    }
}
