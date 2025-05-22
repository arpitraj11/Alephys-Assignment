package com.Alephys.Expense_Tracker.Repository;

import com.Alephys.Expense_Tracker.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IExpenseRepo extends JpaRepository<Transaction, Long> {

    List<Transaction> findByDateBetween(LocalDate start, LocalDate end);

}
