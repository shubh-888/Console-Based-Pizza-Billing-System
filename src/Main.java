import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      🍕 WELCOME TO SHUBHAM PIZZA 🍕      ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.println("\n📋 MENU");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("🥬 1. Veg Pizza              ₹300");
        System.out.println("🍗 2. Non-Veg Pizza          ₹400");
        System.out.println("🌟 3. Deluxe Veg Pizza       ₹450");
        System.out.println("🌟 4. Deluxe Non-Veg Pizza   ₹550");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.print("\n👉 Select your pizza (1-4): ");

        int choice = sc.nextInt();
        Pizza pizza;
        switch(choice){
            case 1:
                pizza = new Pizza(true);
                System.out.println("\n✅ Veg Pizza Selected!");
                break;
            case 2:
                pizza = new Pizza(false);
                System.out.println("\n✅ Non-Veg Pizza Selected!");
                break;

            case 3:
                pizza = new DeluxePizza(true);
                System.out.println("\n🌟 Deluxe Veg Pizza Selected!");
                break;

            case 4:
                pizza = new DeluxePizza(false);
                System.out.println("\n🌟 Deluxe Non-Veg Pizza Selected!");
                break;

            default:
                System.out.println("❌ Invalid Choice!");
                sc.close();
                return;
        }
        if(!(pizza instanceof DeluxePizza)) {
            System.out.println("\n🛒 CUSTOMIZE YOUR PIZZA");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.print("🧀 Add Extra Cheese (+₹100)? (Y/N): ");
            if (sc.next().equalsIgnoreCase("Y")) {
                pizza.addExtraCheese();
            }

            System.out.print("🍄 Add Extra Topping (+₹50)? (Y/N): ");
            if (sc.next().equalsIgnoreCase("Y")) {
                pizza.addExtraTopping();
            }
        } else {

                System.out.println("\n🎁 Deluxe Pizza Benefits");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("🧀 Extra Cheese Included");
                System.out.println("🍄 Extra Topping Included");
            }
            System.out.print("\n📦 Add Takeaway Packaging (+₹25)? (Y/N): ");
            if (sc.next().equalsIgnoreCase("Y")) {
                pizza.takeaway();
            }
            System.out.println("\n🔄 Preparing Your Pizza...");
            System.out.println("🔥 Baking...");
            System.out.println("🧑‍🍳 Adding Fresh Toppings...");
            System.out.println("🍕 Pizza Ready!");

            pizza.getBill();


            sc.close();
        }

    }
