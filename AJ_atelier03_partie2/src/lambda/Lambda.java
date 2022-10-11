package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    /**
     * Retourne une liste contenant uniquement les Integer qui correspondent
     * au predicat match
     * @param list La liste d'Integer originale
     * @param match le predicat à respecter
     * @return une liste contenant les integer qui respectent match
     */
    public static <T> List<T> allMatches(List<T> list, Predicate<T> match) {
        List<T> temp = new ArrayList<>();

        for (T t : list)
            if (match.test(t))
                temp.add(t);

        return temp;
    }

    /**
     * Retourne une liste contenant tous les éléments de la liste originale, transformés
     * par la fonction transform
     * @param list La liste d'Integer originale
     * @param transform la fonction à appliquer aux éléments
     * @return une liste contenant les integer transformés par transform
     */
    public static <T, R> List<R> transformAll(List<T> list, Function<T, R> transform) {
        List<R> temp = new ArrayList<>();

        for (T t : list) {
            temp.add(transform.apply(t));
        }

        return temp;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> match) {
        return list.stream().filter(match).collect(Collectors.toList());
    }

    public static <T, R> List<R> map(List<T> list, Function<T,R> transform) {
        return list.stream().map(transform).collect(Collectors.toList());
    }
}
