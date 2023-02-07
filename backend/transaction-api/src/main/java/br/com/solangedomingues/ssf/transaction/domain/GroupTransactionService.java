package br.com.solangedomingues.ssf.transaction.domain;

import br.com.solangedomingues.ssf.transaction.domain.models.GroupTransaction;
import br.com.solangedomingues.ssf.transaction.domain.ports.GroupTransactionsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class GroupTransactionService {
    private final GroupTransactionsRepository repository;
    public GroupTransaction addTransaction(GroupTransaction transaction) {
        transaction.setTransactionId(UUID.randomUUID().toString());
        repository.save(transaction);
        log.info("Sucessfuly added transaction: {}", transaction);
        return transaction;
    }
}
