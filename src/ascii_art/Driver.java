package ascii_art;

import ascii_art.img_to_char.CharRenderer;
import ascii_art.img_to_char.BrightnessImgCharMatcher;

/**
 * the brain of the program
 * for more information look at the il-campus page:
 * https://courses.campus.gov.il/courses/course-v1:HUJI+ACD_RFP4_HUJI_OOP+2019_1/courseware/02876ca6b1964deeae74c29d1a83c233/21d7576f812b4dbe9124ca8abc8a93da/?child=first
 */
public class Driver {

    public static void main(String[] args) {
        BrightnessImgCharMatcher brightnessImgCharMatcher = new BrightnessImgCharMatcher();
        Character[] charSet = {'a', 'b', 'c', 'd'};
        brightnessImgCharMatcher.chooseChars(16,charSet);

    }
}
