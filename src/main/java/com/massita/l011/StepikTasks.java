package com.massita.l011;


import com.google.common.base.Strings;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StepikTasks {

    public static String decomposeInt(Integer inputData) {
        return decomposeIntInternal(inputData, inputData, "");

    }

    private static String decomposeIntInternal(Integer inputData, Integer maxValue, String prefix) {
        if (inputData == 0) {
            return prefix.stripLeading();
        }
        if (inputData < 0) {
            return "";
        }
        List<String> result = new LinkedList<>();
        for (Integer i = 1; i <= maxValue; i++) {
            result.add(decomposeIntInternal(inputData-i, i, prefix + " " + i.toString()));
        }
        return result.stream()
                .filter(element -> !Strings.isNullOrEmpty(element))
                .collect(Collectors.joining("\n"));
    }

}
