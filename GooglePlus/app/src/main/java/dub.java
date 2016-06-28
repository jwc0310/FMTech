import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;

public final class dub
{
  public static BitmapDrawable[] a;
  private static dub b;
  
  public static dub a(Context paramContext)
  {
    if (a == null)
    {
      Resources localResources = paramContext.getResources();
      BitmapDrawable[] arrayOfBitmapDrawable = new BitmapDrawable[4];
      arrayOfBitmapDrawable[0] = ((BitmapDrawable)localResources.getDrawable(efj.ou));
      arrayOfBitmapDrawable[1] = ((BitmapDrawable)localResources.getDrawable(efj.oz));
      arrayOfBitmapDrawable[2] = ((BitmapDrawable)localResources.getDrawable(efj.oB));
      arrayOfBitmapDrawable[3] = ((BitmapDrawable)localResources.getDrawable(efj.oD));
      a = arrayOfBitmapDrawable;
      int i = a.length;
      for (int j = 0; j < i; j++)
      {
        a[j].setTileModeX(Shader.TileMode.REPEAT);
        a[j].setTileModeY(Shader.TileMode.REPEAT);
      }
      b = new dub();
    }
    return b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dub
 * JD-Core Version:    0.7.0.1
 */