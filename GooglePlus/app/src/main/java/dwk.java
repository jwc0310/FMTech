import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public final class dwk
  extends dwp
{
  private static Drawable i;
  private boolean h;
  private ImageView j;
  
  public dwk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    hxk.a(paramContext);
    if (!this.h)
    {
      i = paramContext.getResources().getDrawable(efj.qp);
      this.h = true;
    }
    this.j = new ImageView(paramContext, paramAttributeSet, paramInt);
    this.j.setImageDrawable(i);
  }
  
  public final void a(qdc paramqdc1, qdc paramqdc2, boolean paramBoolean)
  {
    Context localContext = getContext();
    TimeZone localTimeZone1 = null;
    if (paramqdc1 != null)
    {
      String str5 = paramqdc1.c;
      localTimeZone1 = null;
      if (str5 != null) {
        localTimeZone1 = hxk.a(paramqdc1.c);
      }
    }
    boolean bool1 = false;
    String str1 = null;
    if (paramqdc1 != null)
    {
      Long localLong = paramqdc1.b;
      bool1 = false;
      str1 = null;
      if (localLong != null)
      {
        Calendar localCalendar2 = Calendar.getInstance();
        bool1 = efj.a(localCalendar2.getTimeInMillis(), localCalendar2.getTimeZone(), paramqdc1.b.longValue(), localTimeZone1, true);
        str1 = efj.a(localContext, paramqdc1, false, localTimeZone1, bool1);
      }
    }
    boolean bool3;
    if ((paramqdc2 != null) && (paramqdc2.b != null))
    {
      boolean bool2 = efj.a(paramqdc1.b.longValue(), localTimeZone1, paramqdc2.b.longValue(), localTimeZone1, false);
      if ((bool1) && (bool2)) {
        bool3 = true;
      }
    }
    for (String str2 = efj.a(localContext, paramqdc2, true, localTimeZone1, bool3);; str2 = null)
    {
      ArrayList localArrayList = new ArrayList();
      if (str2 != null) {
        localArrayList.add(str2);
      }
      Calendar localCalendar1 = Calendar.getInstance();
      localCalendar1.setTimeInMillis(paramqdc1.b.longValue());
      String str3 = paramqdc1.c;
      TimeZone localTimeZone2 = hxk.a(str3);
      TimeZone localTimeZone3 = localCalendar1.getTimeZone();
      if (localTimeZone2 != null)
      {
        long l1 = hxk.a(localTimeZone3, localCalendar1);
        long l2 = hxk.a(localTimeZone2, localCalendar1);
        if ((!hxk.a(localTimeZone2.getID(), str3)) || ((!paramBoolean) && (l1 == l2))) {}
      }
      for (String str4 = localTimeZone2.getDisplayName();; str4 = null)
      {
        if (str4 != null) {
          localArrayList.add(str4);
        }
        ImageView localImageView = this.j;
        b();
        this.c = localImageView;
        this.d = null;
        this.f = 0;
        if (this.c != null) {
          addView(this.c);
        }
        if (this.d != null) {
          addView(this.d);
        }
        this.g.a(str1, localArrayList);
        return;
        bool3 = false;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwk
 * JD-Core Version:    0.7.0.1
 */