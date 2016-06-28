import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import java.util.ArrayList;

public final class dws
  extends dwz
{
  public static String a;
  private static boolean f;
  private static float g;
  private static int h;
  public dvb b;
  public TextView c;
  public int d;
  public int e;
  
  public dws(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!f)
    {
      Resources localResources = paramContext.getResources();
      a = localResources.getString(aau.gh);
      g = localResources.getDimension(efj.nK);
      h = localResources.getColor(efj.ko);
      f = true;
    }
    float f1 = g;
    int i = h;
    TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
    localTextView.setTextSize(0, f1);
    localTextView.setSingleLine(true);
    localTextView.setTextColor(i);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    this.c = localTextView;
    addView(this.c);
    this.b = new dvb(paramContext, paramAttributeSet, paramInt);
    addView(this.b);
    this.d = 0;
    this.e = 0;
  }
  
  public static int a(qbs[] paramArrayOfqbs, int paramInt, ArrayList<bqw> paramArrayList)
  {
    qbs localqbs = bqo.a(paramArrayOfqbs, paramInt);
    int i = 0;
    if (localqbs != null)
    {
      if (localqbs.c != null)
      {
        qbr[] arrayOfqbr = localqbs.c;
        int j = arrayOfqbr.length;
        while (i < j)
        {
          qbr localqbr = arrayOfqbr[i];
          if (localqbr.a != null)
          {
            String str1 = localqbr.a.c;
            String str2 = localqbr.a.b;
            String str3 = localqbr.a.d;
            if (str1 != null)
            {
              bqw localbqw = new bqw();
              localbqw.gaiaId = str1;
              localbqw.name = str2;
              localbqw.avatarUrl = str3;
              paramArrayList.add(localbqw);
            }
          }
          i++;
        }
      }
      i = localqbs.b.intValue();
    }
    return i;
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    a(this.c, i, -2147483648, 0, 0);
    a(this.c, 0, 0);
    int j = 0 + this.c.getMeasuredHeight();
    if (this.d > 0)
    {
      a(this.b, i, -2147483648, 0, 0);
      a(this.b, 0, j);
      this.b.getMeasuredHeight();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dws
 * JD-Core Version:    0.7.0.1
 */