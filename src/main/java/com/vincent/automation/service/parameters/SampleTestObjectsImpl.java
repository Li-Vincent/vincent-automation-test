package com.vincent.automation.service.parameters;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vincent.automation.fw.parameter.Parameters;
import com.vincent.automation.fw.parameter.TestObjectsImpl;

public class SampleTestObjectsImpl extends TestObjectsImpl implements SampleTestObjects
{
    private SampleParameters m_sample;

    public SampleTestObjectsImpl(Map<Parameters, String> params)
    {
        super(params);
    }

    @Override
    public void purge()
    {
        m_sample = null;
    }

    @SuppressWarnings("deprecation")
    @Override
    public SampleParameters sampleParameters()
    {
        if (m_sample == null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
            try {
                m_sample = mapper
                        .readValue(m_params.get(SampleTestParameters.SAMPLE_PARAMETERS), SampleParameters.class);
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return m_sample;
    }

}
