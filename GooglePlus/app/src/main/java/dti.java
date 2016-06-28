import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.social.spaces.SpaceFollowButton;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.squares.stream.header.SquareAboutView;
import com.google.android.libraries.social.squares.stream.header.StreamCategoryPickerView;
import com.google.android.libraries.social.squares.stream.relatedlinksview.RelatedLinksView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

final class dti
  extends dfz
{
  private final kxq A;
  private final kxd B;
  String a;
  String b;
  String c;
  String d;
  String e;
  int f;
  int g;
  int h;
  int i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  boolean n;
  boolean o;
  boolean p;
  int q;
  String r;
  odr s;
  final List<String> t = new ArrayList();
  qek u;
  Boolean v;
  List<lhr> w;
  int x = 0;
  lhu y;
  private int z = -1;
  
  public dti(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    super(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
    if (this.z < 0) {
      this.z = super.getViewTypeCount();
    }
    this.ax = 0;
    this.A = ((kxq)mbb.a(paramContext, kxq.class));
    Resources localResources = paramContext.getResources();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = kxg.d.ordinal();
    arrayOfInt[1] = kxg.f.ordinal();
    arrayOfInt[2] = kxg.e.ordinal();
    this.B = new kxd(kxd.a(arrayOfInt), efj.Bf, localResources.getColor(ehr.ar), efj.Bg, localResources.getColor(ehr.aq));
  }
  
  public final void I_()
  {
    this.ax = 0;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    int i1 = paramCursor.getInt(0);
    if (i1 == 0)
    {
      ViewGroup localViewGroup = (ViewGroup)this.A.a(paramContext, paramViewGroup);
      ((SpaceHeaderView)localViewGroup).b(aaw.nh);
      efj.a(localViewGroup, new gxq(pjo.B));
      if (Log.isLoggable("SquareStreamAdapter", 3))
      {
        String str = String.valueOf(localViewGroup);
        new StringBuilder(13 + String.valueOf(str).length()).append("newView() -> ").append(str);
      }
      return localViewGroup;
    }
    if (i1 == 1)
    {
      StreamCategoryPickerView localStreamCategoryPickerView = (StreamCategoryPickerView)localLayoutInflater.inflate(aaw.ni, null);
      this.y = localStreamCategoryPickerView.a;
      return localStreamCategoryPickerView;
    }
    if (i1 == 3) {
      return localLayoutInflater.inflate(aaw.nc, paramViewGroup, false);
    }
    return localLayoutInflater.inflate(aaw.ng, null);
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    int i1 = 1;
    int i3 = paramCursor.getInt(0);
    TextView localTextView;
    int i23;
    if (i3 == 3)
    {
      int i22 = this.aM.getResources().getDimensionPixelSize(efj.Be);
      lpt locallpt2 = new lpt(-2);
      locallpt2.setMargins(-this.ay.f, i22, -this.ay.f, 0);
      locallpt2.a = this.ay.a;
      paramView.setLayoutParams(locallpt2);
      localTextView = (TextView)paramView.findViewById(eyg.y);
      if (this.m)
      {
        localTextView.setVisibility(8);
        int i24 = efj.Bm;
        paramView.setOnClickListener(new dtj(this));
        i23 = i24;
        ((TextView)paramView.findViewById(eyg.x)).setText(i23);
      }
    }
    label284:
    label493:
    int i2;
    label686:
    label736:
    label876:
    do
    {
      return;
      localTextView.setVisibility(0);
      i23 = efj.Bn;
      break;
      lpt locallpt1 = new lpt(-2);
      locallpt1.a = this.ay.a;
      locallpt1.setMargins(-this.ay.f, -this.ay.d, -this.ay.f, 0);
      paramView.setLayoutParams(locallpt1);
      if (Log.isLoggable("SquareStreamAdapter", 3))
      {
        String str7 = String.valueOf(paramView);
        new StringBuilder(12 + String.valueOf(str7).length()).append("bindView(); ").append(str7);
      }
      if (i3 == 0)
      {
        SpaceHeaderView localSpaceHeaderView;
        int i21;
        String str5;
        int i11;
        SquareAboutView localSquareAboutView;
        qek localqek;
        if (!TextUtils.isEmpty(this.b))
        {
          int i5 = i1;
          if (i5 == 0) {
            break label1158;
          }
          localSpaceHeaderView = (SpaceHeaderView)paramView;
          Context localContext1 = this.aM;
          Resources localResources1 = localContext1.getResources();
          localSpaceHeaderView.a(ipf.a(localContext1, this.c, ipm.a));
          localSpaceHeaderView.a(this.b);
          localSpaceHeaderView.a(this.d);
          kxb localkxb = ((kwz)mbb.a(this.aM, kwz.class)).b;
          int i7 = localkxb.e;
          localSpaceHeaderView.n = i7;
          localSpaceHeaderView.c.setTextColor(i7);
          if (this.f > 0)
          {
            String str3 = NumberFormat.getIntegerInstance().format(this.f);
            int i16 = efj.Bh;
            int i17 = this.f;
            Object[] arrayOfObject2 = new Object[i1];
            arrayOfObject2[0] = str3;
            String str4 = localResources1.getQuantityString(i16, i17, arrayOfObject2);
            Context localContext2 = this.aM;
            int i18 = efj.Bt;
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = str4;
            if (!TextUtils.isEmpty(this.r)) {
              break label1168;
            }
            Context localContext3 = this.aM;
            if (this.h != i1) {
              break label1160;
            }
            i21 = efj.Bw;
            str5 = localContext3.getString(i21);
            arrayOfObject3[i1] = str5;
            String str6 = localContext2.getString(i18, arrayOfObject3);
            localSpaceHeaderView.a((String[])this.t.toArray(new String[this.t.size()]), str6, str4);
            if (this.j) {
              localSpaceHeaderView.a((kxp)mbb.b(this.aM, kxp.class));
            }
          }
          int i8 = localkxb.e;
          localSpaceHeaderView.m = i8;
          localSpaceHeaderView.d.setTextColor(i8);
          localSpaceHeaderView.j = ((kxo)mbb.b(this.aM, kxo.class));
          localSpaceHeaderView.i = this.B;
          dtk localdtk = new dtk(this, (lfk)mbb.a(localContext1, lfk.class));
          lgb locallgb = (lgb)mbb.a(localContext1, lgb.class);
          kxg localkxg = efj.e(this.g, this.i);
          if (localkxg != kxg.e) {
            break label1208;
          }
          int i9 = i1;
          SpaceFollowButton localSpaceFollowButton1 = localSpaceHeaderView.g;
          localSpaceFollowButton1.a(localkxg);
          localSpaceFollowButton1.setOnClickListener(localdtk);
          localSpaceFollowButton1.a = locallgb;
          localSpaceFollowButton1.a(localSpaceFollowButton1.b);
          if (this.g != i1) {
            break label1214;
          }
          i11 = 8;
          localSpaceFollowButton1.setVisibility(i11);
          if ((localSpaceHeaderView.h != null) || (i9 == 0)) {
            break label1220;
          }
          localSpaceHeaderView.h = ((SpaceFollowButton)((ViewStub)localSpaceHeaderView.findViewById(do.u)).inflate());
          if (i9 != 0)
          {
            SpaceFollowButton localSpaceFollowButton3 = localSpaceHeaderView.h;
            localSpaceFollowButton3.setOnClickListener(localdtk);
            localSpaceFollowButton3.a = locallgb;
            localSpaceFollowButton3.a(localSpaceFollowButton3.b);
            localSpaceFollowButton3.a(kxg.l);
          }
          localSquareAboutView = (SquareAboutView)localSpaceHeaderView.e;
          String str1 = this.e;
          if (TextUtils.isEmpty(str1)) {
            break label1260;
          }
          localSquareAboutView.a.setText(str1);
          Linkify.addLinks(localSquareAboutView.a, 9);
          localSquareAboutView.a.setVisibility(0);
          localSquareAboutView.b();
          odr localodr = this.s;
          localSquareAboutView.b.a(localodr);
          localSquareAboutView.b();
          localqek = this.u;
          if (localqek != null) {
            break label1282;
          }
          localSquareAboutView.c.setVisibility(8);
          localSquareAboutView.c.setText(null);
          localSquareAboutView.b();
          if ((this.m) || (this.h != i1) || (this.i != i1)) {
            break label1408;
          }
          int i13 = i1;
          if (i13 == 0) {
            break label1414;
          }
          if (TextUtils.isEmpty(localSquareAboutView.d.getText()))
          {
            Uri localUri = efj.a(localSquareAboutView.getContext(), "plus_privacy_block", "https://support.google.com/plus/?hl=%locale%");
            Resources localResources2 = localSquareAboutView.getResources();
            int i15 = efj.Yu;
            Object[] arrayOfObject1 = new Object[i1];
            arrayOfObject1[0] = localUri.toString();
            Spanned localSpanned = lxw.a(localResources2.getString(i15, arrayOfObject1), null);
            localSquareAboutView.d.setText(localSpanned);
            localSquareAboutView.d.setMovementMethod(lxy.a());
          }
          localSquareAboutView.d.setVisibility(0);
          localSpaceHeaderView.f = localSquareAboutView;
          localSpaceHeaderView.l = false;
          localSquareAboutView.setVisibility(8);
          localSquareAboutView.setAlpha(0.0F);
          localSpaceHeaderView.b();
          boolean bool = localSquareAboutView.a();
          localSpaceHeaderView.k = bool;
          if (!bool) {
            localSpaceHeaderView.a(false, false);
          }
          localSpaceHeaderView.b();
          if (this.v != null) {
            break label1450;
          }
          if (this.m) {
            break label1445;
          }
        }
        for (;;)
        {
          localSpaceHeaderView.a(i1, false);
          return;
          int i6 = 0;
          break label284;
          break;
          i21 = efj.Bx;
          break label493;
          kxq localkxq = this.A;
          if (this.h == 0) {}
          int i20;
          for (int i19 = i1;; i20 = 0)
          {
            str5 = localkxq.a(i19, this.r);
            break;
          }
          int i10 = 0;
          break label686;
          i11 = 0;
          break label736;
          if (localSpaceHeaderView.h == null) {
            break label778;
          }
          SpaceFollowButton localSpaceFollowButton2 = localSpaceHeaderView.h;
          if (i10 != 0) {}
          for (int i12 = 0;; i12 = 8)
          {
            localSpaceFollowButton2.setVisibility(i12);
            break;
          }
          localSquareAboutView.a.setText(null);
          localSquareAboutView.a.setVisibility(8);
          break label876;
          String str2 = localqek.b;
          if (!TextUtils.isEmpty(str2))
          {
            SpannableString localSpannableString = new SpannableString(localqek.a);
            lxw locallxw = new lxw(str2);
            locallxw.c = Typeface.DEFAULT_BOLD;
            localSpannableString.setSpan(locallxw, 0, localqek.a.length(), 33);
            localSquareAboutView.c.setText(localSpannableString);
            localSquareAboutView.c.setMovementMethod(lxy.a());
          }
          for (;;)
          {
            localSquareAboutView.c.setVisibility(0);
            break;
            localSquareAboutView.c.setText(localqek.a);
            localSquareAboutView.c.setMovementMethod(null);
          }
          int i14 = 0;
          break label963;
          localSquareAboutView.d.setText(null);
          localSquareAboutView.d.setMovementMethod(null);
          localSquareAboutView.d.setVisibility(8);
          break label1070;
          i2 = 0;
          continue;
          i2 = this.v.booleanValue();
        }
      }
    } while (i3 != i2);
    label778:
    label963:
    label1220:
    label1260:
    StreamCategoryPickerView localStreamCategoryPickerView = (StreamCategoryPickerView)paramView;
    label1070:
    label1208:
    label1214:
    int i4 = this.x;
    label1158:
    label1160:
    label1168:
    label1445:
    label1450:
    localStreamCategoryPickerView.c.setSelection(i4);
    label1282:
    label1414:
    localStreamCategoryPickerView.a.a(this.w);
    label1408:
  }
  
  public final void a(View paramView, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    super.a(paramView, paramCursor, paramViewGroup);
    if ((paramCursor.getPosition() == 0) && (this.y != null))
    {
      hfd localhfd = ((lpk)paramView).e;
      localhfd.setPadding(localhfd.getPaddingLeft(), 0, localhfd.getPaddingRight(), 0);
    }
  }
  
  protected final void a(eab parameab)
  {
    parameab.t = b();
    if (this.p) {}
    for (parameab.u = eai.d;; parameab.u = eai.c)
    {
      super.a(parameab);
      return;
    }
  }
  
  public final void b(Cursor paramCursor)
  {
    if (paramCursor != this.aN[1].c) {}
    for (boolean bool = true;; bool = false)
    {
      if (Log.isLoggable("SquareStreamAdapter", 4)) {
        new StringBuilder(44).append("changeStreamHeaderCursor cursorChanged=").append(bool);
      }
      super.a(1, paramCursor);
      if (bool) {
        a(true, -1);
      }
      return;
    }
  }
  
  public final boolean b()
  {
    int i1 = this.g;
    return (i1 == 2) || (i1 == 1);
  }
  
  public final int b_(int paramInt)
  {
    Cursor localCursor = this.aN[1].c;
    localCursor.moveToPosition(paramInt);
    switch (localCursor.getInt(0))
    {
    default: 
      throw new RuntimeException("Unknown stream header view position!");
    case 0: 
      return 0 + this.z;
    case 1: 
      return 1 + this.z;
    case 3: 
      return 3 + this.z;
    }
    return 2 + this.z;
  }
  
  public final bxn c()
  {
    int i1 = this.q;
    if (!this.o) {}
    for (boolean bool = true;; bool = false) {
      return new bxn(i1, bool, this.n);
    }
  }
  
  public final int getViewTypeCount()
  {
    return 4 + this.z;
  }
  
  public final boolean isEmpty()
  {
    if (super.isEmpty())
    {
      if (!TextUtils.isEmpty(this.b)) {}
      for (int i1 = 1; i1 == 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dti
 * JD-Core Version:    0.7.0.1
 */