package hello.advanced.trace;

import java.util.UUID;

/**
 * 트랜잭션ID와 깊이를 표현하는 level을 묶어 TraceId를 만든다.
 */
public class TraceId {

    private String id;
    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }

    /** 트랜잭션 아이디를 만들어 반환한다. */
    private String createId() {
        // 생성된 아이디의 앞 8자리만 사용
        return UUID.randomUUID().toString().substring(0, 8);
    }

    /** 메소드 호출의 깊이 표현을 위해 이전 TraceId의 레벨을 증가해 다음 TraceId를 반환한다. */
    public TraceId createNextId() {
        return new TraceId(id, level + 1);
    }

    /** 메소드 호출의 깊이 표현을 위해 이전 TraceId의 레벨을 감소해 이전 TraceId를 반환한다. */
    public TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

}
