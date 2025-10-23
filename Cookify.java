import java.util.Scanner;
class RecipeBase {
    String name;
    String[] ingredients;
    String[] steps;
    String youtubeLink;
    RecipeBase(String name, String[] ingredients, String[] steps, String youtubeLink) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.youtubeLink = youtubeLink;
    }
    void displayRecipe(int people) {
        System.out.println("\n🍽 Recipe: " + name);
        System.out.println("Ingredients (for " + people + " people):");
        for (String ingredient : ingredients) {
            System.out.println("- " + scaleIngredient(ingredient, people));
        }
        System.out.println("\nSteps:");
        for (int i = 0; i < steps.length; i++) {
            System.out.println((i + 1) + ". " + steps[i]);
        }
        System.out.println("\n📺 YouTube: " + youtubeLink);
        System.out.println("--------------------------------------");
    }
    private String scaleIngredient(String ingredient, int people) {
        String[] parts = ingredient.split(" ", 2);
        try {
            double qty = Double.parseDouble(parts[0]);
            return (qty * people) + " " + parts[1];
        } catch (NumberFormatException e) {
            return people + " " + ingredient;
        }
    }
}
class MorningRecipes extends RecipeBase {
    MorningRecipes(String name, String[] ingredients, String[] steps, String youtubeLink) {
        super(name, ingredients, steps, youtubeLink);
    }
    static int getInt(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a number: ");
        }
        return sc.nextInt();
    }
    static void showMenu(Scanner sc) {
        System.out.println("\n--- Morning Menu ---");
        System.out.println("1. Idli\n2. Masala Dosa\n3. Ven Pongal\n4. Poori Masala\n5. Rava Kichadi\n6. Medu Vada\n7. Appam\n8. Puttu\n9. Aloo Paratha\n10. Veg Sandwich");
        int choice = getInt(sc, "Choose a dish: ");
        int people = getInt(sc, "How many people will eat? ");
        switch (choice) {
            case 1:
                new MorningRecipes("Soft Idli",
                    new String[]{
                        "1 cups idli rice",
                        "0.25 cups urad dal",
                        "0.25 cups poha (optional)",
                        "1 pinch fenugreek seeds",
                        "1 tsp salt",
                        "100 ml water for batter",
                        "0.5 tsp oil for greasing idli plates"
                    },
                    new String[]{
                        "Soak idli rice and poha (if using) separately for 4 hours",
                        "Soak urad dal and fenugreek seeds separately for 4 hours",
                        "Grind urad dal to a smooth, fluffy paste",
                        "Grind rice (and poha) to a coarse paste",
                        "Mix both batters gently and add salt",
                        "Allow batter to ferment overnight",
                        "Grease idli molds with oil",
                        "Pour fermented batter into molds",
                        "Steam for 10-12 minutes until set",
                        "Serve hot with chutney or sambar"
                    },
                    "https://youtu.be/VzgzG2guCZo?si=Xpmv0a9c1oK9uZXy"
                ).displayRecipe(people);
                break;
            case 2:
                new MorningRecipes("Masala Dosa",
                    new String[]{
                        "1 cups dosa rice",
                        "0.25 cups urad dal",
                        "0.5 tsp fenugreek seeds",
                        "1 tsp salt",
                        "100 ml water for batter",
                        "0.5 tsp oil for greasing dosa pan",
                        "2 medium potatoes",
                        "0.5 tsp mustard seeds",
                        "0.25 tsp turmeric powder",
                        "0.5 tsp cumin seeds",
                        "0.5 tsp grated ginger",
                        "1 green chilies",
                        "1 tbsp chopped coriander leaves",
                        "0.5 tsp oil for tempering",
                        "0.5 tsp salt"
                    },
                    new String[]{
                        "Soak dosa rice and urad dal with fenugreek seeds separately for 4 hours",
                        "Grind urad dal to a smooth paste",
                        "Grind dosa rice to a coarse paste",
                        "Mix both batters and ferment overnight",
                        "Boil and mash potatoes",
                        "Heat oil, add mustard, cumin, ginger, and chilies",
                        "Add turmeric and salt, then mashed potatoes",
                        "Mix and add coriander leaves",
                        "Spread dosa batter thinly on a hot pan",
                        "Add filling, fold and serve"
                    },
                    "https://youtu.be/IDNtiYTd7_M?si=Sg9neGcAt4b4BEPN"
                ).displayRecipe(people);
                break;
            case 3:
                new MorningRecipes("Ven Pongal (Khara Pongal)",
                    new String[]{
                        "0.5 cups raw rice",
                        "0.25 cups split yellow moong dal",
                        "0.5 tsp black pepper",
                        "0.5 tsp cumin seeds",
                        "1 green chilies",
                        "0.5 tsp grated ginger",
                        "1 tsp ghee",
                        "0.5 tsp mustard seeds",
                        "1 sprig curry leaves",
                        "1 tsp cashews",
                        "1 tsp salt"
                    },
                    new String[]{
                        "Roast moong dal lightly",
                        "Cook rice and dal with water",
                        "Heat ghee, add mustard, cumin, pepper, ginger, chilies, curry leaves, cashews",
                        "Pour tempering over cooked pongal",
                        "Mix well and serve hot"
                    },
                    "https://youtu.be/twXXnefqCmw?si=kPebk_rlzm5f-JXH"
                ).displayRecipe(people);
                break;
            case 4:
                new MorningRecipes("Poori Masala (Urulaikizhangu Masala)",
                    new String[]{
                    "2 medium-sized potatoes",
                    "1 onion",
                    "2 green chilies",
                    "1 tomato",
                    "1 tsp ginger-garlic paste",
                    "0.5 tsp mustard seeds",
                    "0.5 tsp cumin seeds",
                    "1 sprig curry leaves",
                    "0.5 tsp turmeric powder",
                    "0.5 tsp red chili powder",
                    "0.5 tsp garam masala",
                    "1 tsp salt (adjust to taste)",
                    "1 tbsp oil",
                    "100 ml water"
        },
        new String[]{
            "Peel and chop potatoes into cubes",
            "Boil potatoes until soft and mash them",
            "Heat oil in a pan, add mustard seeds and cumin seeds",
            "Add curry leaves, chopped onions, and green chilies, sauté until onions turn translucent",
            "Add ginger-garlic paste and sauté for a minute",
            "Add chopped tomatoes, cook until soft",
            "Add turmeric powder, red chili powder, and salt, mix well",
            "Add mashed potatoes and mix thoroughly",
            "Add water to achieve desired consistency",
            "Simmer for 5-10 minutes, adjust seasoning if needed",
            "Serve hot with poori"
        },
        "https://youtu.be/2IBNb8fNDB8?si=zSbRaXbwV6yk0bET"
    ).displayRecipe(people);
    break;
    case 5:
    new MorningRecipes("Rava Kichadi",
        new String[]{
            "1 cup rava (semolina)",
            "2 tbsp ghee",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "2 green chilies (slit)",
            "1 tsp grated ginger",
            "1 onion (sliced)",
            "1 carrot (chopped)",
            "5-6 beans (chopped)",
            "2 tbsp peas",
            "1 sprig curry leaves",
            "1 tsp salt (adjust to taste)",
            "3 cups water"
        },
        new String[]{
            "Heat ghee in a pan, add mustard seeds and cumin seeds",
            "Add chopped green chilies, grated ginger, and curry leaves",
            "Add sliced onions and sauté until translucent",
            "Add chopped carrot, beans, and peas, sauté for a few minutes",
            "Add water and salt, bring to a boil",
            "Slowly add rava while stirring continuously to avoid lumps",
            "Cook until the mixture thickens and ghee separates",
            "Serve hot with chutney or sambar"
        },
        "https://youtu.be/puCRuBswoCw?si=aQ5RJ8HLcpGhZGL6"
    ).displayRecipe(people);
    break;
    case 6:
    new MorningRecipes("Medu Vada (Ulundu Vadai)",
        new String[]{
            "1 cup urad dal (split black gram)",
            "0.5 tsp cumin seeds",
            "2 green chilies (finely chopped)",
            "1 tsp grated ginger",
            "1 small onion (finely chopped)",
            "1 sprig curry leaves (chopped)",
            "1 tsp salt (adjust to taste)",
            "0.5 tsp black pepper (crushed)",
            "1 pinch asafoetida (hing)",
            "3 cups water for soaking",
            "0.25 cup water for grinding",
            "2 cups oil for deep frying"
        },
        new String[]{
            "Soak urad dal in water for 4-5 hours",
            "Drain the soaked dal and grind it into a smooth batter using minimal water",
            "Add cumin seeds, chopped green chilies, grated ginger, onion, curry leaves, salt, black pepper, and asafoetida",
            "Mix the batter thoroughly until fluffy",
            "Heat oil in a deep frying pan",
            "Wet your hands, take a portion of the batter, and shape it into a ring",
            "Carefully slide the shaped batter into the hot oil",
            "Fry until golden brown and crispy",
            "Remove and drain excess oil on paper towels",
            "Serve hot with coconut chutney or sambar"
        },
        "https://youtu.be/qgYTSsxe7W4?si=ewubMugfzil82HjB"
    ).displayRecipe(people);
    break;
case 7:
    new MorningRecipes("Appam (Hoppers)",
        new String[]{
            "1 cup raw rice",
            "0.25 cup cooked rice",
            "0.5 tsp fenugreek seeds",
            "0.25 tsp yeast",
            "0.5 tsp sugar",
            "1 cup water",
            "0.5 tsp salt",
            "2 tbsp coconut milk"
        },
        new String[]{
            "Soak raw rice and fenugreek seeds in water for 6-8 hours",
            "Grind soaked rice and fenugreek seeds with cooked rice into a smooth batter",
            "Add yeast and sugar to the batter, mix well, and let it ferment for 8-12 hours",
            "Once fermented, add salt and mix gently",
            "Heat an appam pan and pour a ladle of batter into the center",
            "Swirl the pan to spread the batter evenly",
            "Cover and cook for 2-3 minutes until edges are crisp and the center is soft",
            "Drizzle coconut milk over the center and cook for another minute",
            "Serve hot with coconut milk or stew"
        },
        "https://youtu.be/yRpYqehvZ9o?si=qUVlKC3LgZBcdLLN"
    ).displayRecipe(people);
    break;
            case 8:
    new MorningRecipes("Puttu (Rice Flour Puttu)",
        new String[]{
            "2 cups rice flour",
            "1 cup grated coconut",
            "0.5 tsp salt",
            "0.75 cup water (as needed for moistening)"
        },
        new String[]{
            "In a large bowl, mix the rice flour and salt.",
            "Gradually sprinkle water and mix until the flour is slightly moist and crumbly.",
            "Take a puttu maker and layer it: start with 2 tbsp grated coconut, then rice flour mixture, repeat, and finish with coconut.",
            "Place the filled puttu maker over boiling water and steam for 10–12 minutes.",
            "Once done, remove from the puttu maker and serve hot with coconut milk, banana, or curry."
        },
        "https://youtu.be/hRxU0oS_Rck?si=dItLNshnYkavyNYv"
    ).displayRecipe(people);
    break;
case 9:
    new MorningRecipes("Aloo Paratha (Stuffed Potato Paratha)",
        new String[]{
            "2 cups whole wheat flour",
            "0.5 tsp salt",
            "0.75 cup water (to knead dough)",
            "1 tbsp oil or ghee",
            "3 medium boiled potatoes, mashed",
            "1 small onion, finely chopped",
            "2 green chilies, finely chopped",
            "0.5 tsp cumin seeds",
            "0.5 tsp garam masala",
            "0.5 tsp chili powder",
            "0.25 tsp turmeric powder",
            "Salt to taste",
            "2 tbsp fresh coriander leaves, chopped"
        },
        new String[]{
            "In a bowl, combine wheat flour and salt, then add water gradually to knead into a soft dough. Cover and rest 20–30 minutes.",
            "Heat 1 tsp oil, add cumin seeds, onions, and green chilies. Sauté until onions turn translucent.",
            "Add mashed potatoes, garam masala, chili powder, turmeric, and salt. Mix well and let cool. Add coriander leaves.",
            "Divide dough into small balls. Roll each into a disc, place filling in center, seal edges, and roll gently into a flat circle.",
            "Cook on a hot tava with ghee/oil until golden spots appear on both sides.",
            "Serve hot with yogurt, pickle, or butter."
        },
        "https://youtu.be/25BaBBfbECc?si=o_BHMXSMf7IXrD2Z"
    ).displayRecipe(people);
    break;
case 10:
    new MorningRecipes("Vegetable Sandwich",
        new String[]{
            "4 slices bread",
            "1 small cucumber, sliced",
            "1 small tomato, sliced",
            "1 small onion, sliced",
            "1 small carrot, grated",
            "4 lettuce leaves",
            "3 tbsp mayonnaise",
            "0.25 tsp salt",
            "0.25 tsp pepper"
        },
        new String[]{
            "Spread 1 tbsp mayonnaise on one side of each bread slice.",
            "Place lettuce leaves on two slices.",
            "Layer cucumber, tomato, onion, and carrot slices evenly.",
            "Sprinkle salt and pepper to taste.",
            "Cover with the remaining bread slices (mayonnaise side facing the filling).",
            "Press gently, slice into halves or quarters.",
            "Serve fresh with chips, ketchup, or juice."
        },
        "https://youtu.be/kxyV7Ln_KRE?si=yHw7aET4aEabQy3Y"
    ).displayRecipe(people);
    break;
            default:
                System.out.println("Invalid choice! Please select between 1–10.");
        }
    }
}
class AfternoonRecipes extends RecipeBase {
    AfternoonRecipes(String name, String[] ingredients, String[] steps, String youtubeLink) {
        super(name, ingredients, steps, youtubeLink);
    }
    static int getInt(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a number: ");
        }
        return sc.nextInt();
    }
    static void showMenu(Scanner sc) {
        System.out.println("\n--- Afternoon Menu ---");
        System.out.println("1. Sambar Rice\n2. Rasam Rice\n3. Curd Rice\n4. Vegetable Biryani\n5. Lemon Rice\n6. Tomato Rice\n7. Cabbage Poriyal\n8. Veg Pulao\n9. Dal Tadka & Rice\n10. Paneer Butter Masala & Roti");
        int choice = getInt(sc, "Choose a dish: ");
        int people = getInt(sc, "How many people will eat? ");
        switch (choice) {
            case 1:
    new AfternoonRecipes("Sambar Sadam (Sambar Rice)",
        new String[]{
            "1 cup rice",
            "0.5 cup toor dal",
            "1 onion, chopped",
            "1 tomato, chopped",
            "1 carrot, chopped",
            "1 potato, chopped",
            "0.5 cup beans, chopped",
            "0.5 cup pumpkin, chopped",
            "1 drumstick, chopped",
            "0.5 cup tamarind extract",
            "2 tbsp sambar powder",
            "0.5 tsp turmeric powder",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "0.25 tsp fenugreek seeds",
            "2 dried red chilies",
            "1 sprig curry leaves",
            "0.25 tsp asafoetida",
            "2 tbsp oil",
            "Salt to taste",
            "3 cups water"
        },
        new String[]{
            "In a pressure cooker, heat oil and add mustard seeds.",
            "Once they splutter, add cumin seeds, fenugreek seeds, dried red chilies, and curry leaves.",
            "Add chopped onions and sauté until translucent.",
            "Add chopped tomatoes and cook until soft.",
            "Add chopped vegetables (carrot, potato, beans, pumpkin, drumstick) and sauté for a few minutes.",
            "Add tamarind extract, sambar powder, turmeric powder, and salt.",
            "Add rice and toor dal, and mix well.",
            "Add water (approximately 3 cups) and stir.",
            "Close the lid of the pressure cooker and cook for 3–4 whistles.",
            "Once pressure releases, open the cooker and mix the sambar rice well.",
            "Serve hot with papad or raita."
        },
        "https://youtu.be/rNP83Cb5nzs?si=r2iEi6B-U63dzRs9"
    ).displayRecipe(people);
    break;
case 2:
    new AfternoonRecipes("Milagu Rasam (Pepper Rasam)",
        new String[]{
            "2 tbsp black peppercorns",
            "1 tbsp cumin seeds",
            "1 tbsp toor dal",
            "2 dried red chilies",
            "1 medium tomato, chopped",
            "1 small onion, chopped",
            "1 sprig curry leaves",
            "1 tsp tamarind extract",
            "0.5 tsp jaggery",
            "1 tsp ghee",
            "Salt to taste",
            "2 cups water"
        },
        new String[]{
            "Dry roast black peppercorns, cumin seeds, toor dal, and dried red chilies until aromatic.",
            "Grind the roasted spices into a coarse powder.",
            "In a pan, heat ghee and sauté chopped onions until translucent.",
            "Add chopped tomatoes and curry leaves; cook until tomatoes soften.",
            "Add tamarind extract, jaggery, and salt; simmer for a few minutes.",
            "Add the ground spice powder and water; bring to a boil.",
            "Reduce heat and let it simmer for 5–10 minutes.",
            "Serve hot with steamed rice."
        },
        "https://youtu.be/d_xj9AHQvMQ?si=TVCgDPvcUm7U7Z6y"
    ).displayRecipe(people);
    break;
case 3:
    new AfternoonRecipes("Curd Rice with Mango Pickle",
        new String[]{
            "1 cup rice",
            "1.5 cups curd",
            "2 tbsp mango pickle",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "0.25 tsp fenugreek seeds",
            "0.25 tsp pepper powder",
            "0.25 tsp turmeric powder",
            "0.25 tsp asafoetida",
            "Salt to taste",
            "0.5 cup water"
        },
        new String[]{
            "Cook rice until soft and let it cool slightly.",
            "Mix curd with the cooked rice thoroughly.",
            "Heat a small pan, add mustard seeds, cumin seeds, and fenugreek seeds; let them splutter.",
            "Add asafoetida, turmeric powder, and pepper powder; sauté briefly.",
            "Pour the tempering over the curd rice and mix well.",
            "Add salt to taste and mix gently.",
            "Serve curd rice with a side of mango pickle."
        },
        "https://youtu.be/xaPiRmxRSc8?si=3RO3xMzISr3rRvYj"
    ).displayRecipe(people);
    break;
case 4:
    new AfternoonRecipes("Vegetable Biryani",
        new String[]{
            "1 cup rice",
            "1 cup mixed vegetables (carrot, beans, potato, beetroot)",
            "1 onion, chopped",
            "1 tomato, chopped",
            "0.5 cup curd",
            "0.25 cup coriander leaves",
            "0.25 cup mint leaves",
            "0.5 tsp turmeric powder",
            "1 tsp sambar powder",
            "0.5 tsp pepper powder",
            "Salt to taste",
            "2 tbsp oil",
            "1 tbsp ghee",
            "2 cups water"
        },
        new String[]{
            "Wash rice well and soak for 30 minutes.",
            "In a pan, heat oil and ghee; add onions, tomatoes, coriander leaves, and mint leaves, sauté well.",
            "Add turmeric powder, sambar powder, pepper powder, and salt; mix well.",
            "Add curd and mixed vegetables; sauté for 5 minutes.",
            "Add rice and water; mix well.",
            "Cover and cook on medium heat for 15 minutes.",
            "Vegetable Biryani is ready to serve."
        },
        "https://youtu.be/rZzim9n_QHA?si=DylT-WrTLJGsRKiM"
    ).displayRecipe(people);
    break;
case 5:
    new AfternoonRecipes("Lemon Rice",
        new String[]{
            "1 cup rice",
            "0.25 cup lemon juice",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "0.25 tsp turmeric powder",
            "0.25 tsp asafoetida",
            "2 dried red chilies",
            "1 sprig curry leaves",
            "2 tbsp peanuts",
            "1 tbsp cashew nuts",
            "1.5 tbsp oil",
            "Salt to taste"
        },
        new String[]{
            "Cook rice and let it cool slightly.",
            "In a pan, heat oil and add mustard seeds; let them splutter.",
            "Add cumin seeds, dried red chilies, and curry leaves; sauté briefly.",
            "Add peanuts and cashew nuts; fry until golden.",
            "Add turmeric powder and asafoetida; mix well.",
            "Add the cooked rice to the pan and mix gently.",
            "Pour lemon juice over the rice and add salt; mix well.",
            "Serve hot."
        },
        "https://youtu.be/Kkog1jDVS6M?si=LI56MmTApVeAo0Ae"
    ).displayRecipe(people);
    break;
    case 6:
    new AfternoonRecipes("Tomato Rice",
        new String[]{
            "1 cup rice",
            "2 tomatoes, chopped",
            "1 onion, sliced",
            "2 green chilies, slit",
            "1 tsp ginger-garlic paste",
            "0.5 tsp red chili powder",
            "0.25 tsp turmeric powder",
            "0.5 tsp garam masala",
            "1 tsp salt (adjust to taste)",
            "2 tbsp oil",
            "1 sprig curry leaves",
            "1 bay leaf",
            "1.5 cups water"
        },
        new String[]{
            "Cook rice separately and set aside.",
            "Heat oil in a pan and add bay leaf and curry leaves.",
            "Add sliced onions and green chilies; sauté until golden.",
            "Add ginger-garlic paste and sauté for 1 minute.",
            "Add chopped tomatoes and cook until mushy.",
            "Add chili powder, turmeric, garam masala, and salt; mix well.",
            "Add cooked rice and toss until well combined.",
            "Serve hot with raita or chips."
        },
        "https://youtu.be/ZElxQUV5kJI?si=Z_jM3NxBPbXHh6ho"
    ).displayRecipe(people);
    break;
case 7:
    new AfternoonRecipes("Cabbage Poriyal",
        new String[]{
            "2 cups cabbage, finely chopped",
            "1 onion, chopped",
            "2 green chilies, slit",
            "1 tsp grated ginger",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "1 sprig curry leaves",
            "2 tbsp grated coconut",
            "0.5 tsp turmeric powder",
            "1 tsp salt (adjust to taste)",
            "1 tbsp oil"
        },
        new String[]{
            "Heat oil in a pan and add mustard seeds; let them splutter.",
            "Add cumin seeds, curry leaves, and green chilies; sauté briefly.",
            "Add chopped onions and grated ginger; sauté until onions turn soft.",
            "Add chopped cabbage, turmeric powder, and salt; mix well.",
            "Sprinkle a little water, cover, and cook for 5 minutes.",
            "Add grated coconut and mix well.",
            "Serve hot with rice and sambar/rasam."
        },
        "https://youtu.be/_3H95nm1SXM?si=O0-Xl4iY6N6Y0mFa"
    ).displayRecipe(people);
    break;
    case 8:
    new AfternoonRecipes("Vegetable Pulao",
        new String[]{
            "1 cup rice",
            "1 cup mixed vegetables (carrot, beans, peas, potato, chopped)",
            "1 onion, sliced",
            "1 tomato, chopped",
            "1 tsp ginger-garlic paste",
            "2 green chilies, slit",
            "1 bay leaf, 1 inch cinnamon, 2 cloves, 2 cardamoms",
            "1 tsp coriander powder",
            "0.5 tsp cumin powder",
            "0.5 tsp red chili powder",
            "0.5 tsp garam masala",
            "1.5 tsp salt (adjust to taste)",
            "2 tbsp oil",
            "2 cups water"
        },
        new String[]{
            "Heat oil in a pressure cooker and sauté whole spices until aromatic.",
            "Add sliced onions and sauté until golden brown.",
            "Add ginger-garlic paste and green chilies; sauté for a minute.",
            "Add chopped tomatoes and cook until soft.",
            "Add mixed vegetables and sauté for a few minutes.",
            "Add rice and sauté for 2 minutes.",
            "Add coriander powder, cumin powder, red chili powder, garam masala, and salt; mix well.",
            "Add water and bring to a boil.",
            "Cover the pressure cooker and cook for 2 whistles.",
            "Let the pressure release naturally.",
            "Fluff the pulao with a fork and serve hot."
        },
        "https://youtu.be/ThHHWLHkq3M?si=pQ2Lg7L3Fftclpdq"
    ).displayRecipe(people);
    break;
case 9:
    new AfternoonRecipes("Dal Tadka & Rice",
        new String[]{
            "0.5 cup toor dal (tuvaram paruppu)",
            "0.25 cup tamarind extract",
            "1 onion, chopped",
            "1 tomato, chopped",
            "3 garlic cloves, crushed",
            "2 green chilies, slit",
            "1 sprig curry leaves",
            "2 tbsp coriander leaves",
            "0.5 tsp mustard seeds",
            "0.5 tsp cumin seeds",
            "0.25 tsp fenugreek seeds",
            "0.25 tsp turmeric powder",
            "1 tsp sambar powder",
            "1 pinch asafoetida",
            "1 tsp salt (adjust to taste)",
            "2 tbsp oil"
        },
        new String[]{
            "Cook toor dal with turmeric powder and set aside.",
            "Extract tamarind juice from soaked tamarind.",
            "In a pan, heat oil and add mustard seeds; let them splutter.",
            "Add cumin seeds, fenugreek seeds, and curry leaves; sauté briefly.",
            "Add chopped onions and sauté until golden brown.",
            "Add crushed garlic and green chilies; sauté for a minute.",
            "Add chopped tomatoes and cook until soft.",
            "Add tamarind extract, sambar powder, and salt; bring to a boil.",
            "Add cooked toor dal and simmer for 10 minutes.",
            "Garnish with coriander leaves.",
            "Serve hot with rice."
        },
        "https://youtu.be/q_qUyOXnXQI?si=LJd2XA-ByxD563b3"
    ).displayRecipe(people);
    break;
case 10:
    new AfternoonRecipes("Paneer Butter Masala",
        new String[]{
            "200 g paneer, cubed",
            "1 onion, chopped",
            "2 tomatoes, chopped",
            "1 tsp ginger-garlic paste",
            "1 green chili, slit",
            "1 tsp coriander powder",
            "0.5 tsp cumin powder",
            "0.5 tsp red chili powder",
            "0.5 tsp garam masala",
            "1 tsp salt (adjust to taste)",
            "2 tbsp butter",
            "2 tbsp fresh cream",
            "0.5 tsp kasuri methi",
            "2 tbsp coriander leaves, chopped"
        },
        new String[]{
            "Heat butter in a pan and sauté chopped onions until golden brown.",
            "Add ginger-garlic paste and green chilies; sauté for a minute.",
            "Add chopped tomatoes and cook until soft.",
            "Add coriander powder, cumin powder, red chili powder, and salt; cook until oil separates.",
            "Add paneer cubes and mix gently.",
            "Add fresh cream and kasuri methi; cook for 5 minutes.",
            "Garnish with coriander leaves.",
            "Serve hot with naan or rice."
        },
        "https://youtu.be/sVNQIbuv_Mc?si=cRaaw8U8bQ4jiaZc"
    ).displayRecipe(people);
    break;
    default:
                System.out.println("Invalid choice! Please select between 1–10.");
        }
    }
}
class EveningRecipes extends RecipeBase {
    EveningRecipes(String name, String[] ingredients, String[] steps, String youtubeLink) {
        super(name, ingredients, steps, youtubeLink);
    }
    static int getInt(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a number: ");
        }
        return sc.nextInt();
    }
    static void showMenu(Scanner sc) {
        System.out.println("\n--- Evening Menu ---");
        System.out.println("1. Masala Tea\n2. Beaten Coffee\n3. Onion Pakoda\n4. Milagai Bajji\n5. Potato Samosa\n6. Vegetable Sandwich\n7. Spicy Masala Noodles Soup\n8. Bhel Puri\n9. Veg Cutlet\n10. Crispy Corn");
        int choice = getInt(sc, "Choose a dish: ");
        int people = getInt(sc, "How many people will eat? ");
        switch (choice) {
            case 1:
    new EveningRecipes("Masala Tea",
        new String[]{
            "2 tsp tea leaves",
            "1 cup water",
            "0.5 cup milk",
            "2 tsp sugar (adjust to taste)",
            "1 inch ginger, crushed",
            "2 cardamom pods",
            "2 cloves",
            "1 small cinnamon stick",
            "3 black peppercorns"
        },
        new String[]{
            "Boil water with crushed ginger, cardamom, cloves, cinnamon, and black peppercorns.",
            "Add tea leaves and simmer for 2–3 minutes.",
            "Add milk and sugar; bring to a boil.",
            "Strain and serve hot."
        },
        "https://youtu.be/9_BF-CHpWiU?si=C4vKECG0mWmcRyJE"
    ).displayRecipe(people);
    break;
case 2:
    new EveningRecipes("Beaten Coffee",
        new String[]{
            "2 tsp instant coffee powder",
            "2 tsp sugar",
            "2 tsp hot water",
            "1 cup milk",
            "3–4 ice cubes (optional, for cold version)"
        },
        new String[]{
            "In a bowl, add instant coffee powder and sugar.",
            "Add hot water and whisk vigorously until the mixture becomes light and frothy.",
            "Heat 1 cup milk (or chill if making cold coffee).",
            "Pour the milk into a glass and top with the beaten coffee mixture.",
            "Stir gently and add ice cubes if desired.",
            "Serve hot or cold."
        },
        "https://youtu.be/XuAhRJ3QzvI?si=l7wgTpzO7chWhyXy"
    ).displayRecipe(people);
    break;
case 3:
    new EveningRecipes("Onion Pakoda",
        new String[]{
            "2 large onions, thinly sliced",
            "1 cup chickpea flour (besan)",
            "2 tbsp rice flour",
            "1 tsp chili powder",
            "0.5 tsp cumin seeds",
            "0.5 tsp carom seeds (ajwain)",
            "1 sprig curry leaves, chopped",
            "1 tsp salt (adjust to taste)",
            "Water (as needed)",
            "Oil for frying"
        },
        new String[]{
            "In a mixing bowl, combine sliced onions with chickpea flour, rice flour, chili powder, cumin, carom seeds, curry leaves, and salt.",
            "Add little water to form a sticky dough-like mixture.",
            "Heat oil in a pan for deep frying.",
            "Take small portions of the mixture and drop into hot oil.",
            "Fry until golden brown and crispy.",
            "Drain excess oil on paper towels.",
            "Serve hot with chutney or sauce."
        },
        "https://youtu.be/3bsT5HrMFy8?si=DbVsgxIWZ949JboG"
    ).displayRecipe(people);
    break;
case 4:
    new EveningRecipes("Milagai Bajji",
        new String[]{
            "8–10 green chilies (large, for bajji)",
            "1 cup chickpea flour (besan)",
            "2 tbsp rice flour",
            "1 tsp chili powder",
            "0.25 tsp asafoetida",
            "1 tsp salt (adjust to taste)",
            "Water (as needed for batter)",
            "Oil for frying"
        },
        new String[]{
            "Slit the green chilies lengthwise and remove seeds if desired.",
            "In a bowl, mix chickpea flour, rice flour, chili powder, asafoetida, and salt.",
            "Add water to make a thick batter.",
            "Heat oil in a pan for deep frying.",
            "Dip each chili into the batter until well-coated.",
            "Drop them into hot oil and fry until golden and crispy.",
            "Drain excess oil on paper towels.",
            "Serve hot with chutney."
        },
        "https://youtu.be/nuHILxC4mbE?si=ySAfsqvwSkD6cFGY"
    ).displayRecipe(people);
    break;
case 5:
    new EveningRecipes("Potato Samosa",
        new String[]{
            "1.5 cups all-purpose flour (maida)",
            "3 medium potatoes, boiled & mashed",
            "1 onion, finely chopped",
            "2 green chilies, chopped",
            "1 tsp grated ginger",
            "0.5 tsp cumin seeds",
            "1 tsp coriander powder",
            "0.5 tsp garam masala",
            "0.25 tsp turmeric powder",
            "0.5 tsp chili powder",
            "2 tbsp coriander leaves, chopped",
            "1 tsp salt (adjust to taste)",
            "Oil for frying"
        },
        new String[]{
            "Mix all-purpose flour with a pinch of salt and water to make a stiff dough. Rest for 20 mins.",
            "Heat oil in a pan, add cumin seeds and let them splutter.",
            "Add onions, chilies, and ginger; sauté until golden.",
            "Add mashed potatoes, coriander powder, garam masala, turmeric, chili powder, and salt. Mix well.",
            "Finish with chopped coriander leaves. Let filling cool.",
            "Divide dough into balls, roll into thin circles, and cut in half.",
            "Fold each half into a cone, fill with potato mixture, and seal edges.",
            "Heat oil in a deep pan and fry samosas until golden brown.",
            "Drain excess oil and serve hot with chutney."
        },
        "https://youtu.be/1ibSVMZaaa0?si=0Rz02Ocsky7lw7WH"
    ).displayRecipe(people);
    break;
    case 6:
    new EveningRecipes("Vegetable Sandwich",
        new String[]{
            "4 bread slices",
            "1 cucumber (sliced)",
            "1 tomato (sliced)",
            "1 onion (sliced)",
            "1 carrot (grated)",
            "4 lettuce leaves",
            "2 cheese slices",
            "2 tbsp butter",
            "1/2 tsp salt",
            "1/4 tsp pepper",
            "1 tbsp chili sauce",
            "1 tbsp tomato ketchup"
        },
        new String[]{
            "Spread butter on one side of each bread slice.",
            "On the unbuttered side, spread chili sauce on one slice and tomato ketchup on the other.",
            "Layer with lettuce leaves, followed by cheese slices.",
            "Add sliced cucumber, tomato, onion, and grated carrot.",
            "Sprinkle with salt and pepper to taste.",
            "Cover with the second slice of bread, buttered side facing out.",
            "Toast the sandwich on a grill or in a sandwich maker until golden brown.",
            "Serve hot with extra ketchup or chutney."
        },
        "https://youtu.be/kxyV7Ln_KRE?si=Kl9hjtzGLpOjeQnx"
    ).displayRecipe(people);
    break;
case 7:
    new EveningRecipes("Spicy Masala Noodles Soup",
        new String[]{
            "1 packet instant noodles",
            "2 cups water",
            "1 tbsp oil",
            "1 tsp ginger-garlic paste",
            "2 green chilies (chopped)",
            "1 onion (chopped)",
            "1 tomato (chopped)",
            "1 carrot (julienned)",
            "1/2 capsicum (julienned)",
            "2 tbsp spring onions (chopped)",
            "1 tbsp soy sauce",
            "1 tsp vinegar",
            "1 tbsp chili sauce",
            "1 tbsp tomato ketchup",
            "1/2 tsp salt",
            "1/4 tsp pepper",
            "1 tbsp coriander leaves (chopped)"
        },
        new String[]{
            "Boil water in a pot and cook instant noodles as per package instructions. Drain and set aside.",
            "In a pan, heat oil and sauté ginger-garlic paste until aromatic.",
            "Add chopped green chilies and onions; sauté until onions turn translucent.",
            "Add chopped tomatoes, carrots, and capsicum; cook for a few minutes.",
            "Add soy sauce, vinegar, chili sauce, tomato ketchup, salt, and pepper; mix well.",
            "Add the cooked noodles to the pan and toss to coat with the sauce.",
            "Garnish with chopped spring onions and coriander leaves.",
            "Serve hot."
        },
        "https://youtu.be/FlJqCqBCxYE?si=S76dlHIJW7mtODPK"
    ).displayRecipe(people);
    break;
case 8:
    new EveningRecipes("Bhel Puri",
        new String[]{
            "2 cups puffed rice",
            "1/2 cup sev (crispy chickpea noodles)",
            "2 tbsp tamarind chutney",
            "2 tbsp green chutney",
            "1 onion (finely chopped)",
            "1 tomato (finely chopped)",
            "1/2 cucumber (finely chopped)",
            "2 tbsp coriander leaves (chopped)",
            "1 green chili (finely chopped)",
            "1 tbsp mint leaves (chopped)",
            "2 tbsp roasted peanuts",
            "1/4 cup sprouts (optional)",
            "1 tsp chaat masala",
            "1/2 tsp salt",
            "1 tbsp lemon juice"
        },
        new String[]{
            "In a large mixing bowl, combine puffed rice, sev, chopped onions, tomatoes, cucumbers, coriander leaves, green chilies, mint leaves, roasted peanuts, and sprouts (if using).",
            "Add tamarind chutney and green chutney to the mixture.",
            "Sprinkle chaat masala and salt to taste.",
            "Toss everything gently to mix well.",
            "Squeeze fresh lemon juice over the top.",
            "Serve immediately to enjoy the crunchiness."
        },
        "https://youtu.be/imXT9LidYSk?si=qnyql8UIOf9zfi6p"
    ).displayRecipe(people);
    break;
case 9:
    new EveningRecipes("Vegetable Cutlet",
        new String[]{
            "2 potatoes (boiled and mashed)",
            "1 carrot (grated)",
            "5-6 green beans (finely chopped)",
            "1/4 cup green peas (boiled & mashed)",
            "1 onion (finely chopped)",
            "1 tsp ginger-garlic paste",
            "1 green chili (finely chopped)",
            "2 tbsp coriander leaves (chopped)",
            "1/2 cup bread crumbs",
            "2 tbsp rice flour",
            "1/2 tsp chili powder",
            "1/2 tsp coriander powder",
            "1/2 tsp garam masala",
            "1 tsp salt",
            "Oil for shallow frying"
        },
        new String[]{
            "In a pan, heat oil and sauté chopped onions until translucent.",
            "Add ginger-garlic paste and green chilies; sauté for a minute.",
            "Add grated carrot, chopped green beans, and boiled green peas; cook for a few minutes.",
            "Add chili powder, coriander powder, garam masala, and salt; mix well.",
            "Add boiled and mashed potatoes; mix thoroughly and cook for 5 minutes.",
            "Remove from heat and let the mixture cool.",
            "Once cooled, shape the mixture into small patties.",
            "Coat each patty with rice flour and then dip into bread crumbs.",
            "Heat oil in a pan and shallow fry the patties until golden brown on both sides.",
            "Drain excess oil on paper towels.",
            "Serve hot with chutney or sauce."
        },
        "https://youtu.be/dY7wb3ZkRaY?si=By7ntKA4BqQchH9m"
    ).displayRecipe(people);
    break;
case 10:
    new EveningRecipes("Crispy Corn",
        new String[]{
            "1 cup sweet corn kernels",
            "2 tbsp corn flour",
            "2 tbsp rice flour",
            "1 tbsp all-purpose flour (maida)",
            "1/2 tsp chili powder",
            "1/2 tsp salt",
            "1 tsp ginger-garlic paste",
            "2 tbsp spring onions (chopped)",
            "Oil for deep frying"
        },
        new String[]{
            "Boil sweet corn kernels until tender; drain and set aside.",
            "In a bowl, mix corn flour, rice flour, all-purpose flour, chili powder, and salt.",
            "Add ginger-garlic paste to the flour mixture.",
            "Add the boiled corn kernels to the mixture and toss to coat evenly.",
            "Heat oil in a pan for deep frying.",
            "Carefully drop the coated corn kernels into the hot oil.",
            "Fry until golden brown and crispy.",
            "Drain excess oil on paper towels.",
            "Garnish with chopped spring onions.",
            "Serve hot with dipping sauce."
        },
        "https://youtu.be/z5ZO4D8MUBA?si=AglYOxgLJdOSwD9T"
    ).displayRecipe(people);
    break;
     default:
                System.out.println("Invalid choice! Please select between 1–10.");
        }
    }
}
class NightRecipes extends RecipeBase {
    NightRecipes(String name, String[] ingredients, String[] steps, String youtubeLink) {
        super(name, ingredients, steps, youtubeLink);
    }
    static int getInt(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a number: ");
        }
        return sc.nextInt();
    }
    static void showMenu(Scanner sc) {
        System.out.println("\n--- Night Menu ---");
        System.out.println("1. Chapati & Dal\n2. Parotta & Salna\n3. Idiyappam \n4. Veg Kurma & Rice\n5. Paneer Curry & Roti\n6. Egg Curry & Rice\n7. Fish Fry & Rasam\n8. Tomato Rice\n9. Tamarind Rice\n10. Curd Rice");
        int choice = getInt(sc, "Choose a dish: ");
        int people = getInt(sc, "How many people will eat? ");
        switch (choice) {
           case 1:
    new NightRecipes("Soft Chapati",
        new String[]{
            "2 cups whole wheat flour",
            "1 tsp salt",
            "3/4 cup water",
            "1 tsp oil"
        },
        new String[]{
            "In a mixing bowl, combine whole wheat flour and salt.",
            "Gradually add water and knead to form a soft, smooth dough.",
            "Cover the dough with a damp cloth and let it rest for 15–20 minutes.",
            "Divide the dough into small balls.",
            "Roll each ball into a thin, round disc using a rolling pin.",
            "Heat a tava or griddle over medium-high heat.",
            "Place the rolled dough onto the hot tava.",
            "Cook until bubbles form on the surface, then flip and cook the other side.",
            "Press gently with a cloth or spatula to puff up the chapati.",
            "Remove from heat and brush with a little oil or ghee.",
            "Serve hot with curry or chutney."
        },
        "https://youtu.be/abwmNE-4SG8?si=nNPgvtaj6jquoXD6"
    ).displayRecipe(people);
    break;
case 2:
    new NightRecipes("Parota Salna",
        new String[]{
            "1 large onion (finely chopped)",
            "2 medium tomatoes (finely chopped)",
            "2 green chilies (slit)",
            "1 tbsp ginger-garlic paste",
            "10 curry leaves",
            "1 inch cinnamon stick",
            "3 cloves",
            "2 cardamom pods",
            "1 bay leaf",
            "1/2 tsp fennel seeds",
            "1/2 tsp turmeric powder",
            "1 tsp chili powder",
            "1 tsp coriander powder",
            "1/2 tsp garam masala",
            "Salt - to taste",
            "1 cup water",
            "2 tsp oil"
        },
        new String[]{
            "In a pan, heat oil and sauté chopped onions until golden brown.",
            "Add ginger-garlic paste and sauté until the raw smell disappears.",
            "Add chopped tomatoes and cook until they turn soft.",
            "Add slit green chilies and curry leaves.",
            "Add cinnamon stick, cloves, cardamom, bay leaf, and fennel seeds; sauté for a minute.",
            "Add turmeric powder, chili powder, coriander powder, and garam masala; mix well.",
            "Add water and salt; bring to a boil.",
            "Simmer for 10–15 minutes to allow the flavors to blend.",
            "Serve hot with dosa, chapathi, or parotta."
        },
        "https://youtu.be/y7kPBiC9mN8?si=99vdw45lT4nMWwzD"
    ).displayRecipe(people);
    break;
case 3:
    new NightRecipes("Idiyappam",
        new String[]{
            "1 cup rice flour",
            "1/2 tsp salt",
            "3/4 cup hot water",
            "1 tsp oil"
        },
        new String[]{
            "In a mixing bowl, combine rice flour and salt.",
            "Gradually add hot water and knead to form a smooth, soft dough.",
            "Grease the idiyappam maker or sev press with a little oil.",
            "Fill the dough into the idiyappam maker.",
            "Press the dough onto greased idli plates or a steaming tray in a circular pattern.",
            "Steam the idiyappam for 10–12 minutes until cooked.",
            "Serve hot with coconut milk or curry."
        },
        "https://youtu.be/E_Qr-J2hJ6w?si=IE1F6pM-zwitOez7"
    ).displayRecipe(people);
    break;
case 4:
    new NightRecipes("Vegetable Kurma",
        new String[]{
            "1/2 cup carrot (chopped)",
            "1/2 cup beans (chopped)",
            "1/2 cup potato (chopped)",
            "1/4 cup peas (boiled)",
            "1 medium onion (finely chopped)",
            "1 medium tomato (finely chopped)",
            "1 green chili (slit)",
            "1 tsp ginger-garlic paste",
            "8-10 curry leaves",
            "1 inch cinnamon stick",
            "3 cloves",
            "2 cardamom pods",
            "1 bay leaf",
            "1/2 tsp fennel seeds",
            "1/2 tsp turmeric powder",
            "1 tsp chili powder",
            "1 tsp coriander powder",
            "1/2 tsp garam masala",
            "Salt - to taste",
            "1/2 cup coconut milk",
            "2 tsp oil"
        },
        new String[]{
            "In a pressure cooker, heat oil and sauté chopped onions until golden brown.",
            "Add ginger-garlic paste and sauté until the raw smell disappears.",
            "Add chopped tomatoes and cook until they turn soft.",
            "Add slit green chilies and curry leaves.",
            "Add cinnamon stick, cloves, cardamom, bay leaf, and fennel seeds; sauté for a minute.",
            "Add turmeric powder, chili powder, coriander powder, and garam masala; mix well.",
            "Add mixed vegetables and sauté for a few minutes.",
            "Add salt and enough water to cover the vegetables.",
            "Close the lid and cook for 2–3 whistles.",
            "Once the pressure releases, open the lid and add coconut milk.",
            "Simmer for 5–7 minutes to blend the flavors.",
            "Serve hot with chapathi, parotta, or rice."
        },
        "https://youtu.be/qovb1I-bjQo?si=RwmRNhjGINVAma7v"
    ).displayRecipe(people);
    break;
case 5:
    new NightRecipes("Spicy Paneer Gravy",
        new String[]{
            "200 g paneer (cubed)",
            "1 medium onion (finely chopped)",
            "2 medium tomatoes (finely chopped)",
            "1 green chili (slit)",
            "1 tsp ginger-garlic paste",
            "8-10 curry leaves",
            "1 inch cinnamon stick",
            "3 cloves",
            "2 cardamom pods",
            "1 bay leaf",
            "1/2 tsp fennel seeds",
            "1/2 tsp turmeric powder",
            "1 tsp chili powder",
            "1 tsp coriander powder",
            "1/2 tsp garam masala",
            "Salt - to taste",
            "2 tbsp coriander leaves (chopped)",
            "2 tsp oil"
        },
        new String[]{
            "In a pan, heat oil and sauté chopped onions until golden brown.",
            "Add ginger-garlic paste and sauté until the raw smell disappears.",
            "Add chopped tomatoes and cook until they turn soft.",
            "Add slit green chilies and curry leaves.",
            "Add cinnamon stick, cloves, cardamom, bay leaf, and fennel seeds; sauté for a minute.",
            "Add turmeric powder, chili powder, coriander powder, and garam masala; mix well.",
            "Add paneer cubes and sauté for a few minutes.",
            "Add salt and enough water to make a gravy.",
            "Simmer for 10–15 minutes to allow the flavors to blend.",
            "Garnish with chopped coriander leaves.",
            "Serve hot with chapathi, parotta, or rice."
        },
        "https://youtu.be/MV_BBA_tfag?si=N4GKBC3til716q99"
    ).displayRecipe(people);
    break;
    case 6:
    new NightRecipes("Egg Curry",
        new String[]{
            "4 boiled eggs",
            "1 medium onion (finely chopped)",
            "2 medium tomatoes (finely chopped)",
            "2 green chilies (slit)",
            "1 tsp ginger-garlic paste",
            "8-10 curry leaves",
            "1 inch cinnamon stick",
            "3 cloves",
            "2 cardamom pods",
            "1 bay leaf",
            "1/2 tsp fennel seeds",
            "1/2 tsp turmeric powder",
            "1 tsp chili powder",
            "1 tsp coriander powder",
            "1/2 tsp garam masala",
            "Salt - to taste",
            "2 tbsp coriander leaves (chopped)",
            "2 tsp oil",
            "1 cup water"
        },
        new String[]{
            "In a pan, heat oil and sauté chopped onions until golden brown.",
            "Add ginger-garlic paste and sauté until the raw smell disappears.",
            "Add chopped tomatoes and cook until they turn soft.",
            "Add slit green chilies and curry leaves.",
            "Add cinnamon stick, cloves, cardamom, bay leaf, and fennel seeds; sauté for a minute.",
            "Add turmeric powder, chili powder, coriander powder, garam masala, salt, and water; bring to a boil.",
            "Carefully add boiled eggs to the gravy.",
            "Simmer for 10–15 minutes to allow the flavors to blend.",
            "Garnish with chopped coriander leaves.",
            "Serve hot with chapathi, parotta, or rice."
        },
        "https://youtu.be/JU8vFH0jY88?si=B5ThW9HeZxdHa75N"
    ).displayRecipe(people);
    break;
case 7:
    new NightRecipes("Fish Fry",
        new String[]{
            "4 fish fillets (Kingfish, Seer fish, or your choice)",
            "1 tsp ginger-garlic paste",
            "1 tsp red chili powder",
            "1/2 tsp turmeric powder",
            "1 tsp coriander powder",
            "1/2 tsp garam masala",
            "1 tbsp lemon juice",
            "2 tbsp rice flour",
            "Salt - to taste",
            "8-10 curry leaves",
            "3 tbsp oil"
        },
        new String[]{
            "Clean the fish fillets and pat them dry with a paper towel.",
            "In a bowl, mix ginger-garlic paste, red chili powder, turmeric powder, coriander powder, garam masala, lemon juice, salt, and rice flour to form a thick marinade.",
            "Coat the fish fillets evenly with the marinade and let them marinate for at least 30 minutes.",
            "Heat oil in a pan over medium heat.",
            "Add curry leaves to the hot oil.",
            "Place the marinated fish fillets in the pan and fry until golden brown and cooked through, about 4–5 minutes per side.",
            "Remove the fish from the pan and drain excess oil on a paper towel.",
            "Serve hot with rice or as an appetizer."
        },
        "https://youtu.be/FszFhprMBmQ?si=INsUeD-IP2_qf5uT"
    ).displayRecipe(people);
    break;
case 8:
    new NightRecipes("Tomato Rice",
        new String[]{
            "1 cup rice",
            "2 medium tomatoes (chopped)",
            "1/2 cup onion (chopped)",
            "1/2 tsp mustard seeds",
            "1/2 tsp cumin seeds",
            "1/4 tsp turmeric powder",
            "1/2 tsp red chili powder",
            "1/2 tsp garam masala",
            "1/4 tsp asafoetida",
            "1 sprig curry leaves",
            "2 tbsp oil",
            "Salt - to taste"
        },
        new String[]{
            "Cook rice and set aside.",
            "In a pan, heat oil and add mustard seeds; let them splutter.",
            "Add cumin seeds, curry leaves, and chopped onions; sauté until onions turn translucent.",
            "Add chopped tomatoes and cook until they soften.",
            "Add turmeric powder, red chili powder, garam masala, and salt; mix well.",
            "Add the cooked rice to the pan and mix gently.",
            "Serve hot."
        },
        "https://youtu.be/zvubs5PoHK4?si=Emp7GaTvGZJ9h8TV"
    ).displayRecipe(people);
    break;
case 9:
    new EveningRecipes("Tamarind Rice",
        new String[]{
            "1 cup rice",
            "2 tbsp tamarind paste",
            "1 tsp jaggery, grated",
            "Salt - to taste",
            "2 tbsp oil",
            "1/2 tsp mustard seeds",
            "1 tsp black gram dal (urad dal)",
            "1 tsp Bengal gram dal (chana dal)",
            "2 dried red chilies",
            "2 green chilies, slit",
            "8-10 curry leaves",
            "1/4 tsp asafoetida",
            "1/4 tsp turmeric powder",
            "1 tsp sesame seeds",
            "2 tbsp peanuts"
        },
        new String[]{
            "Cook the rice and let it cool.",
            "In a pan, heat oil and add mustard seeds.",
            "Once they splutter, add black gram dal, Bengal gram dal, red chilies, green chilies, and curry leaves.",
            "Sauté until the dals turn golden brown.",
            "Add asafoetida and turmeric powder; sauté for a minute.",
            "Add tamarind paste, jaggery, and salt; cook until the mixture thickens.",
            "Add sesame seeds and peanuts; mix well.",
            "Combine the tamarind mixture with the cooled rice.",
            "Serve hot."
        },
        "https://youtu.be/XpSaUF--Vz0?si=OJ8kx06jbQDs98I6"
    ).displayRecipe(people);
    break;
case 10:
    new EveningRecipes("Curd Rice with Mango Pickle",
        new String[]{
            "1 cup cooked rice",
            "1/2 cup fresh curd (yogurt)",
            "Salt - to taste",
            "8-10 curry leaves",
            "1/2 tsp mustard seeds",
            "1 tsp urad dal (black gram dal)",
            "1 tsp ginger, finely chopped",
            "1 green chili, chopped",
            "2 tsp oil"
        },
        new String[]{
            "In a bowl, mix the cooked rice with fresh curd and salt.",
            "In a pan, heat oil and add mustard seeds.",
            "Once they splutter, add urad dal, chopped ginger, and green chilies.",
            "Sauté until the dal turns golden brown.",
            "Add curry leaves and sauté for a minute.",
            "Pour this tempering over the curd rice and mix well.",
            "Serve the curd rice with a side of mango pickle."
        },
        "https://youtu.be/xaPiRmxRSc8?si=XgvGbDXRY1bQ0ezl"
    ).displayRecipe(people);
    break;
    default:
                System.out.println("Invalid choice! Please select between 1–10.");
        }
    }
}
public class Cookify {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Welcome to the Recipe Recommender!");
            System.out.println("Choose a time of the day:");
            System.out.println("1. Morning \n2. Afternoon\n3. Evening\n4. Night\n5. Exit");
            int timeChoice = MorningRecipes.getInt(sc, "Enter your choice: ");

            switch (timeChoice) {
                case 1:
                    MorningRecipes.showMenu(sc);
                    break;
                case 2:
                    AfternoonRecipes.showMenu(sc);
                    break;
                case 3:
                    EveningRecipes.showMenu(sc);
                    break;
                case 4:
                    NightRecipes.showMenu(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using Recipe Recommender! Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
                    break;
            }

            if (continueProgram) {
                System.out.print("Would you like to view another recipe? (y/n): ");
                String again = sc.next();
                if (!again.equalsIgnoreCase("y")) {
                    continueProgram = false;
                    System.out.println("Thank you for using Recipe Recommender! Goodbye!");
                }
            }
        }
        sc.close();
    }
}
