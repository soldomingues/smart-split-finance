package br.com.solangedomingues.ssf.transaction.domain.ports;

import br.com.solangedomingues.ssf.transaction.domain.models.GroupTransaction;

public interface GroupTransactionsRepository {
    GroupTransaction save(GroupTransaction transaction);
}
