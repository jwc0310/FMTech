import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class bzv
  extends ra
  implements joq
{
  public String f;
  public String g;
  public bzw h;
  public String i;
  
  public bzv(Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    switch (paramCursor.getInt(0))
    {
    default: 
      return null;
    case 0: 
      return LayoutInflater.from(paramContext).inflate(efj.wn, paramViewGroup, false);
    case 1: 
      return new jop(paramContext);
    }
    return LayoutInflater.from(paramContext).inflate(efj.tz, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    switch (paramCursor.getInt(0))
    {
    default: 
      return;
    case 0: 
      int i7 = paramCursor.getInt(11);
      int i8;
      int i9;
      int i10;
      if (paramCursor.getInt(12) == 1)
      {
        i8 = 1;
        i9 = paramCursor.getInt(13);
        switch (i7)
        {
        default: 
          if (i8 != 0) {
            i10 = aau.go;
          }
          break;
        }
      }
      for (;;)
      {
        Context localContext = this.d;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i9);
        String str3 = localContext.getString(i10, arrayOfObject3);
        ((TextView)paramView.findViewById(16908308)).setText(str3);
        return;
        i8 = 0;
        break;
        if (i8 != 0)
        {
          i10 = aau.gm;
        }
        else
        {
          i10 = aau.gn;
          continue;
          i10 = aau.gq;
          continue;
          if (i8 != 0)
          {
            i10 = aau.gp;
          }
          else
          {
            i10 = aau.gr;
            continue;
            i10 = aau.gt;
            continue;
            i10 = aau.gs;
          }
        }
      }
    case 1: 
      jop localjop = (jop)paramView;
      localjop.t = this;
      localjop.b = paramCursor.getString(2);
      String str2 = paramCursor.getString(3);
      localjop.a(str2, hdo.b(paramCursor.getString(4)));
      localjop.g = paramCursor.getString(5);
      localjop.d();
      boolean bool1;
      boolean bool2;
      label348:
      int n;
      int i1;
      if (paramCursor.getInt(15) != 0)
      {
        bool1 = true;
        localjop.a(bool1, this.i);
        if (paramCursor.getInt(16) != 1) {
          break label505;
        }
        bool2 = true;
        localjop.u = bool2;
        n = paramCursor.getInt(11);
        i1 = paramCursor.getInt(9);
        localjop.i = paramCursor.getString(6);
        localjop.d();
        int i2 = paramCursor.getInt(8);
        if (i2 <= 0) {
          break label511;
        }
        Resources localResources2 = this.d.getResources();
        int i6 = efj.xt;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i2);
        localjop.a(localResources2.getQuantityString(i6, i2, arrayOfObject2));
      }
      for (;;)
      {
        localjop.a(aau.bh);
        if ((this.f.equals(this.g)) && (!this.g.equals(str2))) {
          break label558;
        }
        localjop.b(false);
        localjop.e();
        return;
        bool1 = false;
        break;
        label505:
        bool2 = false;
        break label348;
        label511:
        if ((this.f.equals(this.g)) && (n != 1) && (i1 == 2)) {
          localjop.a(this.d.getResources().getString(aau.gu));
        }
      }
      label558:
      int i3 = paramCursor.getInt(10);
      int i4 = 0;
      if (i3 != 0) {
        i4 = 1;
      }
      if (i4 != 0) {}
      for (int i5 = aau.gG;; i5 = aau.gI)
      {
        localjop.a(i5);
        localjop.b(true);
        break;
      }
    }
    int j = paramCursor.getInt(13);
    int k = paramCursor.getInt(14);
    Resources localResources1 = this.d.getResources();
    if (j > k) {}
    for (int m = efj.xt;; m = efj.xu)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(k);
      String str1 = localResources1.getQuantityString(m, k, arrayOfObject1);
      ((TextView)paramView.findViewById(16908308)).setText(str1);
      return;
    }
  }
  
  public final void a(jop paramjop, int paramInt)
  {
    String str1;
    String str2;
    Cursor localCursor;
    if ((paramInt == 3) && (this.h != null))
    {
      str1 = paramjop.c;
      str2 = paramjop.i;
      localCursor = this.c;
      if (!localCursor.moveToFirst()) {
        break label161;
      }
      if (localCursor.isNull(3)) {
        break label186;
      }
    }
    label161:
    label167:
    label186:
    for (String str3 = localCursor.getString(3);; str3 = null)
    {
      if (!localCursor.isNull(6)) {}
      for (String str4 = localCursor.getString(6);; str4 = null)
      {
        int j;
        if (((str3 != null) && (TextUtils.equals(str3, str1))) || ((str4 != null) && (TextUtils.equals(str4, str2)))) {
          if (localCursor.getInt(10) != 0) {
            j = 1;
          }
        }
        for (;;)
        {
          if (j == 0) {
            break label167;
          }
          this.h.b(str1, str2);
          return;
          j = 0;
          continue;
          if (localCursor.moveToNext()) {
            break;
          }
          j = 0;
        }
        this.h.a(str1, str2);
        return;
      }
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    switch (((Cursor)getItem(paramInt)).getInt(0))
    {
    default: 
      return 2;
    case 0: 
      return 0;
    }
    return 1;
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return getItemViewType(paramInt) == 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzv
 * JD-Core Version:    0.7.0.1
 */