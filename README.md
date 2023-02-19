# Encrypt any file using AES algorithm.

<hr>

## Using Initialization Vector and Key to both encrypt and decrypt.

## Platform Independent.

<hr>

> Length of Key - 32 Bit

> Length of Initialization Vector - 16 Bit

<hr>

#### Approach / Working Procedure

1. [Main Encryption](https://github.com/aayushkumar20/File-Encryption-in-JAVA/blob/main/generate.java)
   
   > 1. Enter the key
   > 2. Enter the Initialization Vector
   > 3. Enter the file name
   > 4. Enter 1 to encrypt and 2 to decrypt
   > 5. If you enter 1 then the file will be encrypted and saved as <....>
   > 6. If you enter 2 then the file will be decrypted and saved as <....>

2. [Generate Key and Initialization Vector](https://github.com/aayushkumar20/File-Encryption-in-JAVA/blob/main/generate.java)
   
   > 1. It'll Generate random keys everytime you run the code.
   > 
   > 2. Simply copy it and secure it safely.
   > 
   > 3. There's no way to recover the  Keys and Initialization Vector.
   > 
   > 4. ⚠️ Once you forget. <B> It'll never recover </B> ⚠️..

<hr>

#### Requirements.

> 1. Java 16 or later.
> 
> 2. Terminal.
> 
> 3. Files and all the data in the same directory.
> 
> 4. ⚠️ <B> ALWAYS REMEMBER TO SAVE THE PASSWORD IN A SECURE WALLET OR PROTECTED NOTEBOOK </B> ⚠️.

<hr> 

## Screenshots.

1. Initial Directory View 
   
   > Here we're encrypting ```none.mp4``` file.
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-04-27-image.png)

2. Listing all the contents of directory in terminal.
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-06-15-image.png)

3. Generating random Keys and Initialization Vector.
   
   > Command ```javac generate.java```  1<sup>st</sup> step.
   > 
   > Command  ```java generate.java```  2<sup>nd</sup> step.
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-10-21-image.png)
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-13-50-image.png)

4. Now we'll copy the Key and Initialization Vector

5. After that we'll run the java file named "secure.java".
   
   > Command ```javac secure.java``` 1<sup>st</sup> step.
   > 
   > Command ```java secure.java``` 2<sup>nd</sup> step.
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-17-36-image.png)
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-18-03-image.png)

6. Now we'll enter the Key and Initialization Vector.
   
   > 1. Before Encryption.
   >    
   >    ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-20-15-image.png)

![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-21-52-image.png)

As shown above the file is being encrypted.

> 1. Earlier file name was nope.mp4.
> 
> 2. We have two choices
>    
>    - Type "1" to encrypt.
>    
>    - Type "2" to decrypt.
>    
>    - Other than "1" or "2" it'll throw error message.

> 1. Later after encryption the file name changes to "encrypted.mp4". <B> You can change it according to your need. </B>
>    
>    ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-27-10-image.png)

7. Playing the encrypted file (encrypted.mp4).
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-30-55-image.png)

8. For Decrypting.
   
   > 1. Follow the steps mentioned in step number ```6```.
   > 
   > 2. Instead of "1" Type "2" in the last command.
   > 
   > 3. In file name do mention the name of the encrypted file with extension.
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-36-22-image.png)

9. After sucessfull decryption, The file must be returned.
   
   > ⚠️⚠️⚠️ Please do remember to save the Key and IV in a secure location. ⚠️⚠️⚠️
   
   ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-38-24-image.png)

10. Playing the decrypted file.
    
    ![](C:\Users\AAYUSH%20KUMAR\AppData\Roaming\marktext\images\2023-02-19-22-41-20-image.png)

<hr>

# Thank you 😀
