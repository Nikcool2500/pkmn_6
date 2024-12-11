package chirkans.pkmn.repositories;

import chirkans.pkmn.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
    Optional<StudentEntity> findByFirstNameAndSurNameAndFamilyName(String firstName, String surName, String familyName);

    List<StudentEntity> findByGroup(String group);
}
