package knightserver.web;

import knightserver.logic.knight.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KnightController {

    @Autowired
    private Knight knight;

    @RequestMapping("/quest")
    public String startQuest() {
        knight.embarkOnQuest();
        return "Quest successfully completed";
    }
}
