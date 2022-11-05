package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ContactServicesImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    //    ContactRepository contactRepository
    // public ContactServicesImpl(ContactRepository contactRepository) {
    // this.contactRepository = contactRepository;
    // }


    @Override
    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contactRepository.save(contact);
    }

    @Override
    public Contact findById(String id) {
        Optional<Contact> found = contactRepository.findById(id);
        if (found.isEmpty())
            return found.get();
        return found.get();
    }

    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        return contactRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Contact update(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);

    }

    @Override
    public List<Contact> findName(String name) {
        List<Contact> result = new ArrayList<>();
        result.addAll(contactRepository.findByFirstName(name));
        result.addAll(contactRepository.findByLastName(name));
        return result;

    }
}