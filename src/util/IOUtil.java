package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOUtil {
    public static int inputIntNumber(Integer min, Integer max , String errorMessage) {
        int result;
        while (true){
            try{
                result = new Scanner(System.in).nextInt();

                if (result < min || result>max){
                    throw new  InputMismatchException();
                }
                return result;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);

            }
        }
    }
}
