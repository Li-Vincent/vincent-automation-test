package com.vincent.automation.service;

import java.util.HashMap;
import java.util.Map;

import com.vincent.automation.fw.page.ServiceElement;
import com.vincent.automation.fw.page.ServiceWindow;

public abstract class ServiceWindowImpl implements ServiceWindow
{
    protected final Map<ServiceElement, String> m_elementMap = new HashMap<>();

    @Override
    public String getId(ServiceElement id)
    {
        return m_elementMap.get(id);
    }

}
