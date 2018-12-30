package com.massita.l011;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    static List<String> readInput (InputStream stream) {
        Scanner sc = new Scanner(stream);
        List<String> result = new LinkedList<>();
        while (sc.hasNext()) {
            result.add(sc.nextLine());
        }
        return result;

    }

}
