package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus;

import com.squareup.otto.Bus;

public class BusProvider {

    private static final Bus BUS_INSTANCE = new MainPostingBus();

    private BusProvider() {
    }

    public static Bus getInstance() {
        return BUS_INSTANCE;
    }

    public static void register(Object... objects) {
        for (Object o : objects) {
            if (o != null) {
                BUS_INSTANCE.register(o);
            }
        }
    }

    public static void unregister(Object... objects) {
        for (Object o : objects) {
            if (o != null) {
                BUS_INSTANCE.unregister(o);
            }
        }
    }
}
