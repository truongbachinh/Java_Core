package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.DelayQueue;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayItem implements Delayed{
    private long id;
    private String name;
    private LocalDateTime activationDateTime;

    public DelayItem() {

    }

    public DelayItem(long id, String name, LocalDateTime activationDateTime) {
        this.id = id;
        this.name = name;
        this.activationDateTime = activationDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getActivationDateTime() {
        return activationDateTime;
    }

    public void setActivationDateTime(LocalDateTime activationDateTime) {
        this.activationDateTime = activationDateTime;
    }

    @Override
    public int compareTo(Delayed o) {
        long result = this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        if(result < 0)
        {
            return  -1;
        }
        else if(result > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        LocalDateTime now = LocalDateTime.now();
        long diff = now.until(activationDateTime, ChronoUnit.MILLIS);
        return unit.convert(diff,TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "DelayEvent [id = " + id + ", name = " + name + ", activationDateTime=" + activationDateTime + "]";
    }

}
