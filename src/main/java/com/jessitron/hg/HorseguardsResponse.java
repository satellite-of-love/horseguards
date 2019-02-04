package com.jessitron.hg;

public class HorseguardsResponse {

    private final int statusCode;

    public HorseguardsResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public int statusCode() {
        return statusCode;
    }

    public void close() {
        // good job
    }
}
// la la la
// la la la
