package com.Alephys.Expense_Tracker.Service;

import com.Alephys.Expense_Tracker.Model.Transaction;
import com.Alephys.Expense_Tracker.Model.TransactionDTO;
import com.Alephys.Expense_Tracker.Model.TransactionType;
import com.Alephys.Expense_Tracker.Repository.IExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private IExpenseRepo expenseRepo;

    public void addTransaction(TransactionDTO dto) {
        Transaction transaction = new Transaction();

        transaction.setTransactionType(dto.getTransactionType());
        transaction.setAmount(dto.getAmount());
        transaction.setDate(dto.getDate());

        // Validate and assign category
        if (dto.getTransactionType() == TransactionType.INCOME) {
            if (dto.getIncomeCategory() == null) {
                throw new IllegalArgumentException("Income category is required for INCOME type.");
            }
            transaction.setIncomeCategory(dto.getIncomeCategory());
        } else if (dto.getTransactionType() == TransactionType.EXPENSE) {
            if (dto.getExpenseCategory() == null) {
                throw new IllegalArgumentException("Expense category is required for EXPENSE type.");
            }
            transaction.setExpenseCategory(dto.getExpenseCategory());
        }
        expenseRepo.save(transaction);

    }

    public List<Transaction> getAll() {
        return expenseRepo.findAll();

    }

    public List<Transaction> getMonthlySummary(int month, int year) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate start = yearMonth.atDay(1);
        LocalDate end = yearMonth.atEndOfMonth();
        return expenseRepo.findByDateBetween(start, end);
    }
}
