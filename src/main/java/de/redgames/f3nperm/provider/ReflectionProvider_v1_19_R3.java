package de.redgames.f3nperm.provider;

import de.redgames.f3nperm.reflection.ReflectionException;
import de.redgames.f3nperm.reflection.Reflections;

public class ReflectionProvider_v1_19_R3 extends ReflectionProvider_v1_19_R1 {
    @Override
    public Object getPlayerConnection(Object entityPlayer) throws ReflectionException {
        return Reflections.get(entityPlayer, "b");
    }

    @Override
    public Object getNetworkManager(Object playerConnection) throws ReflectionException {
        return Reflections.get(playerConnection, "h");
    }
}
