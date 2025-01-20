package org.itmo.lab3_4.features;

public record TallTalesRandomizer() {
    static String[] massages = {
            " разговаривает о хлебе.",
            " говорит про единорогов.",
            " убеждает пойти за водопад.",
            " говорит, что гдето есть чучело.",
            " говорит, что на небе живут русалки"
    };

    static String getRandomMessage() {
        int i = (int) (Math.random() * ((float) massages.length));
        return massages[i];
    }
}
