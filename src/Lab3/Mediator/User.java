package Lab3.Mediator;

public abstract class User
{
    private Chat mediator;

    private String id;
    private String name;

    public User(Chat room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public Chat getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
