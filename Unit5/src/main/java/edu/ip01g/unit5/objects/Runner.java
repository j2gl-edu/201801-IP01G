package edu.ip01g.unit5.objects;

public class Runner {

    private String name;
    private String event;

    public Runner(final String name, final String event) {
        this.name = name;
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(final String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}
