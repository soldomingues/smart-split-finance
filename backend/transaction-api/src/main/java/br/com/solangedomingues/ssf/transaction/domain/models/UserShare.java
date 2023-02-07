package br.com.solangedomingues.ssf.transaction.domain.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserShare {
    private String userId;
    private BigDecimal owedShare;
    private BigDecimal paidShare;

}
