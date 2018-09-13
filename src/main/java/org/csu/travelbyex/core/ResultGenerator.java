package org.csu.travelbyex.core;

import java.util.ArrayList;
import java.util.List;

public class ResultGenerator {

    private static final int SUCCESS = 0;
    private static final int FAIL = 1;

    public static <T> Result success(T message){
        Result result = new Result();
        result.setStatus(SUCCESS);
        result.setMessage(message);

        return result;
    }

    public static <T> Result fail(T message){
        Result result = new Result();
        result.setStatus(FAIL);
        List<T> messages = new ArrayList<>();
        messages.add(message);
        result.setMessage(messages);

        return result;
    }

}
