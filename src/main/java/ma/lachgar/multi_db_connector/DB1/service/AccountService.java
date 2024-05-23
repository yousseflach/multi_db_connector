package ma.lachgar.multi_db_connector.DB1.service;

import lombok.AllArgsConstructor;
import ma.lachgar.multi_db_connector.DB1.entity.Account;
import ma.lachgar.multi_db_connector.DB1.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public Account updateAccount(Long id, Account account) {
        Account existingAccount = accountRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            existingAccount.setName(account.getName());
            existingAccount.setJobTitle(account.getJobTitle());
            return accountRepository.save(existingAccount);
        }
        return null;
    }
}
