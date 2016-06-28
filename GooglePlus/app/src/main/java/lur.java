import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.ImageButton;

public final class lur
{
  private static final ColorStateList a = ColorStateList.valueOf(-921103);
  private static final ColorStateList b = ColorStateList.valueOf(536870912);
  private static final SparseArray<lus> c = new SparseArray();
  
  public static Button a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Button localButton = new Button(paramContext, paramAttributeSet, paramInt1);
    lus locallus = a(paramInt2);
    int i;
    if (locallus != null)
    {
      localButton.setTextAppearance(paramContext, locallus.b);
      if (Build.VERSION.SDK_INT < 21) {
        break label104;
      }
      i = 1;
      if (i == 0) {
        break label110;
      }
      Drawable localDrawable = paramContext.getResources().getDrawable(locallus.a);
      localButton.setBackground(efj.a(localDrawable, locallus.c, localDrawable));
    }
    for (;;)
    {
      localButton.setGravity(16);
      localButton.setPadding(paramInt3, paramInt4, paramInt3, paramInt4);
      return localButton;
      label104:
      i = 0;
      break;
      label110:
      localButton.setBackgroundResource(locallus.a);
    }
  }
  
  private static lus a(int paramInt)
  {
    lus locallus = (lus)c.get(paramInt);
    if (locallus == null)
    {
      locallus = new lus();
      switch (paramInt)
      {
      default: 
        locallus = null;
      }
    }
    for (;;)
    {
      c.put(paramInt, locallus);
      return locallus;
      locallus.a = efj.ZH;
      locallus.b = da.be;
      locallus.c = b;
      continue;
      locallus.a = efj.ZN;
      locallus.b = da.bh;
      locallus.c = b;
      continue;
      locallus.a = efj.ZJ;
      locallus.b = da.bn;
      locallus.c = b;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.ba;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bk;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.aZ;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bf;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bg;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bc;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bd;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.be;
      locallus.c = a;
      continue;
      locallus.a = efj.ZL;
      locallus.b = da.bm;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.bl;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.ba;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.bb;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.aZ;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.bk;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.bc;
      locallus.c = a;
      continue;
      locallus.a = efj.ZM;
      locallus.b = da.bm;
      locallus.c = a;
      continue;
      locallus.a = efj.ZI;
      locallus.b = da.bi;
      locallus.c = a;
      continue;
      locallus.a = efj.ZK;
      locallus.b = da.bj;
      locallus.c = a;
    }
  }
  
  public static ImageButton b(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ImageButton localImageButton = new ImageButton(paramContext, null, 0);
    lus locallus = a(3);
    int i;
    if (locallus != null)
    {
      if (Build.VERSION.SDK_INT < 21) {
        break label84;
      }
      i = 1;
      if (i == 0) {
        break label90;
      }
      Drawable localDrawable = paramContext.getResources().getDrawable(locallus.a);
      localImageButton.setBackground(efj.a(localDrawable, locallus.c, localDrawable));
    }
    for (;;)
    {
      localImageButton.setPadding(paramInt3, 0, paramInt3, 0);
      return localImageButton;
      label84:
      i = 0;
      break;
      label90:
      localImageButton.setBackgroundResource(locallus.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lur
 * JD-Core Version:    0.7.0.1
 */