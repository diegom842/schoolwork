package APT3;

import java.util.ArrayList;

public class Encryption {

    public String encrypt(String message)
    {
        char[] chars = new char[message.length()]; //creates array

        for(int i = 0; i < message.length(); i++)
            chars[i] = message.charAt(i);

        ArrayList<Character> cypher = new ArrayList<>();
        for(int k = 0; k < chars.length; k ++)
        {
            if(!cypher.contains(chars[k]))
                cypher.add(chars[k]);
        }

        char[] secret = new char [message.length()];
        for(int i = 0; i < secret.length; i++)
        {
            secret[i] = (char) (cypher.indexOf(chars[i]) + 97);
        }

        return new String(secret);
    }
}
