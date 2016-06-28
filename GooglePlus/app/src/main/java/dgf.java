import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.HashMap;

public final class dgf
  extends hqi
{
  public llr f;
  public String g;
  public boolean h;
  public boolean i;
  public Spanned j;
  public Spanned k;
  public HashMap<String, Spanned> l;
  private cgr m;
  private hfa n;
  
  public dgf(Context paramContext, cgr paramcgr, hfa paramhfa, llr paramllr)
  {
    super(paramContext, null);
    this.m = paramcgr;
    this.n = paramhfa;
    this.f = paramllr;
  }
  
  private final void a(eab parameab, Cursor paramCursor)
  {
    parameab.o = this.m.ag;
    parameab.a(paramCursor, this.n, this.n.a, this.m.aO);
    parameab.c(true);
    parameab.y = this.f;
    if (this.i)
    {
      if (!TextUtils.isEmpty(this.j)) {
        parameab.l = lww.a(this.j);
      }
      if (!TextUtils.isEmpty(this.k)) {
        parameab.j = lww.a(this.k);
      }
    }
    parameab.a(this.n);
    this.m.b(parameab.L);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView;
    switch (paramCursor.getInt(1))
    {
    default: 
      localView = null;
    case 2: 
      do
      {
        return localView;
        if (!TextUtils.isEmpty(this.g)) {
          break;
        }
        localView = new View(paramContext);
      } while (!this.h);
      localView.setLayoutParams(new lxk(-1, paramContext.getResources().getDimensionPixelSize(efj.YV)));
      return localView;
      TextView localTextView = new TextView(paramContext);
      lxk locallxk = new lxk(-1, -2);
      int i1 = paramContext.getResources().getDimensionPixelSize(efj.nF);
      int i2 = paramContext.getResources().getDimensionPixelSize(efj.nA);
      localTextView.setLayoutParams(locallxk);
      if (this.h) {
        localTextView.setPadding(i2, i1, i2, i2);
      }
      for (;;)
      {
        Resources localResources = paramContext.getResources();
        int i3 = aau.uy;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = this.g;
        arrayOfObject[1] = this.g;
        String str = localResources.getString(i3, arrayOfObject);
        localTextView.setBackgroundColor(0);
        localTextView.setGravity(16);
        localTextView.setText(Html.fromHtml(str));
        return localTextView;
        localTextView.setPadding(i2, i2, i2, i2);
      }
    case 0: 
      return efj.a(paramContext, paramCursor.getString(2), paramCursor.getLong(11));
    }
    return new hfm(paramContext);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    if ((paramView instanceof kbb)) {
      ((kbb)paramView).ap_();
    }
    switch (paramCursor.getInt(1))
    {
    default: 
    case 0: 
      for (;;)
      {
        if ((paramView instanceof kbb)) {
          ((kbb)paramView).b();
        }
        return;
        if ((paramView instanceof lpk))
        {
          lpk locallpk = (lpk)paramView;
          locallpk.i = this.n;
          lpi locallpi = locallpk.f;
          if ((locallpi instanceof eab)) {
            a((eab)locallpi, paramCursor);
          }
        }
        else if ((paramView instanceof eab))
        {
          a((eab)paramView, paramCursor);
        }
      }
    }
    hfm localhfm = (hfm)paramView;
    localhfm.setLayoutParams(new lxk(-1, -2));
    localhfm.c();
    String str1 = paramCursor.getString(6);
    boolean bool1 = this.i;
    SpannableString localSpannableString = null;
    if (bool1)
    {
      HashMap localHashMap = this.l;
      localSpannableString = null;
      if (localHashMap != null)
      {
        boolean bool6 = this.l.containsKey(str1);
        localSpannableString = null;
        if (bool6) {
          localSpannableString = new SpannableString((CharSequence)this.l.get(str1));
        }
      }
    }
    long l1 = paramCursor.getLong(10);
    byte[] arrayOfByte = paramCursor.getBlob(7);
    SpannableStringBuilder localSpannableStringBuilder;
    label262:
    String str2;
    String str3;
    String str5;
    label341:
    boolean bool2;
    label385:
    boolean bool3;
    label407:
    Object localObject;
    label439:
    boolean bool4;
    String str6;
    int i1;
    if (arrayOfByte == null)
    {
      localSpannableStringBuilder = null;
      str2 = paramCursor.getString(2);
      str3 = paramCursor.getString(3);
      localhfm.a(str3);
      localhfm.a(str2, hdo.b(paramCursor.getString(4)));
      gqu localgqu = gqs.b();
      localgqu.a = str1;
      String str4 = String.valueOf(str2);
      if (str4.length() == 0) {
        break label632;
      }
      str5 = "/".concat(str4);
      localgqu.b = str5;
      gqs localgqs = localgqu.a(2).b(1).a();
      localhfm.c.a(localgqs);
      if ((1L & l1) == 0L) {
        break label647;
      }
      bool2 = true;
      localhfm.a(bool2);
      if (paramCursor.getLong(5) == 0L) {
        break label653;
      }
      bool3 = true;
      localhfm.b(bool3);
      lmj locallmj = lmj.a(paramCursor.getBlob(9));
      if (!TextUtils.isEmpty(localSpannableString)) {
        break label659;
      }
      localObject = localSpannableStringBuilder;
      lxw.a((Spannable)localObject, this.m.ag, false);
      localhfm.a((CharSequence)localObject, locallmj.b, locallmj.c);
      long l2 = paramCursor.getLong(8);
      localhfm.a(lwd.c(paramContext, l2), lwd.a(paramContext, l2).toString());
      bool4 = locallmj.c;
      str6 = locallmj.a;
      i1 = locallmj.b;
      if ((l1 & 0x2) == 0L) {
        break label666;
      }
    }
    label647:
    label653:
    label659:
    label666:
    for (boolean bool5 = true;; bool5 = false)
    {
      bgw localbgw = new bgw(paramContext, str2, str3, bool4, str6, i1, bool2, bool3, bool5, paramCursor.getString(6), (Spanned)localObject);
      localhfm.b.a(localbgw);
      localhfm.b();
      efj.a(localhfm, new kuv(pkh.k, str1));
      localhfm.c(true);
      localhfm.requestLayout();
      break;
      localSpannableStringBuilder = lwh.a(ByteBuffer.wrap(arrayOfByte));
      break label262;
      label632:
      str5 = new String("/");
      break label341;
      bool2 = false;
      break label385;
      bool3 = false;
      break label407;
      localObject = localSpannableString;
      break label439;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.i)
    {
      this.i = paramBoolean;
      notifyDataSetChanged();
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((Cursor)getItem(paramInt)).getInt(1);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgf
 * JD-Core Version:    0.7.0.1
 */