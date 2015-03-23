package net.ttddyy.dsproxy;

import java.lang.reflect.Method;

/**
 * @author Tadaya Tsuyukubo
 * @since 1.3
 */
public class ExecutionInfoBuilder {
    private String dataSourceName;
    private Method method;
    private Object[] methodArgs;
    private Object result;
    private long elapsedTime;
    private Throwable throwable;
    private StatementType statementType;

    public ExecutionInfoBuilder dataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    public ExecutionInfoBuilder method(Method method) {
        this.method = method;
        return this;
    }

    public ExecutionInfoBuilder methodArgs(Object[] methodArgs) {
        this.methodArgs = methodArgs;
        return this;
    }

    public ExecutionInfoBuilder result(Object result) {
        this.result = result;
        return this;
    }

    public ExecutionInfoBuilder elapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    public ExecutionInfoBuilder throwable(Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public ExecutionInfoBuilder statementType(StatementType statementType) {
        this.statementType = statementType;
        return this;
    }


    public ExecutionInfo build() {
        ExecutionInfo executionInfo = new ExecutionInfo();
        executionInfo.setDataSourceName(dataSourceName);
        executionInfo.setMethod(method);
        executionInfo.setMethodArgs(methodArgs);
        executionInfo.setResult(result);
        executionInfo.setElapsedTime(elapsedTime);
        executionInfo.setThrowable(throwable);
        executionInfo.setStatementType(statementType);
        return executionInfo;
    }
}