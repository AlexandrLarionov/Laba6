package Collection;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Random;
import Exception.IcorrectFieldException;

public class Ticket implements Serializable {

    private Integer id;
    private String  name;
    public Coordinates coordinates;
    public Event event;
    private double price ;
    public TicketType type;
    private LocalDateTime creationDate;
    private static final long serialVersionUID = 18L;

    public Ticket(Integer id, String name, Coordinates coordinates, Event e, double price, String t, LocalDateTime creationDate) {//, , TicketType t
        this.id = id;
        if (id == null) this.id = new Random().nextInt();

        if ((name != null) && (name.length() != 0)) {
            this.name = name;
        } else {
            throw new IcorrectFieldException("Incorrect input name");
        }

        if (coordinates != null) {
            this.coordinates = coordinates;
        } else {
            throw new IcorrectFieldException("Incorrect input coordinates");
        }

        this.creationDate = creationDate;
        if (creationDate == null) this.creationDate = LocalDateTime.now();

        if (price > 0) {
            this.price = price;
        } else {
            throw new IcorrectFieldException("Incorrect input price (need to be >0)");
        }

        switch (t){
            case "BUDGETARY":
                this.type = TicketType.BUDGETARY;
                break;
            case "CHEAP":
                this.type = TicketType.CHEAP;
                break;
            case "USUAL":
                this.type = TicketType.USUAL;
                break;
            case "VIP":
                this.type = TicketType.VIP;
                break;
            default: throw new IcorrectFieldException("Incorrect input TicketType");
        }

        if (event != null) {
            this.event = e;
        } else {
            throw new IcorrectFieldException("Incorrect input event");
        }

    }


    public Integer getId() {
        return id;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public java.time.LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Coordinates getCoords() {
        coordinates.getX();
        coordinates.getY();
        return coordinates;
    }

    public Event getEvent(){
        event.getEventType();
        event.getIdTicket();
        event.getMinAge();
        event.getNameTicket();
        event.getTicketsCount();
        return event;
    }

    @Override
    public String toString() {
        return "["+id+" " +name+" " + " "+coordinates.getX()+" "+ coordinates.getY()+" " + " " +event.getIdTicket() + " " + event.getNameTicket() + " " + event.getMinAge()+ " " + event.getTicketsCount() + " " + event.getEventType() + " " + price + " "+ type + "]";
    }
}
