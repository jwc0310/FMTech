import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.Log;

public final class kxb
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  
  public kxb(Context paramContext, int paramInt)
  {
    this.a = paramInt;
    int i = Color.red(paramInt);
    int j = Color.green(paramInt);
    int k = Color.blue(paramInt);
    Resources localResources = paramContext.getResources();
    this.b = paramInt;
    float f = Math.abs(-0.15F);
    this.c = Color.rgb((int)(f * (0 - i) + i), (int)(f * (0 - j) + j), (int)(f * (0 - k) + k));
    int m = (i * 299 + j * 587 + k * 114) / 1000;
    if (Log.isLoggable("SpaceColorSpec", 3))
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Integer.valueOf(j);
      arrayOfObject[2] = Integer.valueOf(k);
      arrayOfObject[3] = Integer.valueOf(m);
      String.format("luma(rgb(%d, %d, %d)) = %d", arrayOfObject);
    }
    if (m <= 180)
    {
      this.d = localResources.getColor(az.F);
      this.e = localResources.getColor(az.G);
      return;
    }
    this.d = localResources.getColor(az.D);
    this.e = localResources.getColor(az.E);
  }
  
  public kxb(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Resources localResources = paramContext.getResources();
    this.a = localResources.getColor(paramInt1);
    this.b = localResources.getColor(paramInt2);
    this.c = localResources.getColor(paramInt3);
    this.d = localResources.getColor(paramInt4);
    this.e = localResources.getColor(paramInt5);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxb
 * JD-Core Version:    0.7.0.1
 */