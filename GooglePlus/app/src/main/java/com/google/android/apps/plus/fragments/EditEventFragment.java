package com.google.android.apps.plus.fragments;

import aau;
import aaw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import bj;
import bk;
import bp;
import bw;
import byz;
import bza;
import bzb;
import bzc;
import bzd;
import bze;
import bzf;
import bzg;
import bzh;
import bzi;
import bzj;
import bzo;
import ckm;
import ckx;
import clc;
import com.google.android.apps.plus.phone.EventLocationActivity;
import com.google.android.apps.plus.phone.HostEventThemePickerActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.EventThemeView;
import com.google.android.apps.plus.views.TypeableAudienceView;
import com.google.android.apps.plus.views.TypeableAudienceView.AudienceTextView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import coo;
import cv;
import cw;
import dgg;
import dme;
import dmm;
import dmx;
import efj;
import fu;
import gnb;
import gnf;
import gxw;
import gxx;
import gxz;
import gya;
import hps;
import hxi;
import hxj;
import hxk;
import hxm;
import iqp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TimeZone;
import jgs;
import jjd;
import jov;
import jpd;
import jpe;
import lhp;
import lut;
import luu;
import mbb;
import qas;
import qat;
import qbe;
import qby;
import qbz;
import qci;
import qdc;
import qdj;
import qdq;
import qdt;
import qdu;

public class EditEventFragment
  extends bzo
  implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, ckx, cw<Cursor>, iqp, luu
{
  public static final String[] a = { "theme_id", "image_url", "placeholder_path" };
  public static final String[] b = { "event_data", "event_type" };
  public String Z;
  private TextView aA;
  private TypeableAudienceView aB;
  private View aC;
  private Integer aD;
  private clc aE;
  private gnb aF;
  private dgg aG;
  private int aH;
  private jov aI;
  private jpd aJ;
  private boolean aK;
  private final jpe aL = new byz(this);
  private final dme aM = new bze(this);
  private TextWatcher aN = new bzf(this);
  private TextWatcher aO = new bzg(this);
  public boolean aa = true;
  public boolean ab;
  public hxj ac;
  public int ad;
  public bzi ae;
  public EventThemeView af;
  public TextView ag;
  public ProgressBar ah;
  public EditText ai;
  public String aj;
  public View ak;
  public MentionMultiAutoCompleteTextView al;
  public Spinner am;
  public hxk an;
  private boolean ar;
  private boolean as;
  private View at;
  private Button au;
  private Button av;
  private Button aw;
  private Button ax;
  private CheckBox ay;
  private View az;
  public String c;
  public String d;
  
  private final boolean D()
  {
    gnb localgnb = gnb.a(this.aB.c);
    return localgnb.c.length + localgnb.b.length == 0;
  }
  
  private final void E()
  {
    int i = 8;
    if (this.ac == null) {
      return;
    }
    int j;
    int k;
    label30:
    label58:
    CheckBox localCheckBox;
    label144:
    boolean bool1;
    Boolean localBoolean;
    if (this.ac.a != null)
    {
      j = 0;
      if (j != 1) {
        break label231;
      }
      k = 1;
      if (k == 0) {
        break label236;
      }
      this.at.setVisibility(i);
      this.az.setVisibility(i);
      this.aC.setVisibility(i);
      TypeableAudienceView localTypeableAudienceView = this.aB;
      if (this.aa) {
        i = 0;
      }
      localTypeableAudienceView.setVisibility(i);
      this.ai.setText(this.ac.b());
      qdu localqdu = this.ac.f();
      if ((localqdu == null) || (localqdu.b == null) || (TextUtils.isEmpty(localqdu.b.a))) {
        break label263;
      }
      this.al.a(localqdu.b.a);
      localCheckBox = this.ay;
      qbz localqbz = localqdu.a;
      bool1 = false;
      if (localqbz != null)
      {
        localBoolean = localqdu.a.d;
        if (localBoolean != null) {
          break label280;
        }
      }
    }
    label263:
    label280:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      localCheckBox.setChecked(bool1);
      w();
      x();
      F();
      y();
      z();
      G();
      return;
      j = 1;
      break;
      label231:
      k = 0;
      break label30;
      label236:
      this.at.setVisibility(0);
      this.az.setVisibility(0);
      this.aC.setVisibility(0);
      break label58;
      this.al.setText(this.ac.m());
      break label144;
    }
  }
  
  private final void F()
  {
    qdc localqdc = this.ac.i();
    hxm localhxm;
    if (localqdc != null)
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTimeInMillis(localqdc.b.longValue());
      this.an.a(localCalendar);
      this.aG.a(this.an);
      localhxm = this.an.a(localqdc.c, null);
      if (localhxm == null) {
        break label87;
      }
    }
    label87:
    for (int i = localhxm.c;; i = -1)
    {
      this.aH = i;
      this.am.setSelection(this.aH);
      return;
    }
  }
  
  private final void G()
  {
    qdq localqdq = this.ac.l();
    if (localqdq != null)
    {
      this.aA.setText(localqdq.b);
      return;
    }
    this.aA.setText(null);
  }
  
  private final void H()
  {
    bzd localbzd = new bzd(this);
    efj.m().post(localbzd);
  }
  
  private final TimeZone a(qdc paramqdc)
  {
    if (paramqdc != null)
    {
      hxm localhxm = this.an.a(paramqdc.c, null);
      TimeZone localTimeZone = null;
      if (localhxm != null) {
        localTimeZone = localhxm.a;
      }
      return localTimeZone;
    }
    return this.an.a().a;
  }
  
  private final void a(int paramInt, String paramString, Uri paramUri, boolean paramBoolean)
  {
    if ((this.ac == null) || (this.ac.a == null)) {
      return;
    }
    qdt localqdt = this.ac.a;
    if (localqdt.l.e == null) {
      localqdt.l.e = new qci();
    }
    this.ad = paramInt;
    localqdt.l.e.a = Integer.valueOf(paramInt);
    String str = null;
    if (paramUri != null)
    {
      str = paramUri.getPath();
      bzd localbzd = new bzd(this);
      efj.m().post(localbzd);
    }
    this.af.a(paramString, str);
  }
  
  private final void a(gxz paramgxz)
  {
    int i = f().getIntent().getIntExtra("account_id", -1);
    if (i != -1)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = paramgxz;
      localgxx.a(localgxw);
    }
  }
  
  private final void e(View paramView)
  {
    if ((paramView == null) || (this.aa)) {
      return;
    }
    TextView localTextView = (TextView)paramView.findViewById(aaw.jD);
    View localView = paramView.findViewById(aaw.bT);
    if (this.ac != null)
    {
      localTextView.setVisibility(8);
      localView.setVisibility(0);
      this.aq.removeMessages(0);
      paramView.findViewById(16908292).setVisibility(8);
      return;
    }
    if (!this.ar)
    {
      localView.setVisibility(8);
      localTextView.setVisibility(8);
      a(paramView);
      return;
    }
    if (this.as)
    {
      localTextView.setVisibility(0);
      localTextView.setText(aau.gg);
      localView.setVisibility(8);
      this.aq.removeMessages(0);
      paramView.findViewById(16908292).setVisibility(8);
      return;
    }
    localTextView.setVisibility(0);
    localTextView.setText(aau.gi);
    localView.setVisibility(8);
    this.aq.removeMessages(0);
    paramView.findViewById(16908292).setVisibility(8);
  }
  
  public static long v()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(12, 90);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    return localCalendar.getTimeInMillis();
  }
  
  protected final boolean A()
  {
    return this.ac != null;
  }
  
  public final void B()
  {
    int i;
    Boolean localBoolean;
    boolean bool;
    label87:
    bp localbp2;
    gnb localgnb;
    String str;
    Intent localIntent2;
    int i1;
    if (this.ac == null)
    {
      i = 0;
      if (i != 0)
      {
        int j = aau.gY;
        coo.a(null, g().getString(j), false, false).a(this.x, "req_pending");
        qdt localqdt1 = this.ac.a;
        if ((localqdt1 != null) && (localqdt1.l.a != null))
        {
          localBoolean = localqdt1.l.a.d;
          if (localBoolean != null) {
            break label441;
          }
          bool = false;
          if ((bool) && (localqdt1.f != null)) {
            localqdt1.f = null;
          }
        }
        if (!this.aa) {
          break label457;
        }
        localbp2 = f();
        int n = f().getIntent().getIntExtra("account_id", -1);
        hxj localhxj2 = this.ac;
        localgnb = gnb.a(this.aB.c);
        str = this.aj;
        localIntent2 = EsService.e.a(localbp2, EsService.class);
        localIntent2.putExtra("op", 903);
        localIntent2.putExtra("account_id", n);
        localIntent2.putExtra("event", localhxj2.d());
        qdt localqdt3 = localhxj2.a;
        i1 = 0;
        if (localqdt3 == null) {
          break label451;
        }
      }
    }
    for (;;)
    {
      localIntent2.putExtra("event_type", i1);
      localIntent2.putExtra("audience", localgnb);
      localIntent2.putExtra("external_id", str);
      this.aD = Integer.valueOf(EsService.a(localbp2, localIntent2));
      return;
      if (TextUtils.isEmpty(this.ac.b()))
      {
        Toast.makeText(this.bn, g().getString(aau.gD), 0).show();
        i = 0;
        break;
      }
      if ((this.aa) && (D()))
      {
        Toast.makeText(this.bn, g().getString(aau.gB), 0).show();
        i = 0;
        break;
      }
      qdc localqdc1 = this.ac.j();
      if (localqdc1 != null)
      {
        qdc localqdc2 = this.ac.i();
        if ((localqdc2 != null) && (localqdc2.b != null) && (localqdc1.b != null) && (localqdc2.b.longValue() >= localqdc1.b.longValue()))
        {
          Toast.makeText(this.bn, g().getString(aau.gC), 0).show();
          i = 0;
          break;
        }
      }
      i = 1;
      break;
      label441:
      bool = localBoolean.booleanValue();
      break label87;
      label451:
      i1 = 1;
    }
    label457:
    bp localbp1 = f();
    int k = f().getIntent().getIntExtra("account_id", -1);
    hxj localhxj1 = this.ac;
    Intent localIntent1 = EsService.e.a(localbp1, EsService.class);
    localIntent1.putExtra("op", 904);
    localIntent1.putExtra("account_id", k);
    localIntent1.putExtra("event", localhxj1.d());
    qdt localqdt2 = localhxj1.a;
    int m = 0;
    if (localqdt2 != null) {}
    for (;;)
    {
      localIntent1.putExtra("event_type", m);
      this.aD = Integer.valueOf(EsService.a(localbp1, localIntent1));
      return;
      m = 1;
    }
  }
  
  public final void C()
  {
    int n;
    if (this.aa) {
      if ((!TextUtils.isEmpty(this.ac.b())) || (!TextUtils.isEmpty(this.ac.m())) || (!D()))
      {
        n = 1;
        if (n == 0) {
          break label154;
        }
        int i1 = aau.lx;
        String str4 = g().getString(i1);
        int i2 = aau.lw;
        String str5 = g().getString(i2);
        int i3 = aau.vS;
        String str6 = g().getString(i3);
        int i4 = aau.ly;
        lut locallut2 = lut.a(str4, str5, str6, g().getString(i4), 0, 0);
        locallut2.n = this;
        locallut2.p = 0;
        locallut2.a(this.x, "quit");
      }
    }
    label154:
    do
    {
      do
      {
        return;
        n = 0;
        break;
      } while (this.ae == null);
      this.ae.ak_();
      return;
      if (this.ab)
      {
        int i = aau.fy;
        String str1 = g().getString(i);
        int j = aau.fx;
        String str2 = g().getString(j);
        int k = aau.vS;
        String str3 = g().getString(k);
        int m = aau.ly;
        lut locallut1 = lut.a(str1, str2, str3, g().getString(m), 0, 0);
        locallut1.n = this;
        locallut1.p = 0;
        locallut1.a(this.x, "quit");
        return;
      }
    } while (this.ae == null);
    this.ae.ak_();
  }
  
  public final void T_() {}
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.tu, paramViewGroup);
    this.at = localView.findViewById(aaw.dr);
    this.af = ((EventThemeView)localView.findViewById(aaw.ds));
    this.af.F = this;
    this.af.setClickable(true);
    this.af.setOnClickListener(this);
    this.ag = ((TextView)localView.findViewById(aaw.jy));
    TextView localTextView = this.ag;
    int i = aau.fU;
    localTextView.setText(g().getString(i).toUpperCase());
    this.ah = ((ProgressBar)localView.findViewById(aaw.dt));
    this.ai = ((EditText)localView.findViewById(aaw.dp));
    this.ai.addTextChangedListener(this.aN);
    this.au = ((Button)localView.findViewById(aaw.kr));
    this.au.setOnClickListener(this);
    this.av = ((Button)localView.findViewById(aaw.dh));
    this.av.setOnClickListener(this);
    this.aw = ((Button)localView.findViewById(aaw.ks));
    this.aw.setOnClickListener(this);
    this.ax = ((Button)localView.findViewById(aaw.dj));
    this.ax.setOnClickListener(this);
    this.aA = ((TextView)localView.findViewById(aaw.eM));
    this.aA.setOnClickListener(this);
    this.aC = localView.findViewById(aaw.eJ);
    this.ay = ((CheckBox)localView.findViewById(aaw.dT));
    this.ay.setOnCheckedChangeListener(this);
    this.az = localView.findViewById(aaw.dU);
    this.aB = ((TypeableAudienceView)localView.findViewById(aaw.ai));
    this.aB.a.setOnFocusChangeListener(this);
    TypeableAudienceView localTypeableAudienceView1 = this.aB;
    localTypeableAudienceView1.b = aau.gv;
    localTypeableAudienceView1.c();
    this.aB.f = new bza(this);
    this.ak = localView.findViewById(aaw.jx);
    this.ak.setOnClickListener(this);
    this.al = ((MentionMultiAutoCompleteTextView)localView.findViewById(aaw.cu));
    this.al.addTextChangedListener(this.aO);
    this.al.a(this, f().getIntent().getIntExtra("account_id", -1), null, null);
    this.al.c = true;
    ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(f(), efj.yh);
    this.aE = new clc(localContextThemeWrapper, this.x, k(), f().getIntent().getIntExtra("account_id", -1));
    this.aE.e = 11;
    this.aE.m = false;
    this.aE.n = this;
    this.aE.a(paramBundle);
    TypeableAudienceView localTypeableAudienceView2 = this.aB;
    clc localclc = this.aE;
    localTypeableAudienceView2.a.setAdapter(localclc);
    this.aB.e = f().getIntent().getIntExtra("account_id", -1);
    localView.findViewById(aaw.cQ).setOnClickListener(this);
    this.aG = new dgg(localContextThemeWrapper);
    this.aG.a(this.an);
    this.am = ((Spinner)localView.findViewById(aaw.lJ));
    this.am.setAdapter(this.aG);
    hxm localhxm = this.an.a();
    if (localhxm != null) {}
    for (int j = localhxm.c;; j = -1)
    {
      this.aH = j;
      this.am.setSelection(this.aH);
      this.am.setOnItemSelectedListener(this);
      E();
      e(localView);
      return localView;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = f().getIntent().getIntExtra("account_id", -1);
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new bzb(this, this.bn, i);
    }
    return new bzc(this, this.bn, hxi.a, i);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    Calendar localCalendar = Calendar.getInstance();
    qdc localqdc1 = this.ac.i();
    String str2;
    Long localLong;
    label65:
    qdc localqdc2;
    if (localqdc1 == null)
    {
      String str1 = String.valueOf(this.ac.a());
      if (str1.length() != 0)
      {
        str2 = "Missing start time in event ".concat(str1);
        Log.e("EditEventFragment", str2);
        localLong = Long.valueOf(v());
        localqdc2 = this.ac.j();
        if (localqdc2 == null) {
          break label205;
        }
        localCalendar.setTimeInMillis(localqdc2.b.longValue());
      }
    }
    label205:
    for (;;)
    {
      label91:
      if ((localqdc2 == null) || (localCalendar.get(11) != paramInt1) || (localCalendar.get(12) != paramInt2))
      {
        localCalendar.set(11, paramInt1);
        localCalendar.set(12, paramInt2);
        localCalendar.setTimeZone(((hxm)this.am.getSelectedItem()).a);
        long l = localCalendar.getTimeInMillis();
        for (;;)
        {
          if (localLong.longValue() > l)
          {
            localCalendar.add(6, 1);
            l = localCalendar.getTimeInMillis();
            continue;
            str2 = new String("Missing start time in event ");
            break;
            localLong = localqdc1.b;
            break label65;
            localCalendar.setTimeInMillis(7200000L + localLong.longValue());
            break label91;
          }
        }
        b(localCalendar);
        z();
        x();
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 != -1) || (paramIntent == null)) {}
    int i;
    String str;
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      case 0: 
        byte[] arrayOfByte = paramIntent.getByteArrayExtra("location");
        qdt localqdt = this.ac.a;
        if (arrayOfByte == null) {
          localqdt.f = null;
        }
        for (;;)
        {
          G();
          return;
          try
          {
            qbe localqbe = new qbe();
            localqbe.a = new int[] { 340 };
            localqbe.a(qdq.a, qat.b(new qdq(), arrayOfByte, 0, arrayOfByte.length));
            localqdt.f = localqbe;
          }
          catch (qas localqas)
          {
            Log.e("EditEventFragment", "Unable to deserialize Place.", localqas);
            return;
          }
        }
      case 1: 
        i = paramIntent.getIntExtra("theme_id", -1);
        str = paramIntent.getStringExtra("theme_url");
      }
    } while ((i == -1) || (str == null));
    this.ad = i;
    k().b(0, null, this);
    return;
    this.aF = ((gnb)paramIntent.getParcelableExtra("extra_acl"));
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, dmx paramdmx)
  {
    if ((this.aD == null) || (paramInt != this.aD.intValue())) {}
    label101:
    do
    {
      return;
      bj localbj = (bj)this.x.a("req_pending");
      if (localbj != null) {
        localbj.a(false);
      }
      this.aD = null;
      if (paramdmx != null)
      {
        int j;
        if (paramdmx.c != 200)
        {
          j = 1;
          if (j == 0) {
            continue;
          }
          if (!this.aa) {
            break label101;
          }
        }
        for (int k = aau.eA;; k = aau.uV)
        {
          Toast.makeText(this.bn, k, 0).show();
          return;
          j = 0;
          break;
        }
      }
    } while (this.ae == null);
    if (this.aa) {}
    for (int i = aau.fX;; i = aau.gR)
    {
      Toast.makeText(this.bn, i, 0).show();
      this.ae.a(this.ac);
      return;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.an = new hxk(this.bn);
    this.an.a(Calendar.getInstance());
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    byte[] arrayOfByte;
    int i;
    if (paramBundle != null)
    {
      this.aa = paramBundle.getBoolean("new_event");
      this.c = paramBundle.getString("event_id");
      this.d = paramBundle.getString("owner_id");
      if ((paramBundle.containsKey("event")) && (paramBundle.containsKey("event_type")))
      {
        arrayOfByte = paramBundle.getByteArray("event");
        i = paramBundle.getInt("event_type");
        if (i != 0) {
          break label224;
        }
      }
    }
    try
    {
      this.ac = new hxj((qdt)qat.b(new qdt(), arrayOfByte, 0, arrayOfByte.length));
      for (;;)
      {
        if (paramBundle.containsKey("request_id")) {
          this.aD = Integer.valueOf(paramBundle.getInt("request_id"));
        }
        this.aj = paramBundle.getString("external_id");
        this.ab = paramBundle.getBoolean("changed");
        this.aK = paramBundle.getBoolean("contacts_permission_dialog_shown");
        k().a(0, null, this);
        if ((!this.aa) && (this.ac == null)) {
          k().a(1, null, this);
        }
        this.aI.a(aaw.iL, this.aL);
        return;
        label224:
        if (i == 1) {
          this.ac = new hxj((qdj)qat.b(new qdj(), arrayOfByte, 0, arrayOfByte.length));
        }
      }
    }
    catch (qas localqas)
    {
      for (;;)
      {
        Log.e("EditEventFragment", "Failed to parse binary proto data. ", localqas);
        localqas.printStackTrace();
      }
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if (("quit".equals(paramString)) && (this.ae != null)) {
      this.ae.ak_();
    }
  }
  
  public final void a(MediaView paramMediaView)
  {
    H();
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString1, String paramString2, String paramString3) {}
  
  public final void a(String paramString1, String paramString2, jjd paramjjd, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      int i = f().getIntent().getIntExtra("account_id", -1);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = gxz.ed;
      if (paramBundle != null) {
        localgxw.h.putAll(paramBundle);
      }
      localgxx.a(localgxw);
    }
    this.aB.a(paramjjd);
    TypeableAudienceView localTypeableAudienceView = this.aB;
    localTypeableAudienceView.a.setText("");
    localTypeableAudienceView.c();
  }
  
  public final void a(String paramString, jgs paramjgs)
  {
    TypeableAudienceView localTypeableAudienceView1 = this.aB;
    localTypeableAudienceView1.g = true;
    if (!paramjgs.a(gnb.a(localTypeableAudienceView1.c).c))
    {
      Context localContext = localTypeableAudienceView1.getContext();
      int i = localTypeableAudienceView1.e;
      gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
      gxw localgxw = new gxw(localContext, i);
      localgxw.c = gxz.cT;
      localgxx.a(localgxw);
      localTypeableAudienceView1.c.add(new gnb(paramjgs));
      localTypeableAudienceView1.b();
    }
    TypeableAudienceView localTypeableAudienceView2 = this.aB;
    localTypeableAudienceView2.a.setText("");
    localTypeableAudienceView2.c();
  }
  
  public final void a(Calendar paramCalendar)
  {
    long l = paramCalendar.getTimeInMillis();
    TimeZone localTimeZone = paramCalendar.getTimeZone();
    qdc localqdc = this.ac.i();
    String str2;
    if (localqdc == null)
    {
      String str1 = String.valueOf(this.ac.a());
      if (str1.length() != 0)
      {
        str2 = "Missing start time in event ".concat(str1);
        Log.e("EditEventFragment", str2);
        localqdc = new qdc();
        localqdc.b = Long.valueOf(v());
      }
    }
    else
    {
      if (localqdc.c == null) {
        break label166;
      }
    }
    label166:
    for (int i = 1;; i = 0)
    {
      if ((localqdc.b.longValue() != l) || (i == 0))
      {
        localqdc.b = Long.valueOf(l);
        localqdc.c = localTimeZone.getID();
        this.ac.a(localqdc);
        F();
        this.ab = true;
      }
      return;
      str2 = new String("Missing start time in event ");
      break;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(String paramString1, String paramString2, String paramString3) {}
  
  public final void b(Calendar paramCalendar)
  {
    long l = paramCalendar.getTimeInMillis();
    TimeZone localTimeZone = paramCalendar.getTimeZone();
    qdc localqdc = this.ac.j();
    if (localqdc == null)
    {
      localqdc = new qdc();
      localqdc.b = Long.valueOf(v());
    }
    if (localqdc.b.longValue() != l)
    {
      localqdc.b = Long.valueOf(l);
      localqdc.c = localTimeZone.getID();
      this.ac.b(localqdc);
      this.ab = true;
    }
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aI = ((jov)this.bo.a(jov.class));
    this.aJ = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.aE.b(paramBundle);
    paramBundle.putBoolean("new_event", this.aa);
    paramBundle.putString("event_id", this.c);
    paramBundle.putString("owner_id", this.d);
    if (this.ac != null)
    {
      paramBundle.putByteArray("event", this.ac.d());
      if (this.ac.a == null) {
        break label141;
      }
    }
    label141:
    for (int i = 0;; i = 1)
    {
      paramBundle.putInt("event_type", i);
      if (this.aD != null) {
        paramBundle.putInt("request_id", this.aD.intValue());
      }
      paramBundle.putString("external_id", this.aj);
      paramBundle.putBoolean("changed", this.ab);
      paramBundle.putBoolean("contacts_permission_dialog_shown", this.aK);
      return;
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aM);
    if (this.aD != null)
    {
      int i6 = this.aD.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i6)))
      {
        dmx localdmx = EsService.a(this.aD.intValue());
        a(this.aD.intValue(), localdmx);
        this.aD = null;
      }
    }
    if (this.aF != null)
    {
      TypeableAudienceView localTypeableAudienceView = this.aB;
      gnb localgnb1 = this.aF;
      localTypeableAudienceView.g = true;
      ArrayList localArrayList = new ArrayList(localTypeableAudienceView.c);
      gnb localgnb2 = gnb.a(localTypeableAudienceView.c);
      jgs[] arrayOfjgs1 = localgnb2.c;
      jjd[] arrayOfjjd1 = localgnb2.b;
      lhp[] arrayOflhp1 = localgnb2.d;
      hps[] arrayOfhps1 = localgnb2.e;
      localTypeableAudienceView.c.clear();
      if (localgnb1 != null)
      {
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
        {
          gnb localgnb4 = (gnb)localArrayList.get(j);
          if (localgnb1.b(localgnb4)) {
            localTypeableAudienceView.c.add(localgnb4);
          }
        }
        jgs[] arrayOfjgs2 = localgnb1.c;
        int k = arrayOfjgs2.length;
        int m = 0;
        if (m < k)
        {
          jgs localjgs = arrayOfjgs2[m];
          gnb localgnb3;
          if (!localjgs.a(arrayOfjgs1))
          {
            localgnb3 = new gnb(localjgs);
            if (localjgs.c != 9) {
              break label286;
            }
            localTypeableAudienceView.c.add(0, localgnb3);
          }
          for (;;)
          {
            m++;
            break;
            label286:
            localTypeableAudienceView.c.add(localgnb3);
          }
        }
        for (jjd localjjd : localgnb1.b) {
          if (!localjjd.a(arrayOfjjd1)) {
            localTypeableAudienceView.c.add(new gnb(localjjd));
          }
        }
        for (lhp locallhp : localgnb1.d) {
          if (!locallhp.a(arrayOflhp1)) {
            localTypeableAudienceView.c.add(new gnb(locallhp));
          }
        }
        for (hps localhps : localgnb1.e) {
          if (!localhps.a(arrayOfhps1)) {
            localTypeableAudienceView.c.add(new gnb(localhps));
          }
        }
      }
      localTypeableAudienceView.b();
      this.aF = null;
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.aM;
    EsService.d.remove(localdme);
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    View localView1;
    if (paramCompoundButton == this.ay)
    {
      localView1 = this.aC;
      if (paramBoolean) {
        break label101;
      }
    }
    label101:
    for (int i = 0;; i = 8)
    {
      localView1.setVisibility(i);
      View localView2 = this.N;
      if (localView2 != null) {
        localView2.invalidate();
      }
      qdu localqdu = this.ac.f();
      if (((localqdu != null) && (localqdu.a != null)) || (paramBoolean))
      {
        if (localqdu.a == null) {
          localqdu.a = new qbz();
        }
        localqdu.a.d = Boolean.valueOf(paramBoolean);
      }
      return;
    }
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    qdc localqdc1 = this.ac.i();
    String str2;
    qdc localqdc2;
    int j;
    if (localqdc1 == null)
    {
      String str1 = String.valueOf(this.ac.a());
      if (str1.length() != 0)
      {
        str2 = "Missing start time in event ".concat(str1);
        Log.e("EditEventFragment", str2);
        localqdc1 = new qdc();
        localqdc1.b = Long.valueOf(v());
      }
    }
    else
    {
      localqdc2 = this.ac.j();
      j = f().getIntent().getIntExtra("account_id", -1);
      if (i != aaw.cQ) {
        break label193;
      }
      a(gxz.da);
      bp localbp2 = f();
      int m = f().getIntent().getIntExtra("account_id", -1);
      int n = aau.gl;
      a(efj.a(localbp2, m, g().getString(n), gnb.a(this.aB.c), 12, false, false, true, false), 2);
    }
    label193:
    do
    {
      return;
      str2 = new String("Missing start time in event ");
      break;
      if (i == aaw.kr)
      {
        bzh localbzh1 = new bzh(1);
        localbzh1.n = this;
        localbzh1.p = 0;
        Bundle localBundle1 = new Bundle();
        localBundle1.putLong("date_time", localqdc1.b.longValue());
        localBundle1.putString("time_zone", localqdc1.c);
        localbzh1.f(localBundle1);
        localbzh1.a(this.x, "date");
        return;
      }
      if (i == aaw.dh)
      {
        bzh localbzh2 = new bzh(0);
        localbzh2.n = this;
        localbzh2.p = 0;
        Bundle localBundle2 = new Bundle();
        if (localqdc2 != null) {
          localBundle2.putLong("date_time", localqdc2.b.longValue());
        }
        for (;;)
        {
          localBundle2.putString("time_zone", localqdc1.c);
          localbzh2.f(localBundle2);
          localbzh2.a(this.x, "date");
          return;
          localBundle2.putLong("date_time", localqdc1.b.longValue());
        }
      }
      if (i == aaw.ks)
      {
        bzj localbzj1 = new bzj(1);
        localbzj1.n = this;
        localbzj1.p = 0;
        Bundle localBundle3 = new Bundle();
        localBundle3.putLong("date_time", localqdc1.b.longValue());
        localBundle3.putString("time_zone", localqdc1.c);
        localbzj1.f(localBundle3);
        localbzj1.a(this.x, "time");
        return;
      }
      if (i == aaw.dj)
      {
        bzj localbzj2 = new bzj(0);
        localbzj2.n = this;
        localbzj2.p = 0;
        Bundle localBundle4 = new Bundle();
        if (localqdc2 != null) {
          localBundle4.putLong("date_time", localqdc2.b.longValue());
        }
        for (;;)
        {
          localBundle4.putString("time_zone", localqdc1.c);
          localbzj2.f(localBundle4);
          localbzj2.a(this.x, "time");
          return;
          localBundle4.putLong("date_time", 7200000L + localqdc1.b.longValue());
        }
      }
      if (i == aaw.eM)
      {
        a(gxz.cN);
        qdq localqdq = this.ac.l();
        bp localbp1 = f();
        int k = f().getIntent().getIntExtra("account_id", -1);
        Intent localIntent2 = new Intent(localbp1, EventLocationActivity.class);
        localIntent2.setAction("android.intent.action.PICK");
        localIntent2.putExtra("account_id", k);
        if (localqdq != null) {
          localIntent2.putExtra("location", qat.a(localqdq));
        }
        a(localIntent2, 0);
        return;
      }
    } while (i != aaw.jx);
    Intent localIntent1 = new Intent(f(), HostEventThemePickerActivity.class);
    localIntent1.putExtra("account_id", j);
    a(localIntent1, 1);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.aI.a(this.aJ, aaw.iL, Collections.singletonList("android.permission.READ_CONTACTS"));
      this.aK = true;
    }
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    hxm localhxm;
    long l1;
    long l2;
    qdc localqdc1;
    String str2;
    if (paramInt != this.aH)
    {
      localhxm = (hxm)this.am.getSelectedItem();
      l1 = localhxm.b;
      l2 = this.an.a().b;
      localqdc1 = this.ac.i();
      if (localqdc1 == null)
      {
        str2 = String.valueOf(this.ac.a());
        if (str2.length() == 0) {
          break label253;
        }
      }
    }
    label253:
    for (String str3 = "Missing start time in event ".concat(str2);; str3 = new String("Missing start time in event "))
    {
      Log.e("EditEventFragment", str3);
      localqdc1 = new qdc();
      localqdc1.b = Long.valueOf(v());
      String str1 = localqdc1.c;
      if (!TextUtils.isEmpty(str1)) {
        l2 = hxk.a(hxk.a(str1), this.an.b);
      }
      long l3 = l2 - l1;
      localqdc1.c = localhxm.a.getID();
      localqdc1.b = Long.valueOf(l3 + localqdc1.b.longValue());
      this.ac.a(localqdc1);
      qdc localqdc2 = this.ac.j();
      if ((localqdc2 != null) && (localqdc2.b != null))
      {
        localqdc2.b = Long.valueOf(l3 + localqdc2.b.longValue());
        localqdc2.c = localqdc1.c;
        this.ac.b(localqdc2);
      }
      return;
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public final void p_()
  {
    super.p_();
    if (this.aE != null) {
      this.aE.f();
    }
  }
  
  public final void q_()
  {
    super.q_();
    if (this.aE != null) {
      this.aE.x.removeMessages(0);
    }
  }
  
  public final gya r_()
  {
    return gya.D;
  }
  
  public final void w()
  {
    qdc localqdc = this.ac.i();
    String str1;
    if (localqdc == null)
    {
      str1 = String.valueOf(this.ac.a());
      if (str1.length() == 0) {
        break label91;
      }
    }
    label91:
    for (String str2 = "Missing start time in event ".concat(str1);; str2 = new String("Missing start time in event "))
    {
      Log.e("EditEventFragment", str2);
      localqdc = new qdc();
      localqdc.b = Long.valueOf(v());
      this.au.setText(efj.a(f(), localqdc.b.longValue(), a(localqdc)));
      return;
    }
  }
  
  public final void x()
  {
    qdc localqdc = this.ac.j();
    if (localqdc != null)
    {
      this.av.setText(efj.a(f(), localqdc.b.longValue(), a(localqdc)));
      return;
    }
    this.av.setText(null);
  }
  
  public final void y()
  {
    qdc localqdc = this.ac.i();
    if ((localqdc != null) && (f() != null)) {
      this.aw.setText(efj.b(f(), localqdc.b.longValue(), a(localqdc)));
    }
  }
  
  public final void z()
  {
    qdc localqdc = this.ac.j();
    if ((localqdc != null) && (f() != null))
    {
      this.ax.setText(efj.b(f(), localqdc.b.longValue(), a(localqdc)));
      return;
    }
    this.ax.setText(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.EditEventFragment
 * JD-Core Version:    0.7.0.1
 */