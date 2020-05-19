package midi;

import jm.music.data.Note;
import jm.util.Play;

import static jm.constants.Pitches.C4;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Note n = new Note(C4,3);
       Play.midi(n);  
    }
}
