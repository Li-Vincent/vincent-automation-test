package com.vincent.automation.test;

import com.vincent.automation.fw.parameter.Result;

public interface SampleTestCollectionI
{
    public Result moveTo();

    public Result login();

    public Result create();

    public Result update();

    public Result cancel();

    public Result delete();

    public Result compare();

    public Result search();

    public Result select();

    public Result cleanUp();

}
