package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "주문처리", path = "주문처리")
public interface 주문처리Repository
    extends PagingAndSortingRepository<주문처리, Long> {}
