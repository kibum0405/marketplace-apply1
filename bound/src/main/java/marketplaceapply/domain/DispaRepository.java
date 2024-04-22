package marketplaceapply.domain;

import marketplaceapply.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "dispas", path = "dispas")
public interface DispaRepository
    extends PagingAndSortingRepository<Dispa, Long> {}
