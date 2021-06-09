package Collection;
import java.io.Serializable;
import java.util.Random;

/**
 * Класс для храниения информации о событии
 */
public class Event {
    private int id;
    private String name;
    private int minAge;
    private long ticketsCount;
    private EventType eventType;
    private static final long serialVersionUID = 18L;

    public Event(Integer id, String name, int minAge, long ticketsCount, EventType s){
        this.id = id;
        if (id == null) this.id = new Random().nextInt();


        if ((name != null) && (name.length() != 0)) {
            this.name = name;
        } else {
            throw new NumberFormatException();
        }

        this.minAge = minAge;

        if (ticketsCount > 0) {
            this.ticketsCount = ticketsCount;
        } else {
            throw new NumberFormatException();
        }


        this.eventType = s;
    }

    public Integer getIdTicket(){return id;}
    public String getNameTicket(){return name;}
    public Integer getMinAge(){return minAge;}
    public Long getTicketsCount(){return ticketsCount;}

    public EventType getEventType() {
        return eventType;
    }
    public void setIdEvent(Integer id){
        this.id = id;
    }
}
