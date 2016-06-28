import android.graphics.Bitmap;

final class hdm
  implements ifg
{
  hdm(hdi paramhdi) {}
  
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
        int i = ((hdk)paramkba).f;
        if ((((Bitmap)localObject).getWidth() < i) || (((Bitmap)localObject).getHeight() < i))
        {
          Bitmap localBitmap2 = this.a.b.b(i, i);
          Bitmap localBitmap3 = mfo.a((Bitmap)localObject, i, i, localBitmap2);
          if (localBitmap3 != localBitmap2) {
            this.a.b.a(localBitmap2);
          }
          if (localBitmap3 != localObject)
          {
            this.a.b.a((Bitmap)localObject);
            localObject = localBitmap3;
          }
        }
        return lwe.a((Bitmap)localObject);
      }
      localObject = localBitmap1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdm
 * JD-Core Version:    0.7.0.1
 */