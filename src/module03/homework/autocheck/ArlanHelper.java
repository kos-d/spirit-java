package module03.homework.autocheck;

public class ArlanHelper {
    public String drawQuad(int n) {
        String quad = "";
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                quad = quad + "*";
                j++;
            }
            quad = quad + "\n";
            i++;
        }
        return quad;
    }
    /*
     public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }
     */

    public String drawRect(int width, int height, char c) {
        String result = "";
        int columns = 0;
        while (columns < height) {
            int lines = 0;
            while (lines < width) {
                result = result + c;
                lines++;
            }
            result = result + "\n";
            columns++;
        }
        return result;
    }
    /*
    public String drawRect(int width, int height, char c) {
        String result = "";

        int lines = height;

        while(lines > 0) {
            lines--;

            int columns = width;
            while(columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
    }
     */
    public String drawLine(int length) {
        String result = "";
        int count = 0;
        while (count < length) {
            if (count % 2 == 0) {
                result = result + "*";
            } else {
                result = result + "#";
            }
            count++;
        }
        return result;
    }
    /*
    public String drawLine(int length) {
        String result = "";

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result;
    }
    */
//    public String drawPattern(char[] pattern, int repeatCount) {
//        String result = "";
//        int count = 0;
//        int patternLength = pattern.length;
//
//        while (patternLength > 0) {
//            result += pattern[count];
//            patternLength--;
//            count++;
//        }
//        return result.repeat(repeatCount);
//    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //helper.drawQuad(4);
        System.out.println(helper.drawQuad(2));
        System.out.println(helper.drawRect(2, 3, 'X'));
        System.out.println(helper.drawLine(5));
//        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
