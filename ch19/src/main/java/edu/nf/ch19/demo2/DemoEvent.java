package edu.nf.ch19.demo2;

/**
 * @author LZ
 * @date 2020/12/9
 */
public class DemoEvent {
    private String message;

    public DemoEvent(String message) {
        this.message = message;
    }

    public DemoEvent() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
