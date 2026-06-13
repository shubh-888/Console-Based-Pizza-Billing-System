public class Pizza {

    private int price;
    private boolean veg;

    private final int extraCheese = 100;
    private final int extraTopping = 50;
    private final int takeaway = 25;

    private int basePizzaPrice;

    private boolean isExtraCheese = false;
    private boolean isExtraTopping = false;
    private boolean isTakeAway = false;

    public Pizza(boolean veg) {

        this.veg = veg;

        if (veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        this.basePizzaPrice = this.price;
    }

    public void addExtraCheese() {

        if (!isExtraCheese) {
            isExtraCheese = true;
            this.price += extraCheese;
        }
    }

    public void addExtraTopping() {

        if (!isExtraTopping) {
            isExtraTopping = true;
            this.price += extraTopping;
        }
    }

    public void takeaway() {

        if (!isTakeAway) {
            isTakeAway = true;
            this.price += takeaway;
        }
    }

    public void getBill() {

        StringBuilder bill = new StringBuilder();

        bill.append("\n");
        bill.append("╔══════════════════════════════════════╗\n");
        bill.append("║          🍕 PIZZA INVOICE 🍕         ║\n");
        bill.append("╚══════════════════════════════════════╝\n\n");

        bill.append(String.format("🍕 %-25s ₹%d%n",
                veg ? "Veg Pizza 🥬" : "Non-Veg Pizza 🍗",
                basePizzaPrice));

        if (isExtraCheese) {
            bill.append(String.format("🧀 %-25s ₹%d%n",
                    "Extra Cheese",
                    extraCheese));
        }

        if (isExtraTopping) {
            bill.append(String.format("🍄 %-25s ₹%d%n",
                    "Extra Topping",
                    extraTopping));
        }

        if (isTakeAway) {
            bill.append(String.format("📦 %-25s ₹%d%n",
                    "Takeaway Packaging",
                    takeaway));
        }

        bill.append("──────────────────────────────────────\n");

        bill.append(String.format("💰 %-25s ₹%d%n",
                "TOTAL BILL",
                price));

        bill.append("──────────────────────────────────────\n");
        bill.append("🔥 Freshly Baked With Love ❤️\n");
        bill.append("🙏 Thank You For Visiting!\n");
        bill.append("🍕 Visit Again Soon!\n");

        System.out.println(bill);
    }
}