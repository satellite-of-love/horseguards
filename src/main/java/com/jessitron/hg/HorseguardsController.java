package com.jessitron.hg;


import java.io.IOException;


class HorseguardsController {

    public String storingResponse() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
    try {
        response = [object Object];
    } finally {
        if (response != null) { response.close(); }
    }
    

        return "App running: Served from " + getClass().getName() +
                " got " + response.statusCode();
    }

    public String storingResponseCorrectly() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
        try {
            response = client.get("https://bananas.com")
                    .execute();
        } finally {
            if (response != null) {
                response.close();
            }
        }

        return "App running: Served from " + getClass().getName() +
                " got " + response.statusCode();
    }

    public String storingStatusCode() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
    try {
        response = [object Object];
    } finally {
        if (response != null) { response.close(); }
    }
    int statusCode = response.statusCode();

        return "App running: Served from " + getClass().getName() +
                " got " + statusCode;
    }

    public String storingStatusCodeCorrectly() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
        try {
            response = client.get("https://bananas.com")
                    .execute();
        } finally {
            if (response != null) {
                response.close();
            }
        }

        int statusCode = response.statusCode();

        return "App running: Served from " + getClass().getName() +
                " got " + statusCode;

    }

}
