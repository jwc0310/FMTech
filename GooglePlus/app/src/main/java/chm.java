import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.util.ArrayList;

final class chm
  extends dme
{
  chm(cgr paramcgr) {}
  
  private final boolean ad(int paramInt, dmx paramdmx)
  {
    boolean bool1 = true;
    if ((this.a.ah == null) || (this.a.ah.intValue() != paramInt)) {
      bool1 = false;
    }
    label372:
    do
    {
      return bool1;
      this.a.ah = null;
      cgr.e(this.a);
      if (paramdmx != null)
      {
        boolean bool2;
        mbf localmbf;
        int i;
        if (paramdmx.c != 200)
        {
          bool2 = bool1;
          if (!bool2) {
            break label372;
          }
          localmbf = this.a.bn;
          switch (this.a.ai)
          {
          default: 
            i = aau.mm;
          }
        }
        for (;;)
        {
          Toast.makeText(localmbf, i, 0).show();
          return false;
          bool2 = false;
          break;
          i = aau.sA;
          continue;
          i = aau.sc;
          continue;
          i = aau.le;
          continue;
          i = aau.fe;
          continue;
          i = aau.fH;
          continue;
          i = aau.ff;
          continue;
          i = aau.fI;
          continue;
          i = aau.st;
          continue;
          i = aau.ed;
          continue;
          i = aau.dY;
          continue;
          i = aau.ec;
          continue;
          i = aau.ee;
          continue;
          i = aau.iE;
          continue;
          i = aau.cG;
          continue;
          i = aau.uW;
          continue;
          i = aau.mp;
        }
      }
      switch (this.a.ai)
      {
      default: 
        return bool1;
      case 16: 
      case 18: 
        this.a.a(bool1);
        Toast.makeText(this.a.bn, cgr.e(this.a.ai), 0).show();
        return bool1;
      }
    } while (this.a.ab == null);
    try
    {
      this.a.aR = false;
      this.a.ac.a(this.a.ab, this.a.bb, this.a.bc);
      this.a.ac.a();
      return bool1;
    }
    catch (NullPointerException localNullPointerException)
    {
      Log.e("stream1upfrag", "Error in container view adapter", localNullPointerException);
      this.a.aR = bool1;
      return bool1;
    }
    Toast.makeText(this.a.bn, cgr.e(this.a.ai), 0).show();
    return bool1;
  }
  
  public final void B(int paramInt, dmx paramdmx)
  {
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label38;
      }
    }
    label38:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        Toast.makeText(this.a.bn, aau.pi, 0).show();
      }
      return;
    }
  }
  
  public final void C(int paramInt, dmx paramdmx)
  {
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label38;
      }
    }
    label38:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        Toast.makeText(this.a.bn, aau.eW, 0).show();
      }
      return;
    }
  }
  
  public final void H(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void R(int paramInt, dmx paramdmx)
  {
    int i;
    if (paramdmx.c != 200)
    {
      i = 1;
      if (i != 0) {
        break label76;
      }
      if (this.a.aL != null) {
        this.a.aL.setText(null);
      }
    }
    label76:
    while ((!kdd.a(paramdmx.d, "INVALID_ACL_EXPANSION")) || (this.a.ah.intValue() != paramInt))
    {
      ad(paramInt, paramdmx);
      new kqf(92).b(this.a.bn);
      this.a.D();
      return;
      i = 0;
      break;
    }
    this.a.ah = null;
    cgr.e(this.a);
    cgr localcgr1 = this.a;
    int j = aau.to;
    String str1 = localcgr1.g().getString(j);
    cgr localcgr2 = this.a;
    if (this.a.am) {}
    for (int k = aau.tp;; k = aau.tq)
    {
      String str2 = localcgr2.g().getString(k);
      cgr localcgr3 = this.a;
      int m = aau.mf;
      lut locallut = lut.b(str1, str2, localcgr3.g().getString(m), null);
      locallut.n = this.a.n;
      locallut.p = 0;
      locallut.a(this.a.x, "StreamPostRestrictionsNotSupported");
      return;
    }
  }
  
  public final void S(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void T(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void U(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void V(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void a(dmx paramdmx)
  {
    ;
    if (localdmx != null) {
      if (localdmx.c == 200) {
        break label70;
      }
    }
    label70:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        dgf localdgf = this.a.ab;
        Object localObject1;
        localdgf.j = localObject1;
        Object localObject2;
        localdgf.k = localObject2;
        Object localObject3;
        localdgf.l = localObject3;
        this.a.ab.a(true);
      }
      ad(paramdmx, localdmx);
      return;
    }
  }
  
  public final void a(int paramInt, gnb paramgnb, dmx paramdmx)
  {
    if (paramdmx.c != 200) {}
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && (paramgnb != null))
      {
        this.a.aJ = paramgnb;
        cgr.d(this.a);
      }
      ad(paramInt, paramdmx);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean, dmx paramdmx)
  {
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label48;
      }
    }
    label48:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.a.aK.add(jjf.c(paramString));
        ad(paramInt, paramdmx);
      }
      return;
    }
  }
  
  public final void a(boolean paramBoolean, dmx paramdmx)
  {
    int i;
    mbf localmbf;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label50;
      }
      i = 1;
      if (i != 0)
      {
        localmbf = this.a.bn;
        if (!paramBoolean) {
          break label55;
        }
      }
    }
    label50:
    label55:
    for (int j = aau.pi;; j = aau.eW)
    {
      Toast.makeText(localmbf, j, 0).show();
      return;
      i = 0;
      break;
    }
  }
  
  public final void b(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    int i;
    bp localbp;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label59;
      }
      i = 1;
      if (i == 0)
      {
        localbp = this.a.f();
        if (!paramBoolean) {
          break label65;
        }
      }
    }
    label59:
    label65:
    for (int j = aau.lf;; j = aau.vf)
    {
      Toast.makeText(localbp, j, 0).show();
      ad(paramInt, paramdmx);
      return;
      i = 0;
      break;
    }
  }
  
  public final void c(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    boolean bool = true;
    int i;
    cgr localcgr;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label51;
      }
      i = bool;
      if (i == 0)
      {
        localcgr = this.a;
        if (paramBoolean) {
          break label57;
        }
      }
    }
    for (;;)
    {
      localcgr.aG = bool;
      ad(paramInt, paramdmx);
      return;
      label51:
      i = 0;
      break;
      label57:
      bool = false;
    }
  }
  
  public final void d(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    boolean bool = true;
    int i;
    cgr localcgr;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label51;
      }
      i = bool;
      if (i == 0)
      {
        localcgr = this.a;
        if (paramBoolean) {
          break label57;
        }
      }
    }
    for (;;)
    {
      localcgr.aE = bool;
      ad(paramInt, paramdmx);
      return;
      label51:
      i = 0;
      break;
      label57:
      bool = false;
    }
  }
  
  public final void o(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
  
  public final void p(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chm
 * JD-Core Version:    0.7.0.1
 */