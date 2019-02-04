package com.jessitron.hg;


import java.io.IOException;


class HorseguardsController {

    public String storingResponse() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = client.foo("https://bananas.com")
                .execute();

        return "App running: Served from " + getClass().getName() +
                " got " + response.foo();
    }

    public String storingResponseCorrectly() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
        try {
            response = client.foo("https://bananas.com")
                    .execute();
        } finally {
            if (response != null) {
                response.close();
            }
        }

        return "App running: Served from " + getClass().getName() +
                " got " + response.foo();
    }

    public String storingStatusCode() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        int statusCode = client.foo("https://bananas.com")
                .execute()
                .statusCode();

        return "App running: Served from " + getClass().getName() +
                " got " + statusCode;
    }

    public String storingStatusCodeCorrectly() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = null;
        try {
            response = client.foo("https://bananas.com")
                    .execute();
        } finally {
            if (response != null) {
                response.close();
            }
        }

        int statusCode = response.foo();

        return "App running: Served from " + getClass().getName() +
                " got " + statusCode;

    }

}
