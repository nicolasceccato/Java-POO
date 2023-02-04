import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.text.MessageFormat;
import java.util.Date;



public class Program {

    public static void main(String[] args) {
        String teste = "";
        String dois = "";

        if ("".equals(teste)){
            System.out.println("Iguais!");
        }else{
            System.out.println("Diferentes");
        }
        int planet = 7;
        String event = "a disturbance in the Force";
        int testeES = 34;

        String result = MessageFormat.format(
                "At {0,time} on {0,date}, there was {2} on planet {3,number,integer}.",
                new Date(), planet,  event, testeES);
        Classe classe = new Classe();
        System.out.println(result);
        System.out.println(classe.toString());





        }
    }



