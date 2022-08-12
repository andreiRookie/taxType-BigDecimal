package taxtypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTaxType extends TaxType {
    int taxRate1 = 10;
    int taxRate2 = 15;
    int incomeLimit = 100_000;
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal result = ((amount.compareTo(BigDecimal.valueOf(incomeLimit)) == -1)
                ? amount.multiply(BigDecimal.valueOf(taxRate1)).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)
                : amount.multiply(BigDecimal.valueOf(taxRate2)).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP));
                return result;

    }
}
