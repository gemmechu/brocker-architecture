/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecturalpatern.models;

/**
 *
 * @author gemme
 */
public class Message {
    String body;
    String header;

    public Message(String body, String header) {
        this.body = body;
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public String getHeader() {
        return header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    
}
