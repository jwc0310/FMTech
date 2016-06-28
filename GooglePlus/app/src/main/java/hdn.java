import android.graphics.Bitmap;

final class hdn
  implements ifg
{
  hdn(hdi paramhdi) {}
  
  public final Object a(kba paramkba, Object paramObject)
  {
    Object localObject;
    if ((paramObject instanceof Bitmap)) {
      localObject = (Bitmap)paramObject;
    }
    for (;;)
    {
      Bitmap localBitmap1;
      if (localObject == null)
      {
        return paramObject;
        boolean bool = paramObject instanceof iey;
        localObject = null;
        if (!bool) {
          continue;
        }
        iey localiey = (iey)paramObject;
        localBitmap1 = ((iey)paramObject).a;
        if ((localiey.b < localBitmap1.getWidth()) || (localiey.c < localBitmap1.getHeight())) {
          localObject = Bitmap.createBitmap(localBitmap1, 0, 0, localiey.b, localiey.c);
        }
      }
      else
      {
        Bitmap localBitmap2 = this.a.b.b(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        Bitmap localBitmap3 = lwe.a((Bitmap)localObject, efj.o(this.a.a), localBitmap2);
        this.a.b.a((Bitmap)localObject);
        return localBitmap3;
      }
      localObject = localBitmap1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdn
 * JD-Core Version:    0.7.0.1
 */