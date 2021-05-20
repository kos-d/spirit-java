package module06.homework.autocheck;

public class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));
        
        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));
        
        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));
        
        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}
class GooWordStat {

    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {            
        return freq;
    }

//        @Override
//        public String toString() {
//            if (freq < 1000) {                
//                return low();
//            } else if (freq >= 1000 && freq <= 100000){
//                
//            }
//            
//            return "Word is " + word + ", freq is " + freq;
//        }
    @Override
    public String toString() {
        String message = "Word is [" + word + "], search freq is ";
        if (freq < 1000) {                
            return message + arrayMethod(1);
        } else if (freq >= 1000 && freq < 100000) {
            return message + arrayMethod(2);
        } else if (freq >= 100000 && freq < 10000000) {
            return message + arrayMethod(3);
        } else if (freq >= 10000000) {
            return message + arrayMethod(4);
        }
        return message;
    }

    public String low() {
        String low = "LOW";
        return low;
    }
    public String arrayMethod(int num) {

    String[] freqArr =  { 
        "LOW",
        "MEDIUM",
        "HIGH",
        "EXTRA HIGH"    };
    if (num == 1) {
            return freqArr[0];
        } else if (num == 2) {
            return freqArr[1];
        } else if (num == 3) {
            return (freqArr[2]);
        } else if (num == 4) {
            return (freqArr[3]);
        }
    return "test";
    }             
}

    

//    public String switchMethod(int num) {
//
//        //String min = "freq < 1000";
//        int number = num;
//        switch (number) {
//            case 1:
//                System.out.println("LOW");
//                break;
//            case 2:
//                System.out.println("MEDIUM");
//                break;
//            case 3:
//                System.out.println("HIGH");
//                break;
//            case 4:
//                System.out.println("EXTRA HIGH");
//                break;
////                default :
////                    System.out.println(min);
//        }
//        return "test";
//    }


