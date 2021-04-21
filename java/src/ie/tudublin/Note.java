package ie.tudublin;

import java.util.ArrayList;

class Note {
    private char note;
    private int duration;

     public Note(char note, int duration)
      {
        this.note = note;

        this.duration = duration;
    }
public String toString() {
    return note + Integer.toString (duration);
}


     
}