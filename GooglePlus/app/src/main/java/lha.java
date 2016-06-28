import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.squares.providers.acl.SquareAvatarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class lha
  extends mca
  implements cw<Cursor>, gos, gpb, hrd, hrx, kym, lzp
{
  private static final String[] a = { "square_id", "square_name", "photo_url", "restricted_domain", "square_streams" };
  private boolean Z;
  private hrs aa;
  private List<lgu> ab;
  private kyl ac;
  private goi ad;
  private hrf b;
  private int c;
  private String d;
  
  private final void a(Cursor paramCursor)
  {
    if (paramCursor == null)
    {
      this.ab = Collections.emptyList();
      if (this.b != null) {
        this.b.aL_();
      }
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramCursor.moveToPosition(-1);
    String str1;
    kzc[] arrayOfkzc;
    String str2;
    while (paramCursor.moveToNext())
    {
      str1 = paramCursor.getString(0);
      if ((!(this.aa instanceof hrr)) || (!((hrr)this.aa).a(170, str1)))
      {
        arrayOfkzc = kzc.a(paramCursor.getBlob(4));
        if ((arrayOfkzc == null) || (arrayOfkzc.length != 1)) {
          break label231;
        }
        str2 = arrayOfkzc[0].a;
      }
    }
    for (String str3 = arrayOfkzc[0].b;; str3 = null)
    {
      lgw locallgw = lgu.a();
      locallgw.b = paramCursor.getString(2);
      String str4 = paramCursor.getString(1);
      if (!TextUtils.isEmpty(paramCursor.getString(3))) {}
      for (boolean bool = true;; bool = false)
      {
        locallgw.a = new lhp(str1, str4, str2, str3, bool);
        localArrayList.add(new lgu(locallgw));
        break;
      }
      this.ab = localArrayList;
      break;
      label231:
      str2 = null;
    }
  }
  
  private final void c(Parcelable paramParcelable)
  {
    if (!this.aa.b())
    {
      gpa.a(paramParcelable, this).a(this.x, "RemoveCirclesWarning");
      return;
    }
    d(paramParcelable);
  }
  
  private final void d(Parcelable paramParcelable)
  {
    this.aa.a();
    this.aa.a(paramParcelable);
    this.ad.a(-1);
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.ab.get(paramInt);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    kzp localkzp1 = new kzp(this.bn, this.c, a);
    String str1 = this.d;
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = DatabaseUtils.sqlEscapeString(str1);
      String str3 = str2.substring(1, -1 + str2.length());
      SQLiteQueryBuilder localSQLiteQueryBuilder = localkzp1.r;
      String str4 = String.valueOf(" AND (square_name LIKE '");
      String str5 = String.valueOf("square_name");
      String str6 = String.valueOf("square_name");
      localSQLiteQueryBuilder.appendWhere(46 + String.valueOf(str4).length() + String.valueOf(str3).length() + String.valueOf(str5).length() + String.valueOf(str3).length() + String.valueOf(str6).length() + String.valueOf(str3).length() + str4 + str3 + "%' OR " + str5 + " LIKE '% " + str3 + "%' OR " + str6 + " GLOB '*[^a-zA-Z0-9'']" + str3 + "*')");
    }
    kzp localkzp2 = localkzp1.a(1);
    if (this.Z) {
      localkzp2.r.appendWhere(" AND restricted_domain!=''");
    }
    return localkzp2;
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    SquareAvatarView localSquareAvatarView = (SquareAvatarView)paramView.findViewById(dl.am);
    lgu locallgu = (lgu)this.ab.get(paramInt);
    String str = locallgu.b;
    if (str != null) {
      localSquareAvatarView.a.a(null, str);
    }
    TextView localTextView = (TextView)paramView.findViewById(dl.an);
    localTextView.setText(locallgu.a.b);
    localTextView.setTextSize(0, g().getDimension(ehr.dS));
    localTextView.setTypeface(localTextView.getTypeface(), 1);
    localTextView.setMaxLines(2);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    localTextView.setIncludeFontPadding(false);
    localTextView.setTextColor(g().getColor(aau.CC));
    efj.a(paramView, new kuw(pjo.u, locallgu.a.a));
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.aa != null) && ((paramParcelable instanceof lgu)))
    {
      if (this.aa.c(paramParcelable)) {
        this.aa.b(paramParcelable);
      }
    }
    else {
      return;
    }
    lgu locallgu = (lgu)paramParcelable;
    if (locallgu.a.c == null)
    {
      this.ac.a(locallgu.a).a(h(), null);
      return;
    }
    c(paramParcelable);
  }
  
  public final void a(View paramView) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(hrf paramhrf)
  {
    this.b = paramhrf;
  }
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      String str = this.d;
      this.d = paramString.trim();
      if (!this.d.equals(str))
      {
        if (!TextUtils.isEmpty(this.d)) {
          break label44;
        }
        a(null);
      }
    }
    return;
    label44:
    k().b(1, null, this);
  }
  
  public final void a(lhp paramlhp)
  {
    lgw locallgw = lgu.a();
    locallgw.a = paramlhp;
    c(new lgu(locallgw));
  }
  
  public final void a(boolean paramBoolean)
  {
    this.Z = paramBoolean;
    a(null);
    k().b(1, null, this);
  }
  
  public final void aM_() {}
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Ym, null);
  }
  
  public final void b(Parcelable paramParcelable)
  {
    d(paramParcelable);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    this.c = ((git)this.bo.a(git.class)).c();
    lzo locallzo = (lzo)this.bo.b(lzo.class);
    if (locallzo != null) {
      locallzo.a(this);
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
    for (this.Z = localgor.a();; this.Z = false)
    {
      this.aa = ((hrs)this.bo.b(hrs.class));
      this.bo.a(kym.class, this);
      this.ac = ((kyl)this.bo.a(kyl.class));
      this.ad = ((goi)this.bo.a(goi.class));
      return;
    }
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    if (this.ab != null) {
      return this.ab.size();
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lha
 * JD-Core Version:    0.7.0.1
 */