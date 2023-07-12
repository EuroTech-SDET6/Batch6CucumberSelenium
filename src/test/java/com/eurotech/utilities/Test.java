package com.eurotech.utilities;

import java.util.Base64;

public class Test {

    public static void main(String[] args) {



        String originalText = "Eurotech Stduy";

        String encodeText = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("encodeText = " + encodeText);

       String newText= EncryptionUtils.encrypt(originalText,"Germany");
       //env name mey secret key ===  Germany

        System.out.println("newText = " + newText);

        System.out.println("EncryptionUtils.decrypt(str,\"Germany\") = " + EncryptionUtils.decrypt(newText, "Germany"));

    }
}
