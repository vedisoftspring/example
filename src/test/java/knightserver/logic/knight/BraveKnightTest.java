package knightserver.logic.knight;

import knightserver.logic.quest.Quest;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BraveKnightTest {

    @Test
    public void embarkOnQuest() {
        Quest mockQuest = mock(Quest.class); // Создание фиктивного
        // объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest); // Внедрение
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}