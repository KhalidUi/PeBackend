package contactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import contactmanager.model.User;

public interface ContactRepository extends JpaRepository<User, Integer> {

}
