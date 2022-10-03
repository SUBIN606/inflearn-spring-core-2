package hello.advanced.trace;

/** 로그 시작할 때 상태정보를 저장하는 용도 */
public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs;   // 로그 시작 시간
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

}
