package boot.study.constants;

/**
 * @author xutong
 */
public enum Token {
    SUCCESS,
    FAILED;

    public boolean isSuccess() {
        return this.equals(SUCCESS);
    }

    public boolean isFailed() {
        return this.equals(FAILED);
    }
}

