import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.List;

final class doz
  implements kex
{
  doz(doq paramdoq) {}
  
  public final boolean a(ket paramket, Object paramObject)
  {
    String str1 = paramket.s;
    List localList = ((hba)mbb.a(this.a.bn, hba.class)).e();
    doq localdoq1 = this.a;
    int i = aau.or;
    Boolean localBoolean5;
    if (TextUtils.equals(localdoq1.g().getString(i), str1))
    {
      localBoolean5 = (Boolean)paramObject;
      dnt localdnt = (dnt)this.a.Z.a.get(0);
      if ((localList.isEmpty()) && (localBoolean5.booleanValue())) {
        localdnt.a(null);
      }
    }
    doq localdoq6;
    int i1;
    do
    {
      for (;;)
      {
        return true;
        if (!localBoolean5.booleanValue())
        {
          new AlertDialog.Builder(this.a.bn).setMessage(aau.uZ).setNeutralButton(aau.mg, null).create().show();
          new dpa(this, localList).execute(null);
          return true;
          if ((paramket instanceof dnt))
          {
            dob localdob = (dob)paramket;
            String str4 = (String)paramObject;
            String str5 = localdob.e;
            if ((TextUtils.isEmpty(str5)) || (!str5.equals(str4)))
            {
              new dpb(this, localList, str4).execute(null);
              return true;
            }
          }
          else
          {
            doq localdoq2 = this.a;
            int j = aau.nO;
            if (TextUtils.equals(localdoq2.g().getString(j), str1))
            {
              Boolean localBoolean4 = (Boolean)paramObject;
              doq localdoq7 = this.a;
              if (localBoolean4.booleanValue()) {}
              for (gxz localgxz = gxz.p;; localgxz = gxz.q)
              {
                doq.a(localdoq7, localList, localgxz);
                new dpd(this, localBoolean4).execute(null);
                return true;
              }
            }
            doq localdoq3 = this.a;
            int k = aau.nA;
            if (TextUtils.equals(localdoq3.g().getString(k), str1))
            {
              new dpe(this, (Boolean)paramObject).execute(null);
              return true;
            }
            doq localdoq4 = this.a;
            int m = aau.mO;
            if (TextUtils.equals(localdoq4.g().getString(m), str1))
            {
              String str3 = (String)paramObject;
              Boolean localBoolean3;
              if (TextUtils.equals(str3, "WIFI_ONLY"))
              {
                doq.a(this.a, localList, gxz.o);
                int i7 = aau.mQ;
                paramket.a_(paramket.l.getString(i7));
                localBoolean3 = Boolean.valueOf(true);
              }
              while ((localBoolean3 != null) && (!localList.isEmpty()))
              {
                new dpf(this, localBoolean3).execute(null);
                return true;
                if (TextUtils.equals(str3, "WIFI_OR_MOBILE"))
                {
                  doq.a(this.a, localList, gxz.n);
                  int i6 = aau.mP;
                  paramket.a_(paramket.l.getString(i6));
                  localBoolean3 = Boolean.valueOf(false);
                }
                else
                {
                  localBoolean3 = null;
                }
              }
            }
            else
            {
              doq localdoq5 = this.a;
              int n = aau.vq;
              if (!TextUtils.equals(localdoq5.g().getString(n), str1)) {
                break;
              }
              String str2 = (String)paramObject;
              Boolean localBoolean2;
              if (TextUtils.equals(str2, "WIFI_ONLY"))
              {
                doq.a(this.a, localList, gxz.m);
                int i5 = aau.vs;
                paramket.a_(paramket.l.getString(i5));
                localBoolean2 = Boolean.valueOf(true);
                hbj.c(this.a.bn);
              }
              while ((localBoolean2 != null) && (!localList.isEmpty()))
              {
                new dpg(this, localBoolean2).execute(null);
                return true;
                if (TextUtils.equals(str2, "WIFI_OR_MOBILE"))
                {
                  doq.a(this.a, localList, gxz.l);
                  int i4 = aau.vr;
                  paramket.a_(paramket.l.getString(i4));
                  localBoolean2 = Boolean.valueOf(false);
                }
                else
                {
                  localBoolean2 = null;
                }
              }
            }
          }
        }
      }
      localdoq6 = this.a;
      i1 = aau.oE;
    } while (!TextUtils.equals(localdoq6.g().getString(i1), str1));
    if (TextUtils.equals((String)paramObject, "FULL"))
    {
      doq.a(this.a, localList, gxz.s);
      int i3 = aau.oC;
      paramket.a_(paramket.l.getString(i3));
    }
    for (Boolean localBoolean1 = Boolean.valueOf(true);; localBoolean1 = Boolean.valueOf(false))
    {
      new dph(this, localList, localBoolean1).execute(null);
      return true;
      doq.a(this.a, localList, gxz.r);
      int i2 = aau.oJ;
      paramket.a_(paramket.l.getString(i2));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doz
 * JD-Core Version:    0.7.0.1
 */