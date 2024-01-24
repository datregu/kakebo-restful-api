package com.datregu.app.rest.Controller;

import com.datregu.app.rest.Model.Entry;
import com.datregu.app.rest.Repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KakeboController {
    @Autowired
    private EntryRepository entryRepository;

    @GetMapping(value = "/")
    public String holaMundo() {
        return "Hola mundo!!!!";
    }

    @GetMapping(value = "/entries")
    public List<Entry> getEntries() {
        return entryRepository.findAll();
    }

    @PostMapping(value = "/saveentry")
    public String saveEntry(@RequestBody Entry entry) {
        entryRepository.save(entry);
        return "Entry saved";
    }

    @PutMapping(value = "/update/{id}")
    public String updateEntry(@PathVariable long id, @RequestBody Entry entry) {
        Entry updatedEntry = entryRepository.findById(id).get();
        updatedEntry.setDate(entry.getDate());
        updatedEntry.setConcept(entry.getConcept());
        updatedEntry.setCategory(entry.getCategory());
        updatedEntry.setAmount(entry.getAmount());
        entryRepository.save(updatedEntry);
        return "Updated Entry";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteEntry(@PathVariable long id) {
        Entry deletedEntry = entryRepository.findById(id).get();
        entryRepository.delete(deletedEntry);
        return "Deleted Entry";
    }
}