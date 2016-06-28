import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.HashSet;
import java.util.Map;

public final class cqh
  extends mca
  implements View.OnClickListener, luu
{
  private String Z;
  public Integer a;
  private String aa;
  private String ab;
  private ImageTextButton ac;
  private MultiAutoCompleteTextView ad;
  private View ae;
  private ImageView af;
  private ImageView ag;
  private ImageView ah;
  private ImageView ai;
  private ImageView aj;
  private git ak;
  private final dme al = new cqi(this);
  private final TextWatcher am = new cqj(this);
  private int b;
  private String c;
  private int d;
  
  private final void y()
  {
    switch (this.d)
    {
    default: 
      return;
    case 1: 
      this.af.setImageResource(efj.pZ);
      this.ag.setImageResource(efj.pY);
      this.ah.setImageResource(efj.pY);
      this.ai.setImageResource(efj.pY);
      this.aj.setImageResource(efj.pY);
      return;
    case 2: 
      this.af.setImageResource(efj.pZ);
      this.ag.setImageResource(efj.pZ);
      this.ah.setImageResource(efj.pY);
      this.ai.setImageResource(efj.pY);
      this.aj.setImageResource(efj.pY);
      return;
    case 3: 
      this.af.setImageResource(efj.pZ);
      this.ag.setImageResource(efj.pZ);
      this.ah.setImageResource(efj.pZ);
      this.ai.setImageResource(efj.pY);
      this.aj.setImageResource(efj.pY);
      return;
    case 4: 
      this.af.setImageResource(efj.pZ);
      this.ag.setImageResource(efj.pZ);
      this.ah.setImageResource(efj.pZ);
      this.ai.setImageResource(efj.pZ);
      this.aj.setImageResource(efj.pY);
      return;
    }
    this.af.setImageResource(efj.pZ);
    this.ag.setImageResource(efj.pZ);
    this.ah.setImageResource(efj.pZ);
    this.ai.setImageResource(efj.pZ);
    this.aj.setImageResource(efj.pZ);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.wN, null);
    ((ImageTextButton)localView.findViewById(aaw.aT)).setOnClickListener(this);
    this.ac = ((ImageTextButton)localView.findViewById(aaw.il));
    this.ac.setOnClickListener(this);
    this.ad = ((MultiAutoCompleteTextView)localView.findViewById(aaw.mD));
    this.ad.addTextChangedListener(this.am);
    this.ae = localView.findViewById(aaw.dC);
    this.af = ((ImageView)localView.findViewById(aaw.kk));
    this.af.setOnClickListener(this);
    this.ag = ((ImageView)localView.findViewById(aaw.kl));
    this.ag.setOnClickListener(this);
    this.ah = ((ImageView)localView.findViewById(aaw.km));
    this.ah.setOnClickListener(this);
    this.ai = ((ImageView)localView.findViewById(aaw.kn));
    this.ai.setOnClickListener(this);
    this.aj = ((ImageView)localView.findViewById(aaw.ko));
    this.aj.setOnClickListener(this);
    if (paramBundle == null) {
      this.ae.requestFocus();
    }
    ImageTextButton localImageTextButton = this.ac;
    boolean bool;
    if (this.d != this.b) {
      bool = true;
    }
    for (;;)
    {
      localImageTextButton.setEnabled(bool);
      y();
      this.ad.setText(this.Z);
      return localView;
      String str1 = this.ad.getText().toString();
      if (this.c != null) {}
      for (String str2 = this.c;; str2 = "")
      {
        if (str1.equals(str2)) {
          break label306;
        }
        bool = true;
        break;
      }
      label306:
      bool = false;
    }
  }
  
  public final void a(int paramInt)
  {
    f().setResult(paramInt, null);
    f().finish();
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.d = paramBundle.getInt("modified_star_rating");
      this.Z = paramBundle.getString("modified_review_text");
      if (paramBundle.containsKey("review_request_id")) {
        this.a = Integer.valueOf(paramBundle.getInt("review_request_id"));
      }
    }
    Bundle localBundle = this.m;
    this.aa = localBundle.getString("place_cluster_id");
    this.ab = localBundle.getString("activity_id");
    this.b = 0;
    this.c = null;
    boolean bool1 = localBundle.containsKey("place_star_rating");
    int i;
    int j;
    label130:
    int k;
    if ((paramBundle != null) && (paramBundle.containsKey("original_star_rating")))
    {
      i = 1;
      if ((bool1) || (i != 0))
      {
        if (!bool1) {
          break label226;
        }
        j = localBundle.getInt("place_star_rating");
        this.b = j;
      }
      boolean bool2 = localBundle.containsKey("place_review_text");
      if ((paramBundle == null) || (!paramBundle.containsKey("original_review_text"))) {
        break label237;
      }
      k = 1;
      label160:
      if ((bool2) || (k != 0)) {
        if (!bool2) {
          break label243;
        }
      }
    }
    label226:
    label237:
    label243:
    for (String str = localBundle.getString("place_review_text");; str = paramBundle.getString("original_review_text"))
    {
      this.c = str;
      if (this.d == 0) {
        this.d = this.b;
      }
      if (this.Z == null) {
        this.Z = this.c;
      }
      return;
      i = 0;
      break;
      j = paramBundle.getInt("original_star_rating");
      break label130;
      k = 0;
      break label160;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("quit".equals(paramString)) {
      a(0);
    }
  }
  
  protected final boolean a(dmx paramdmx)
  {
    int m;
    boolean bool;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label107;
      }
      m = 1;
      if (m == 0)
      {
        Exception localException = paramdmx.d;
        bool = false;
        if (localException == null) {
          break label104;
        }
      }
    }
    String str1;
    if ((paramdmx != null) && (paramdmx.d != null))
    {
      String str2 = paramdmx.d.getMessage();
      if (str2 != null)
      {
        int k = aau.vR;
        Object[] arrayOfObject = { str2 };
        str1 = g().getString(k, arrayOfObject);
      }
    }
    for (;;)
    {
      Toast.makeText(f(), str1, 1).show();
      bool = true;
      label104:
      return bool;
      label107:
      m = 0;
      break;
      int j = aau.uV;
      str1 = g().getString(j);
      continue;
      int i = aau.uV;
      str1 = g().getString(i);
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ak = ((git)this.bo.a(git.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    if (this.a != null) {
      paramBundle.putInt("review_request_id", this.a.intValue());
    }
    if (!this.m.containsKey("place_star_rating")) {
      paramBundle.putInt("original_star_rating", this.b);
    }
    paramBundle.putInt("modified_star_rating", this.d);
    if (!this.m.containsKey("place_review_text")) {
      paramBundle.putString("original_review_text", this.c);
    }
    paramBundle.putString("modified_review_text", this.ad.getText().toString());
    super.e(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.al);
    if (this.a != null)
    {
      int i = this.a.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.a.intValue());
        this.a = null;
        w();
        if (!a(localdmx)) {
          a(-1);
        }
      }
    }
  }
  
  public final void n()
  {
    dme localdme = this.al;
    EsService.d.remove(localdme);
    super.n();
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.aT) {
      v();
    }
    int n;
    do
    {
      return;
      if (i != aaw.il) {
        break;
      }
      if (this.ae != null) {
        this.ae.requestFocus();
      }
      efj.k(this.N);
      String str3 = this.ad.getText().toString();
      mbf localmbf = this.bn;
      int k = this.ak.c();
      String str4 = this.aa;
      int m = this.d;
      String str5 = this.ab;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 725);
      localIntent.putExtra("account_id", k);
      localIntent.putExtra("place_cluster_id", str4);
      localIntent.putExtra("star_rating", m);
      localIntent.putExtra("review_text", str3);
      localIntent.putExtra("aid", str5);
      this.a = Integer.valueOf(EsService.a(localmbf, localIntent));
      n = aau.vQ;
    } while ((bj)this.x.a("req_pending") != null);
    coo.a(null, g().getString(n), false, false).a(this.x, "req_pending");
    return;
    int j;
    label270:
    label286:
    ImageTextButton localImageTextButton;
    boolean bool;
    if ((i == aaw.kk) || (i == aaw.kl) || (i == aaw.km) || (i == aaw.kn) || (i == aaw.ko))
    {
      j = 1;
      if (j == 0) {
        break label321;
      }
      if (i != aaw.kk) {
        break label323;
      }
      this.d = 1;
      localImageTextButton = this.ac;
      if (this.d == this.b) {
        break label383;
      }
      bool = true;
    }
    for (;;)
    {
      localImageTextButton.setEnabled(bool);
      y();
      return;
      j = 0;
      break label270;
      label321:
      break;
      label323:
      if (i == aaw.kl)
      {
        this.d = 2;
        break label286;
      }
      if (i == aaw.km)
      {
        this.d = 3;
        break label286;
      }
      if (i == aaw.kn)
      {
        this.d = 4;
        break label286;
      }
      if (i != aaw.ko) {
        break label286;
      }
      this.d = 5;
      break label286;
      label383:
      String str1 = this.ad.getText().toString();
      if (this.c != null) {}
      for (String str2 = this.c;; str2 = "")
      {
        if (str1.equals(str2)) {
          break label431;
        }
        bool = true;
        break;
      }
      label431:
      bool = false;
    }
  }
  
  public final void v()
  {
    if (this.ac.isEnabled())
    {
      efj.k(this.ae);
      int i = aau.cf;
      String str1 = g().getString(i);
      int j = aau.vP;
      String str2 = g().getString(j);
      int k = aau.vS;
      String str3 = g().getString(k);
      int m = aau.ly;
      lut locallut = lut.a(str1, str2, str3, g().getString(m), 0, 0);
      locallut.n = this;
      locallut.p = 0;
      locallut.a(this.x, "quit");
      return;
    }
    a(0);
  }
  
  protected final void w()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  protected final void x()
  {
    ImageTextButton localImageTextButton = this.ac;
    boolean bool;
    if (this.d != this.b) {
      bool = true;
    }
    for (;;)
    {
      localImageTextButton.setEnabled(bool);
      return;
      String str1 = this.ad.getText().toString();
      if (this.c != null) {}
      for (String str2 = this.c;; str2 = "")
      {
        if (str1.equals(str2)) {
          break label69;
        }
        bool = true;
        break;
      }
      label69:
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqh
 * JD-Core Version:    0.7.0.1
 */