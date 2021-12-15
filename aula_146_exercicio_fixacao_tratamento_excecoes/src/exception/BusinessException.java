package exception;

public class BusinessException extends RuntimeException {
	public static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}

}
