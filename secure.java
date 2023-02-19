import java.io.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;


class secure
{
    public static void encryption(String key, String IV, String file)
    {
        try
        {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("-------------"); // Change it according to your choice
            byte[] k = key.getBytes();
            byte[] iv = IV.getBytes();
            SecretKeySpec sks = new SecretKeySpec(k, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, sks, new IvParameterSpec(iv));
            CipherOutputStream cos = new CipherOutputStream(fos, cipher);
            int b;
            byte[] d = new byte[8];
            while((b = fis.read(d)) != -1)
            {
                cos.write(d, 0, b);
            }
            cos.flush();
            cos.close();
            fis.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void decryption(String key, String IV, String file)
    {
        try
        {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("------------"); // Change it according to your choice.
            byte[] k = key.getBytes();
            byte[] iv = IV.getBytes();
            SecretKeySpec sks = new SecretKeySpec(k, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, sks, new IvParameterSpec(iv));
            CipherOutputStream cos = new CipherOutputStream(fos, cipher);
            int b;
            byte[] d = new byte[8];
            while((b = fis.read(d)) != -1)
            {
                cos.write(d, 0, b);
            }
            cos.flush();
            cos.close();
            fis.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        String key = sc.nextLine();
        System.out.println("Enter the IV: ");
        String IV = sc.nextLine();
        System.out.println("Enter the file name: ");
        String file = sc.nextLine();
        System.out.println("Enter 1 to encrypt and 2 to decrypt: ");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            encryption(key, IV, file);
        }
        else if(choice == 2)
        {
            decryption(key, IV, file);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
