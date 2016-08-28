package org.skyding.microservice.part2.endpoint;

/**
 * Created by wid on 2016/8/28.
 */
public class ViewCount {

    private ViewCount() {
    }

    private static ViewCount viewCount = new ViewCount();

    public static ViewCount newInstance() {
        return viewCount;
    }

    public static void addCount() {
        viewCount.count++;
    }


    private long count;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
