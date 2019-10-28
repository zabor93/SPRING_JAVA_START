package springmvcdispatch.component;

import org.springframework.stereotype.Component;
import springmvcdispatch.model.Participant;
import java.util.LinkedList;
import java.util.List;

@Component
public class EventHolder {
    private List<Participant> listParticipant;

    public EventHolder() {
        this.listParticipant = new LinkedList<>();
    }

    public void addParticipant(Participant participant) {
        listParticipant.add(participant);
    }

    public List<Participant> getListParticipant() {
       return listParticipant;
    }

    public boolean checkRegistration(Participant participant) {
        return listParticipant.contains(participant);
    }
}
