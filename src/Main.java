import taxtypes.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        TaxType[] taxTypes = new TaxType[] {
                new IncomeTaxType(),
                new ProgressiveTaxType(),
                new VATaxType(),
        };

        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("1234235567899"), taxTypes[0], taxService),
                new Bill(new BigDecimal(92_979), taxTypes[1], taxService),
                new Bill(new BigDecimal(100_000), taxTypes[1], taxService),
                new Bill(new BigDecimal(23_500_000), taxTypes[2], taxService)
                // TODO создать платежи с различным типами налогообложения
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
