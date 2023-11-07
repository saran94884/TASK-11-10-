public class Tea {
 

    public void prepareTea() {
        if (!prepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            prepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }
}

public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        if (!prepared) {
            System.out.println("Preparing black tea with hot water and black tea leaves.");
            prepared = true;
            
        } else {
            System.out.println("Black tea is already prepared.");
        }
    }
}

public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        if (!prepared) {
            System.out.println("Preparing green tea with hot water and green tea leaves.");
            prepared = true;
           
        } else {
            System.out.println("Green tea is already prepared.");
        }
    }
}

public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        if (!prepared) {
            System.out.println("Preparing herbal tea with hot water and herbal tea ingredients.");
            prepared = true;
            
        } else {
            System.out.println("Herbal tea is already prepared.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tea basicTea = new Tea();
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        basicTea.prepareTea();
        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();
    }
}
