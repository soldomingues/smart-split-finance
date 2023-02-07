package br.com.solangedomingues.ssf.transaction.adapters.out.dynamodb;

import br.com.solangedomingues.ssf.transaction.domain.models.GroupTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupTransactionMapper {
    DynamoGroupTransactionEntity toDyanmoEntity(GroupTransaction source);
    GroupTransaction fromDynamoEntity(DynamoGroupTransactionEntity destination);
}
