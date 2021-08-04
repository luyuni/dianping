package top.luyuni.dianping.common;

public class BussinessException extends Exception{
    private CommonError commonError;

    public BussinessException(EmBusinessError emBusinessError) {
        super();
        this.commonError = new CommonError(emBusinessError);
    }

    public CommonError getCommonError() {
        return commonError;
    }
}
