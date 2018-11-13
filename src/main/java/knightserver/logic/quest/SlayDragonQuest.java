package knightserver.logic.quest;

import org.springframework.stereotype.Component;

@Component
public class SlayDragonQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("Start slay dragon quest");
        System.out.println("Dragon was killed");
    }
}
