package org.buloichyk.springrestapp1.repositories;


import org.buloichyk.springrestapp1.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
