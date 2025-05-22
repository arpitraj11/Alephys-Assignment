package com.Alephys.Expense_Tracker.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private IncomeCategory incomeCategory;

    @Enumerated(EnumType.STRING)
    private ExpenseCategory expenseCategory;

    private double amount;
    private LocalDate date;

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public void setIncomeCategory(IncomeCategory incomeCategory) {
        this.incomeCategory = incomeCategory;
    }
    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setDate(LocalDate date) {
        this.date= date;
    }

}
