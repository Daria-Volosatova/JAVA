package Reflection;


import Reflection.representations.JSONRepresentation;
import Reflection.representations.Representation;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object o = new Node();
        Representation representation = new JSONRepresentation();
        Serializer serializer = new Serializer(representation);
        System.out.println(serializer.serialize(o));
//        Gson gson = new Gson();
//        System.out.println(gson.toJson(o));
    }
}


class Node {
    public final String name = "adaad";
    public final Integer integer = 1;
    public final char c = 'c';
    public final int i = 0;
    public final Integer[] arr = {1, 2, 3, 4};
    public final Collection<String> stringList = Arrays.asList("a", "b", "c");
    public final SimpleObject simpleObject = new SimpleObject();
    public final Collection<SimpleObject> nodeList = Arrays.asList(new SimpleObject(), new SimpleObject());
}

