package com.google.android.libraries.social.sharekit.impl;

import aau;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import bk;
import bp;
import bu;
import bv;
import bw;
import com.google.android.libraries.social.sharekit.comments.CommentBox;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import efj;
import et;
import git;
import gqw;
import gzj;
import haa;
import hey;
import hez;
import hfc;
import hfp;
import ipf;
import ipm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import khy;
import khz;
import kia;
import kib;
import kic;
import kij;
import kiv;
import kja;
import kjb;
import kjc;
import kjd;
import kje;
import kjf;
import kjg;
import kjh;
import kji;
import kjj;
import kjl;
import kjp;
import kjr;
import kjx;
import kkv;
import lho;
import lln;
import llu;
import llx;
import lma;
import lmb;
import lpz;
import lqa;
import luu;
import lvc;
import mbb;
import mbf;
import mca;
import mfi;
import qbe;

public final class ComposedContentFragment
  extends mca
  implements kjj, luu, lvc
{
  public kjh Z;
  public CommentBoxFragment a;
  private ViewGroup aa;
  private ViewGroup ab;
  private View ac;
  private View ad;
  private View ae;
  private LocationSelectorFragment af;
  private kjr ag;
  private String ah;
  private Bundle ai;
  private boolean aj;
  private final gzj ak = new gzj(this, this.bp);
  private hfc al;
  private boolean am;
  private final View.OnClickListener an = new kja(this);
  public kij b;
  public kji c;
  public final List<kjl> d = new ArrayList();
  
  private final void C()
  {
    this.ab.removeAllViews();
    kkv localkkv = this.c.m;
    Object localObject;
    int i;
    if ((localkkv == null) || (!localkkv.a()))
    {
      localObject = null;
      if (localObject == null)
      {
        if (this.c.d == null) {
          break label551;
        }
        localObject = new lho(this.bn);
        lmb locallmb = this.c.d;
        ((lho)localObject).a = locallmb;
        String str1 = ((lho)localObject).a.c;
        if (!TextUtils.isEmpty(str1))
        {
          ((lho)localObject).b = ipf.a(((lho)localObject).getContext(), str1, ipm.a);
          if (Build.VERSION.SDK_INT < 14) {
            break label545;
          }
          i = 1;
          label111:
          if (i != 0) {
            ((lho)localObject).setAlpha(0.001F);
          }
        }
        StringBuilder localStringBuilder = new StringBuilder();
        CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
        arrayOfCharSequence1[0] = locallmb.b;
        efj.a(localStringBuilder, arrayOfCharSequence1);
        if (((lho)localObject).a.d)
        {
          CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
          arrayOfCharSequence2[0] = ((lho)localObject).getContext().getString(aau.CE);
          efj.a(localStringBuilder, arrayOfCharSequence2);
        }
        ((lho)localObject).setContentDescription(localStringBuilder.toString());
        ((lho)localObject).b();
        ((lho)localObject).requestLayout();
        ((lho)localObject).invalidate();
        ((lho)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, g().getDimensionPixelSize(efj.UK)));
      }
    }
    for (;;)
    {
      if (localObject == null) {
        break label620;
      }
      this.ab.addView((View)localObject);
      this.ac.setVisibility(8);
      this.ab.setVisibility(0);
      this.aa.setVisibility(0);
      return;
      if (this.am)
      {
        if (localkkv.a == null)
        {
          localObject = null;
          break;
        }
        localObject = new hfp(this.bn);
        a(localkkv, (hfp)localObject);
        this.ad.setVisibility(0);
        this.ad.setOnClickListener(this.an);
        break;
      }
      if (localkkv.b != null)
      {
        localObject = new lpz(this.bn);
        lma locallma = localkkv.b;
        int j = f().getWindowManager().getDefaultDisplay().getWidth();
        if (TextUtils.isEmpty(locallma.a)) {}
        for (String str2 = locallma.c;; str2 = locallma.a)
        {
          String str3 = locallma.b;
          ((lpz)localObject).a(str2, locallma.d, locallma.f, locallma.e, str3, null, null, null, null, j, -1, true, null, (short)j, (short)j);
          break;
        }
      }
      if (localkkv.a != null)
      {
        if (this.ag.c == null)
        {
          this.ad.setVisibility(0);
          this.ad.setOnClickListener(this.an);
        }
        lpz locallpz = new lpz(this.bn);
        if (this.ag.c == null) {}
        for (kje localkje = new kje(this, localkkv, locallpz);; localkje = null)
        {
          a(localkkv, locallpz, localkje);
          localObject = locallpz;
          break;
        }
      }
      localObject = null;
      break;
      label545:
      i = 0;
      break label111;
      label551:
      if (this.c.k != null)
      {
        qbe localqbe = this.c.l;
        localObject = this.c.k.a(this.bn, localqbe.b, localqbe);
        this.aa.setLayoutParams(new LinearLayout.LayoutParams(-1, g().getDimensionPixelSize(efj.Uz)));
      }
    }
    label620:
    if (this.c.d())
    {
      this.aa.setVisibility(0);
      this.ac.setVisibility(0);
      return;
    }
    this.ad.setVisibility(8);
    this.ad.setOnClickListener(null);
    this.ab.setVisibility(8);
    this.aa.setVisibility(8);
  }
  
  private final void D()
  {
    CommentBoxFragment localCommentBoxFragment = this.a;
    if ((TextUtils.equals(localCommentBoxFragment.c, localCommentBoxFragment.b.getText())) || (TextUtils.isEmpty(localCommentBoxFragment.b.getText()))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localCommentBoxFragment.c = null;
        localCommentBoxFragment.b.setText("");
      }
      if ((this.c.b() != null) && (TextUtils.equals(this.c.f, this.a.b.getText().toString()))) {
        this.a.b.setText("");
      }
      return;
    }
  }
  
  private final String a(llu paramllu)
  {
    String str1 = paramllu.e;
    if (!TextUtils.isEmpty(str1)) {
      return str1;
    }
    PackageManager localPackageManager = this.bn.getPackageManager();
    try
    {
      CharSequence localCharSequence = localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo("com.google.android.apps.social", 0));
      if (!TextUtils.isEmpty(localCharSequence))
      {
        String str2 = localCharSequence.toString();
        return str2;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public final String A()
  {
    if (this.a != null) {
      return kia.a(this.a.b.getText());
    }
    return null;
  }
  
  public final String B()
  {
    if (this.a != null) {
      return this.a.b.getText().toString();
    }
    return null;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.UO, paramViewGroup, false);
    this.a = ((CommentBoxFragment)this.x.a(aau.Bl));
    CommentBoxFragment localCommentBoxFragment1 = this.a;
    kjc localkjc = new kjc(this);
    localCommentBoxFragment1.a.add(localkjc);
    CommentBoxFragment localCommentBoxFragment2 = this.a;
    kiv localkiv = new kiv(this);
    if (localCommentBoxFragment2.d) {
      localCommentBoxFragment2.b.a = localkiv;
    }
    CommentBoxFragment localCommentBoxFragment3 = this.a;
    kjd localkjd = new kjd(this);
    localCommentBoxFragment3.b.addTextChangedListener(localkjd);
    this.a.b.setCursorVisible(false);
    this.af = ((LocationSelectorFragment)f().b.a.d.a(aau.Bv));
    LocationSelectorFragment localLocationSelectorFragment = this.af;
    kjx localkjx = new kjx(this);
    localLocationSelectorFragment.d.add(localkjx);
    String str = this.c.a();
    if (!TextUtils.isEmpty(str)) {
      this.a.b.setText(str);
    }
    this.aa = ((ViewGroup)localView.findViewById(aau.Bu));
    this.ab = ((ViewGroup)localView.findViewById(aau.Bt));
    this.ac = localView.findViewById(aau.AR);
    this.ad = localView.findViewById(aau.BE);
    this.ae = localView.findViewById(aau.Bp);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.UD);
    int j = f().getWindowManager().getDefaultDisplay().getWidth() / 4 - i;
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(j, j, 0, 0);
    this.ae.setLayoutParams(localLayoutParams);
    y();
    return localView;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    ((luu)this.bo.a(kic.class)).a(paramInt, paramBundle, paramString);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString)
  {
    ((luu)this.bo.a(kic.class)).a(paramInt, paramBoolean, paramBundle, paramString);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ak.d.a(this, null, false);
    this.b = ((kij)mbb.a(this.bn, kij.class));
    this.b.a(new kjb(this));
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("content_deep_link_id")) {
        this.ah = paramBundle.getString("content_deep_link_id");
      }
      if (paramBundle.containsKey("content_deep_link_metadata")) {
        this.ai = paramBundle.getBundle("content_deep_link_metadata");
      }
      this.aj = paramBundle.getBoolean("domain_restrict", this.aj);
      w();
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    ((luu)this.bo.a(kic.class)).a(paramBundle, paramString);
  }
  
  public final void a(String paramString)
  {
    if (this.c.g() != khz.a) {}
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    kji localkji = this.c;
    localkji.f = paramString;
    localkji.g = null;
    x();
    if (this.a != null)
    {
      CommentBoxFragment localCommentBoxFragment = this.a;
      efj.k(localCommentBoxFragment.b);
      localCommentBoxFragment.b.setCursorVisible(false);
    }
    C();
    this.Z.g();
  }
  
  public final void a(String paramString, int paramInt)
  {
    ((lvc)this.bo.a(kic.class)).a(paramString, paramInt);
  }
  
  public final void a(kkv paramkkv, hfp paramhfp)
  {
    llx localllx = paramkkv.a.a;
    if (localllx == null) {}
    hez localhez;
    for (hey localhey = null;; localhey = new hey(localhez))
    {
      hfc.a(localhey, paramhfp);
      kjf localkjf = new kjf(this, paramkkv, paramhfp);
      paramhfp.a.a(localkjf);
      return;
      localhez = new hez();
      localhez.d = localllx.d;
      localhez.a = localllx.a;
      localhez.b = localllx.b;
      localhez.c = localllx.e;
      localhez.e = localllx.k;
      localhez.f = localllx.l;
    }
  }
  
  public final void a(kkv paramkkv, lpz paramlpz, lqa paramlqa)
  {
    llx localllx = paramkkv.a.a;
    llu localllu = paramkkv.c;
    String str;
    View localView;
    int i;
    label75:
    int j;
    if (paramkkv.c == null)
    {
      str = null;
      paramlpz.a(localllx, localllu, null, null, str, f().getWindowManager().getDefaultDisplay().getWidth(), -1, false, paramlqa);
      localView = this.ae;
      if (paramkkv.a.e == -1) {
        break label135;
      }
      i = 1;
      if ((i == 0) || (!paramkkv.a.a()) || (this.ag.c != null)) {
        break label141;
      }
      boolean bool = paramlpz.f;
      j = 0;
      if (bool) {
        break label141;
      }
    }
    for (;;)
    {
      localView.setVisibility(j);
      return;
      str = a(paramkkv.c);
      break;
      label135:
      i = 0;
      break label75;
      label141:
      j = 8;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    ((luu)this.bo.a(kic.class)).b(paramBundle, paramString);
  }
  
  public final void b(String paramString)
  {
    this.a.v();
    String str;
    CommentBoxFragment localCommentBoxFragment;
    if (!TextUtils.isEmpty(paramString))
    {
      str = this.a.b.getText().toString();
      if ((!str.contains(paramString)) && (!str.contains(paramString.replace("http://", ""))))
      {
        localCommentBoxFragment = this.a;
        if (!TextUtils.isEmpty(str)) {
          break label119;
        }
      }
    }
    for (;;)
    {
      localCommentBoxFragment.b.setText(paramString);
      new AlertDialog.Builder(this.bn).setMessage(et.J).setPositiveButton(17039370, new kjg(this)).setCancelable(true).create().show();
      C();
      return;
      label119:
      paramString = 2 + String.valueOf(str).length() + String.valueOf(paramString).length() + str + "\n\n" + paramString;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((kji)this.bo.a(kji.class));
    this.ag = ((kjr)this.bo.a(kjr.class));
    this.am = ((lln)this.bo.a(lln.class)).j(((git)this.bo.a(git.class)).c());
    this.al = ((hfc)this.bo.a(hfc.class));
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    ((luu)this.bo.a(kic.class)).c(paramBundle, paramString);
  }
  
  public final void d_()
  {
    this.a = null;
    this.aa = null;
    this.ab = null;
    this.ac = null;
    this.ad = null;
    this.ae = null;
    super.d_();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ah != null) {
      paramBundle.putString("content_deep_link_id", this.ah);
    }
    if (this.ai != null) {
      paramBundle.putBundle("content_deep_link_metadata", this.ai);
    }
  }
  
  public final void m()
  {
    super.m();
    this.c.n.add(this);
    D();
    C();
    if (this.c.d()) {
      this.Z.g();
    }
  }
  
  public final void n()
  {
    this.c.n.remove(this);
    super.n();
  }
  
  public final void v()
  {
    if (this.a != null)
    {
      CommentBoxFragment localCommentBoxFragment = this.a;
      efj.k(localCommentBoxFragment.b);
      localCommentBoxFragment.b.setCursorVisible(false);
    }
  }
  
  public final void w()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((kjl)localIterator.next()).a();
    }
  }
  
  public final void x()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((kjl)localIterator.next()).b();
    }
  }
  
  public final void y()
  {
    View localView1 = this.a.N;
    int i;
    int j;
    label57:
    View localView2;
    int k;
    if (this.b.b().b)
    {
      i = 0;
      localView1.setVisibility(i);
      if ((this.c.b) || (!this.b.b().a)) {
        break label87;
      }
      j = 1;
      localView2 = this.af.N;
      k = 0;
      if (j == 0) {
        break label92;
      }
    }
    for (;;)
    {
      localView2.setVisibility(k);
      return;
      i = 8;
      break;
      label87:
      j = 0;
      break label57;
      label92:
      k = 8;
    }
  }
  
  public final void z()
  {
    D();
    C();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.ComposedContentFragment
 * JD-Core Version:    0.7.0.1
 */