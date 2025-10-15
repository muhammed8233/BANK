package Chapter6;

import java.security.SecureRandom;

public class Random {
    SecureRandom secure = new SecureRandom();
    int num = secure.nextInt(6) + 1;
}
