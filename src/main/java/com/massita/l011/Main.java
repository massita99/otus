package com.massita.l011;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input number for decompose(EOF for finish)");
        List<String> inputList = Reader.readInput(System.in);
        System.out.println(StepikTasks.decomposeInt(Integer.valueOf(inputList.get(0))));

    }
}
