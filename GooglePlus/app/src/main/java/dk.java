import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

public final class dk
{
  public Context a;
  public CharSequence b;
  public CharSequence c;
  public PendingIntent d;
  public Bitmap e;
  public CharSequence f;
  public int g;
  public int h;
  boolean i = true;
  public dw j;
  public CharSequence k;
  int l;
  int m;
  boolean n;
  public String o;
  public boolean p;
  public ArrayList<dg> q = new ArrayList();
  public boolean r = false;
  public String s;
  Bundle t;
  public int u = 0;
  public int v = 0;
  public Notification w;
  public Notification x = new Notification();
  public ArrayList<String> y;
  
  public dk(Context paramContext)
  {
    this.a = paramContext;
    this.x.when = System.currentTimeMillis();
    this.x.audioStreamType = -1;
    this.h = 0;
    this.y = new ArrayList();
  }
  
  public static CharSequence a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    while (paramCharSequence.length() <= 5120) {
      return paramCharSequence;
    }
    return paramCharSequence.subSequence(0, 5120);
  }
  
  @Deprecated
  public final Notification a()
  {
    return df.a.a(this, new dl());
  }
  
  public final dk a(int paramInt)
  {
    this.x.defaults = paramInt;
    if ((paramInt & 0x4) != 0)
    {
      Notification localNotification = this.x;
      localNotification.flags = (0x1 | localNotification.flags);
    }
    return this;
  }
  
  public final dk a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = paramBoolean;
    return this;
  }
  
  public final dk a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this.q.add(new dg(paramInt, paramCharSequence, paramPendingIntent));
    return this;
  }
  
  public final dk a(dw paramdw)
  {
    if (this.j != paramdw)
    {
      this.j = paramdw;
      if (this.j != null) {
        this.j.a(this);
      }
    }
    return this;
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Notification localNotification2 = this.x;
      localNotification2.flags = (paramInt | localNotification2.flags);
      return;
    }
    Notification localNotification1 = this.x;
    localNotification1.flags &= (paramInt ^ 0xFFFFFFFF);
  }
  
  public final Notification b()
  {
    return df.a.a(this, new dl());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dk
 * JD-Core Version:    0.7.0.1
 */