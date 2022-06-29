package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "cancellations",
    path = "cancellations"
)
public interface CancellationRepository
    extends PagingAndSortingRepository<Cancellation, String> {}
