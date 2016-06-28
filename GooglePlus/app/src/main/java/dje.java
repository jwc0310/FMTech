import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.profile.viewer.flair.ProfileFlairView;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.views.autoresizetextview.AutoResizeTextView;
import com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView;

final class dje
  extends dfz
{
  jyz a;
  qtl b;
  quj c;
  qub d;
  qtg e;
  String f;
  private Cursor g;
  private final int h = super.getViewTypeCount();
  private qtj i;
  private qtz j;
  private qtf k;
  private ProfileFlairView l;
  private SpaceHeaderView m;
  private Button n;
  private TextView o;
  private TextView p;
  private final djg q;
  
  public dje(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob, djg paramdjg)
  {
    super(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
    this.q = paramdjg;
  }
  
  private final void a(SpannableStringBuilder paramSpannableStringBuilder, String paramString1, lvd paramlvd, String paramString2)
  {
    paramSpannableStringBuilder.append("  ");
    int i1 = -1 + paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.setSpan(paramlvd, i1, i1 + 1, 17);
    SpaceHeaderView localSpaceHeaderView = this.m;
    CharSequence localCharSequence = TextUtils.concat(new CharSequence[] { paramString1, ". ", paramString2 });
    localSpaceHeaderView.b.setContentDescription(localCharSequence);
    localSpaceHeaderView.c();
  }
  
  private final void h()
  {
    int i1 = 8;
    if ((this.l == null) || (this.a == null)) {}
    ProfileFlairView localProfileFlairView;
    jyz localjyz;
    do
    {
      return;
      this.l.a(b());
      localProfileFlairView = this.l;
      localjyz = this.a;
      localProfileFlairView.a.removeAllViews();
      localProfileFlairView.b.removeAllViews();
    } while (localjyz == null);
    if (localjyz.a != null) {}
    for (int i2 = localjyz.a.getCount();; i2 = 0)
    {
      if (localjyz.b != null) {}
      label515:
      label519:
      for (int i3 = localjyz.b.getCount();; i3 = 0)
      {
        int i4 = i2 + i3;
        TextView localTextView1 = localProfileFlairView.c;
        int i5;
        Context localContext;
        int i7;
        label185:
        SpaceListItemView localSpaceListItemView2;
        if (i4 == 0)
        {
          i5 = i1;
          localTextView1.setVisibility(i5);
          TextView localTextView2 = localProfileFlairView.d;
          if ((!TextUtils.isEmpty(localProfileFlairView.c.getText())) && (localjyz.c)) {
            i1 = 0;
          }
          localTextView2.setVisibility(i1);
          if (i4 == 0) {
            break;
          }
          localContext = localProfileFlairView.getContext();
          if (i2 <= 0) {
            break label515;
          }
          localjyz.a.moveToPosition(-1);
          i7 = 0;
          if (!localjyz.a.moveToNext()) {
            break label346;
          }
          localSpaceListItemView2 = localProfileFlairView.e.b(localContext, localProfileFlairView.a);
          localProfileFlairView.f.a(hhb.b, localSpaceListItemView2, localjyz.a, localProfileFlairView.j, localProfileFlairView.i);
          if (i7 >= localProfileFlairView.m) {
            break label302;
          }
          if (localProfileFlairView.a.getChildCount() != 0) {
            break label293;
          }
        }
        label293:
        for (LinearLayout.LayoutParams localLayoutParams4 = localProfileFlairView.l;; localLayoutParams4 = localProfileFlairView.k)
        {
          localSpaceListItemView2.setLayoutParams(localLayoutParams4);
          localProfileFlairView.a.addView(localSpaceListItemView2);
          i7++;
          break label185;
          i5 = 0;
          break;
        }
        label302:
        if (localProfileFlairView.b.getChildCount() == 0) {}
        for (LinearLayout.LayoutParams localLayoutParams3 = localProfileFlairView.l;; localLayoutParams3 = localProfileFlairView.k)
        {
          localSpaceListItemView2.setLayoutParams(localLayoutParams3);
          localProfileFlairView.b.addView(localSpaceListItemView2);
          break;
        }
        label346:
        for (int i6 = i7;; i6 = 0)
        {
          if (i3 <= 0) {
            break label519;
          }
          localjyz.b.moveToPosition(-1);
          label366:
          SpaceListItemView localSpaceListItemView1;
          if (localjyz.b.moveToNext())
          {
            localSpaceListItemView1 = localProfileFlairView.e.b(localContext, localProfileFlairView.a);
            localProfileFlairView.g.a(len.b, localSpaceListItemView1, localjyz.b, localProfileFlairView.h);
            if (i6 >= localProfileFlairView.m) {
              break label471;
            }
            if (localProfileFlairView.a.getChildCount() != 0) {
              break label462;
            }
          }
          for (LinearLayout.LayoutParams localLayoutParams2 = localProfileFlairView.l;; localLayoutParams2 = localProfileFlairView.k)
          {
            localSpaceListItemView1.setLayoutParams(localLayoutParams2);
            localProfileFlairView.a.addView(localSpaceListItemView1);
            i6++;
            break label366;
            break;
          }
          if (localProfileFlairView.b.getChildCount() == 0) {}
          for (LinearLayout.LayoutParams localLayoutParams1 = localProfileFlairView.l;; localLayoutParams1 = localProfileFlairView.k)
          {
            localSpaceListItemView1.setLayoutParams(localLayoutParams1);
            localProfileFlairView.b.addView(localSpaceListItemView1);
            break;
          }
        }
        label462:
        label471:
        break;
      }
    }
  }
  
  private final void k()
  {
    if ((this.g == null) || (!this.g.moveToFirst()) || (this.m == null)) {}
    do
    {
      return;
      this.f = this.g.getString(this.g.getColumnIndexOrThrow("gaia_id"));
    } while (this.f == null);
    this.i = new qtj();
    this.b = new qtl();
    qtt localqtt = new qtt();
    qud localqud = new qud();
    quh localquh = new quh();
    quf localquf = new quf();
    qtv localqtv = new qtv();
    this.d = new qub();
    this.c = new quj();
    this.j = new qtz();
    this.e = new qtg();
    this.k = new qtf();
    for (;;)
    {
      String str1;
      SpannableStringBuilder localSpannableStringBuilder;
      Context localContext;
      Boolean localBoolean1;
      Boolean localBoolean2;
      String str3;
      Long localLong;
      long l1;
      try
      {
        qtj localqtj = this.i;
        byte[] arrayOfByte1 = this.g.getBlob(this.g.getColumnIndexOrThrow("name"));
        qat.b(localqtj, arrayOfByte1, 0, arrayOfByte1.length);
        qtl localqtl = this.b;
        byte[] arrayOfByte2 = this.g.getBlob(this.g.getColumnIndexOrThrow("photo"));
        qat.b(localqtl, arrayOfByte2, 0, arrayOfByte2.length);
        byte[] arrayOfByte3 = this.g.getBlob(this.g.getColumnIndexOrThrow("cover_photo"));
        qat.b(localqtt, arrayOfByte3, 0, arrayOfByte3.length);
        byte[] arrayOfByte4 = this.g.getBlob(this.g.getColumnIndexOrThrow("name_is_verified"));
        qat.b(localqud, arrayOfByte4, 0, arrayOfByte4.length);
        byte[] arrayOfByte5 = this.g.getBlob(this.g.getColumnIndexOrThrow("tagline"));
        qat.b(localquh, arrayOfByte5, 0, arrayOfByte5.length);
        byte[] arrayOfByte6 = this.g.getBlob(this.g.getColumnIndexOrThrow("owner_stats"));
        qat.b(localquf, arrayOfByte6, 0, arrayOfByte6.length);
        byte[] arrayOfByte7 = this.g.getBlob(this.g.getColumnIndexOrThrow("domain"));
        qat.b(localqtv, arrayOfByte7, 0, arrayOfByte7.length);
        quj localquj = this.c;
        byte[] arrayOfByte8 = this.g.getBlob(this.g.getColumnIndexOrThrow("vanity_id"));
        qat.b(localquj, arrayOfByte8, 0, arrayOfByte8.length);
        qub localqub = this.d;
        byte[] arrayOfByte9 = this.g.getBlob(this.g.getColumnIndexOrThrow("local_page"));
        qat.b(localqub, arrayOfByte9, 0, arrayOfByte9.length);
        qtz localqtz = this.j;
        byte[] arrayOfByte10 = this.g.getBlob(this.g.getColumnIndexOrThrow("gender"));
        qat.b(localqtz, arrayOfByte10, 0, arrayOfByte10.length);
        qtg localqtg = this.e;
        byte[] arrayOfByte11 = this.g.getBlob(this.g.getColumnIndexOrThrow("is_plus_page"));
        qat.b(localqtg, arrayOfByte11, 0, arrayOfByte11.length);
        qtf localqtf = this.k;
        byte[] arrayOfByte12 = this.g.getBlob(this.g.getColumnIndexOrThrow("can_edit_profile"));
        qat.b(localqtf, arrayOfByte12, 0, arrayOfByte12.length);
        str1 = b();
        if (this.l != null) {
          this.l.a(str1);
        }
        if (this.o != null)
        {
          TextView localTextView = this.o;
          if (TextUtils.isEmpty(str1))
          {
            str5 = str1;
            localTextView.setText(str5);
          }
        }
        else
        {
          localSpannableStringBuilder = new SpannableStringBuilder(str1);
          localContext = this.aM;
          localBoolean1 = localqud.b;
          if (localBoolean1 != null) {
            break label1007;
          }
          bool1 = false;
          if (!bool1) {
            break label1040;
          }
          lvd locallvd = new lvd(localContext, efj.AR, efj.AK);
          localBoolean2 = this.d.b;
          if (localBoolean2 != null) {
            break label1017;
          }
          bool2 = false;
          if (!bool2) {
            break label1027;
          }
          str2 = localContext.getString(aw.M);
          a(localSpannableStringBuilder, str1, locallvd, str2);
          this.m.a(localSpannableStringBuilder);
          SpaceHeaderView localSpaceHeaderView1 = this.m;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = this.b.b;
          localSpaceHeaderView1.a(arrayOfString, null, localContext.getString(aw.ac));
          this.m.a(localquh.b);
          if (!TextUtils.isEmpty(localqtt.b)) {
            break label1079;
          }
          str3 = localContext.getString(aw.x);
          localqtt.b = str3;
          SpaceHeaderView localSpaceHeaderView2 = this.m;
          ipf localipf = ipf.a(localContext, localqtt.b, ipm.a);
          String str4 = localContext.getString(aw.w);
          localSpaceHeaderView2.a.setContentDescription(str4);
          localSpaceHeaderView2.a(localipf);
          SpaceHeaderView localSpaceHeaderView3 = this.m;
          localLong = localquf.b;
          if (localLong != null) {
            break label1088;
          }
          l1 = 0L;
          localSpaceHeaderView3.a((int)l1, 0, null);
          if (this.q == null) {
            break;
          }
          this.q.a(this.n);
          return;
        }
      }
      catch (qas localqas)
      {
        throw new RuntimeException(localqas);
      }
      String str5 = this.aM.getString(aw.K, new Object[] { str1 });
      continue;
      label1007:
      boolean bool1 = localBoolean1.booleanValue();
      continue;
      label1017:
      boolean bool2 = localBoolean2.booleanValue();
      continue;
      label1027:
      String str2 = localContext.getString(aw.N);
      continue;
      label1040:
      if (localqtv.b != null)
      {
        a(localSpannableStringBuilder, str1, new lvd(localContext, efj.AP, efj.AL), localqtv.b);
        continue;
        label1079:
        str3 = localqtt.b;
        continue;
        label1088:
        l1 = localLong.longValue();
      }
    }
  }
  
  @TargetApi(21)
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    lpt locallpt = new lpt(-2);
    locallpt.setMargins(-this.ay.f, -this.ay.d, -this.ay.f, 0);
    locallpt.a = this.ay.a;
    if (paramCursor.getPosition() == 0)
    {
      LinearLayout localLinearLayout2 = (LinearLayout)LayoutInflater.from(paramContext).inflate(efj.AX, paramViewGroup, false);
      this.m = ((SpaceHeaderView)localLinearLayout2.findViewById(ehr.ah));
      this.m.a(kxn.a);
      int i1 = paramContext.getResources().getColor(aaw.mX);
      SpaceHeaderView localSpaceHeaderView = this.m;
      localSpaceHeaderView.n = i1;
      localSpaceHeaderView.c.setTextColor(i1);
      if (Build.VERSION.SDK_INT >= 21) {
        this.m.setElevation(0.0F);
      }
      this.n = ((Button)localLinearLayout2.findViewById(ehr.V));
      localLinearLayout2.setLayoutParams(locallpt);
      return localLinearLayout2;
    }
    if (paramCursor.getPosition() == 1)
    {
      this.l = ((ProfileFlairView)LayoutInflater.from(paramContext).inflate(efj.TY, paramViewGroup, false));
      this.l.setLayoutParams(locallpt);
      this.l.d.setOnClickListener(new gxn(new djf(this)));
      return this.l;
    }
    LinearLayout localLinearLayout1 = (LinearLayout)LayoutInflater.from(paramContext).inflate(efj.AZ, paramViewGroup, false);
    this.o = ((TextView)localLinearLayout1.findViewById(ehr.aa));
    this.p = ((TextView)localLinearLayout1.findViewById(ehr.Y));
    localLinearLayout1.setLayoutParams(locallpt);
    return localLinearLayout1;
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    if (paramCursor.getPosition() == 0) {
      k();
    }
    do
    {
      return;
      if (paramCursor.getPosition() == 1)
      {
        h();
        return;
      }
    } while ((paramCursor.getPosition() != 2) || (this.o == null));
    String str = b();
    TextView localTextView = this.o;
    if (TextUtils.isEmpty(str)) {}
    for (;;)
    {
      localTextView.setText(str);
      return;
      str = this.aM.getString(aw.K, new Object[] { str });
    }
  }
  
  protected final void a(eab parameab)
  {
    parameab.u = eai.b;
    super.a(parameab);
  }
  
  public final void a(jyz paramjyz)
  {
    if (this.a == paramjyz) {
      return;
    }
    this.a = paramjyz;
    h();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.p == null) {
      return;
    }
    TextView localTextView = this.p;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      localTextView.setVisibility(i1);
      return;
    }
  }
  
  public final String b()
  {
    if ((this.i == null) || (this.i.d == null)) {
      return "";
    }
    return this.i.d;
  }
  
  public final int b_(int paramInt)
  {
    if (paramInt == 0) {
      return 0 + this.h;
    }
    if (paramInt == 1) {
      return 1 + this.h;
    }
    return 2 + this.h;
  }
  
  public final int c()
  {
    if ((this.j == null) || (this.j.b == -2147483648)) {
      return 0;
    }
    return this.j.b;
  }
  
  public final void c(Cursor paramCursor)
  {
    if (this.g == paramCursor) {
      return;
    }
    this.g = paramCursor;
    k();
  }
  
  public final boolean d()
  {
    qub localqub = this.d;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localqub != null)
    {
      localBoolean = this.d.c;
      if (localBoolean != null) {
        break label37;
      }
    }
    label37:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public final boolean e()
  {
    qtf localqtf = this.k;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localqtf != null)
    {
      localBoolean = this.k.b;
      if (localBoolean != null) {
        break label37;
      }
    }
    label37:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public final String f()
  {
    if ((!d()) || (this.d.d == null)) {
      return "";
    }
    return this.d.d;
  }
  
  public final Uri g()
  {
    if ((!d()) || (this.d.e == null)) {
      return null;
    }
    return Uri.parse(Uri.decode(this.d.e));
  }
  
  public final int getViewTypeCount()
  {
    return 3 + this.h;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dje
 * JD-Core Version:    0.7.0.1
 */