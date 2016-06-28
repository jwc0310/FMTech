import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.util.SparseArray;

public final class duc
{
  private static final SparseArray<dud> a = new SparseArray();
  
  private static dud a(Context paramContext, int paramInt)
  {
    Object localObject = (dud)a.get(paramInt);
    dud localdud;
    Resources localResources;
    if (localObject == null)
    {
      localdud = new dud();
      localResources = paramContext.getResources();
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      a.put(paramInt, localdud);
      localObject = localdud;
      return localObject;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.oO));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.oP));
      localdud.c = efj.B(paramContext, efj.yo);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.oO));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.oP));
      localdud.c = efj.B(paramContext, efj.yr);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.oO));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.oP));
      localdud.c = efj.B(paramContext, efj.yr);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.oH));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.oI));
      localdud.c = efj.B(paramContext, efj.yo);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.oF));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.oG));
      localdud.c = efj.B(paramContext, efj.yw);
      continue;
      localdud.a = null;
      localdud.b = null;
      localdud.c = efj.B(paramContext, efj.yw);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.pS));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.pS));
      localdud.c = efj.B(paramContext, efj.yw);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.qG));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.qG));
      localdud.c = efj.B(paramContext, efj.yw);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.pQ));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.pQ));
      localdud.c = efj.B(paramContext, efj.yw);
      continue;
      localdud.a = ((NinePatchDrawable)localResources.getDrawable(efj.pR));
      localdud.b = ((NinePatchDrawable)localResources.getDrawable(efj.pR));
      localdud.c = efj.B(paramContext, efj.yw);
    }
  }
  
  public static dvr a(Context paramContext, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, dvs paramdvs, CharSequence paramCharSequence, boolean paramBoolean)
  {
    dud localdud = a(paramContext, 6);
    return new dvr(paramContext, paramBitmap, localdud.a, localdud.b, paramdvs, 0, 0, paramCharSequence, false);
  }
  
  public static dvr a(Context paramContext, CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, dvs paramdvs)
  {
    dud localdud = a(paramContext, paramInt1);
    return new dvr(paramContext, null, paramCharSequence, localdud.c, localdud.a, localdud.b, paramdvs, 0, 0, paramCharSequence, true, 0, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duc
 * JD-Core Version:    0.7.0.1
 */