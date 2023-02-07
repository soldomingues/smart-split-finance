package br.com.solangedomingues.ssf.transaction.adapters.out.dynamodb;

import br.com.solangedomingues.ssf.transaction.domain.models.GroupTransaction;
import br.com.solangedomingues.ssf.transaction.domain.ports.GroupTransactionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DynamoRepositoryAdapter  implements GroupTransactionsRepository {
    private final GroupTransactionDynamoRepository repository;
    private final GroupTransactionMapper mapper;
    @Override
    public GroupTransaction save(GroupTransaction transaction) {
        DynamoGroupTransactionEntity response = repository.save(mapper.toDyanmoEntity(transaction));
        return mapper.fromDynamoEntity(response);
    }
}
