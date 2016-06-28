import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.photos.viewer.components.shapes.PhotoShapesLayout;
import java.util.List;

public class bbe
{
  bbe(bbf parambbf) {}
  
  public void a(bbc parambbc)
  {
    this.a.ap = null;
    String str1 = parambbc.D;
    if ((parambbc.G) && (!TextUtils.isEmpty(str1)))
    {
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {}
      for (String str3 = "g:".concat(str2);; str3 = new String("g:"))
      {
        Intent localIntent = efj.a(this.a.f(), this.a.ar, str3, null, 0, false);
        this.a.a(localIntent);
        return;
      }
    }
    int i;
    label111:
    int j;
    label131:
    bbc localbbc;
    if (1 == this.a.ad)
    {
      i = 1;
      if (i != 0) {
        break label180;
      }
      j = -1 + this.a.a.size();
      if (j < 0) {
        break label188;
      }
      localbbc = (bbc)this.a.a.get(j);
      if (localbbc != parambbc) {
        break label182;
      }
    }
    label180:
    label182:
    for (boolean bool = true;; bool = false)
    {
      localbbc.G = bool;
      j--;
      break label131;
      i = 0;
      break label111;
      break;
    }
    label188:
    if (parambbc.J == 4) {}
    for (int k = 1;; k = 0)
    {
      if ((k != 0) || (parambbc.J == 100))
      {
        this.a.ab = parambbc;
        this.a.a(3);
      }
      int m = this.a.a.indexOf(parambbc);
      this.a.a.add(0, this.a.a.remove(m));
      this.a.ae = true;
      this.a.aq.requestLayout();
      return;
    }
  }
  
  public void a(bbd parambbd, Long paramLong, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    bbf localbbf5;
    gxz localgxz5;
    Bundle localBundle9;
    if (bbd.a.equals(parambbd))
    {
      localbbf5 = this.a;
      localgxz5 = gxz.dv;
      if (TextUtils.isEmpty(paramString1)) {
        break label693;
      }
      localBundle9 = new Bundle();
      localBundle9.putString("extra_gaia_id", paramString1);
    }
    label270:
    label681:
    label687:
    label693:
    for (Bundle localBundle10 = localBundle9;; localBundle10 = null)
    {
      gxx localgxx5 = (gxx)localbbf5.bo.a(gxx.class);
      gxw localgxw5 = new gxw(localbbf5.bn, localbbf5.ar);
      localgxw5.c = localgxz5;
      localgxw5.d = gya.ae;
      if (localBundle10 != null) {
        localgxw5.h.putAll(localBundle10);
      }
      localgxx5.a(localgxw5);
      this.a.ah.b(paramLong.longValue(), false);
      return;
      bbf localbbf4;
      gxz localgxz4;
      Bundle localBundle7;
      if (bbd.b.equals(parambbd)) {
        if (!TextUtils.isEmpty(paramString3))
        {
          localbbf4 = this.a;
          localgxz4 = gxz.dh;
          if (TextUtils.isEmpty(paramString3)) {
            break label687;
          }
          localBundle7 = new Bundle();
          localBundle7.putString("extra_gaia_id", paramString3);
        }
      }
      for (Bundle localBundle8 = localBundle7;; localBundle8 = null)
      {
        gxx localgxx4 = (gxx)localbbf4.bo.a(gxx.class);
        gxw localgxw4 = new gxw(localbbf4.bn, localbbf4.ar);
        localgxw4.c = localgxz4;
        localgxw4.d = gya.ae;
        if (localBundle8 != null) {
          localgxw4.h.putAll(localBundle8);
        }
        localgxx4.a(localgxw4);
        this.a.ah.a(paramLong.longValue(), paramString3, paramString2);
        return;
        bbf localbbf3;
        gxz localgxz3;
        Bundle localBundle5;
        if (paramBoolean)
        {
          localbbf3 = this.a;
          localgxz3 = gxz.dw;
          if (TextUtils.isEmpty(paramString3)) {
            break label681;
          }
          localBundle5 = new Bundle();
          localBundle5.putString("extra_gaia_id", paramString3);
        }
        for (Bundle localBundle6 = localBundle5;; localBundle6 = null)
        {
          gxx localgxx3 = (gxx)localbbf3.bo.a(gxx.class);
          gxw localgxw3 = new gxw(localbbf3.bn, localbbf3.ar);
          localgxw3.c = localgxz3;
          localgxw3.d = gya.ae;
          if (localBundle6 != null) {
            localgxw3.h.putAll(localBundle6);
          }
          localgxx3.a(localgxw3);
          break label270;
          bbf localbbf2 = this.a;
          gxz localgxz2 = gxz.dj;
          Bundle localBundle3;
          if (!TextUtils.isEmpty(paramString3))
          {
            localBundle3 = new Bundle();
            localBundle3.putString("extra_gaia_id", paramString3);
          }
          for (Bundle localBundle4 = localBundle3;; localBundle4 = null)
          {
            gxx localgxx2 = (gxx)localbbf2.bo.a(gxx.class);
            gxw localgxw2 = new gxw(localbbf2.bn, localbbf2.ar);
            localgxw2.c = localgxz2;
            localgxw2.d = gya.ae;
            if (localBundle4 != null) {
              localgxw2.h.putAll(localBundle4);
            }
            localgxx2.a(localgxw2);
            break label270;
            if (!bbd.c.equals(parambbd)) {
              break;
            }
            bbf localbbf1 = this.a;
            gxz localgxz1 = gxz.di;
            Bundle localBundle1;
            if (!TextUtils.isEmpty(paramString3))
            {
              localBundle1 = new Bundle();
              localBundle1.putString("extra_gaia_id", paramString3);
            }
            for (Bundle localBundle2 = localBundle1;; localBundle2 = null)
            {
              gxx localgxx1 = (gxx)localbbf1.bo.a(gxx.class);
              gxw localgxw1 = new gxw(localbbf1.bn, localbbf1.ar);
              localgxw1.c = localgxz1;
              localgxw1.d = gya.ae;
              if (localBundle2 != null) {
                localgxw1.h.putAll(localBundle2);
              }
              localgxx1.a(localgxw1);
              this.a.ah.a(paramLong.longValue(), paramBoolean);
              return;
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbe
 * JD-Core Version:    0.7.0.1
 */