/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package org.ksd.server.job;

public class Job {
    private int id;
    private String hax;
    private String cronExpress;
    private long nextTigerTime;

    public long getNextTigerTime() {
        return nextTigerTime;
    }

    public void setNextTigerTime(long nextTigerTime) {
        this.nextTigerTime = nextTigerTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHax() {
        return hax;
    }

    public void setHax(String hax) {
        this.hax = hax;
    }

    public String getCronExpress() {
        return cronExpress;
    }

    public void setCronExpress(String cronExpress) {
        this.cronExpress = cronExpress;
    }

}
