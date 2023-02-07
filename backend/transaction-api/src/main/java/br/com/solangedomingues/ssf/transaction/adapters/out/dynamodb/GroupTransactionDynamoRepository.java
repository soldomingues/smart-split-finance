package br.com.solangedomingues.ssf.transaction.adapters.out.dynamodb;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface GroupTransactionDynamoRepository extends
        CrudRepository<DynamoGroupTransactionEntity, String> {
}
