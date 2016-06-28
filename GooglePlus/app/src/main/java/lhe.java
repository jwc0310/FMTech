import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

public abstract class lhe
  extends hqf
  implements cw<lhi>
{
  private Exception a;
  public final cv b;
  public final int c;
  public boolean d;
  public boolean e;
  public boolean f;
  public String g;
  public final int h;
  public lhj i = new lhj(b());
  public boolean j;
  public final Handler k = new lhg(this);
  private boolean l = true;
  
  public lhe(Context paramContext, bw parambw, cv paramcv, int paramInt1, int paramInt2)
  {
    super(paramContext, (byte)0);
    for (int m = 0; m < 2; m++) {
      a(false, false);
    }
    this.h = 1024;
    lhl locallhl = (lhl)parambw.a("search_results_fragment");
    if (locallhl == null)
    {
      locallhl = new lhl();
      parambw.a().a(locallhl, "search_results_fragment").c();
    }
    for (;;)
    {
      locallhl.a = this.i;
      this.b = paramcv;
      this.c = paramInt1;
      return;
      lhj locallhj = locallhl.a;
      if (locallhj != null)
      {
        this.i = locallhj;
        this.g = this.i.a;
        this.j = true;
      }
    }
  }
  
  public final int a()
  {
    return 2;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  public int a(Exception paramException)
  {
    return 3;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return b(paramContext, paramViewGroup);
    }
    return a(paramContext, paramViewGroup);
  }
  
  public abstract View a(Context paramContext, ViewGroup paramViewGroup);
  
  public final fu<lhi> a(int paramInt, Bundle paramBundle)
  {
    if (paramInt == this.h) {
      return a(this.i.b);
    }
    return null;
  }
  
  public abstract lhh a(String paramString);
  
  public abstract void a(View paramView, int paramInt);
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
    case 0: 
      int m;
      do
      {
        do
        {
          return;
          a(paramView, paramCursor);
        } while (paramInt2 < -4 + paramCursor.getCount());
        boolean bool = TextUtils.isEmpty(this.i.b);
        m = 0;
        if (!bool) {
          m = 1;
        }
      } while (m == 0);
      this.k.post(new lhf(this));
      return;
    }
    a(paramView, paramCursor.getInt(0));
  }
  
  public abstract void a(View paramView, Cursor paramCursor);
  
  public final void a(fu<lhi> paramfu) {}
  
  public abstract View b(Context paramContext, ViewGroup paramViewGroup);
  
  public final void b(String paramString)
  {
    if (TextUtils.equals(this.g, paramString)) {
      return;
    }
    this.i.a(paramString);
    this.k.removeMessages(0);
    this.k.removeMessages(1);
    this.g = paramString;
    if (TextUtils.isEmpty(paramString))
    {
      this.b.a(this.h);
      y();
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("query", this.g);
    this.e = false;
    this.a = null;
    this.f = false;
    this.d = false;
    this.k.sendEmptyMessageDelayed(1, 300L);
    this.b.a(this.h);
    this.b.a(this.h, localBundle, this);
    d();
  }
  
  protected final boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1) {
      return false;
    }
    return super.b(paramInt1, paramInt2);
  }
  
  public abstract String[] b();
  
  protected final void c()
  {
    this.k.removeMessages(0);
    hqr localhqr = this.i.c;
    if (localhqr.getCount() == 0) {
      a(0, localhqr);
    }
  }
  
  public final void d()
  {
    hqr localhqr = new hqr(new String[] { "_id" });
    if (!TextUtils.isEmpty(this.g))
    {
      if (this.g.trim().length() < 2) {
        break label170;
      }
      if (!this.e) {
        break label93;
      }
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(a(this.a));
      localhqr.a(arrayOfObject4);
    }
    label170:
    for (;;)
    {
      if (localhqr.getCount() != 0) {
        c();
      }
      a(1, localhqr);
      return;
      label93:
      if (this.f)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(2);
        localhqr.a(arrayOfObject3);
      }
      else if ((this.d) && ((this.l) || (this.i.c.getCount() > 0)))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(1);
        localhqr.a(arrayOfObject2);
        continue;
        if (this.g.trim().length() < 2)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(5);
          localhqr.a(arrayOfObject1);
        }
      }
    }
  }
  
  public boolean isEmpty()
  {
    return TextUtils.isEmpty(this.g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhe
 * JD-Core Version:    0.7.0.1
 */