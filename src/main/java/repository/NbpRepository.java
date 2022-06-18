package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.Root;

public interface NbpRepository extends JpaRepository<Root,Integer> {
}
