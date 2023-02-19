// WAP to generate a random key and IV for AES algorithm
// 32 bytes key and 16 bytes IV
// Without using any library


import java.util.*;
import java.io.*;

class generate
{
    public static void main(String[] args) {
        try
        {
            String key = "";
            String IV = "";
            Random r = new Random();
            for(int i = 0; i < 32; i++)
            {
                key += (char)(r.nextInt(26) + 97);
            }
            for(int i = 0; i < 16; i++)
            {
                IV += (char)(r.nextInt(26) + 97);
            }
            System.out.println("Key: " + key);
            System.out.println("IV: " + IV);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}