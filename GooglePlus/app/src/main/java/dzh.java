import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import java.util.Calendar;
import java.util.TimeZone;

public final class dzh
  extends eab
  implements gik
{
  private int V = -1;
  private qdj a;
  private dzq b;
  
  public dzh(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dzh(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dzh(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.b = new dzq(paramContext, paramAttributeSet, 0);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.V = -1;
    this.b.D_();
  }
  
  public final void E_()
  {
    onClick(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.V = paramInt2;
    this.b.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    return paramInt2 + this.b.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.b.getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    try
    {
      this.a = ((qdj)qat.b(new qdj(), arrayOfByte, 0, arrayOfByte.length));
      return;
    }
    catch (qas localqas)
    {
      Log.e("ShowtimeEventCardViewGroup", "Unable to parse HoaPlusEvent from the stored event.", localqas);
    }
  }
  
  public final void a(StringBuilder paramStringBuilder)
  {
    if (this.b != null)
    {
      CharSequence[] arrayOfCharSequence = new CharSequence[1];
      arrayOfCharSequence[0] = ((String)this.b.getContentDescription());
      efj.a(paramStringBuilder, arrayOfCharSequence);
    }
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    dzq localdzq;
    String str1;
    dzp localdzp;
    qdj localqdj2;
    long l;
    qdc localqdc2;
    if (this.a != null)
    {
      removeView(this.b);
      addView(this.b);
      a(paramhfa, this.K);
      localdzq = this.b;
      qdj localqdj1 = this.a;
      str1 = this.g;
      String str2 = this.h;
      localdzq.removeAllViews();
      localdzq.a = localqdj1;
      if (localdzq.a != null)
      {
        localdzq.addView(localdzq.c);
        localdzq.c.a(localdzq.a, str1, str2, false);
        localdzq.setBackgroundColor(0);
        localdzp = localdzq.b;
        localqdj2 = localdzq.a;
        if (localdzq.a.n == null) {
          break label403;
        }
        if (localdzq.b() == null) {
          break label391;
        }
        l = localdzq.b().b.longValue();
        if (localdzq.a.o == null) {
          break label397;
        }
        localqdc2 = (qdc)localdzq.a.o.b(qdc.a);
        label187:
        if ((l <= 0L) || ((localqdc2 != null) && (localqdc2.b.longValue() > 0L))) {
          break label403;
        }
      }
    }
    Resources localResources;
    label391:
    label397:
    label403:
    for (int i = 1;; i = 0)
    {
      localdzp.b = str1;
      localResources = localdzp.getResources();
      if (TextUtils.isEmpty(localqdj2.b)) {
        break label409;
      }
      localdzp.c = localqdj2.b;
      efj.i(localdzp);
      qdc localqdc1 = (qdc)localqdj2.h.b(qdc.a);
      qbe localqbe = localqdj2.h;
      TimeZone localTimeZone = null;
      if (localqbe != null)
      {
        String str3 = localqdc1.c;
        localTimeZone = null;
        if (str3 != null) {
          localTimeZone = hxk.a(localqdc1.c);
        }
      }
      Calendar localCalendar = Calendar.getInstance();
      boolean bool = efj.a(localCalendar.getTimeInMillis(), localCalendar.getTimeZone(), localqdc1.b.longValue(), localTimeZone, true);
      localdzp.d = efj.a(localdzp.getContext(), localqdc1.b.longValue(), localqdc1.c, false, null, bool);
      localdzq.addView(localdzq.b);
      this.b.d = this;
      return;
      l = 0L;
      break;
      localqdc2 = null;
      break label187;
    }
    label409:
    if (i != 0) {}
    for (int j = aau.dh;; j = aau.di)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = dzp.a.a.a(localdzp.b);
      localdzp.c = localResources.getString(j, arrayOfObject);
      break;
    }
  }
  
  public final Intent b(boolean paramBoolean)
  {
    Intent localIntent = super.b(paramBoolean);
    if (localIntent != null)
    {
      localIntent.putExtra("event_id", this.a.g);
      localIntent.putExtra("owner_id", this.a.d);
    }
    return localIntent;
  }
  
  public final boolean f()
  {
    return this.R == 0;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = this.b.getMeasuredHeight();
    if ((this.V != -1) && (i != 0)) {
      this.b.layout(this.B, this.V, this.B + this.b.getMeasuredWidth(), i + this.V);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzh
 * JD-Core Version:    0.7.0.1
 */