package com.vincent.automation.service.parameters;

import com.vincent.automation.fw.parameter.Parameters;

public enum SampleTestParameters implements Parameters {
    SAMPLE_PARAMETERS(""),
    UNKNOWN("unknown");

    private final String m_val;

    SampleTestParameters(String val)
    {
        m_val = val;
    }

    @Override
    public String val()
    {
        return m_val;
    }

    @Override
    public Parameters unknown()
    {
        return UNKNOWN;
    }
}
