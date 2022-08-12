package taxtypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IncomeTaxType extends TaxType {
    int taxRate = 13;
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal result = amount.multiply(BigDecimal.valueOf(taxRate)).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        return result;
    }


}
