package com.vincent.automation.test;

import com.vincent.automation.fw.TestCollection;
import com.vincent.automation.fw.parameter.Result;
import com.vincent.automation.fw.parameter.TestObjects;
import com.vincent.automation.lib.logger.TestLogger;
import com.vincent.automation.service.parameters.SampleTestObjects;

public class SampleTestCollection implements TestCollection<SampleTestObjects>, SampleTestCollectionI
{
    protected TestLogger                LOGGER = (TestLogger) TestLogger.getLogger(this.getClass());

    private static SampleTestCollection s_instance;

    protected SampleTestObjects         m_testObjects;

    public SampleTestCollection(SampleTestObjects testObjects)
    {
        m_testObjects = testObjects;
    }

    public static SampleTestCollection instance()
    {
        return s_instance;
    }

    public static SampleTestCollection setInstance(TestObjects testObjects)
    {
        if (s_instance == null || !testObjects.equals(s_instance.m_testObjects)) {
            s_instance = new SampleTestCollection((SampleTestObjects) testObjects);
        }
        return s_instance;
    }

    @Override
    public SampleTestObjects testObjects()
    {
        return m_testObjects;
    }

    @Override
    public Result moveTo()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result login()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result create()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result update()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result cancel()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result delete()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result compare()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result search()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result select()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result cleanUp()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
