package midi.sound;

import javax.sound.midi.*;
import java.util.HashMap;
import java.util.Map;

public class Play {

    private static Channel[] channels;
    Instrument instruments[];
    private Synthesizer synthesizer;
    static int velocity = 127;

    public static Channel getSpecialisedChannel(int index){
        return channels[index];
    }

    public void setup() {
        getSynthesizer();
        setupInstruments();
        setupChannels();
    }

    // EFFECTS: synthesizes sound given instrument, note, and velocity
    public static void play(int instrument, int note){
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


    private void getSynthesizer(){
        try {
            if (synthesizer == null) {
                if ((synthesizer = MidiSystem.getSynthesizer()) == null) {
                    System.out.println("getSynthesizer() failed!");
                    return;
                }
            }
            synthesizer.open();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void setupChannels() {
        MidiChannel midiChannels[] = synthesizer.getChannels();
        channels = new Channel[midiChannels.length];
        for (int i = 0; i < channels.length; i++) {
            channels[i] = new Channel(midiChannels[i], i);
        }
    }

    // MODIFIES: this
    // EFFECTS:  loads soundbank instruments into []
    private void setupInstruments() {
        if (synthesizer.getDefaultSoundbank() != null) {
            instruments = synthesizer.getDefaultSoundbank().getInstruments();
            synthesizer.loadInstrument(instruments[0]);
        }
    }


    // EFFECTS: returns the channel associated with the given instrument, stored in HashMap
    private static Channel getChannelData(int instrument) {
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
