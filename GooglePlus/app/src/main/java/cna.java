import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class cna
  extends cmo
{
  private static int[] a;
  private static int ax;
  private int aA = 3000;
  private int aB = 4000;
  private int aC = 5000;
  private int aD = 6000;
  private int aE = 7000;
  private int aF = 8000;
  private String[] aG;
  private String[] aH;
  private ArrayList<cng> aI;
  private TextView aJ;
  private int aK;
  private boolean aL;
  private nwa aM;
  private nwa aN;
  private nvy aO;
  private nvy aP;
  private nwl aQ;
  private nwl aR;
  private nvr aS;
  private nwm aT;
  private nvr aU;
  private nvr aV;
  private nwm aW;
  private nws aX;
  private nws aY;
  private int ay = 1000;
  private int az = 2000;
  
  private final nwa J()
  {
    nwa localnwa = new nwa();
    int i = this.as.getChildCount() - this.ap;
    localnwa.b = new nvz[i];
    for (int j = 0; j < i; j++)
    {
      View localView = this.as.getChildAt(j);
      cng localcng = (cng)localView.getTag();
      nvz localnvz = new nvz();
      localnvz.a = a(localView, localcng.a);
      localnvz.b = a(localView, localcng.b);
      localnvz.d = a(localView, localcng.f);
      localnvz.c = new nvt();
      String str1 = a(localView, localcng.c);
      if (!TextUtils.isEmpty(str1))
      {
        localnvz.c.a = new nvl();
        localnvz.c.a.a = Integer.valueOf(Integer.parseInt(str1));
      }
      String str2 = a(localView, localcng.d);
      if (!TextUtils.isEmpty(str2))
      {
        localnvz.c.b = new nvl();
        localnvz.c.b.a = Integer.valueOf(Integer.parseInt(str2));
      }
      localnvz.c.c = Boolean.valueOf(b(localView, localcng.e));
      localnwa.b[j] = localnvz;
    }
    localnwa.a = E();
    return localnwa;
  }
  
  private final nvy K()
  {
    nvy localnvy = new nvy();
    int i = this.as.getChildCount() - this.ap;
    localnvy.b = new nvx[i];
    for (int j = 0; j < i; j++)
    {
      View localView = this.as.getChildAt(j);
      cng localcng = (cng)localView.getTag();
      nvx localnvx = new nvx();
      localnvx.a = a(localView, localcng.a);
      localnvx.b = a(localView, localcng.b);
      localnvx.d = a(localView, localcng.f);
      localnvx.c = new nvt();
      String str1 = a(localView, localcng.c);
      if (!TextUtils.isEmpty(str1))
      {
        localnvx.c.a = new nvl();
        localnvx.c.a.a = Integer.valueOf(Integer.parseInt(str1));
      }
      String str2 = a(localView, localcng.d);
      if (!TextUtils.isEmpty(str2))
      {
        localnvx.c.b = new nvl();
        localnvx.c.b.a = Integer.valueOf(Integer.parseInt(str2));
      }
      localnvx.c.c = Boolean.valueOf(b(localView, localcng.e));
      localnvy.b[j] = localnvx;
    }
    localnvy.a = E();
    return localnvy;
  }
  
  private final nvr L()
  {
    nvr localnvr = new nvr();
    nwm localnwm = E();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    int i = this.as.getChildCount() - this.ap;
    int j = 0;
    while (j < i)
    {
      View localView = this.as.getChildAt(j);
      cng localcng = (cng)localView.getTag();
      int k = c(localView, localcng.g);
      switch (k)
      {
      default: 
        j++;
        break;
      case 0: 
      case 1: 
      case 3: 
      case 4: 
        nxs localnxs = new nxs();
        localnxs.b = new nvq();
        nvq localnvq4 = localnxs.b;
        int i3;
        int i4;
        if (this.aK == 6)
        {
          i3 = 2;
          localnvq4.a = i3;
          switch (this.aK)
          {
          default: 
            i4 = -2147483648;
          }
        }
        for (;;)
        {
          localnxs.d = i4;
          localnxs.c = a(localView, localcng.a);
          localnxs.a = localnwm;
          localArrayList1.add(localnxs);
          break;
          i3 = 3;
          break label194;
          switch (k)
          {
          case 2: 
          default: 
            break;
          case 0: 
            i4 = 2;
            break;
          case 1: 
            i4 = 7;
            break;
          case 3: 
            i4 = 5;
            break;
          case 4: 
            i4 = 8;
            continue;
            switch (k)
            {
            case 2: 
            default: 
              break;
            case 0: 
              i4 = 3;
              break;
            case 1: 
              i4 = 18;
              break;
            case 3: 
              i4 = 6;
              break;
            case 4: 
              i4 = 19;
            }
            break;
          }
        }
      case 2: 
        nxq localnxq = new nxq();
        localnxq.b = new nvq();
        nvq localnvq3 = localnxq.b;
        if (this.aK == 6) {}
        for (int i2 = 2;; i2 = 3)
        {
          localnvq3.a = i2;
          localnxq.c = a(localView, localcng.a);
          localnxq.a = localnwm;
          localArrayList2.add(localnxq);
          break;
        }
      case 6: 
        nxp localnxp = new nxp();
        localnxp.b = new nvq();
        nvq localnvq2 = localnxp.b;
        if (this.aK == 6) {}
        for (int i1 = 2;; i1 = 3)
        {
          localnvq2.a = i1;
          localnxp.c = a(localView, localcng.a);
          localnxp.a = localnwm;
          localArrayList3.add(localnxp);
          break;
        }
      case 5: 
        label194:
        nxr localnxr = new nxr();
        localnxr.b = new nvq();
        nvq localnvq1 = localnxr.b;
        if (this.aK == 6) {}
        for (int m = 2;; m = 3)
        {
          localnvq1.a = m;
          localnxr.c = a(localView, localcng.a);
          int n = localcng.h;
          localnxr.d = a[c(localView, n)];
          localnxr.a = localnwm;
          localArrayList4.add(localnxr);
          break;
        }
      }
    }
    localArrayList1.addAll(Arrays.asList(this.aV.a));
    localArrayList2.addAll(Arrays.asList(this.aV.b));
    localArrayList3.addAll(Arrays.asList(this.aV.c));
    localArrayList4.addAll(Arrays.asList(this.aV.d));
    localnvr.a = ((nxs[])localArrayList1.toArray(new nxs[localArrayList1.size()]));
    localnvr.b = ((nxq[])localArrayList2.toArray(new nxq[localArrayList2.size()]));
    localnvr.c = ((nxp[])localArrayList3.toArray(new nxp[localArrayList3.size()]));
    localnvr.d = ((nxr[])localArrayList4.toArray(new nxr[localArrayList4.size()]));
    return localnvr;
  }
  
  private final nws M()
  {
    nws localnws = new nws();
    int i = this.as.getChildCount() - this.ap;
    localnws.b = new nwr[i];
    for (int j = 0; j < i; j++)
    {
      View localView = this.as.getChildAt(j);
      cng localcng = (cng)localView.getTag();
      nwr localnwr = new nwr();
      localnwr.a = a(localView, localcng.a);
      localnws.b[j] = localnwr;
    }
    localnws.a = E();
    return localnws;
  }
  
  private static LinearLayout.LayoutParams N()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, 0);
    return localLayoutParams;
  }
  
  private final View O()
  {
    int i = this.aK;
    View localView = null;
    switch (i)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return localView;
    case 4: 
      localView = a(null, null);
    }
    for (;;)
    {
      this.as.addView(localView, this.as.getChildCount() - this.ap);
      localView.setVisibility(0);
      if (Build.VERSION.SDK_INT >= 11) {
        break;
      }
      cnb localcnb = new cnb(this);
      efj.m().post(localcnb);
      return localView;
      localView = a(null, null);
      continue;
      localView = a(null, null, null);
      continue;
      localView = a(null, null);
      continue;
      localView = a(null, null);
    }
  }
  
  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    default: 
      return -1;
    case 2: 
    case 3: 
      return 0;
    case 7: 
    case 18: 
      return 1;
    case 5: 
    case 6: 
      return 3;
    }
    return 4;
  }
  
  private static int a(nvr paramnvr)
  {
    int i;
    int k;
    label30:
    int m;
    if (paramnvr.a != null)
    {
      i = paramnvr.a.length;
      int j = i + 0;
      if (paramnvr.b == null) {
        break label88;
      }
      k = paramnvr.b.length;
      m = j + k;
      if (paramnvr.c == null) {
        break label93;
      }
    }
    label88:
    label93:
    for (int n = paramnvr.c.length;; n = 0)
    {
      int i1 = n + m;
      nxr[] arrayOfnxr = paramnvr.d;
      int i2 = 0;
      if (arrayOfnxr != null) {
        i2 = paramnvr.d.length;
      }
      return i1 + i2;
      i = 0;
      break;
      k = 0;
      break label30;
    }
  }
  
  private final View a(cng paramcng, int paramInt1, int paramInt2, String paramString)
  {
    if (paramcng == null)
    {
      int k = this.ay;
      this.ay = (k + 1);
      int m = this.az;
      this.az = (m + 1);
      int n = this.aA;
      this.aA = (n + 1);
      int i1 = this.aB;
      this.aB = (i1 + 1);
      int i2 = this.aC;
      this.aC = (i2 + 1);
      int i3 = this.aD;
      this.aD = (i3 + 1);
      int i4 = this.aE;
      this.aE = (i4 + 1);
      int i5 = this.aF;
      this.aF = (i5 + 1);
      paramcng = new cng(k, m, n, i1, i2, i3, i4, i5);
    }
    View localView = f().getLayoutInflater().inflate(efj.wb, null);
    localView.setTag(paramcng);
    Spinner localSpinner1 = (Spinner)localView.findViewById(aaw.ep);
    localSpinner1.setId(paramcng.h);
    ArrayAdapter localArrayAdapter1 = new ArrayAdapter(f(), efj.wt, this.aH);
    localArrayAdapter1.setDropDownViewResource(17367049);
    localSpinner1.setAdapter(localArrayAdapter1);
    int i;
    if (paramInt2 > 0)
    {
      i = paramInt2;
      localSpinner1.setSelection(i);
      if (paramInt2 <= 0) {
        break label389;
      }
    }
    label389:
    for (int j = 0;; j = 4)
    {
      localSpinner1.setVisibility(j);
      Spinner localSpinner2 = (Spinner)localView.findViewById(aaw.eq);
      localSpinner2.setId(paramcng.g);
      ArrayAdapter localArrayAdapter2 = new ArrayAdapter(f(), efj.wt, this.aG);
      localArrayAdapter2.setDropDownViewResource(17367049);
      localSpinner2.setAdapter(localArrayAdapter2);
      localSpinner2.setTag(localSpinner1);
      localSpinner2.setSelection(paramInt1);
      EditText localEditText = (EditText)localView.findViewById(aaw.mi);
      localEditText.setId(paramcng.a);
      localEditText.setText(paramString);
      ImageView localImageView = (ImageView)localView.findViewById(aaw.cp);
      localImageView.setOnClickListener(this);
      localImageView.setTag(localView);
      localView.setLayoutParams(N());
      return localView;
      i = 0;
      break;
    }
  }
  
  private View a(String paramString1, String paramString2, cng paramcng)
  {
    if (paramcng == null)
    {
      int i = this.ay;
      this.ay = (i + 1);
      int j = this.az;
      this.az = (j + 1);
      int k = this.aA;
      this.aA = (k + 1);
      int m = this.aB;
      this.aB = (m + 1);
      int n = this.aC;
      this.aC = (n + 1);
      int i1 = this.aD;
      this.aD = (i1 + 1);
      int i2 = this.aE;
      this.aE = (i2 + 1);
      int i3 = this.aF;
      this.aF = (i3 + 1);
      paramcng = new cng(i, j, k, m, n, i1, i2, i3);
    }
    View localView = f().getLayoutInflater().inflate(efj.wf, null);
    localView.setTag(paramcng);
    EditText localEditText = (EditText)localView.findViewById(aaw.fv);
    localEditText.setId(paramcng.a);
    localEditText.setText(paramString1);
    CheckBox localCheckBox = (CheckBox)localView.findViewById(aaw.cg);
    localCheckBox.setId(paramcng.e);
    localCheckBox.setTag(localView);
    if ((paramString2 != null) && (paramString2.equals(paramString1))) {}
    for (boolean bool = true;; bool = false)
    {
      localCheckBox.setChecked(bool);
      ImageView localImageView = (ImageView)localView.findViewById(aaw.cp);
      localImageView.setOnClickListener(this);
      localImageView.setTag(localView);
      localView.setLayoutParams(N());
      return localView;
    }
  }
  
  private View a(nvx paramnvx, cng paramcng)
  {
    if (paramcng == null)
    {
      int i = this.ay;
      this.ay = (i + 1);
      int j = this.az;
      this.az = (j + 1);
      int k = this.aA;
      this.aA = (k + 1);
      int m = this.aB;
      this.aB = (m + 1);
      int n = this.aC;
      this.aC = (n + 1);
      int i1 = this.aD;
      this.aD = (i1 + 1);
      int i2 = this.aE;
      this.aE = (i2 + 1);
      int i3 = this.aF;
      this.aF = (i3 + 1);
      paramcng = new cng(i, j, k, m, n, i1, i2, i3);
    }
    View localView = f().getLayoutInflater().inflate(efj.wd, null);
    localView.setTag(paramcng);
    EditText localEditText1 = (EditText)localView.findViewById(aaw.fv);
    localEditText1.setId(paramcng.a);
    String str1;
    String str2;
    label237:
    String str3;
    if (paramnvx != null)
    {
      str1 = paramnvx.a;
      localEditText1.setText(str1);
      localEditText1.setInputType(540673);
      EditText localEditText2 = (EditText)localView.findViewById(aaw.lK);
      localEditText2.setId(paramcng.b);
      if (paramnvx == null) {
        break label346;
      }
      str2 = paramnvx.b;
      localEditText2.setText(str2);
      localEditText2.setInputType(16385);
      EditText localEditText3 = (EditText)localView.findViewById(aaw.cu);
      localEditText3.setId(paramcng.f);
      if (paramnvx == null) {
        break label354;
      }
      str3 = paramnvx.d;
      label283:
      localEditText3.setText(str3);
      localEditText3.setInputType(16433);
      localEditText3.setSingleLine(false);
      localEditText3.setGravity(48);
      if (paramnvx == null) {
        break label362;
      }
    }
    label346:
    label354:
    label362:
    for (nvt localnvt = paramnvx.c;; localnvt = null)
    {
      a(localView, paramcng, localnvt);
      localView.setLayoutParams(N());
      return localView;
      str1 = "";
      break;
      str2 = "";
      break label237;
      str3 = "";
      break label283;
    }
  }
  
  private View a(nvz paramnvz, cng paramcng)
  {
    if (paramcng == null)
    {
      int i = this.ay;
      this.ay = (i + 1);
      int j = this.az;
      this.az = (j + 1);
      int k = this.aA;
      this.aA = (k + 1);
      int m = this.aB;
      this.aB = (m + 1);
      int n = this.aC;
      this.aC = (n + 1);
      int i1 = this.aD;
      this.aD = (i1 + 1);
      int i2 = this.aE;
      this.aE = (i2 + 1);
      int i3 = this.aF;
      this.aF = (i3 + 1);
      paramcng = new cng(i, j, k, m, n, i1, i2, i3);
    }
    View localView = f().getLayoutInflater().inflate(efj.we, null);
    localView.setTag(paramcng);
    EditText localEditText1 = (EditText)localView.findViewById(aaw.fv);
    localEditText1.setId(paramcng.a);
    String str1;
    String str2;
    label237:
    String str3;
    if (paramnvz != null)
    {
      str1 = paramnvz.a;
      localEditText1.setText(str1);
      localEditText1.setInputType(540673);
      EditText localEditText2 = (EditText)localView.findViewById(aaw.lK);
      localEditText2.setId(paramcng.b);
      if (paramnvz == null) {
        break label346;
      }
      str2 = paramnvz.b;
      localEditText2.setText(str2);
      localEditText2.setInputType(16385);
      EditText localEditText3 = (EditText)localView.findViewById(aaw.cu);
      localEditText3.setId(paramcng.f);
      if (paramnvz == null) {
        break label354;
      }
      str3 = paramnvz.d;
      label283:
      localEditText3.setText(str3);
      localEditText3.setInputType(16433);
      localEditText3.setSingleLine(false);
      localEditText3.setGravity(48);
      if (paramnvz == null) {
        break label362;
      }
    }
    label346:
    label354:
    label362:
    for (nvt localnvt = paramnvz.c;; localnvt = null)
    {
      a(localView, paramcng, localnvt);
      localView.setLayoutParams(N());
      return localView;
      str1 = "";
      break;
      str2 = "";
      break label237;
      str3 = "";
      break label283;
    }
  }
  
  private View a(nwr paramnwr, cng paramcng)
  {
    if (paramcng == null)
    {
      int i = this.ay;
      this.ay = (i + 1);
      int j = this.az;
      this.az = (j + 1);
      int k = this.aA;
      this.aA = (k + 1);
      int m = this.aB;
      this.aB = (m + 1);
      int n = this.aC;
      this.aC = (n + 1);
      int i1 = this.aD;
      this.aD = (i1 + 1);
      int i2 = this.aE;
      this.aE = (i2 + 1);
      int i3 = this.aF;
      this.aF = (i3 + 1);
      paramcng = new cng(i, j, k, m, n, i1, i2, i3);
    }
    View localView = f().getLayoutInflater().inflate(efj.wi, null);
    localView.setTag(paramcng);
    EditText localEditText = (EditText)localView.findViewById(aaw.fv);
    localEditText.setId(paramcng.a);
    if (paramnwr != null) {}
    for (String str = paramnwr.a;; str = "")
    {
      localEditText.setText(str);
      localEditText.setInputType(97);
      ImageView localImageView = (ImageView)localView.findViewById(aaw.cp);
      localImageView.setOnClickListener(this);
      localImageView.setTag(localView);
      localView.setLayoutParams(N());
      return localView;
    }
  }
  
  private View a(nxs paramnxs, cng paramcng)
  {
    int i;
    if (paramnxs != null)
    {
      i = a(paramnxs.d);
      if (paramnxs == null) {
        break label37;
      }
    }
    label37:
    for (String str = paramnxs.c;; str = "")
    {
      return a(paramcng, i, -1, str);
      i = 0;
      break;
    }
  }
  
  private static String a(View paramView, int paramInt)
  {
    EditText localEditText = (EditText)paramView.findViewById(paramInt);
    if (localEditText != null) {
      return localEditText.getText().toString();
    }
    return null;
  }
  
  private final nwl a(boolean paramBoolean)
  {
    nwl localnwl = new nwl();
    String str1 = null;
    ArrayList localArrayList = new ArrayList();
    int i = this.as.getChildCount() - this.ap;
    int j = 0;
    if (j < i)
    {
      View localView = this.as.getChildAt(j);
      cng localcng = (cng)localView.getTag();
      String str2;
      String str3;
      if (b(localView, localcng.e))
      {
        str1 = a(localView, localcng.a);
        if (!paramBoolean) {
          break label138;
        }
        str2 = String.valueOf("~~Internal~CurrentLocation.");
        str3 = String.valueOf(str1);
        if (str3.length() == 0) {
          break label144;
        }
      }
      label138:
      label144:
      for (str1 = str2.concat(str3);; str1 = new String(str2))
      {
        localArrayList.add(a(localView, localcng.a));
        j++;
        break;
      }
    }
    localnwl.c = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
    if (str1 != null) {
      localnwl.b = str1;
    }
    localnwl.a = E();
    return localnwl;
  }
  
  private final nwm a(nvr paramnvr1, nvr paramnvr2, int paramInt)
  {
    Object localObject1;
    Object localObject4;
    if (paramnvr1.a != null)
    {
      ArrayList localArrayList1 = new ArrayList(Arrays.asList(paramnvr1.a));
      Iterator localIterator1 = localArrayList1.iterator();
      ArrayList localArrayList2;
      int i;
      if (paramnvr2 != null)
      {
        localArrayList2 = new ArrayList(Arrays.asList(paramnvr2.a));
        i = 0;
        localObject1 = null;
      }
      for (;;)
      {
        if (!localIterator1.hasNext()) {
          break label138;
        }
        nxs localnxs = (nxs)localIterator1.next();
        if (!a(localnxs, paramInt))
        {
          localIterator1.remove();
          if (localArrayList2 != null) {
            localArrayList2.add(localnxs);
          }
          i = 1;
          continue;
          localArrayList2 = null;
          break;
        }
        if (localObject1 != null) {
          break label753;
        }
        localObject4 = localnxs.a;
        localObject1 = localObject4;
      }
      label138:
      if (i != 0)
      {
        paramnvr1.a = ((nxs[])localArrayList1.toArray(new nxs[localArrayList1.size()]));
        if (localArrayList2 != null) {
          paramnvr2.a = ((nxs[])localArrayList2.toArray(new nxs[localArrayList2.size()]));
        }
      }
    }
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      if (paramnvr1.b != null)
      {
        ArrayList localArrayList3 = new ArrayList(Arrays.asList(paramnvr1.b));
        Iterator localIterator2 = localArrayList3.iterator();
        ArrayList localArrayList4;
        int j;
        if (paramnvr2 != null)
        {
          localArrayList4 = new ArrayList(Arrays.asList(paramnvr2.b));
          localObject2 = localObject1;
          j = 0;
        }
        for (;;)
        {
          if (!localIterator2.hasNext()) {
            break label327;
          }
          nxq localnxq = (nxq)localIterator2.next();
          if (!a(localnxq, paramInt))
          {
            localIterator2.remove();
            if (localArrayList4 != null) {
              localArrayList4.add(localnxq);
            }
            j = 1;
            continue;
            localArrayList4 = null;
            break;
          }
          if (localObject2 != null) {
            break label739;
          }
          localObject3 = localnxq.a;
          localObject2 = localObject3;
        }
        label327:
        if (j != 0)
        {
          paramnvr1.b = ((nxq[])localArrayList3.toArray(new nxq[localArrayList3.size()]));
          if (localArrayList4 != null) {
            paramnvr2.b = ((nxq[])localArrayList4.toArray(new nxq[localArrayList4.size()]));
          }
        }
      }
      for (;;)
      {
        if (paramnvr1.c != null)
        {
          ArrayList localArrayList5 = new ArrayList(Arrays.asList(paramnvr1.c));
          Iterator localIterator3 = localArrayList5.iterator();
          ArrayList localArrayList6;
          int k;
          if (paramnvr2 != null)
          {
            localArrayList6 = new ArrayList(Arrays.asList(paramnvr2.c));
            k = 0;
          }
          for (;;)
          {
            if (!localIterator3.hasNext()) {
              break label508;
            }
            nxp localnxp = (nxp)localIterator3.next();
            if (!a(localnxp, paramInt))
            {
              localIterator3.remove();
              if (localArrayList6 != null) {
                localArrayList6.add(localnxp);
              }
              k = 1;
              continue;
              localArrayList6 = null;
              break;
            }
            if (localObject2 == null) {
              localObject2 = localnxp.a;
            }
          }
          label508:
          if (k != 0)
          {
            paramnvr1.c = ((nxp[])localArrayList5.toArray(new nxp[localArrayList5.size()]));
            if (localArrayList6 != null) {
              paramnvr2.c = ((nxp[])localArrayList6.toArray(new nxp[localArrayList6.size()]));
            }
          }
        }
        if (paramnvr1.d != null)
        {
          ArrayList localArrayList7 = new ArrayList(Arrays.asList(paramnvr1.d));
          Iterator localIterator4 = localArrayList7.iterator();
          ArrayList localArrayList8 = null;
          int m = 0;
          if (paramnvr2 != null) {
            localArrayList8 = new ArrayList(Arrays.asList(paramnvr2.d));
          }
          while (localIterator4.hasNext())
          {
            nxr localnxr = (nxr)localIterator4.next();
            if (!a(localnxr, paramInt))
            {
              localIterator4.remove();
              if (localArrayList8 != null) {
                localArrayList8.add(localnxr);
              }
              m = 1;
            }
            else if (localObject2 == null)
            {
              localObject2 = localnxr.a;
            }
          }
          if (m != 0)
          {
            paramnvr1.d = ((nxr[])localArrayList7.toArray(new nxr[localArrayList7.size()]));
            if (localArrayList8 != null) {
              paramnvr2.d = ((nxr[])localArrayList8.toArray(new nxr[localArrayList8.size()]));
            }
          }
        }
        return localObject2;
        label739:
        localObject3 = localObject2;
        break;
        localObject2 = localObject1;
      }
      label753:
      localObject4 = localObject1;
      break;
      localObject1 = null;
    }
  }
  
  private final void a(View paramView, cng paramcng, nvt paramnvt)
  {
    EditText localEditText1 = (EditText)paramView.findViewById(aaw.kq);
    localEditText1.setId(paramcng.c);
    if ((paramnvt != null) && (paramnvt.a != null) && (paramnvt.a.a != null)) {
      localEditText1.setText(Integer.toString(paramnvt.a.a.intValue()));
    }
    EditText localEditText2 = (EditText)paramView.findViewById(aaw.dg);
    localEditText2.setId(paramcng.d);
    if ((paramnvt != null) && (paramnvt.b != null) && (paramnvt.b.a != null)) {
      localEditText2.setText(Integer.toString(paramnvt.b.a.intValue()));
    }
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(aaw.cg);
    localCheckBox.setId(paramcng.e);
    localCheckBox.setTag(localEditText2);
    Boolean localBoolean;
    if (paramnvt != null)
    {
      localBoolean = paramnvt.c;
      if (localBoolean != null) {
        break label198;
      }
    }
    label198:
    for (boolean bool = false;; bool = localBoolean.booleanValue())
    {
      localCheckBox.setChecked(bool);
      ImageView localImageView = (ImageView)paramView.findViewById(aaw.cp);
      localImageView.setOnClickListener(this);
      localImageView.setTag(paramView);
      return;
    }
  }
  
  private static boolean a(nxp paramnxp, int paramInt)
  {
    if ((paramnxp.b == null) || (paramnxp.b.a == -2147483648)) {
      return false;
    }
    if (6 == paramInt) {}
    for (int i = 2; paramnxp.b.a == i; i = 3) {
      return true;
    }
    return false;
  }
  
  private static boolean a(nxq paramnxq, int paramInt)
  {
    if ((paramnxq.b == null) || (paramnxq.b.a == -2147483648)) {
      return false;
    }
    if (6 == paramInt) {}
    for (int i = 2; paramnxq.b.a == i; i = 3) {
      return true;
    }
    return false;
  }
  
  private static boolean a(nxr paramnxr, int paramInt)
  {
    if ((paramnxr.b == null) || (paramnxr.b.a == -2147483648)) {
      return false;
    }
    if (6 == paramInt) {}
    for (int i = 2; paramnxr.b.a == i; i = 3) {
      return true;
    }
    return false;
  }
  
  private static boolean a(nxs paramnxs, int paramInt)
  {
    boolean bool;
    if (6 == paramInt) {
      if ((paramnxs.d != 2) && (paramnxs.d != 7) && (paramnxs.d != 5))
      {
        int j = paramnxs.d;
        bool = false;
        if (j != 8) {}
      }
      else
      {
        bool = true;
      }
    }
    int i;
    do
    {
      return bool;
      if ((paramnxs.d == 3) || (paramnxs.d == 18) || (paramnxs.d == 6)) {
        break;
      }
      i = paramnxs.d;
      bool = false;
    } while (i != 19);
    return true;
  }
  
  private static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 2: 
      return 0;
    case 7: 
      return 1;
    case 8: 
      return 2;
    case 9: 
      return 3;
    case 3: 
      return 4;
    case 10: 
      return 5;
    case 6: 
      return 6;
    case 5: 
      return 7;
    }
    return 8;
  }
  
  private final void b(View paramView, cng paramcng, nvt paramnvt)
  {
    boolean bool1 = true;
    boolean bool2;
    String str1;
    label48:
    boolean bool3;
    label120:
    String str2;
    label140:
    EditText localEditText2;
    cmt localcmt2;
    Boolean localBoolean;
    boolean bool4;
    if ((paramnvt != null) && (paramnvt.a != null) && (paramnvt.a.a != null))
    {
      bool2 = bool1;
      if (!bool2) {
        break label245;
      }
      str1 = Integer.toString(paramnvt.a.a.intValue());
      EditText localEditText1 = (EditText)paramView.findViewById(paramcng.c);
      cmt localcmt1 = new cmt(this, localEditText1, str1);
      localcmt1.onTextChanged(localEditText1.getText(), 0, 0, 0);
      localEditText1.addTextChangedListener(localcmt1);
      if ((paramnvt == null) || (paramnvt.b == null) || (paramnvt.b.a == null)) {
        break label253;
      }
      bool3 = bool1;
      if (!bool3) {
        break label259;
      }
      str2 = Integer.toString(paramnvt.b.a.intValue());
      localEditText2 = (EditText)paramView.findViewById(paramcng.d);
      localcmt2 = new cmt(this, localEditText2, str2);
      if (paramnvt == null) {
        break label277;
      }
      localBoolean = paramnvt.c;
      if (localBoolean != null) {
        break label267;
      }
      bool4 = false;
      label185:
      if (!bool4) {
        break label277;
      }
    }
    for (;;)
    {
      CheckBox localCheckBox = (CheckBox)paramView.findViewById(paramcng.e);
      cms localcms = new cms(this, localEditText2, localcmt2, bool1);
      localcms.onCheckedChanged(localCheckBox, localCheckBox.isChecked());
      localCheckBox.setOnCheckedChangeListener(localcms);
      return;
      bool2 = false;
      break;
      label245:
      str1 = "";
      break label48;
      label253:
      bool3 = false;
      break label120;
      label259:
      str2 = "";
      break label140;
      label267:
      bool4 = localBoolean.booleanValue();
      break label185;
      label277:
      bool1 = false;
    }
  }
  
  private static boolean b(View paramView, int paramInt)
  {
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(paramInt);
    return (localCheckBox != null) && (localCheckBox.isChecked());
  }
  
  private static int c(View paramView, int paramInt)
  {
    Spinner localSpinner = (Spinner)paramView.findViewById(paramInt);
    if (localSpinner != null) {
      return localSpinner.getSelectedItemPosition();
    }
    return -1;
  }
  
  protected final void A()
  {
    super.A();
    nxl localnxl;
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return;
    case 4: 
      nwa localnwa = J();
      localnxl = new nxl();
      localnxl.e = new nxv();
      localnxl.e.g = localnwa;
      this.aM.a = E();
      localnxl.e.g.a = this.aM.a;
    }
    for (;;)
    {
      a(localnxl);
      return;
      nvy localnvy = K();
      localnxl = new nxl();
      localnxl.e = new nxv();
      localnxl.e.h = localnvy;
      localnxl.e.h.a = E();
      continue;
      nwl localnwl = a(false);
      localnxl = new nxl();
      localnxl.e = new nxv();
      localnxl.e.i = localnwl;
      localnxl.e.i.a = E();
      continue;
      nvr localnvr = L();
      localnxl = new nxl();
      localnxl.d = new nvn();
      localnxl.d.c = localnvr;
      continue;
      nws localnws = M();
      localnxl = new nxl();
      localnxl.e = new nxv();
      localnxl.e.b = localnws;
      localnxl.e.b.a = E();
    }
  }
  
  protected final byte[] D()
  {
    switch (this.aK)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return null;
          } while (this.aN == null);
          return qat.a(this.aN);
        } while (this.aP == null);
        return qat.a(this.aP);
      } while (this.aR == null);
      return qat.a(this.aR);
    } while (this.aU == null);
    return qat.a(this.aU);
  }
  
  protected final Intent F()
  {
    Intent localIntent = super.F();
    if (localIntent == null) {
      localIntent = new Intent();
    }
    if (this.m.getBoolean("profile_edit_return_json")) {
      localIntent.putExtra("profile_edit_mode", this.aK);
    }
    return localIntent;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if ((this.aK == 6) || (this.aK == 7))
    {
      String[] arrayOfString1 = new String[7];
      int i = aau.qW;
      arrayOfString1[0] = g().getString(i);
      int j = aau.qY;
      arrayOfString1[1] = g().getString(j);
      int k = aau.qL;
      arrayOfString1[2] = g().getString(k);
      int m = aau.qX;
      arrayOfString1[3] = g().getString(m);
      int n = aau.qZ;
      arrayOfString1[4] = g().getString(n);
      int i1 = aau.qM;
      arrayOfString1[5] = g().getString(i1);
      int i2 = aau.qK;
      arrayOfString1[6] = g().getString(i2);
      this.aG = arrayOfString1;
      String[] arrayOfString2 = new String[9];
      int i3 = aau.qN;
      arrayOfString2[0] = g().getString(i3);
      int i4 = aau.qO;
      arrayOfString2[1] = g().getString(i4);
      int i5 = aau.qP;
      arrayOfString2[2] = g().getString(i5);
      int i6 = aau.qQ;
      arrayOfString2[3] = g().getString(i6);
      int i7 = aau.qR;
      arrayOfString2[4] = g().getString(i7);
      int i8 = aau.qS;
      arrayOfString2[5] = g().getString(i8);
      int i9 = aau.qT;
      arrayOfString2[6] = g().getString(i9);
      int i10 = aau.qU;
      arrayOfString2[7] = g().getString(i10);
      int i11 = aau.qV;
      arrayOfString2[8] = g().getString(i11);
      this.aH = arrayOfString2;
    }
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    int i12;
    TextView localTextView2;
    int i13;
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      i12 = 0;
      TextView localTextView1 = new TextView(f());
      localTextView1.setId(aaw.hT);
      localTextView1.setText(i12);
      localTextView1.setTextColor(d);
      localTextView1.setTextSize(0, c);
      localTextView1.setTypeface(null, 1);
      localTextView1.setBackgroundDrawable(Z);
      localTextView1.setGravity(17);
      this.aJ = localTextView1;
      this.aJ.setOnClickListener(this);
      localTextView2 = this.aJ;
      boolean bool = this.ak;
      i13 = 0;
      if (!bool) {
        break;
      }
    }
    for (;;)
    {
      localTextView2.setVisibility(i13);
      LinearLayout localLinearLayout = this.as;
      TextView localTextView3 = this.aJ;
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, b);
      localLayoutParams.setMargins(aa, aa, aa, aa);
      localLinearLayout.addView(localTextView3, localLayoutParams);
      this.ap = 1;
      return localView;
      i12 = aau.qj;
      break;
      i12 = aau.ql;
      break;
      i12 = aau.qk;
      break;
      i12 = aau.qi;
      break;
      i12 = aau.qm;
      break;
      i13 = 8;
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (ax == 0)
    {
      Resources localResources = paramActivity.getResources();
      a = new int[] { 2, 7, 8, 9, 3, 10, 6, 5, 4 };
      ax = localResources.getDimensionPixelSize(efj.nr);
    }
  }
  
  public final void a(Cursor paramCursor)
  {
    int i = this.aK;
    nwm localnwm = null;
    gnb localgnb1;
    switch (i)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      localgnb1 = gnb.a(this.at.c);
      if ((localgnb1 != null) && (!localgnb1.b())) {
        break;
      }
    }
    for (gnb localgnb2 = gnb.a(a(localnwm));; localgnb2 = localgnb1)
    {
      gnb localgnb3 = gnb.a(localgnb2);
      TextOnlyAudienceView localTextOnlyAudienceView = this.at;
      localTextOnlyAudienceView.g = true;
      ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView.c);
      gnb localgnb4 = gnb.a(localTextOnlyAudienceView.c);
      jgs[] arrayOfjgs1 = localgnb4.c;
      jjd[] arrayOfjjd1 = localgnb4.b;
      lhp[] arrayOflhp1 = localgnb4.d;
      hps[] arrayOfhps1 = localgnb4.e;
      localTextOnlyAudienceView.c.clear();
      if (localgnb3 != null)
      {
        int j = localArrayList.size();
        int k = 0;
        for (;;)
        {
          if (k < j)
          {
            gnb localgnb6 = (gnb)localArrayList.get(k);
            if (localgnb3.b(localgnb6)) {
              localTextOnlyAudienceView.c.add(localgnb6);
            }
            k++;
            continue;
            this.ah = gnb.a(a(this.aN.a));
            localnwm = this.aM.a;
            break;
            this.ah = gnb.a(a(this.aP.a));
            localnwm = this.aO.a;
            break;
            this.ah = gnb.a(a(this.aR.a));
            localnwm = this.aQ.a;
            break;
            this.ah = gnb.a(a(this.aW));
            localnwm = this.aT;
            break;
            this.ah = gnb.a(a(this.aY.a));
            localnwm = this.aX.a;
            break;
          }
        }
        jgs[] arrayOfjgs2 = localgnb3.c;
        int m = arrayOfjgs2.length;
        int n = 0;
        if (n < m)
        {
          jgs localjgs = arrayOfjgs2[n];
          gnb localgnb5;
          if (!localjgs.a(arrayOfjgs1))
          {
            localgnb5 = new gnb(localjgs);
            if (localjgs.c != 9) {
              break label463;
            }
            localTextOnlyAudienceView.c.add(0, localgnb5);
          }
          for (;;)
          {
            n++;
            break;
            label463:
            localTextOnlyAudienceView.c.add(localgnb5);
          }
        }
        for (jjd localjjd : localgnb3.b) {
          if (!localjjd.a(arrayOfjjd1)) {
            localTextOnlyAudienceView.c.add(new gnb(localjjd));
          }
        }
        for (lhp locallhp : localgnb3.d) {
          if (!locallhp.a(arrayOflhp1)) {
            localTextOnlyAudienceView.c.add(new gnb(locallhp));
          }
        }
        for (hps localhps : localgnb3.e) {
          if (!localhps.a(arrayOfhps1)) {
            localTextOnlyAudienceView.c.add(new gnb(localhps));
          }
        }
      }
      localTextOnlyAudienceView.b();
      this.at.setEnabled(true);
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.aL = paramBundle.getBoolean("auto_add");
      this.aI = ((ArrayList)paramBundle.getSerializable("items"));
      this.ay = paramBundle.getInt("next_name");
      this.az = paramBundle.getInt("next_title");
      this.aA = paramBundle.getInt("next_start");
      this.aB = paramBundle.getInt("next_end");
      this.aC = paramBundle.getInt("next_current");
    }
    for (;;)
    {
      this.aK = this.m.getInt("profile_edit_mode");
      super.a(paramBundle);
      return;
      this.aL = true;
    }
  }
  
  protected final void a(bru parambru)
  {
    nxl localnxl = parambru.h;
    switch (this.aK)
    {
    }
    do
    {
      do
      {
        return;
        if (localnxl.e != null)
        {
          nwa localnwa2 = localnxl.e.g;
          this.aM = localnwa2;
          this.aN = localnwa2;
        }
      } while (this.aN != null);
      nwa localnwa1 = new nwa();
      this.aM = localnwa1;
      this.aN = localnwa1;
      return;
      if (localnxl.e != null)
      {
        nvy localnvy2 = localnxl.e.h;
        this.aO = localnvy2;
        this.aP = localnvy2;
      }
    } while (this.aP != null);
    nvy localnvy1 = new nvy();
    this.aO = localnvy1;
    this.aP = localnvy1;
  }
  
  public final void e(Bundle paramBundle)
  {
    int i = this.as.getChildCount() - this.ap;
    if (i > 0)
    {
      if (this.aI == null) {
        this.aI = new ArrayList();
      }
      this.aI.clear();
      for (int j = 0; j < i; j++)
      {
        View localView = this.as.getChildAt(j);
        this.aI.add((cng)localView.getTag());
      }
      paramBundle.putSerializable("items", this.aI);
    }
    paramBundle.putInt("next_name", this.ay);
    paramBundle.putInt("next_title", this.az);
    paramBundle.putInt("next_start", this.aA);
    paramBundle.putInt("next_end", this.aB);
    paramBundle.putInt("next_current", this.aC);
    super.e(paramBundle);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.aT) {
      H();
    }
    do
    {
      View localView2;
      do
      {
        return;
        if (i == aaw.jk)
        {
          A();
          return;
        }
        if (i != aaw.hT) {
          break;
        }
        localView2 = O();
      } while (localView2 == null);
      View localView3 = localView2.findViewById(((cng)localView2.getTag()).a);
      localView3.requestFocus();
      efj.j(localView3);
      return;
      if (i == aaw.cp)
      {
        View localView1 = (View)paramView.getTag();
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
        localBuilder.setMessage(aau.qs);
        localBuilder.setPositiveButton(aau.qr, new cnc(this, localView1));
        localBuilder.setNegativeButton(17039360, new cne(this));
        localBuilder.show();
        return;
      }
    } while (i != aaw.af);
    G();
    cph localcph = cph.a(aau.qt, this.al, this.am, this.an);
    localcph.n = this;
    localcph.p = 0;
    localcph.a(this.x, "simple_audience");
  }
  
  protected final byte[] v()
  {
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return null;
    case 4: 
      return qat.a(J());
    case 3: 
      return qat.a(K());
    case 5: 
      return qat.a(a(true));
    case 6: 
    case 7: 
      return qat.a(L());
    }
    return qat.a(M());
  }
  
  protected final void w()
  {
    switch (this.aK)
    {
    }
    for (;;)
    {
      return;
      this.aM = null;
      if (this.ai != null) {}
      try
      {
        nwa localnwa = new nwa();
        byte[] arrayOfByte5 = this.ai;
        this.aM = ((nwa)qat.b(localnwa, arrayOfByte5, 0, arrayOfByte5.length));
        label114:
        if (this.aM != null) {
          continue;
        }
        this.aM = new nwa();
        return;
        this.aO = null;
        if (this.ai != null) {}
        try
        {
          nvy localnvy = new nvy();
          byte[] arrayOfByte4 = this.ai;
          this.aO = ((nvy)qat.b(localnvy, arrayOfByte4, 0, arrayOfByte4.length));
          label178:
          if (this.aO != null) {
            continue;
          }
          this.aO = new nvy();
          return;
          this.aQ = null;
          if (this.ai != null) {}
          try
          {
            nwl localnwl = new nwl();
            byte[] arrayOfByte3 = this.ai;
            this.aQ = ((nwl)qat.b(localnwl, arrayOfByte3, 0, arrayOfByte3.length));
            label242:
            if (this.aQ != null) {
              continue;
            }
            this.aQ = new nwl();
            return;
            this.aS = null;
            if (this.ai != null) {}
            try
            {
              nvr localnvr = new nvr();
              byte[] arrayOfByte2 = this.ai;
              this.aS = ((nvr)qat.b(localnvr, arrayOfByte2, 0, arrayOfByte2.length));
              label306:
              if (this.aS == null) {
                this.aS = new nvr();
              }
              this.aT = a(this.aS, null, this.aK);
              return;
              this.aX = null;
              if (this.ai != null) {}
              try
              {
                nws localnws = new nws();
                byte[] arrayOfByte1 = this.ai;
                this.aX = ((nws)qat.b(localnws, arrayOfByte1, 0, arrayOfByte1.length));
                label382:
                if (this.aX != null) {
                  continue;
                }
                this.aX = new nws();
                return;
              }
              catch (Exception localException1)
              {
                break label382;
              }
            }
            catch (Exception localException2)
            {
              break label306;
            }
          }
          catch (Exception localException3)
          {
            break label242;
          }
        }
        catch (Exception localException4)
        {
          break label178;
        }
      }
      catch (Exception localException5)
      {
        break label114;
      }
    }
  }
  
  protected final void x()
  {
    Object localObject1 = null;
    super.x();
    Object localObject2;
    int j;
    label109:
    nvz[] arrayOfnvz1;
    Object localObject3;
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      localObject2 = null;
      if ((localObject2 != null) && (((nwm)localObject2).a != null)) {
        this.ag = ((nwm)localObject2).a.b;
      }
      int i = this.ao;
      if (localObject1 != null)
      {
        j = localObject1.length;
        this.ao = (j + i);
        return;
      }
      break;
    case 4: 
      this.aN = null;
      if (this.aj != null) {
        for (;;)
        {
          try
          {
            nwa localnwa = new nwa();
            byte[] arrayOfByte5 = this.aj;
            this.aN = ((nwa)qat.b(localnwa, arrayOfByte5, 0, arrayOfByte5.length));
            localnwm3 = this.aN.a;
          }
          catch (Exception localException8)
          {
            try
            {
              arrayOfnvz1 = this.aN.b;
              localObject3 = localnwm3;
              if (this.aN != null) {
                break label964;
              }
              this.aN = new nwa();
              nvz[] arrayOfnvz3 = arrayOfnvz1;
              localObject2 = localObject3;
              localObject1 = arrayOfnvz3;
            }
            catch (Exception localException9)
            {
              for (;;)
              {
                nwm localnwm3;
                nwm localnwm2 = localnwm3;
                continue;
                localObject2 = null;
                localObject1 = null;
                continue;
                localObject2 = null;
                localObject1 = null;
                continue;
                localObject2 = null;
                localObject1 = null;
              }
              arrayOfnvz2 = arrayOfnvz1;
              localObject2 = localObject3;
              localObject1 = arrayOfnvz2;
            }
            localException8 = localException8;
            localnwm2 = null;
          }
          localObject3 = localnwm2;
          arrayOfnvz1 = null;
        }
      }
      break;
    case 3: 
      label185:
      this.aP = null;
      if (this.aj == null) {}
      break;
    }
    for (;;)
    {
      int i2;
      int i4;
      try
      {
        nvy localnvy = new nvy();
        byte[] arrayOfByte4 = this.aj;
        this.aP = ((nvy)qat.b(localnvy, arrayOfByte4, 0, arrayOfByte4.length));
        localObject2 = this.aP.a;
      }
      catch (Exception localException6)
      {
        try
        {
          for (;;)
          {
            localObject1 = this.aP.b;
            if (this.aP != null) {
              break;
            }
            this.aP = new nvy();
            break;
            this.aR = null;
            if (this.aj == null) {
              break label950;
            }
            for (;;)
            {
              try
              {
                nwl localnwl = new nwl();
                byte[] arrayOfByte3 = this.aj;
                this.aR = ((nwl)qat.b(localnwl, arrayOfByte3, 0, arrayOfByte3.length));
                localObject2 = this.aR.a;
              }
              catch (Exception localException4)
              {
                int i7;
                localObject2 = null;
                localObject1 = null;
                continue;
              }
              try
              {
                if (TextUtils.isEmpty(this.aR.b)) {
                  continue;
                }
                i7 = 1;
                this.ao = i7;
                localObject1 = this.aR.c;
              }
              catch (Exception localException5)
              {
                localObject1 = null;
                continue;
              }
              if (this.aR != null) {
                break;
              }
              this.aR = new nwl();
              break;
              i7 = 0;
              continue;
              this.aU = null;
              if (this.aj != null) {}
              for (;;)
              {
                try
                {
                  nvr localnvr1 = new nvr();
                  byte[] arrayOfByte2 = this.aj;
                  this.aU = ((nvr)qat.b(localnvr1, arrayOfByte2, 0, arrayOfByte2.length));
                  localnvr2 = this.aU;
                  k = this.aK;
                  nxs[] arrayOfnxs = localnvr2.a;
                  int m = arrayOfnxs.length;
                  n = 0;
                  if (n >= m) {
                    continue;
                  }
                  nxs localnxs = arrayOfnxs[n];
                  if ((!a(localnxs, k)) || (localnxs.a == null)) {
                    continue;
                  }
                  localnwm1 = localnxs.a;
                  this.aW = localnwm1;
                  this.ao = a(this.aU);
                }
                catch (Exception localException3)
                {
                  nvr localnvr2;
                  int k;
                  int n;
                  nwm localnwm1;
                  nxq[] arrayOfnxq;
                  int i1;
                  nxq localnxq;
                  nxp[] arrayOfnxp;
                  int i3;
                  nxp localnxp;
                  nxr[] arrayOfnxr;
                  int i5;
                  int i6;
                  nxr localnxr;
                  continue;
                }
                if (this.aU == null) {
                  this.aU = new nvr();
                }
                this.aV = new nvr();
                a(this.aU, this.aV, this.aK);
                localObject2 = null;
                localObject1 = null;
                break;
                n++;
                continue;
                arrayOfnxq = localnvr2.b;
                i1 = arrayOfnxq.length;
                i2 = 0;
                if (i2 < i1)
                {
                  localnxq = arrayOfnxq[i2];
                  if ((!a(localnxq, k)) || (localnxq.a == null)) {
                    break label986;
                  }
                  localnwm1 = localnxq.a;
                }
                else
                {
                  arrayOfnxp = localnvr2.c;
                  i3 = arrayOfnxp.length;
                  i4 = 0;
                  if (i4 < i3)
                  {
                    localnxp = arrayOfnxp[i4];
                    if ((!a(localnxp, k)) || (localnxp.a == null)) {
                      break label992;
                    }
                    localnwm1 = localnxp.a;
                  }
                  else
                  {
                    arrayOfnxr = localnvr2.d;
                    i5 = arrayOfnxr.length;
                    i6 = 0;
                    if (i6 < i5)
                    {
                      localnxr = arrayOfnxr[i6];
                      if ((a(localnxr, k)) && (localnxr.a != null)) {
                        localnwm1 = localnxr.a;
                      } else {
                        i6++;
                      }
                    }
                    else
                    {
                      localnwm1 = null;
                      continue;
                      this.aY = null;
                      if (this.aj == null) {
                        break label943;
                      }
                      try
                      {
                        nws localnws = new nws();
                        byte[] arrayOfByte1 = this.aj;
                        this.aY = ((nws)qat.b(localnws, arrayOfByte1, 0, arrayOfByte1.length));
                        localObject2 = this.aY.a;
                      }
                      catch (Exception localException1)
                      {
                        try
                        {
                          localObject1 = this.aY.b;
                          if (this.aY != null) {
                            break;
                          }
                          this.aY = new nws();
                          break;
                          j = 0;
                          break label109;
                          localException1 = localException1;
                          localObject2 = null;
                          localObject1 = null;
                        }
                        catch (Exception localException2)
                        {
                          localObject1 = null;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          localException6 = localException6;
          localObject2 = null;
          localObject1 = null;
          continue;
        }
        catch (Exception localException7)
        {
          localObject1 = null;
          continue;
        }
      }
      label943:
      label950:
      label964:
      nvz[] arrayOfnvz2;
      break;
      arrayOfnvz1 = null;
      localObject3 = null;
      break label185;
      label986:
      i2++;
      continue;
      label992:
      i4++;
    }
  }
  
  protected final void y()
  {
    int k;
    label70:
    String str4;
    String str5;
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      k = 0;
    case 4: 
    case 3: 
      for (;;)
      {
        if ((k == 0) && (this.aL)) {
          O();
        }
        this.aL = false;
        if (this.aJ != null) {
          this.aJ.setVisibility(0);
        }
        return;
        if (this.aM.b == null) {
          break;
        }
        int i10 = this.aM.b.length;
        int i11 = 0;
        if (i11 < i10)
        {
          nvz localnvz = this.aM.b[i11];
          if ((this.aI != null) && (this.aI.size() > i11)) {}
          for (cng localcng5 = (cng)this.aI.get(i11);; localcng5 = null)
          {
            View localView6 = a(localnvz, localcng5);
            this.as.addView(localView6, this.as.getChildCount() - this.ap);
            i11++;
            break;
          }
        }
        k = i10;
        continue;
        if (this.aO.b == null) {
          break;
        }
        int i8 = this.aO.b.length;
        int i9 = 0;
        if (i9 < i8)
        {
          nvx localnvx = this.aO.b[i9];
          if ((this.aI != null) && (this.aI.size() > i9)) {}
          for (cng localcng4 = (cng)this.aI.get(i9);; localcng4 = null)
          {
            View localView5 = a(localnvx, localcng4);
            this.as.addView(localView5, this.as.getChildCount() - this.ap);
            i9++;
            break;
          }
        }
        k = i8;
      }
    case 5: 
      str4 = this.aQ.b;
      if (!TextUtils.isEmpty(str4)) {
        if (str4.startsWith("~~Internal~CurrentLocation."))
        {
          str5 = this.aQ.b.substring(27);
          k = 0;
        }
      }
      break;
    }
    for (;;)
    {
      if (this.aQ.c == null) {
        break label70;
      }
      int i5 = this.aQ.c.length;
      int i6 = k + i5;
      int i7 = 0;
      label428:
      if (i7 < i5)
      {
        if ((this.aI != null) && (this.aI.size() > i7)) {}
        for (cng localcng3 = (cng)this.aI.get(i7);; localcng3 = null)
        {
          View localView3 = a(this.aQ.c[i7], str5, localcng3);
          this.as.addView(localView3, this.as.getChildCount() - this.ap);
          i7++;
          break label428;
          View localView4 = a(str4, str4, null);
          this.as.addView(localView4, this.as.getChildCount() - this.ap);
          str5 = str4;
          k = 1;
          break;
        }
        if (this.aS == null) {
          break;
        }
        int m;
        label581:
        int n;
        int i1;
        label602:
        Object localObject;
        int i2;
        cng localcng2;
        View localView2;
        if (this.aK == 6)
        {
          m = 1;
          jfl localjfl = new jfl(this.aS, m);
          n = 0;
          i1 = 0;
          if (!localjfl.hasNext()) {
            break label916;
          }
          localObject = localjfl.next();
          if ((this.aI == null) || (this.aI.size() <= n)) {
            break label727;
          }
          ArrayList localArrayList = this.aI;
          i2 = n + 1;
          localcng2 = (cng)localArrayList.get(n);
          if (!(localObject instanceof nxs)) {
            break label737;
          }
          localView2 = a((nxs)localObject, localcng2);
          if (localView2 == null) {
            break label1038;
          }
          this.as.addView(localView2, this.as.getChildCount() - this.ap);
        }
        for (int i3 = 1;; i3 = i1)
        {
          i1 = i3;
          n = i2;
          break label602;
          m = 2;
          break label581;
          label727:
          i2 = n;
          localcng2 = null;
          break label660;
          label737:
          if ((localObject instanceof nxq))
          {
            nxq localnxq = (nxq)localObject;
            if (localnxq != null) {}
            for (String str3 = localnxq.c;; str3 = "")
            {
              localView2 = a(localcng2, 2, -1, str3);
              break;
            }
          }
          if ((localObject instanceof nxr))
          {
            nxr localnxr = (nxr)localObject;
            int i4;
            if (localnxr != null)
            {
              i4 = b(localnxr.d);
              label817:
              if (localnxr == null) {
                break label851;
              }
            }
            label851:
            for (String str2 = localnxr.c;; str2 = "")
            {
              localView2 = a(localcng2, 5, i4, str2);
              break;
              i4 = 0;
              break label817;
            }
          }
          if ((localObject instanceof nxp))
          {
            nxp localnxp = (nxp)localObject;
            if (localnxp != null) {}
            for (String str1 = localnxp.c;; str1 = "")
            {
              localView2 = a(localcng2, 6, -1, str1);
              break;
            }
          }
          localView2 = null;
          break label681;
          k = i1;
          break label70;
          if (this.aX.b == null) {
            break;
          }
          int i = this.aX.b.length;
          int j = 0;
          if (j < i)
          {
            nwr localnwr = this.aX.b[j];
            if ((this.aI != null) && (this.aI.size() > j)) {}
            for (cng localcng1 = (cng)this.aI.get(j);; localcng1 = null)
            {
              View localView1 = a(localnwr, localcng1);
              this.as.addView(localView1, this.as.getChildCount() - this.ap);
              j++;
              break;
            }
          }
          k = i;
          break label70;
        }
      }
      label660:
      label681:
      k = i6;
      label916:
      break label70;
      label1038:
      str5 = str4;
      k = 0;
    }
  }
  
  public final void z()
  {
    super.z();
    label139:
    label168:
    label201:
    int m;
    label262:
    label323:
    label580:
    int n;
    label406:
    label414:
    label422:
    label430:
    label702:
    int i1;
    label518:
    label547:
    label809:
    label1216:
    int i2;
    label641:
    label785:
    label793:
    label801:
    label1234:
    Object localObject1;
    label926:
    label1256:
    View localView2;
    cng localcng2;
    int i3;
    String str5;
    label1325:
    int i4;
    Object localObject2;
    switch (this.aK)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
    case 4: 
    case 3: 
    case 5: 
    case 6: 
    case 7: 
      do
      {
        int i6;
        int i7;
        int i8;
        do
        {
          int i12;
          int i13;
          do
          {
            int i15;
            int i16;
            do
            {
              return;
              if ((this.aN != null) && (this.aN.b != null)) {}
              for (i15 = this.aN.b.length;; i15 = 0)
              {
                i16 = this.as.getChildCount() - this.ap;
                if (i16 != 0) {
                  break label139;
                }
                if (i15 == 0) {
                  break;
                }
                this.au.setEnabled(true);
                return;
              }
              int i17 = 0;
              if (i17 < i16)
              {
                nvz localnvz;
                View localView5;
                cng localcng5;
                String str10;
                String str11;
                String str12;
                if (i17 < i15)
                {
                  localnvz = this.aN.b[i17];
                  localView5 = this.as.getChildAt(i17);
                  localcng5 = (cng)localView5.getTag();
                  if (localnvz == null) {
                    break label406;
                  }
                  str10 = localnvz.a;
                  EditText localEditText7 = (EditText)localView5.findViewById(localcng5.a);
                  cmt localcmt7 = new cmt(this, localEditText7, str10);
                  localcmt7.onTextChanged(localEditText7.getText(), 0, 0, 0);
                  localEditText7.addTextChangedListener(localcmt7);
                  if (localnvz == null) {
                    break label414;
                  }
                  str11 = localnvz.b;
                  EditText localEditText8 = (EditText)localView5.findViewById(localcng5.b);
                  cmt localcmt8 = new cmt(this, localEditText8, str11);
                  localcmt8.onTextChanged(localEditText8.getText(), 0, 0, 0);
                  localEditText8.addTextChangedListener(localcmt8);
                  if (localnvz == null) {
                    break label422;
                  }
                  str12 = localnvz.d;
                  EditText localEditText9 = (EditText)localView5.findViewById(localcng5.f);
                  cmt localcmt9 = new cmt(this, localEditText9, str12);
                  localcmt9.onTextChanged(localEditText9.getText(), 0, 0, 0);
                  localEditText9.addTextChangedListener(localcmt9);
                  if (localnvz == null) {
                    break label430;
                  }
                }
                for (nvt localnvt2 = localnvz.c;; localnvt2 = null)
                {
                  b(localView5, localcng5, localnvt2);
                  i17++;
                  break;
                  localnvz = null;
                  break label168;
                  str10 = "";
                  break label201;
                  str11 = "";
                  break label262;
                  str12 = "";
                  break label323;
                }
              }
            } while (i15 <= i16);
            b(this.aq);
            return;
            if ((this.aP != null) && (this.aP.b != null)) {}
            for (i12 = this.aP.b.length;; i12 = 0)
            {
              i13 = this.as.getChildCount() - this.ap;
              if (i13 != 0) {
                break label518;
              }
              if (i12 == 0) {
                break;
              }
              this.au.setEnabled(true);
              return;
            }
            int i14 = 0;
            if (i14 < i13)
            {
              nvx localnvx;
              View localView4;
              cng localcng4;
              String str7;
              String str8;
              String str9;
              if (i14 < i12)
              {
                localnvx = this.aP.b[i14];
                localView4 = this.as.getChildAt(i14);
                localcng4 = (cng)localView4.getTag();
                if (localnvx == null) {
                  break label785;
                }
                str7 = localnvx.a;
                EditText localEditText4 = (EditText)localView4.findViewById(localcng4.a);
                cmt localcmt4 = new cmt(this, localEditText4, str7);
                localcmt4.onTextChanged(localEditText4.getText(), 0, 0, 0);
                localEditText4.addTextChangedListener(localcmt4);
                if (localnvx == null) {
                  break label793;
                }
                str8 = localnvx.b;
                EditText localEditText5 = (EditText)localView4.findViewById(localcng4.b);
                cmt localcmt5 = new cmt(this, localEditText5, str8);
                localcmt5.onTextChanged(localEditText5.getText(), 0, 0, 0);
                localEditText5.addTextChangedListener(localcmt5);
                if (localnvx == null) {
                  break label801;
                }
                str9 = localnvx.d;
                EditText localEditText6 = (EditText)localView4.findViewById(localcng4.f);
                cmt localcmt6 = new cmt(this, localEditText6, str9);
                localcmt6.onTextChanged(localEditText6.getText(), 0, 0, 0);
                localEditText6.addTextChangedListener(localcmt6);
                if (localnvx == null) {
                  break label809;
                }
              }
              for (nvt localnvt1 = localnvx.c;; localnvt1 = null)
              {
                b(localView4, localcng4, localnvt1);
                i14++;
                break;
                localnvx = null;
                break label547;
                str7 = "";
                break label580;
                str8 = "";
                break label641;
                str9 = "";
                break label702;
              }
            }
          } while (i12 <= i13);
          b(this.aq);
          return;
          if ((this.aR != null) && (this.aR.c != null)) {}
          for (i6 = this.aR.c.length;; i6 = 0)
          {
            i7 = this.as.getChildCount() - this.ap;
            i8 = 0;
            if (i7 != 0) {
              break label926;
            }
            if ((this.aR.b == null) && ((this.aR.c == null) || (this.aR.c.length <= 0))) {
              break;
            }
            this.au.setEnabled(true);
            return;
          }
          int i9 = 0;
          while (i9 < i7)
          {
            Object localObject3;
            int i11;
            boolean bool;
            if ((i9 == 0) && (!TextUtils.isEmpty(this.aR.b)))
            {
              localObject3 = this.aR.b;
              i11 = 1;
              bool = true;
              View localView3 = this.as.getChildAt(i9);
              cng localcng3 = (cng)localView3.getTag();
              EditText localEditText3 = (EditText)localView3.findViewById(localcng3.a);
              cmt localcmt3 = new cmt(this, localEditText3, (String)localObject3);
              localcmt3.onTextChanged(localEditText3.getText(), 0, 0, 0);
              localEditText3.addTextChangedListener(localcmt3);
              CheckBox localCheckBox = (CheckBox)localView3.findViewById(localcng3.e);
              cnh localcnh = new cnh(this, bool);
              localcnh.onCheckedChanged(localCheckBox, localCheckBox.isChecked());
              localCheckBox.setOnCheckedChangeListener(localcnh);
              i9++;
              i8 = i11;
            }
            else
            {
              int i10 = i9 - i8;
              if (i10 < i6) {}
              for (String str6 = this.aR.c[i10];; str6 = "")
              {
                localObject3 = str6;
                i11 = i8;
                bool = false;
                break;
              }
            }
          }
        } while (i6 <= i7 - i8);
        b(this.aq);
        return;
        m = a(this.aU);
        n = this.as.getChildCount() - this.ap;
        if (n != 0) {
          break;
        }
      } while (m == 0);
      this.au.setEnabled(true);
      return;
      if (this.aK == 6)
      {
        i1 = 1;
        jfl localjfl = new jfl(this.aU, i1);
        i2 = 0;
        if (i2 >= n) {
          break label1677;
        }
        if (!localjfl.hasNext()) {
          break label1488;
        }
        localObject1 = localjfl.next();
        localView2 = this.as.getChildAt(i2);
        localcng2 = (cng)localView2.getTag();
        i3 = 0;
        if (localObject1 == null) {
          break label1663;
        }
        if (!(localObject1 instanceof nxs)) {
          break label1502;
        }
        nxs localnxs = (nxs)localObject1;
        int i5 = a(localnxs.d);
        if (localnxs.c == null) {
          break label1494;
        }
        str5 = localnxs.c;
        i4 = i5;
        localObject2 = str5;
      }
      break;
    }
    for (;;)
    {
      EditText localEditText2 = (EditText)localView2.findViewById(localcng2.a);
      cmt localcmt2 = new cmt(this, localEditText2, (String)localObject2);
      localcmt2.onTextChanged(localEditText2.getText(), 0, 0, 0);
      localEditText2.addTextChangedListener(localcmt2);
      Spinner localSpinner1 = (Spinner)localView2.findViewById(localcng2.h);
      cmz localcmz = new cmz(this, i3);
      localcmz.onItemSelected(localSpinner1, null, i3, 0L);
      localSpinner1.setOnItemSelectedListener(localcmz);
      Spinner localSpinner2 = (Spinner)localView2.findViewById(localcng2.g);
      cnf localcnf = new cnf(this, i4, localSpinner1, localEditText2);
      localcnf.onItemSelected(localSpinner1, null, i4, 0L);
      localSpinner2.setOnItemSelectedListener(localcnf);
      i2++;
      break label1234;
      i1 = 2;
      break label1216;
      label1488:
      localObject1 = null;
      break label1256;
      label1494:
      str5 = "";
      break label1325;
      label1502:
      if ((localObject1 instanceof nxq))
      {
        nxq localnxq = (nxq)localObject1;
        if (localnxq.c != null) {}
        for (String str4 = localnxq.c;; str4 = "")
        {
          localObject2 = str4;
          i4 = 2;
          i3 = 0;
          break;
        }
      }
      if ((localObject1 instanceof nxr))
      {
        nxr localnxr = (nxr)localObject1;
        i3 = b(localnxr.d);
        if (localnxr.c != null) {}
        for (String str3 = localnxr.c;; str3 = "")
        {
          localObject2 = str3;
          i4 = 5;
          break;
        }
      }
      if ((localObject1 instanceof nxp))
      {
        nxp localnxp = (nxp)localObject1;
        if (localnxp.c != null) {}
        for (String str2 = localnxp.c;; str2 = "")
        {
          localObject2 = str2;
          i4 = 6;
          i3 = 0;
          break;
        }
        label1663:
        localObject2 = "";
        i3 = 0;
        i4 = 0;
        continue;
        label1677:
        if (m <= n) {
          break;
        }
        b(this.aq);
        return;
        if ((this.aY != null) && (this.aY.b != null)) {}
        int j;
        for (int i = this.aY.b.length;; i = 0)
        {
          j = this.as.getChildCount() - this.ap;
          if (j != 0) {
            break label1754;
          }
          if (i == 0) {
            break;
          }
          this.au.setEnabled(true);
          return;
        }
        label1754:
        int k = 0;
        if (k < j)
        {
          nwr localnwr;
          label1777:
          View localView1;
          cng localcng1;
          if (k < i)
          {
            localnwr = this.aY.b[k];
            localView1 = this.as.getChildAt(k);
            localcng1 = (cng)localView1.getTag();
            if (localnwr == null) {
              break label1870;
            }
          }
          label1870:
          for (String str1 = localnwr.a;; str1 = "")
          {
            EditText localEditText1 = (EditText)localView1.findViewById(localcng1.a);
            cmt localcmt1 = new cmt(this, localEditText1, str1);
            localcmt1.onTextChanged(localEditText1.getText(), 0, 0, 0);
            localEditText1.addTextChangedListener(localcmt1);
            k++;
            break;
            localnwr = null;
            break label1777;
          }
        }
        if (i <= j) {
          break;
        }
        b(this.aq);
        return;
      }
      localObject2 = null;
      i3 = 0;
      i4 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cna
 * JD-Core Version:    0.7.0.1
 */