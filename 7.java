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
            // Adjust brewing time and other specifics for black tea.
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
            // Adjust brewing time and other specifics for green tea.
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
            // Adjust brewing time and other specifics for herbal tea.
        } else {
            System.out.println("Herbal tea is already prepared.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tea[] teas = new Tea[4];
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        for (Tea tea : teas) {
            tea.prepareTea(); // Polymorphic call to prepareTea
        }
    }
}
