package com.Alephys.Expense_Tracker.Controller;

import com.Alephys.Expense_Tracker.Model.*;
import com.Alephys.Expense_Tracker.Service.ExpenseService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/transaction")
    public String addTransaction(@RequestBody TransactionDTO dto) {
        expenseService.addTransaction(dto);
        return "Transaction added successfully!";
    }

    @GetMapping("/monthly-summary")
    public List<Transaction> getMonthlySummary(@RequestParam int month, @RequestParam int year) {
        return expenseService.getMonthlySummary(month, year);
    }

    @GetMapping("/all")
    public List<Transaction> getAllTransactions() {
        return expenseService.getAll();

    }
}
