package com.formento.bank.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {

    private final BigDecimal amount;
    private final LocalDate invoiceExpirationDate;

    public Invoice(BigDecimal amount, LocalDate invoiceExpirationDate) {
        this.amount = amount;
        this.invoiceExpirationDate = invoiceExpirationDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getInvoiceExpirationDate() {
        return invoiceExpirationDate;
    }

}
