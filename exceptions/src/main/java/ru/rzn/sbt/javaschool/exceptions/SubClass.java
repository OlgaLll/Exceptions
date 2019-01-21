package ru.rzn.sbt.javaschool.exceptions;

import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
    public String callService(SomeService service) throws FileNotFoundException {
        String str = null;
        try {
            service.doSomething();
            str = "DONE";
        }
        catch (FileNotFoundException e)
        {
            throw e;
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage(), ex);
        }
        return str;
    }
}
