package com.vincent.automation.service.window;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

import com.vincent.automation.fw.page.ServiceElement;
import com.vincent.automation.fw.page.element.action.WebElementAction;
import com.vincent.automation.fw.page.element.action.Clickable;
import com.vincent.automation.fw.utils.ByType;
import com.vincent.automation.service.ServiceWindowImpl;

public class TestWindow extends ServiceWindowImpl
{
    public TestWindow()
    {
        m_elementMap.put(TestElement.LOGIN_BTN, "");
    }

    public enum TestElement implements ServiceElement {

        LOGIN_BTN(ById.class, Clickable.class);

        private Class<? extends WebElementAction> m_action;
        private Class<? extends By>               m_by;

        TestElement(Class<? extends By> by, Class<? extends WebElementAction> action)
        {
            m_by = by;
            m_action = action;
        }

        @Override
        public ByType byType()
        {
            return ByType.getType(m_by);
        }

        @Override
        public Class<? extends WebElementAction> action()
        {
            return m_action;
        }
    }
}
