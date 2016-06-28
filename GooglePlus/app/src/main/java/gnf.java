import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public class gnf
  extends FrameLayout
  implements View.OnClickListener, cw<Cursor>
{
  private boolean a;
  public final ArrayList<gnb> c = new ArrayList();
  public ViewGroup d;
  public int e = -1;
  public Runnable f;
  public boolean g;
  public boolean h;
  
  public gnf(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public gnf(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public gnf(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, false);
  }
  
  public gnf(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    this.a = paramBoolean;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (paramInt == aau.xD) {
      return new jma(getContext(), this.e, 5);
    }
    throw new AssertionError();
  }
  
  public void a()
  {
    int i = efj.DJ;
    addView(LayoutInflater.from(getContext()).inflate(i, this, false));
    this.d = ((ViewGroup)findViewById(aau.xJ));
  }
  
  public void a(int paramInt)
  {
    int i = efj.DL;
    View localView = LayoutInflater.from(getContext()).inflate(i, this, false);
    if (this.a) {
      localView.setOnClickListener(this);
    }
    this.d.addView(localView, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, Object paramObject, boolean paramBoolean)
  {
    if (paramInt1 > -1 + d()) {
      a(paramInt1);
    }
    TextView localTextView = (TextView)this.d.getChildAt(paramInt1);
    localTextView.setCompoundDrawablesWithIntrinsicBounds(paramInt2, 0, paramInt3, 0);
    localTextView.setText(paramString);
    boolean bool = paramObject instanceof jgs;
    int i;
    if (paramBoolean)
    {
      i = efj.Dp;
      localTextView.setBackgroundResource(i);
      if (this.a) {
        if (!bool) {
          break label210;
        }
      }
    }
    label210:
    for (int j = aw.aq;; j = aw.ap)
    {
      localTextView.setContentDescription(getContext().getResources().getString(j, new Object[] { paramString }));
      if (localTextView.getVisibility() != 0) {
        localTextView.setVisibility(0);
      }
      localTextView.setTag(paramObject);
      return;
      jgs localjgs;
      if (bool) {
        localjgs = (jgs)paramObject;
      }
      for (;;)
      {
        if (localjgs != null) {
          switch (localjgs.c)
          {
          default: 
            i = efj.Dn;
            break;
            localjgs = null;
            break;
          case 7: 
          case 8: 
          case 9: 
            i = efj.Do;
            break;
          }
        }
      }
      i = efj.Dn;
      break;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gnb paramgnb)
  {
    this.g = true;
    ArrayList localArrayList = new ArrayList(this.c);
    gnb localgnb1 = gnb.a(this.c);
    jgs[] arrayOfjgs1 = localgnb1.c;
    jjd[] arrayOfjjd1 = localgnb1.b;
    lhp[] arrayOflhp1 = localgnb1.d;
    hps[] arrayOfhps1 = localgnb1.e;
    this.c.clear();
    if (paramgnb != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        gnb localgnb3 = (gnb)localArrayList.get(j);
        if (paramgnb.b(localgnb3)) {
          this.c.add(localgnb3);
        }
      }
      jgs[] arrayOfjgs2 = paramgnb.c;
      int k = arrayOfjgs2.length;
      int m = 0;
      if (m < k)
      {
        jgs localjgs = arrayOfjgs2[m];
        gnb localgnb2;
        if (!localjgs.a(arrayOfjgs1))
        {
          localgnb2 = new gnb(localjgs);
          if (localjgs.c != 9) {
            break label187;
          }
          this.c.add(0, localgnb2);
        }
        for (;;)
        {
          m++;
          break;
          label187:
          this.c.add(localgnb2);
        }
      }
      for (jjd localjjd : paramgnb.b) {
        if (!localjjd.a(arrayOfjjd1)) {
          this.c.add(new gnb(localjjd));
        }
      }
      for (lhp locallhp : paramgnb.d) {
        if (!locallhp.a(arrayOflhp1)) {
          this.c.add(new gnb(locallhp));
        }
      }
      for (hps localhps : paramgnb.e) {
        if (!localhps.a(arrayOfhps1)) {
          this.c.add(new gnb(localhps));
        }
      }
    }
    b();
  }
  
  public final void a(jjd paramjjd)
  {
    this.g = true;
    if (paramjjd.a(gnb.a(this.c).b)) {
      return;
    }
    Context localContext = getContext();
    int i = this.e;
    gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
    gxw localgxw = new gxw(localContext, i);
    localgxw.c = gxz.z;
    localgxx.a(localgxw);
    this.c.add(new gnb(paramjjd));
    b();
  }
  
  public void b()
  {
    Iterator localIterator = this.c.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      gnb localgnb = (gnb)localIterator.next();
      jgs[] arrayOfjgs = localgnb.c;
      int m = arrayOfjgs.length;
      int n = 0;
      if (n < m)
      {
        jgs localjgs = arrayOfjgs[n];
        boolean bool = aau.a(getContext(), this.e, localjgs.c);
        String str2;
        label95:
        int i5;
        int i6;
        if (!TextUtils.isEmpty(localjgs.b))
        {
          str2 = localjgs.b;
          i5 = i + 1;
          switch (localjgs.c)
          {
          default: 
            i6 = efj.Dr;
            label137:
            if (!this.a) {
              break;
            }
          }
        }
        for (int i7 = efj.Dq;; i7 = 0)
        {
          a(i, i6, i7, str2, localjgs, bool);
          n++;
          i = i5;
          break;
          str2 = getContext().getString(aw.ar);
          break label95;
          i6 = efj.Dw;
          break label137;
          i6 = efj.Du;
          break label137;
          i6 = efj.Ds;
          break label137;
        }
      }
      jjd[] arrayOfjjd = localgnb.b;
      int i1 = arrayOfjjd.length;
      int i2 = 0;
      label233:
      jjd localjjd;
      String str1;
      label265:
      int i3;
      if (i2 < i1)
      {
        localjjd = arrayOfjjd[i2];
        if (TextUtils.isEmpty(localjjd.b)) {
          break label304;
        }
        str1 = localjjd.b;
        i3 = i + 1;
        if (!this.a) {
          break label340;
        }
      }
      label304:
      label340:
      for (int i4 = efj.Dq;; i4 = 0)
      {
        a(i, 0, i4, str1, localjjd, false);
        i2++;
        i = i3;
        break label233;
        break;
        if (!TextUtils.isEmpty(localjjd.c))
        {
          str1 = localjjd.c;
          break label265;
        }
        str1 = getResources().getString(17039374);
        break label265;
      }
    }
    int j = d();
    while (i < j)
    {
      this.d.getChildAt(i).setVisibility(8);
      i++;
    }
    for (int k = -1 + this.d.getChildCount(); k >= 0; k--)
    {
      View localView = this.d.getChildAt(k);
      if (localView.getVisibility() == 8) {
        this.d.removeView(localView);
      }
    }
    if (this.f != null) {
      this.f.run();
    }
  }
  
  public final void b(jjd paramjjd)
  {
    this.g = true;
    Iterator localIterator = this.c.iterator();
    gnb localgnb;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localgnb = (gnb)localIterator.next();
    } while ((localgnb.b.length != 1) || (localgnb.c.length != 0) || (!jjd.a(localgnb.b[0], paramjjd)));
    for (;;)
    {
      if (localgnb != null)
      {
        this.c.remove(localgnb);
        b();
      }
      return;
      localgnb = null;
    }
  }
  
  public int d()
  {
    return this.d.getChildCount();
  }
  
  public void e()
  {
    if (this.c.isEmpty()) {
      return;
    }
    this.g = true;
    int i = -1 + this.c.size();
    this.c.remove(i);
    b();
  }
  
  public void onClick(View paramView)
  {
    if (!this.a) {}
    int j;
    do
    {
      return;
      Context localContext = getContext();
      int i = this.e;
      gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
      gxw localgxw = new gxw(localContext, i);
      localgxw.c = gxz.cW;
      localgxx.a(localgxw);
      j = this.d.indexOfChild(paramView);
    } while (j == -1);
    this.g = true;
    this.c.remove(j);
    b();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    gng localgng = (gng)paramParcelable;
    super.onRestoreInstanceState(localgng.getSuperState());
    this.c.clear();
    this.c.addAll(localgng.a);
    this.g = localgng.b;
    this.h = localgng.c;
    b();
  }
  
  public Parcelable onSaveInstanceState()
  {
    gng localgng = new gng(super.onSaveInstanceState());
    localgng.a = this.c;
    localgng.b = this.g;
    localgng.c = this.h;
    return localgng;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gnf
 * JD-Core Version:    0.7.0.1
 */