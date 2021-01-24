package service;

import сontacts.Contact;

import java.io.IOException;
import java.util.List;

public interface ContactsServiceFile {

    List<Contact> getAll();
    void remove(Contact contact) throws IOException;
    void add(Contact contact) throws IOException;
    List<Contact> getContactsWhereNameStartsWith(String startOfName);
    List<Contact> getPartsPhone(String startOfName);
    boolean check(Contact contact);

}
