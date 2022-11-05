package africa.semicolon.truecaller.data.repositories;

import africa.semicolon.truecaller.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ContactRepository extends MongoRepository<Contact, String> {
    List<Contact> findByFirstName(String firstName);

    List<Contact> findByLastName(String lastName);

    Contact findByPhoneNumber(String PhoneNumber);

}


