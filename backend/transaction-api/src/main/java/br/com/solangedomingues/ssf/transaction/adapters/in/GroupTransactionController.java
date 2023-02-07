package br.com.solangedomingues.ssf.transaction.adapters.in;

import br.com.solangedomingues.ssf.transaction.domain.GroupTransactionService;
import br.com.solangedomingues.ssf.transaction.domain.models.GroupTransaction;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;

import java.util.function.Function;

@Slf4j
@Controller
@RequiredArgsConstructor
public class GroupTransactionController {
    private final GroupTransactionService service;

    @Bean
    public Function<Message<GroupTransaction>, Message<GroupTransaction>> addTransaction() {
        return request -> {
            log.info("Request: {}", request);

            return MessageBuilder
                    .withPayload(service.addTransaction(request.getPayload()))
                    .setHeader("statusCode", HttpStatus.OK.value())
                    .build();
        };
    }
}
