/*
 * Copyright 1999-29 Nov 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.osworkflow;

import java.util.Map;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

/**
 * ��TestFunction.java��ʵ��������TODO ��ʵ������ 
 * @author yangbolin 29 Nov 2015 5:19:17 pm
 */
public class TestFunction implements FunctionProvider {

    @Override
    public void execute(Map arg0, Map arg1, PropertySet arg2) throws WorkflowException {
        // ��״̬
        System.out.println("change status...");
    }

}
