package HmrsHomework.Hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, boolean success, String message) {
        super(null, false, message);
    }

    public  ErrorDataResult(String message){ super(null,false,message);}

    public ErrorDataResult(T data){ super(null,false);}
}
