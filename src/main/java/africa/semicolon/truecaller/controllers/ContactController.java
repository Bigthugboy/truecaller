package africa.semicolon.truecaller.controllers;


import africa.semicolon.truecaller.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public String addContact(@RequestBody RequestDto requestDto) {
        contactService.addContact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getPhoneNumber());
        return "Added Successfully";
    }

    @GetMapping("/contact/{firstName}")
    public String findByFirstName(@PathVariable String firstName) {
        return contactService.findName(firstName).toString();
    }
}
