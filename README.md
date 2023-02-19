# Encrypt any file using AES algorithm.


## Using Initialization Vector and Key to both encrypt and decrypt.

## Platform Independent.


> Length of Key - 32 Bit

> Length of Initialization Vector - 16 Bit


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


#### Requirements.

> 1. Java 16 or later.
> 
> 2. Terminal.
> 
> 3. Files and all the data in the same directory.
> 
> 4. ⚠️ <B> ALWAYS REMEMBER TO SAVE THE PASSWORD IN A SECURE WALLET OR PROTECTED NOTEBOOK </B> ⚠️.


## Screenshots.

1. Initial Directory View 
   
   > Here we're encrypting ```nope.mp4``` file.
   
   ![Screenshot_20230219_220408](https://user-images.githubusercontent.com/37871733/219963610-6aa186cd-3c30-4b03-ba42-ee1eb4623312.png)


2. Listing all the contents of directory in terminal.
   
   ![Screenshot_20230219_220613](https://user-images.githubusercontent.com/37871733/219963630-0f147983-324d-4a23-bfb7-1792dacf43a6.png)


3. Generating random Keys and Initialization Vector.
   
   > Command ```javac generate.java```  1<sup>st</sup> step.
   > 
   > Command  ```java generate.java```  2<sup>nd</sup> step.
   
   ![Screenshot_20230219_220954](https://user-images.githubusercontent.com/37871733/219963714-711de8b6-8c12-423b-8d4e-14c77f789b4b.png)
   
   ![Screenshot_20230219_221347](https://user-images.githubusercontent.com/37871733/219963726-9828f933-cbf5-422a-8fb7-067e697d1935.png)



4. Now we'll copy the Key and Initialization Vector

5. After that we'll run the java file named "secure.java".
   
   > Command ```javac secure.java``` 1<sup>st</sup> step.
   > 
   > Command ```java secure.java``` 2<sup>nd</sup> step.
   
   ![Screenshot_20230219_221733](https://user-images.githubusercontent.com/37871733/219963740-880a5b3d-a444-48f5-8c28-7c0320e1fdb6.png)

   ![Screenshot_20230219_221800](https://user-images.githubusercontent.com/37871733/219963749-00ec1cec-58d4-455c-90d7-e7148627e243.png)


6. Now we'll enter the Key and Initialization Vector.
   
   > 1. Before Encryption.
   >    
   >    ![Screenshot_20230219_221912](https://user-images.githubusercontent.com/37871733/219963766-772ec517-3b35-4a88-b952-47fb3624b17e.png)

  ![Screenshot_20230219_222138](https://user-images.githubusercontent.com/37871733/219963822-c07dad50-5407-44a1-a43d-bdcc87ac3a59.png)

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
>    ![Screenshot_20230219_222707](https://user-images.githubusercontent.com/37871733/219963844-a27382d3-16dc-4b54-a5b7-d6c2b335c8d4.png)

7. Playing the encrypted file (encrypted.mp4).
   
   ![Screenshot_20230219_223050](https://user-images.githubusercontent.com/37871733/219963853-2367d5fa-bec8-4855-a9d3-8633b860b995.png)


8. For Decrypting.
   
   > 1. Follow the steps mentioned in step number ```6```.
   > 
   > 2. Instead of "1" Type "2" in the last command.
   > 
   > 3. In file name do mention the name of the encrypted file with extension.
   
   ![Screenshot_20230219_223618](https://user-images.githubusercontent.com/37871733/219963867-9a57d8f1-2dfd-4252-939a-81d23f1663a0.png)


9. After sucessfull decryption, The file must be returned.
   
   > ⚠️⚠️⚠️ Please do remember to save the Key and IV in a secure location. ⚠️⚠️⚠️
   
   ![Screenshot_20230219_223820](https://user-images.githubusercontent.com/37871733/219963871-76c6aba5-2721-4dc4-99e0-6421956e2991.png)

10. Playing the decrypted file.
    
    ![Screenshot_20230219_224050](https://user-images.githubusercontent.com/37871733/219963877-30d74908-6a07-4899-a3b1-8372173979de.png)


# Thank you 😀
