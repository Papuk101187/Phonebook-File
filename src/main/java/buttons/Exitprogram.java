package buttons;

import menu.MenuAction;
import service.*;

import java.io.IOException;


public class Exitprogram implements MenuAction {
    InMemoryContactsServiceFile InMemoryContactsServiceFile;

    public Exitprogram(InMemoryContactsServiceFile inMemoryContactsService) {
        this.InMemoryContactsServiceFile = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {


    }

    @Override
    public String getName() {
        return "Выйти из програмы";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }






}
