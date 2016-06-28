import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.StaleDataException;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.views.EventThemeView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class dar
  extends hqf
{
  public bzu a;
  public boolean b;
  public HashMap<String, bqy> c;
  private dwb d;
  private dat e;
  
  public dar(Context paramContext, ColumnGridView paramColumnGridView, dat paramdat, dwb paramdwb)
  {
    super(paramContext, (byte)0);
    hqg localhqg1 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg4 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg4, 0, this.aO);
      this.aN = arrayOfhqg4;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg3 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg3, 0, this.aO);
      this.aN = arrayOfhqg3;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int j = this.aO;
    this.aO = (j + 1);
    arrayOfhqg2[j] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
    this.e = paramdat;
    this.d = paramdwb;
    efj.b(efj.K(paramContext));
    this.b = true;
    paramColumnGridView.a = false;
    paramColumnGridView.a(efj.x(paramContext));
    int k = (int)paramContext.getResources().getDimension(ehr.ef);
    paramColumnGridView.b(k);
    paramColumnGridView.setPadding(k, 0, k, 0);
    das localdas = new das(this);
    paramColumnGridView.e.c = localdas;
  }
  
  private final void a(dwc paramdwc, Cursor paramCursor)
  {
    int i = paramCursor.getInt(1);
    long l = paramCursor.getLong(4);
    List localList = ((bqu)bqo.d.a(paramCursor.getBlob(5))).people;
    if (this.c != null) {
      for (int m = -1 + localList.size(); m >= 0; m--)
      {
        bqw localbqw2 = (bqw)localList.get(m);
        if (localbqw2.gaiaId != null)
        {
          bqy localbqy = (bqy)this.c.get(localbqw2.gaiaId);
          if (localbqy != null)
          {
            localbqw2.name = localbqy.a;
            localbqw2.avatarUrl = localbqy.b;
          }
        }
      }
    }
    dwb localdwb = this.d;
    Drawable localDrawable;
    switch (i)
    {
    case 3: 
    default: 
      localDrawable = null;
    }
    ArrayList localArrayList;
    int j;
    for (;;)
    {
      if (localDrawable != null) {
        paramdwc.c.setImageDrawable(localDrawable);
      }
      localArrayList = new ArrayList();
      j = localList.size();
      for (int k = 0; k < j; k++)
      {
        bqw localbqw1 = (bqw)localList.get(k);
        if (localbqw1.name != null) {
          localArrayList.add(localbqw1);
        }
      }
      localDrawable = dwc.b;
      continue;
      localDrawable = dwc.a;
      continue;
      localDrawable = null;
    }
    paramdwc.e.a(localArrayList, localdwb, j);
    paramdwc.d.setText(lwd.a(paramdwc.getContext(), l));
    paramdwc.f.setText(paramdwc.a(i, localArrayList));
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      i = 4;
      return i;
      return 0;
      Cursor localCursor = this.aN[i].c;
      if ((localCursor != null) && (!localCursor.isClosed()))
      {
        localCursor.moveToPosition(paramInt2);
        switch (localCursor.getInt(i))
        {
        }
      }
    }
    return 3;
    return 2;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    localObject = null;
    switch (paramInt1)
    {
    }
    do
    {
      return localObject;
      dwl localdwl = new dwl(paramContext);
      localdwl.setId(aaw.dm);
      return localdwl;
      bool = this.b;
      try
      {
        int j = paramCursor.getInt(1);
        i = j;
      }
      catch (StaleDataException localStaleDataException)
      {
        for (;;)
        {
          int i = 0;
        }
        localObject = new dwe(paramContext);
        continue;
        localObject = new dwd(paramContext);
        bool = false;
        continue;
        localObject = new dwc(paramContext);
        continue;
        localObject = new dvm(paramContext);
        continue;
      }
      localObject = null;
      switch (i)
      {
      }
    } while ((localObject == null) || (!bool));
    ((View)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    return localObject;
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    if (paramCursor.isClosed()) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    for (;;)
    {
      dwl localdwl1;
      String str6;
      int n;
      boolean bool5;
      int i3;
      try
      {
        localdwl1 = (dwl)paramView;
        hxj localhxj = bqo.a(paramCursor, 1, 2);
        byte[] arrayOfByte2 = paramCursor.getBlob(3);
        if (arrayOfByte2 != null)
        {
          locallmj = lmj.a(arrayOfByte2);
          String str5 = hdo.b(paramCursor.getString(9));
          if (localhxj == null) {
            break;
          }
          bzu localbzu = this.a;
          dwb localdwb2 = this.d;
          dwn localdwn;
          qdu localqdu1;
          int j;
          dwo localdwo;
          Resources localResources;
          qdu localqdu2;
          String str8;
          boolean bool3;
          if ((!localdwl1.g) && (!localbzu.d))
          {
            if ((localdwl1.d) || (localbzu.e)) {
              break label1986;
            }
            i5 = 1;
            if ((i5 != 0) && (localdwl1.f)) {
              localdwl1.b();
            }
          }
          else
          {
            localdwn = localdwl1.a;
            if (!localdwl1.d) {
              break label1992;
            }
            localdwl2 = null;
            boolean bool2 = localdwl1.e;
            localdwn.u = localhxj;
            localdwn.v = locallmj;
            if (localdwn.v == null) {
              localdwn.v = new lmj();
            }
            localqdu1 = localdwn.u.f();
            if (localdwn.u.a == null) {
              break label1999;
            }
            i = 0;
            if (i != 0) {
              continue;
            }
            localdwn.h.setVisibility(0);
            localdwn.a(localqdu1.d);
            localdwn.i.setVisibility(8);
            j = 0;
            localdwn.k.a(localdwn.u.c(), str5);
            qdo localqdo = localdwn.u.h();
            if ((localqdo != null) && (!TextUtils.isEmpty(localqdo.c)))
            {
              String str11 = localqdo.c;
              localdwn.k.setContentDescription(str11);
              localdwn.m.setText(str11);
            }
            localdwn.l.setText(localhxj.b());
            localdwn.removeView(localdwn.r);
            localdwn.removeView(localdwn.p);
            localdwn.removeView(localdwn.q);
            if (localdwl2 != null)
            {
              localdwn.addView(localdwn.p);
              localdwn.addView(localdwn.q);
              if (bool2) {
                localdwn.addView(localdwn.r);
              }
            }
            localdwn.s = localdwl2;
            localdwn.t = localdwb2;
            qbz localqbz1 = localqdu1.a;
            if ((localqbz1 == null) || (localqbz1.e == null) || (!localqbz1.e.booleanValue())) {
              continue;
            }
            localdwn.n.setText(dwn.a);
            localdwn.n.setTextColor(dwn.d);
            localdwn.n.setBackgroundDrawable(dwn.c);
            localdwn.n.setVisibility(0);
            localdwn.n.setTextSize(0, dwn.b);
            localdwn.h.F = localdwn;
            if (j != 0) {
              localdwn.i.setOnClickListener(localdwn);
            }
            localdwn.k.setOnClickListener(localdwn);
            localdwn.q.setOnClickListener(localdwn);
            localdwn.o = localbzu.h;
            localdwo = localdwl1.b;
            localdwo.g = localdwb2;
            localResources = localdwo.getResources();
            if (localhxj.b == null) {
              continue;
            }
            str6 = localResources.getString(aau.iP);
            str7 = localResources.getString(aau.iQ);
            localqdu2 = localhxj.f();
            qby localqby = localqdu2.b;
            str8 = localhxj.m();
            if ((localqby == null) || (localqby.a == null) || (TextUtils.isEmpty(localqby.a))) {
              continue;
            }
            SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(localqby.a));
            lxw.a(localSpannableStringBuilder, localdwo, false);
            localdwo.a.setText(localSpannableStringBuilder);
            long l = System.currentTimeMillis();
            TextView localTextView1 = localdwo.f;
            if (!bqo.a(localhxj, l)) {
              break label2005;
            }
            localTextView1.setText(str7);
            localdwo.c.a(localhxj.i(), localhxj.j(), bqo.b(localhxj));
            qdq localqdq = localhxj.l();
            if (localhxj.a == null) {
              break label2012;
            }
            k = 0;
            continue;
            bool3 = bqo.b(localhxj.b);
            if (localqdq == null) {
              continue;
            }
            n = 1;
            if (n == 0) {
              continue;
            }
            localdwo.d.a(n, localqdq, localhxj.i(), localdwb2);
            localdwo.d.setVisibility(0);
            mim localmim = localqdu2.f;
            if ((localhxj.a == null) || (localmim == null) || (TextUtils.isEmpty(localmim.a))) {
              continue;
            }
            dwy localdwy = localdwo.e;
            localdwy.d = localmim.a;
            localdwy.a = null;
            localdwy.b = null;
            localdwy.c = null;
            localdwy.a(true);
            localdwo.e.setVisibility(0);
            if ((!localhxj.g()) || (localbzu.a != 1)) {
              continue;
            }
            localdwo.b.a(localhxj, localbzu, localdwb2);
            localdwo.f.setVisibility(0);
            localdwo.b.setVisibility(0);
            dwr localdwr = localdwl1.c;
            if (System.currentTimeMillis() > localhxj.k()) {}
            qdu localqdu3 = localhxj.f();
            qbz localqbz2 = localqdu3.a;
            if ((localqbz2 == null) || (localqbz2.c == null) || (!localqbz2.c.booleanValue()) || (localbzu.g)) {
              break label2060;
            }
            bool4 = true;
            localdwr.d = bool4;
            if (!localdwr.d) {
              break label2066;
            }
            i1 = 8;
            localdwr.c.setVisibility(i1);
            localdwr.b.setVisibility(i1);
            dws localdws = localdwr.b;
            qbs[] arrayOfqbs = localqdu3.c;
            ArrayList localArrayList = new ArrayList();
            localdws.e = (0 + dws.a(arrayOfqbs, 1, localArrayList) + dws.a(arrayOfqbs, 6, localArrayList) + dws.a(arrayOfqbs, 5, localArrayList));
            localdws.b.a(localArrayList, localdwb2, localdws.e);
            localdws.d = localArrayList.size();
            TextView localTextView2 = localdws.c;
            String str9 = dws.a;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(localdws.e);
            localTextView2.setText(String.format(str9, arrayOfObject));
            localdws.requestLayout();
            localdwr.a = localdwb2;
            localdwr.invalidate();
            return;
          }
          if ((i5 != 0) || (localdwl1.f)) {
            continue;
          }
          localdwl1.b();
          continue;
          qdj localqdj = localdwn.u.b;
          if (localqdu1.d.a.intValue() != 2013050006)
          {
            localdwn.h.setVisibility(0);
            localdwn.a(localqdu1.d);
            localdwn.i.setVisibility(0);
            localdwn.i.a(localqdj, null, str5, true);
            j = 1;
            continue;
          }
          localdwn.h.setVisibility(8);
          continue;
          if ((localqdu1.b.b != null) && (localqdu1.b.b.a != null))
          {
            TextView localTextView3 = localdwn.n;
            Boolean localBoolean = localqdu1.b.b.a;
            boolean bool6;
            if (localBoolean == null)
            {
              bool6 = false;
              if (bool6)
              {
                str10 = dwn.f;
                localTextView3.setText(str10);
                localdwn.n.setTextColor(dwn.g);
                localdwn.n.setBackgroundDrawable(null);
                localdwn.n.setVisibility(0);
              }
            }
            else
            {
              bool6 = localBoolean.booleanValue();
              continue;
            }
            String str10 = dwn.e;
            continue;
          }
          localdwn.n.setVisibility(8);
          continue;
          str6 = localResources.getString(aau.gM);
          str7 = localResources.getString(aau.gN);
          continue;
          if (!TextUtils.isEmpty(str8))
          {
            localdwo.a.setText(str8);
            continue;
          }
          localdwo.a.setText(null);
          continue;
          if (localqdu2.g != null)
          {
            n = 2;
            continue;
          }
          if ((m != 0) && (localbzu.g) && (!bool3))
          {
            Context localContext = localdwo.getContext();
            int i2 = ((git)mbb.a(localContext, git.class)).c();
            bool5 = ((hyi)mbb.a(localContext, hyi.class)).b(bwb.o, i2);
            if (efj.a(localContext, "vnd.google.android.hangouts/vnd.google.android.hangout_on_air_whitelist", i2, true) == null) {
              break label2048;
            }
            i3 = 1;
            break label2024;
            localdwo.d.setVisibility(8);
            continue;
            localdwo.e.setVisibility(8);
            continue;
            localdwo.f.setVisibility(8);
            localdwo.b.setVisibility(8);
            continue;
          }
          switch (paramCursor.getInt(1))
          {
          default: 
            if (this.e == null) {
              break;
            }
            this.e.a(paramInt2);
            return;
          case 5: 
            dwe localdwe = (dwe)paramView;
            dwx localdwx = new dwx();
            localdwx.b = paramCursor.getString(2);
            localdwx.a = paramCursor.getString(3);
            localdwx.c = hdo.b(paramCursor.getString(9));
            localdwx.d = paramCursor.getLong(4);
            localdwx.e = paramCursor.getString(7);
            dwb localdwb1 = this.d;
            if (this.b) {
              break label2072;
            }
            bool1 = true;
            localdwe.a(localdwx, localdwb1, bool1);
            break;
          case 100: 
            dwd localdwd = (dwd)paramView;
            String str1 = paramCursor.getString(2);
            String str2 = paramCursor.getString(3);
            String str3 = hdo.b(paramCursor.getString(9));
            paramCursor.getString(8);
            String str4 = paramCursor.getString(6);
            byte[] arrayOfByte1 = paramCursor.getBlob(5);
            localdwd.a(str2, str1, str3, paramCursor.getLong(4), str4, arrayOfByte1, this.d);
            break;
          case 1: 
          case 2: 
          case 3: 
          case 4: 
            a((dwc)paramView, paramCursor);
            continue;
            n = 0;
            break;
          }
        }
        lmj locallmj = null;
        continue;
        if (k != 1) {
          break label2018;
        }
        m = 1;
        continue;
        int i5 = 0;
      }
      catch (StaleDataException localStaleDataException)
      {
        return;
      }
      label1986:
      continue;
      label1992:
      dwl localdwl2 = localdwl1;
      continue;
      label1999:
      int i = 1;
      continue;
      label2005:
      String str7 = str6;
      continue;
      label2012:
      int k = 1;
      continue;
      label2018:
      int m = 0;
      continue;
      label2024:
      if ((bool5) && (i3 != 0)) {}
      for (int i4 = 1;; i4 = 0)
      {
        if (i4 == 0) {
          break label2058;
        }
        n = 3;
        break;
        label2048:
        i3 = 0;
        break label2024;
      }
      label2058:
      continue;
      label2060:
      boolean bool4 = false;
      continue;
      label2066:
      int i1 = 0;
      continue;
      label2072:
      boolean bool1 = false;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 5;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dar
 * JD-Core Version:    0.7.0.1
 */