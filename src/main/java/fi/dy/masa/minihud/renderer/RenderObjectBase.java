package fi.dy.masa.minihud.renderer;

import net.minecraft.class_4587;
import net.minecraft.client.render.BufferBuilder;

public abstract class RenderObjectBase
{
    protected final int glMode;

    public RenderObjectBase(int glMode)
    {
        this.glMode = glMode;
    }

    public int getGlMode()
    {
        return this.glMode;
    }

    public abstract void uploadData(BufferBuilder buffer);

    public abstract void draw(class_4587 matrixQueue);

    public abstract void deleteGlResources();
}
