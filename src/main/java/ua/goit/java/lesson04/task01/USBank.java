package ua.goit.java.lesson04.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class USBank extends Bank {

    public USBank(
            final long id, final String bankCountry, final Currency currency,
            final int numberOfEmployees, final double avrSalaryOfEmployee,
            final long rating, final long totalCapital) {
        super(
                id, bankCountry, currency, numberOfEmployees,
                avrSalaryOfEmployee, rating, totalCapital
        );
    }

    @Override
    public int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        return 0;
    }

    @Override
    public int getCommission(final int summ) {
        return 0;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
