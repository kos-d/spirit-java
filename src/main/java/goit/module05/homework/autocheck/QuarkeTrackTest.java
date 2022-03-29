package goit.module05.homework.autocheck;

import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        System.out.println(track1.equals(track2));
        System.out.println(track1.equals(track3));

        System.out.println(track1.hashCode() == track2.hashCode());
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}
class QuarkeTrack {
    private int track;
    
    public QuarkeTrack(int[] lines) {
        int sumOfTracks= 0;
        for (int i = 0; i < lines.length; i++) {
            sumOfTracks += lines[i];
        }
        this.track = sumOfTracks;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } 
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        QuarkeTrack that = (QuarkeTrack) obj;
        if (track != that.track) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + track;
        return result;
    }
}

    /*
    public QuarkeTrack(int[] lines) {
        this.lines = lines;
        for (int i = 0; i < this.lines.length; i++) {
            lengthLines += this.lines[i];
        }
    }
    public int[] getLines() {
        return lines;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof QuarkeTrack)) {
            return false;
        }
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        if (this.lengthLines == quarkeTrack.lengthLines) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(lines);
        result = prime * result + Arrays.hashCode(lines);
        return result;
    }
    */

    /*@Override
    public int hashCode() {
        return Arrays.hashCode(this.lines);
    }*/

   /* @Override
    public int hashCode() {
        if (lines == null) {
            return 0;
        }
        int result = 1;
        for (int element : lines) {
            result = 31 * result + element;
        }
        return result;
    }*/

//    @Override
//    public int hashCode() {
//        int result = Objects.hash(lengthLines);
//        int result = 1;
//        result = 31 * result + Arrays.hashCode(lines);
//        return result;
//        return Arrays.hashCode(lines);
//        return Arrays.hashCode(this.lines);
//    }