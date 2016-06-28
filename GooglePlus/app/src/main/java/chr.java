import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;

public final class chr
  extends cge
{
  private String a;
  private String b;
  
  protected final boolean G()
  {
    return false;
  }
  
  protected final void M_()
  {
    this.aH = efj.x(this.a);
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return super.a(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, null, paramlob);
  }
  
  protected final gzf a(String paramString, byte[] paramArrayOfByte)
  {
    int i = this.at.c();
    return new ltz(this.bn, i, this.a, null);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getString("query");
      this.b = paramBundle.getString("delayed_query");
      this.aH = efj.x(this.a);
      k().a(2, null, this);
      return;
    }
    this.b = this.m.getString("query");
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    switch (paramfu.i)
    {
    default: 
      return;
    case 2: 
      super.a(paramfu, paramCursor);
      return;
    }
    this.az.b(paramCursor, -1);
    ac();
    this.aM = false;
    this.aN = false;
    if (this.aJ)
    {
      hwq localhwq5 = this.aw;
      int j = aau.eD;
      localhwq5.d = null;
      localhwq5.c = j;
      localhwq5.e();
      hwq localhwq6 = this.aw;
      hwt localhwt4 = hwt.c;
      if (localhwt4 == null) {
        throw new NullPointerException();
      }
      localhwq6.g = ((hwt)localhwt4);
      localhwq6.a();
      N_();
      return;
    }
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if ((paramCursor != null) && (paramCursor.getCount() > 0))
    {
      hwq localhwq4 = this.aw;
      hwt localhwt3 = hwt.b;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq4.g = ((hwt)localhwt3);
      localhwq4.a();
      this.aM = TextUtils.isEmpty(this.aB);
    }
    for (;;)
    {
      this.aI = false;
      break;
      if ((localgzj.a("fetch_newer")) || (localgzj.a("fetch_older")))
      {
        if (L_())
        {
          lvz locallvz = this.ax;
          if (locallvz.a != null)
          {
            SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
            if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
              localSwipeRefreshLayoutWithUpScroll.a(true);
            }
          }
        }
      }
      else if (!TextUtils.isEmpty(this.a))
      {
        if (this.aI)
        {
          a(true);
        }
        else if (L_())
        {
          hwq localhwq2 = this.aw;
          int i = aau.lJ;
          localhwq2.d = null;
          localhwq2.c = i;
          localhwq2.e();
          hwq localhwq3 = this.aw;
          hwt localhwt2 = hwt.c;
          if (localhwt2 == null) {
            throw new NullPointerException();
          }
          localhwq3.g = ((hwt)localhwt2);
          localhwq3.a();
        }
      }
      else
      {
        hwq localhwq1 = this.aw;
        hwt localhwt1 = hwt.b;
        if (localhwt1 == null) {
          throw new NullPointerException();
        }
        localhwq1.g = ((hwt)localhwt1);
        localhwq1.a();
      }
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("fetch_newer".equals(paramString)) || ("fetch_older".equals(paramString)))
    {
      paramhaa.c = false;
      this.aJ = hae.a(paramhae);
      af();
      k().b(2, null, this);
      return;
    }
    super.a(paramString, paramhae, paramhaa);
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (TextUtils.isEmpty(this.a))
    {
      N_();
      return;
    }
    if ((paramBoolean) && (L_()))
    {
      lvz locallvz = this.ax;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
    }
    int i = this.at.c();
    ltz localltz = new ltz(f(), i, this.a, this.aB);
    if (paramBoolean) {}
    for (String str = "fetch_newer";; str = "fetch_older")
    {
      localltz.f = str;
      ((gzj)this.bo.a(gzj.class)).b(localltz);
      N_();
      return;
    }
  }
  
  protected final void ac_() {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("query", this.a);
    paramBundle.putString("delayed_query", this.b);
  }
  
  public final void p_()
  {
    if (this.b != null)
    {
      this.a = this.b;
      this.b = null;
      this.aI = true;
      this.aH = efj.x(this.a);
      k().b(2, null, this);
      a(true);
    }
    super.p_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chr
 * JD-Core Version:    0.7.0.1
 */