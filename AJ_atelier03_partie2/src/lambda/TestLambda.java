package lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(153, 22, 4567, 50, 209, 34, 1040);

        List<Integer> result;


        //Trouve tous les entiers de la liste qui sont plus grands que 200
        result = Lambda.allMatches(list, integer -> integer > 200);
        System.out.println(result);

        //Trouve tous les entiers pairs de la liste
        result = Lambda.allMatches(list, integer -> integer % 2 == 0);
        System.out.println(result);

        //Trouve tous les entiers de la liste dont le premier chiffre est 1
        result = Lambda.allMatches(list, integer -> Integer.parseInt(Integer.toString(integer).substring(0,1)) == 1);
        System.out.println(result);

        //Retourne une liste contenant les entiers de la liste originale multipliés par 2
        result = Lambda.transformAll(list, integer -> integer * 2);
        System.out.println(result);

        //Retourne une liste contenant les entiers de la liste originale auxquels on a soustrait 25
        result = Lambda.transformAll(list, integer -> integer - 25);
        System.out.println(result);

        List<String> list2 = Arrays.asList("hello", "bonjour", "goeiedag", "hallo", "hej");

        //Trouve toutes les String de la liste qui commencent par "h"
        List<String> result2 = Lambda.allMatches(list2, s -> s.charAt(0) == 'h');
        System.out.println(result2);

        //Retournerune liste qui contient la taille de chacune des String de la liste originale
        List<Integer> result3 = Lambda.transformAll(list2, String::length);
        System.out.println(result3);



        System.out.println("------------------");

        //Trouve tous les entiers de la liste qui sont plus grands que 200
        result = Lambda.filter(list, integer -> integer > 200);
        System.out.println(result);

        //Trouve tous les entiers pairs de la liste
        result = Lambda.filter(list, integer -> integer % 2 == 0);
        System.out.println(result);

        //Trouve tous les entiers de la liste dont le premier chiffre est 1
        result = Lambda.filter(list, integer -> Integer.parseInt(Integer.toString(integer).substring(0,1)) == 1);
        System.out.println(result);

        //Retourne une liste contenant les entiers de la liste originale multipliés par 2
        result = Lambda.map(list, integer -> integer * 2);
        System.out.println(result);

        //Retourne une liste contenant les entiers de la liste originale auxquels on a soustrait 25
        result = Lambda.map(list, integer -> integer - 25);
        System.out.println(result);

        //Trouve toutes les String de la liste qui commencent par "h"
        List<String> result4 = Lambda.filter(list2, s -> s.charAt(0) == 'h');
        System.out.println(result4);

        //Retournerune liste qui contient la taille de chacune des String de la liste originale
        List<Integer> result5 = Lambda.map(list2, String::length);
        System.out.println(result5);


    }
}
