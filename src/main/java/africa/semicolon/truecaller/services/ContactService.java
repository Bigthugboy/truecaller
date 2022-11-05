package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public interface ContactService {

    void addContact(String firstName, String lastName, String phoneNumber);

    Contact findById(String id);


    Contact findByPhoneNumber(String phoneNumber);

    Contact update(Contact contact);

    void deleteContact(Contact contact);


    List<Contact> findName(String name);
}
