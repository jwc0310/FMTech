import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;

public final class clc
  extends ckm
  implements jio, joq
{
  public clc(Context paramContext, bw parambw, cv paramcv, int paramInt)
  {
    super(paramContext, parambw, paramcv, paramInt);
  }
  
  public clc(Context paramContext, bw parambw, cv paramcv, int paramInt1, int paramInt2)
  {
    super(paramContext, parambw, paramcv, paramInt1, paramInt2);
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 2: 
      return new hgl(paramContext);
    case 3: 
    case 4: 
    case 5: 
      return new jop(paramContext);
    }
    return LayoutInflater.from(paramContext).inflate(efj.vA, paramViewGroup, false);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    if ((paramCursor == null) || (paramCursor.isClosed())) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    case 2: 
      hgl localhgl = (hgl)paramView;
      int i8 = paramCursor.getInt(4);
      String str18 = this.o;
      String str19;
      String str20;
      int i9;
      int i11;
      if (str18 == null)
      {
        localhgl.b = null;
        str19 = paramCursor.getString(1);
        str20 = paramCursor.getString(2);
        i9 = paramCursor.getInt(6);
        Context localContext2 = this.aM;
        int i10 = this.d;
        boolean bool6 = ((giz)mbb.a(localContext2, giz.class)).a(i10).c("is_child");
        if ((i8 != 9) && (i8 != 7)) {
          break label206;
        }
        i11 = 1;
        if ((!bool6) || (i11 == 0)) {
          break label212;
        }
      }
      for (boolean bool7 = true;; bool7 = false)
      {
        localhgl.a(str19, i8, str20, i9, bool7);
        return;
        localhgl.b = str18.toUpperCase();
        break;
        i11 = 0;
        break label164;
      }
    case 5: 
      jop localjop3 = (jop)paramView;
      String str2 = this.o;
      String str5;
      boolean bool1;
      boolean bool2;
      String str7;
      String str8;
      int m;
      String str9;
      String str11;
      int n;
      int i2;
      String str14;
      boolean bool4;
      boolean bool5;
      TextView localTextView2;
      if (str2 == null)
      {
        localjop3.l = null;
        localjop3.a = this.c;
        String str3 = paramCursor.getString(0);
        localjop3.b = str3;
        String str4 = paramCursor.getString(2);
        str5 = paramCursor.getString(1);
        String str6 = hdo.b(paramCursor.getString(5));
        if (((!TextUtils.equals(localjop3.c, str4)) || (!TextUtils.equals(localjop3.e, str5))) && (localjop3.f))
        {
          localjop3.ap_();
          localjop3.c = str4;
          localjop3.e = str5;
          localjop3.d = str6;
          localjop3.b();
        }
        if (paramCursor.getInt(12) != 1) {
          break label903;
        }
        bool1 = true;
        localjop3.g = paramCursor.getString(3);
        localjop3.d();
        localjop3.a(bool1, this.p);
        if (paramCursor.getInt(13) != 1) {
          break label909;
        }
        bool2 = true;
        localjop3.u = bool2;
        str7 = paramCursor.getString(11);
        str8 = paramCursor.getString(6);
        if (TextUtils.isEmpty(str8)) {
          break label915;
        }
        m = 1;
        str9 = paramCursor.getString(8);
        boolean bool3 = this.q;
        String str10 = null;
        if (bool3) {
          str10 = paramCursor.getString(9);
        }
        str11 = paramCursor.getString(7);
        String str12 = paramCursor.getString(10);
        localjop3.s = false;
        if (TextUtils.isEmpty(str10)) {
          break label921;
        }
        localjop3.q = true;
        localjop3.r = false;
        localjop3.o.setText(PhoneNumberUtils.formatNumber(str10));
        String str17 = efj.g(localjop3.getContext(), str12);
        if (!TextUtils.isEmpty(str17))
        {
          if (localjop3.p == null)
          {
            Context localContext1 = localjop3.getContext();
            localjop3.p = new TextView(localContext1);
            localjop3.p.setSingleLine(true);
            localjop3.p.setGravity(16);
            localjop3.p.setTextAppearance(localContext1, ehr.dk);
            localjop3.addView(localjop3.p);
          }
          localjop3.p.setText(str17.toUpperCase(Locale.getDefault()));
          localjop3.s = true;
        }
        TextView localTextView1 = localjop3.o;
        if (!localjop3.q) {
          break label1353;
        }
        n = 0;
        localTextView1.setVisibility(n);
        if (localjop3.p != null)
        {
          TextView localTextView3 = localjop3.p;
          if (!localjop3.s) {
            break label1360;
          }
          i2 = 0;
          localTextView3.setVisibility(i2);
        }
        String str13 = String.valueOf(this.b.a(this.d).b("gaia_id"));
        if (str13.length() == 0) {
          break label1367;
        }
        str14 = "g:".concat(str13);
        if ((!this.l) || (m != 0) || (str14.equals(str3))) {
          break label1381;
        }
        bool4 = true;
        localjop3.a(bool4);
        if ((this.l) && (this.n != null)) {
          localjop3.t = this;
        }
        bool5 = true;
        if (str5 != null)
        {
          if (paramInt2 != 0) {
            break label1387;
          }
          bool5 = true;
        }
        localjop3.h = bool5;
        localTextView2 = localjop3.m;
        if (!localjop3.h) {
          break label1424;
        }
      }
      for (int i1 = 0;; i1 = 8)
      {
        localTextView2.setVisibility(i1);
        if (paramInt2 >= -5 + paramCursor.getCount()) {
          e();
        }
        localjop3.e();
        return;
        localjop3.l = str2.toUpperCase(Locale.getDefault());
        break;
        bool1 = false;
        break label376;
        bool2 = false;
        break label419;
        m = 0;
        break label457;
        if (!TextUtils.isEmpty(str11))
        {
          localjop3.q = true;
          if (!TextUtils.isEmpty(str8))
          {
            int i3 = 1;
            int i5;
            for (int i4 = 0;; i4 = i5 + 1)
            {
              i5 = str8.indexOf('|', i4);
              if (i5 == -1) {
                break;
              }
              i3++;
            }
            String str15 = 1 + String.valueOf(str11).length() + "|" + str11;
            Resources localResources1 = localjop3.getResources();
            int i6 = efj.Td;
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = Integer.valueOf(i3);
            arrayOfObject1[1] = str15;
            localResources1.getQuantityString(i6, i3, arrayOfObject1).toUpperCase(Locale.getDefault()).indexOf(str15);
            Resources localResources2 = localjop3.getResources();
            int i7 = efj.Td;
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(i3);
            arrayOfObject2[1] = str11;
            String str16 = localResources2.getQuantityString(i7, i3, arrayOfObject2);
            efj.a(localjop3.o, str16, localjop3.n, localjop3.l, jop.A, localjop3.w);
            localjop3.r = true;
            break label663;
          }
          efj.a(localjop3.o, str11, localjop3.n, localjop3.l, jop.A, localjop3.w);
          localjop3.r = false;
          break label663;
        }
        if (!TextUtils.isEmpty(str8))
        {
          localjop3.q = true;
          localjop3.r = true;
          if (localjop3.a == null) {
            break label663;
          }
          localjop3.o.setText(localjop3.a.a(str8));
          break label663;
        }
        if (!TextUtils.isEmpty(str9))
        {
          localjop3.q = true;
          localjop3.r = false;
          localjop3.o.setText(str9);
          break label663;
        }
        if (!TextUtils.isEmpty(str7))
        {
          localjop3.q = true;
          localjop3.r = false;
          TextView localTextView4 = localjop3.o;
          if (efj.aaz == null) {
            efj.aaz = new lwi();
          }
          localTextView4.setText(Html.fromHtml(str7, null, efj.aaz));
          break label663;
        }
        localjop3.q = false;
        localjop3.r = false;
        localjop3.o.setText(null);
        break label663;
        n = 8;
        break label681;
        i2 = 8;
        break label714;
        str14 = new String("g:");
        break label763;
        bool4 = false;
        break label788;
        if (!paramCursor.moveToPrevious()) {
          break label831;
        }
        if (TextUtils.equals(str5, paramCursor.getString(1))) {
          bool5 = false;
        }
        paramCursor.moveToNext();
        break label831;
      }
    case 3: 
      jop localjop2 = (jop)paramView;
      localjop2.i = this.o;
      localjop2.d();
      localjop2.a(this.l);
      if ((this.l) && (this.n != null)) {
        localjop2.t = this;
      }
      localjop2.e();
      return;
    case 4: 
      label164:
      label206:
      label212:
      label376:
      label763:
      jop localjop1 = (jop)paramView;
      label419:
      label457:
      label714:
      label1360:
      label1367:
      label1381:
      label1387:
      String str1 = this.o;
      label663:
      label681:
      label831:
      label1353:
      localjop1.j = true;
      label788:
      label921:
      localjop1.k = str1;
      label903:
      label909:
      label915:
      localjop1.m.setText(str1);
      label1424:
      localjop1.a(this.l);
      if ((this.l) && (this.n != null)) {
        localjop1.t = this;
      }
      localjop1.e();
      return;
    }
    int i = 8;
    int j = 8;
    int k = 8;
    switch (paramCursor.getInt(0))
    {
    }
    for (;;)
    {
      paramView.findViewById(aaw.eH).setVisibility(i);
      paramView.findViewById(aaw.gc).setVisibility(j);
      paramView.findViewById(aaw.dk).setVisibility(k);
      return;
      i = 0;
      continue;
      j = 0;
      continue;
      k = 0;
    }
  }
  
  public final void a(jop paramjop, int paramInt)
  {
    if (paramInt == 0)
    {
      if (!TextUtils.isEmpty(paramjop.i)) {
        c("add_email_dialog");
      }
    }
    else {
      return;
    }
    if (!TextUtils.isEmpty(paramjop.k))
    {
      c("add_sms_dialog");
      return;
    }
    this.n.a(paramjop.b, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clc
 * JD-Core Version:    0.7.0.1
 */