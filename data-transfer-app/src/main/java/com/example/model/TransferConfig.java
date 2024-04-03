package com.example.model;

import lombok.*;

public class TransferConfig {

    private String sourceUrl;
    private String getDestinationUrl;
    private int interval;

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getGetDestinationUrl() {
        return getDestinationUrl;
    }

    public void setGetDestinationUrl(String getDestinationUrl) {
        this.getDestinationUrl = getDestinationUrl;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }


}
