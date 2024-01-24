package com.datregu.app.rest.Repository;

import com.datregu.app.rest.Model.Entry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository <Entry, Long> {

}
