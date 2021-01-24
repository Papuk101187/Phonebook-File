package menu;

import service.InMemoryContactsServiceFile;
import buttons.*;

import java.io.IOException;

public class Menu {

    public static void main(String[] args) throws IOException {

       InMemoryContactsServiceFile contactsService = new InMemoryContactsServiceFile();
       MenuPanel menuPanel = new MenuPanel(
       new AddContactMenuAction(contactsService),
       new ReadAllContactsMenuAction(contactsService),
        new RemoveContactMenuAction(contactsService),
        new Exitprogram(contactsService),
         new SearchbypartnumberMenuAction(contactsService),
        new SearchbeginningnameMenuAction(contactsService));
        menuPanel.starting();

    }

}
