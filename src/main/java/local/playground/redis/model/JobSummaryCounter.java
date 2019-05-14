package local.playground.redis.model;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDate;

@RedisHash
public class JobSummaryCounter implements Serializable {

    private LocalDate id;

    private int totalCount;

    private int failedCount;

    private int completedCount;

    public JobSummaryCounter(LocalDate id) {
        this.id = id;
        totalCount = failedCount = completedCount = 0;
    }

    public LocalDate getId() {
        return id;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void incrementTotalCount(int value) {
        totalCount += value;
    }

    public int getFailedCount() {
        return failedCount;
    }

    public void incrementFailedCount(int value) {
        failedCount += value;
    }

    public int getCompletedCount() {
        return completedCount;
    }

    public void incrementCompletedCount(int value) {
        completedCount += value;
    }
}