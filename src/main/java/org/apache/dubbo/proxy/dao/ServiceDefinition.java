package org.apache.dubbo.proxy.dao;


public class ServiceDefinition {

    private String application;// app
    private String serviceID; // 服务id
    private String methodName; // 方法名
    private Object[] paramValues; // 参数值
    private String[] paramTypes; // 参数类型

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParamValues() {
        return paramValues;
    }

    public void setParamValues(Object[] paramValues) {
        this.paramValues = paramValues;
    }

    public String[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(String[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
