package ascii_art.img_to_char;

import java.util.Arrays;

public class BrightnessImgCharMatcher implements MatchMaker{
    @Override
    public char[][] chooseChars(int numCharsInRow, Character[] charSet) {
//        for (Character c : charSet) {
//            System.out.println(BrightnessImgCharMatcher(c,numCharsInRow));
//        }
        System.out.println(Arrays.toString(BrightnessImgCharMatcher(numCharsInRow, charSet)));
        return new char[0][];
    }

    private static float[] BrightnessImgCharMatcher(int numCharsInRow, Character[] charSet ){
        float trueCount = 0,sum = 0;
        float[] result = new float[charSet.length];
        for (int i = 0; i < charSet.length; i++) {
            boolean[][] img = CharRenderer.getImg(charSet[i], numCharsInRow, "Ariel");
            for (boolean[] row : img) {
                for (boolean col : row) {
                    if (col)
                        trueCount++;
                    sum++;
                }
            }
            result[i] = trueCount/sum;
        }
        return result;
    }
}
