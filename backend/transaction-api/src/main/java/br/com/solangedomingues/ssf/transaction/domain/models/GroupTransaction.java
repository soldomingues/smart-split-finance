package br.com.solangedomingues.ssf.transaction.domain.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class GroupTransaction {
    private String groupId;
    private String transactionId;
    private String description;
    private BigDecimal totalAmount;
    private String category;
    private List<UserShare> shares;
}
