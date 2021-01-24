package buttons;

import сontacts.ContactParser;
import menu.MenuAction;
import service.*;

public class ReadAllContactsMenuAction implements MenuAction {
    ContactParser contactParser = new ContactParser();

    InMemoryContactsServiceFile InMemoryContactsServiceFile;

    public ReadAllContactsMenuAction(InMemoryContactsServiceFile inMemoryContactsService) {
        this.InMemoryContactsServiceFile = inMemoryContactsService;
    }

    @Override
    public void doAction() {

        for (Object contacts : InMemoryContactsServiceFile.getAll()) {
            System.out.println(contacts);
        }
    }

    @Override
    public String getName() {
        return "Показать список телефонных номеров";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
