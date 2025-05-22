package com.Alephys.Expense_Tracker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
    private TransactionType transactionType;
    private IncomeCategory incomeCategory;
    private ExpenseCategory expenseCategory;
    private double amount;
    private LocalDate date;

    public TransactionType getTransactionType() {
        return transactionType;
    }
    public IncomeCategory getIncomeCategory(){
        return incomeCategory;
    }
    public ExpenseCategory getExpenseCategory(){
        return expenseCategory;
    }
    public double getAmount(){
        return amount;
    }
    public LocalDate getDate(){
        return date;
    }


}
