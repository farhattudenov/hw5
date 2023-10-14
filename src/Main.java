public class Main {
    public static void main(String[] args) {
        class Hero {
            private int health;
            private int damage;
            private String superpower;

            public Hero(int health, int damage, String superpower) {
                this.health = health;
                this.damage = damage;
                this.superpower = superpower;
            }

            public Hero(int health, int damage) {
                this(health, damage, "No superpower");
            }

            public int getHealth() {
                return health;
            }

            public int getDamage() {
                return damage;
            }

            public String getSuperpower() {
                return superpower;
            }
        }

        class Boss {
            private int health;
            private int damage;
            private String defenseType;

            public int getHealth() {
                return health;
            }

            public void setHealth(int health) {
                this.health = health;
            }

            public int getDamage() {
                return damage;
            }

            public void setDamage(int damage) {
                this.damage = damage;
            }

            public String getDefenseType() {
                return defenseType;
            }

            public void setDefenseType(String defenseType) {
                this.defenseType = defenseType;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Boss boss = new Boss();
                boss.setHealth(600);
                boss.setDamage(50);
                boss.setDefenseType("Physical");

                System.out.println("Boss Info:");
                System.out.println("Health: " + boss.getHealth());
                System.out.println("Damage: " + boss.getDamage());
                System.out.println("Defense Type: " + boss.getDefenseType());

                Hero[] heroes = createHeroes();
                System.out.println("\nHeroes Info:");
                for (Hero hero : heroes) {
                    System.out.println("Hero Health: " + hero.getHealth());
                    System.out.println("Hero Damage: " + hero.getDamage());
                    System.out.println("Hero Superpower: " + hero.getSuperpower() + "\n");
                }
            }

            public static Hero[] createHeroes() {
                Hero[] heroes = new Hero[3];
                heroes[0] = new Hero(250, 20, "Flying");
                heroes[1] = new Hero(260, 15);
                heroes[2] = new Hero(270, 10, "Invisibility");
                return heroes;
    }
 }