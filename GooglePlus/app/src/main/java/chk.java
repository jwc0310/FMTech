import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.apps.plus.phone.EditPostActivity;
import com.google.android.apps.plus.phone.WritePlaceReviewActivity;

final class chk
  implements gpq
{
  chk(cgr paramcgr) {}
  
  private final boolean a(int paramInt)
  {
    return (this.a.ar != null) && (this.a.ar.d != null) && (this.a.ar.d.a == paramInt);
  }
  
  public final void a(gpr paramgpr)
  {
    int i = 1;
    if (!this.a.i()) {
      return;
    }
    this.a.bk.a(paramgpr);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(i, localgqe.b);
    if (!this.a.ad) {
      localgqe.a = i;
    }
    if (this.a.aw != null) {
      paramgpr.b(aaw.jW);
    }
    int j;
    label110:
    int i1;
    label186:
    int i6;
    label315:
    label344:
    int i5;
    label404:
    label445:
    label465:
    int i4;
    label528:
    label577:
    String str1;
    if ((this.a.ab != null) && (this.a.ab.i))
    {
      j = i;
      if (!TextUtils.isEmpty(this.a.Z))
      {
        gjb localgjb = this.a.b.f();
        String str2 = localgjb.b("gaia_id");
        if ((!localgjb.c("is_google_plus")) || ((this.a.ar != null) && (this.a.ar.e != null))) {
          break label967;
        }
        i1 = i;
        if (!TextUtils.equals(str2, this.a.Z)) {
          break label1020;
        }
        paramgpr.b(aaw.cP);
        paramgpr.b(aaw.cr);
        if ((!this.a.aI) && (!this.a.am) && (!this.a.aH))
        {
          paramgpr.c(aaw.fr).setTitle(this.a.af.a(this.a.au));
          paramgpr.b(aaw.fr);
        }
        if (i1 != 0)
        {
          if (!this.a.aC) {
            break label973;
          }
          i6 = aaw.mc;
          paramgpr.b(i6);
        }
        if (!this.a.aG) {
          break label981;
        }
        paramgpr.b(aaw.cz);
        if (((!this.a.am) && ((!this.a.ak) || (this.a.aF))) || (!this.a.aI))
        {
          if (!this.a.aE) {
            break label994;
          }
          paramgpr.b(aaw.cA);
        }
        if ((this.a.au) && (cgr.a(this.a) == eai.e))
        {
          if (!a(4)) {
            break label1007;
          }
          paramgpr.b(aaw.md);
        }
        if (this.a.aD)
        {
          if (j == 0) {
            break label1137;
          }
          i5 = aaw.jY;
          paramgpr.b(i5);
        }
        if ((this.a.am) && (this.a.ap)) {
          paramgpr.b(aaw.N);
        }
        int i3 = this.a.an;
        if ((i3 != 2) && (i3 != i)) {
          break label1145;
        }
        i4 = i;
        if ((i4 != 0) && ((cgr.a(this.a) == eai.c) || (cgr.a(this.a) == eai.d)))
        {
          if (!a(i)) {
            break label1151;
          }
          paramgpr.b(aaw.me);
        }
      }
      if ((this.a.ar != null) && (this.a.ar.e != null))
      {
        MenuItem localMenuItem = paramgpr.c(aaw.iu);
        Resources localResources = this.a.g();
        int n = aau.kF;
        Object[] arrayOfObject2 = new Object[i];
        arrayOfObject2[0] = this.a.aa;
        localMenuItem.setTitle(localResources.getString(n, arrayOfObject2));
        paramgpr.b(aaw.iu);
      }
      if (!TextUtils.isEmpty(this.a.az))
      {
        if (!TextUtils.isEmpty(this.a.aa)) {
          break label1164;
        }
        str1 = null;
        label698:
        cgr localcgr2 = this.a;
        int m = aau.kN;
        gql localgql = new gql(localcgr2.g().getString(m), this.a.az, str1);
        paramgpr.a(aaw.jN, new gqi(this.a.bn, new gxq(pkh.G), new gxq(pkh.y), localgql));
      }
      if (!TextUtils.isEmpty(this.a.ax))
      {
        gqj localgqj = new gqj(this.a.bl);
        localgqj.a = aau.kQ;
        paramgpr.a(aaw.bZ, new gqi(this.a.bn, new gxq(pkh.p), new gxq(pkh.y), localgqj));
      }
      if ((!this.a.ak) || (this.a.as.l != i)) {
        break label1209;
      }
    }
    for (;;)
    {
      if ((i != 0) && (this.a.bi != null)) {
        paramgpr.b(aaw.ms);
      }
      if ((i == 0) || (this.a.bh == null) || (!this.a.bh.a(this.a.as))) {
        break;
      }
      paramgpr.b(aaw.mr);
      return;
      j = 0;
      break label110;
      label967:
      i1 = 0;
      break label186;
      label973:
      i6 = aaw.fu;
      break label315;
      label981:
      paramgpr.b(aaw.dd);
      break label344;
      label994:
      paramgpr.b(aaw.de);
      break label404;
      label1007:
      paramgpr.b(aaw.hF);
      break label445;
      label1020:
      if ((this.a.an == i) || ((this.a.an == 2) && (this.a.aq != i) && (this.a.aq != 2)))
      {
        paramgpr.b(aaw.ix);
        paramgpr.b(aaw.aA);
        if (i1 == 0) {
          break label1127;
        }
        if (!this.a.aC) {
          break label1129;
        }
      }
      label1084:
      label1127:
      label1129:
      for (int i2 = aaw.mc;; i2 = aaw.fu)
      {
        paramgpr.b(i2);
        break;
        paramgpr.b(aaw.iy);
        break label1084;
        break;
      }
      label1137:
      i5 = aaw.lW;
      break label465;
      label1145:
      i4 = 0;
      break label528;
      label1151:
      paramgpr.b(aaw.hG);
      break label577;
      label1164:
      cgr localcgr1 = this.a;
      int k = aau.kO;
      Object[] arrayOfObject1 = new Object[i];
      arrayOfObject1[0] = this.a.aa;
      str1 = localcgr1.g().getString(k, arrayOfObject1);
      break label698;
      label1209:
      i = 0;
    }
  }
  
  public final void a(tp paramtp)
  {
    this.a.be = paramtp.a();
    paramtp.c(true);
    efj.a(paramtp, true);
    paramtp.d(false);
    paramtp.b(cgr.bd);
    if (this.a.aV)
    {
      paramtp.a(true);
      paramtp.a(new ColorDrawable(this.a.g().getColor(17170445)));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    boolean bool1;
    if (i == aaw.jW)
    {
      this.a.ag.a(this.a.aw);
      bool1 = true;
    }
    int j;
    do
    {
      jtr localjtr;
      do
      {
        jtp localjtp;
        do
        {
          return bool1;
          if (i == aaw.cP)
          {
            int i13 = this.a.b.c();
            if (this.a.aB != null)
            {
              bp localbp = this.a.f();
              String str14 = this.a.aB.i;
              int i14 = this.a.aB.g;
              String str15 = this.a.aB.h;
              String str16 = this.a.d;
              Intent localIntent2 = new Intent(localbp, WritePlaceReviewActivity.class);
              localIntent2.setAction("android.intent.action.VIEW");
              localIntent2.putExtra("account_id", i13);
              localIntent2.putExtra("place_cluster_id", str14);
              localIntent2.putExtra("place_star_rating", i14);
              localIntent2.putExtra("place_review_text", str15);
              localIntent2.putExtra("activity_id", str16);
              this.a.a(localIntent2);
            }
            for (;;)
            {
              return true;
              cgr localcgr8 = this.a;
              mbf localmbf = this.a.bn;
              String str13 = this.a.d;
              Spanned localSpanned = this.a.ax;
              boolean bool2 = this.a.aF;
              boolean bool3 = this.a.am;
              boolean bool4 = this.a.ay;
              Intent localIntent1 = new Intent(localmbf, EditPostActivity.class);
              localIntent1.setAction("android.intent.action.EDIT");
              localIntent1.putExtra("account_id", i13);
              localIntent1.putExtra("activity_id", str13);
              byte[] arrayOfByte = null;
              if (localSpanned != null) {
                arrayOfByte = lwh.a(localSpanned);
              }
              localIntent1.putExtra("content", arrayOfByte);
              localIntent1.putExtra("reshare", bool2);
              localIntent1.putExtra("is_square_post", bool3);
              localIntent1.putExtra("is_only_text", bool4);
              localcgr8.a(localIntent1);
            }
          }
          if (i == aaw.cr)
          {
            cgr localcgr7 = this.a;
            Bundle localBundle3 = gxy.a("extra_activity_id", localcgr7.d);
            gxx localgxx2 = (gxx)localcgr7.bo.a(gxx.class);
            gxw localgxw2 = new gxw(localcgr7.bn);
            localgxw2.c = gxz.T;
            if (localBundle3 != null) {
              localgxw2.h.putAll(localBundle3);
            }
            localgxx2.a(localgxw2);
            int i9 = aau.kK;
            String str10 = localcgr7.g().getString(i9);
            int i10 = aau.pl;
            String str11 = localcgr7.g().getString(i10);
            int i11 = aau.mf;
            String str12 = localcgr7.g().getString(i11);
            int i12 = aau.cM;
            lut locallut4 = lut.a(str10, str11, str12, localcgr7.g().getString(i12), 0, 0);
            locallut4.n = localcgr7;
            locallut4.p = 0;
            locallut4.a(localcgr7.x, "delete_activity");
            return true;
          }
          if (i == aaw.ix)
          {
            cgr localcgr6 = this.a;
            int i5 = aau.kG;
            String str7 = localcgr6.g().getString(i5);
            int i6 = aau.pp;
            String str8 = localcgr6.g().getString(i6);
            int i7 = aau.vS;
            String str9 = localcgr6.g().getString(i7);
            int i8 = aau.ly;
            lut locallut3 = lut.a(str7, str8, str9, localcgr6.g().getString(i8), 0, 0);
            locallut3.n = localcgr6;
            locallut3.p = 0;
            locallut3.a(localcgr6.x, "remove_activity");
            cgr.a(this.a, new gxq(pjo.aL));
            return true;
          }
          if (i == aaw.aA)
          {
            cgr.a(this.a, this.a.Z);
            cgr.a(this.a, new gxq(pjo.h));
            return true;
          }
          if ((i == aaw.N) && (this.a.am))
          {
            lin locallin = this.a.bj;
            String str6 = this.a.al;
            lit locallit = new lit();
            Bundle localBundle2 = new Bundle();
            localBundle2.putString("square_id", str6);
            locallit.f(localBundle2);
            locallit.a(locallin.a.h(), null);
            cgr.a(this.a, new kuw(pjo.aW, this.a.al));
            return true;
          }
          if (i == aaw.hG)
          {
            cgr.b(this.a, 2);
            cgr.a(this.a, new gxq(pjo.aF));
            return true;
          }
          if (i == aaw.me)
          {
            cgr.b(this.a, 1);
            cgr.a(this.a, new gxq(pjo.aQ));
            return true;
          }
          if (i == aaw.hF)
          {
            cgr.c(this.a, 2);
            cgr.a(this.a, new gxq(pjn.Q));
            return true;
          }
          if (i == aaw.md)
          {
            cgr.c(this.a, 1);
            cgr.a(this.a, new gxq(pjn.ae));
            return true;
          }
          if (i == aaw.iy)
          {
            cgr localcgr5 = this.a;
            Bundle localBundle1 = gxy.a("extra_activity_id", localcgr5.d);
            gxx localgxx1 = (gxx)localcgr5.bo.a(gxx.class);
            gxw localgxw1 = new gxw(localcgr5.bn);
            localgxw1.c = gxz.Z;
            if (localBundle1 != null) {
              localgxw1.h.putAll(localBundle1);
            }
            localgxx1.a(localgxw1);
            int i1 = aau.kL;
            String str3 = localcgr5.g().getString(i1);
            int i2 = aau.pq;
            String str4 = localcgr5.g().getString(i2);
            int i3 = aau.mf;
            String str5 = localcgr5.g().getString(i3);
            int i4 = aau.cM;
            lut locallut2 = lut.a(str3, str4, str5, localcgr5.g().getString(i4), 0, 0);
            locallut2.n = localcgr5;
            locallut2.p = 0;
            locallut2.m.putString("activity_id", localcgr5.d);
            locallut2.a(localcgr5.x, "report_activity");
            return true;
          }
          if (i == aaw.fu)
          {
            cgr.b(this.a);
            cgr localcgr4 = this.a;
            gxt localgxt2 = pkh.z;
            String[] arrayOfString2 = new String[1];
            arrayOfString2[0] = this.a.d;
            cgr.a(localcgr4, new kvj(localgxt2, arrayOfString2));
            return true;
          }
          if (i == aaw.mc)
          {
            cgr.b(this.a);
            cgr localcgr3 = this.a;
            gxt localgxt1 = pkh.Q;
            String[] arrayOfString1 = new String[1];
            arrayOfString1[0] = this.a.d;
            cgr.a(localcgr3, new kvj(localgxt1, arrayOfString1));
            return true;
          }
          if (i == aaw.cz)
          {
            cgr.a(this.a, false);
            return true;
          }
          if (i == aaw.dd)
          {
            cgr.a(this.a, true);
            return true;
          }
          if (i == aaw.cA)
          {
            cgr.b(this.a, false);
            return true;
          }
          if (i == aaw.de)
          {
            cgr.b(this.a, true);
            return true;
          }
          if (i == aaw.lW)
          {
            this.a.F();
            return true;
          }
          if (i == aaw.jY)
          {
            cgr localcgr2 = this.a;
            localcgr2.ab.a(false);
            localcgr2.a.a();
            return true;
          }
          if (i == aaw.iq)
          {
            this.a.E();
            return true;
          }
          if (i == 16908332)
          {
            cgr.c(this.a, true);
            return true;
          }
          if (i == aaw.iu)
          {
            cgr localcgr1 = this.a;
            int k = aau.rS;
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localcgr1.aa;
            arrayOfObject[1] = localcgr1.aa;
            String str1 = localcgr1.g().getString(k, arrayOfObject);
            int m = aau.mf;
            String str2 = localcgr1.g().getString(m);
            int n = aau.cM;
            lut locallut1 = lut.a(null, str1, str2, localcgr1.g().getString(n), 0, 0);
            locallut1.n = localcgr1;
            locallut1.p = 0;
            locallut1.m.putString("activity_id", localcgr1.d);
            locallut1.a(localcgr1.x, "reject_inferred_post");
            return false;
          }
          if (i != aaw.mr) {
            break;
          }
          localjtp = this.a.bh;
          bool1 = false;
        } while (localjtp == null);
        this.a.bh.a(this.a.bn, this.a.as);
        return false;
        if (i != aaw.ms) {
          break;
        }
        localjtr = this.a.bi;
        bool1 = false;
      } while (localjtr == null);
      this.a.bi.a();
      return false;
      if (i == aaw.fr)
      {
        if (this.a.aW == 0)
        {
          this.a.a(this.a.ae.a(this.a.b.c(), this.a.d, this.a.at, this.a.aH, false, null, false), 102);
          return false;
        }
        this.a.a(this.a.ae.a(this.a.b.c(), this.a.d, this.a.at, this.a.aH, false, null, false));
        cgr.c(this.a);
        return false;
      }
      if (i == aaw.ec) {
        break;
      }
      j = aaw.dA;
      bool1 = false;
    } while (i != j);
    this.a.bk.a(paramMenuItem);
    return true;
  }
  
  public final void b(tp paramtp)
  {
    paramtp.c(this.a.be);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chk
 * JD-Core Version:    0.7.0.1
 */