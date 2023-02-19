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
