package com.hxq.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 *
 */
public class CoffeeWithHook extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("你想在咖啡里加糖和牛奶吗？(N/y)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
