package br.com.suafeira.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.suafeira.to.Fair;

public interface FairRepository extends JpaRepository<Fair, Integer> {

	Optional<Fair> findById(Integer id);
	
	List<Fair> findBySiteNameIsContaining(String siteName);	
	
	List<Fair> findByAddressIsContaining(String address);

}
