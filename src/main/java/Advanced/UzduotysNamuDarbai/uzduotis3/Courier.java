package Advanced.UzduotysNamuDarbai.uzduotis3;

import java.time.LocalDate;

public abstract class Courier {

    private String name;
    private String deliveredFrom;
    private LocalDate deliveryDate;

    public Courier(String name, String deliveredFrom, LocalDate deliveryDate) {
        this.name = name;
        this.deliveredFrom = deliveredFrom;
        this.deliveryDate = deliveryDate;
    }
}
