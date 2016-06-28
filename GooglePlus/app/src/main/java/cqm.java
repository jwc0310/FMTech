import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.avatargroupview.AvatarGroupView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class cqm
  extends hqf
{
  private static int r = -1;
  final int a;
  final ddl b;
  public int c;
  long d;
  boolean e = false;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  boolean i;
  noj j;
  private final View.OnTouchListener k;
  private final LayoutInflater l;
  private final int m;
  private final int n;
  private int o;
  private byte[] p;
  private byte[] q;
  private final dcc s;
  private boolean t;
  
  public cqm(Context paramContext, dcc paramdcc, View.OnTouchListener paramOnTouchListener, ddl paramddl, int paramInt)
  {
    super(paramContext, (byte)0);
    if (r < 0) {
      r = this.aM.getResources().getDimensionPixelSize(efj.my);
    }
    this.k = paramOnTouchListener;
    this.b = paramddl;
    this.s = paramdcc;
    this.l = LayoutInflater.from(paramContext);
    this.a = paramInt;
    hqg localhqg1 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg16 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg16, 0, this.aO);
      this.aN = arrayOfhqg16;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i1 = this.aO;
    this.aO = (i1 + 1);
    arrayOfhqg1[i1] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg15 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg15, 0, this.aO);
      this.aN = arrayOfhqg15;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int i2 = this.aO;
    this.aO = (i2 + 1);
    arrayOfhqg2[i2] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg3 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg14 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg14, 0, this.aO);
      this.aN = arrayOfhqg14;
    }
    hqg[] arrayOfhqg3 = this.aN;
    int i3 = this.aO;
    this.aO = (i3 + 1);
    arrayOfhqg3[i3] = localhqg3;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg4 = new hqg(true, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg13 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg13, 0, this.aO);
      this.aN = arrayOfhqg13;
    }
    hqg[] arrayOfhqg4 = this.aN;
    int i4 = this.aO;
    this.aO = (i4 + 1);
    arrayOfhqg4[i4] = localhqg4;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg5 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg12 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg12, 0, this.aO);
      this.aN = arrayOfhqg12;
    }
    hqg[] arrayOfhqg5 = this.aN;
    int i5 = this.aO;
    this.aO = (i5 + 1);
    arrayOfhqg5[i5] = localhqg5;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg6 = new hqg(true, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg11 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg11, 0, this.aO);
      this.aN = arrayOfhqg11;
    }
    hqg[] arrayOfhqg6 = this.aN;
    int i6 = this.aO;
    this.aO = (i6 + 1);
    arrayOfhqg6[i6] = localhqg6;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg7 = new hqg(true, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg10 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg10, 0, this.aO);
      this.aN = arrayOfhqg10;
    }
    hqg[] arrayOfhqg7 = this.aN;
    int i7 = this.aO;
    this.aO = (i7 + 1);
    arrayOfhqg7[i7] = localhqg7;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg8 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg9 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg9, 0, this.aO);
      this.aN = arrayOfhqg9;
    }
    hqg[] arrayOfhqg8 = this.aN;
    int i8 = this.aO;
    this.aO = (i8 + 1);
    arrayOfhqg8[i8] = localhqg8;
    this.aP = false;
    notifyDataSetChanged();
    Resources localResources = paramContext.getResources();
    this.m = localResources.getColor(efj.ko);
    this.n = localResources.getColor(efj.kp);
  }
  
  static int a(Cursor paramCursor)
  {
    if (b(paramCursor)) {
      return paramCursor.getCount();
    }
    return 0;
  }
  
  private final void a(List<bpx> paramList1, String paramString1, AvatarGroupView paramAvatarGroupView, MediaView paramMediaView, String paramString2, int paramInt, Intent paramIntent, String paramString3, List<bpx> paramList2)
  {
    int i1;
    int i2;
    if ((paramList1 == null) || (paramList1.isEmpty()))
    {
      i1 = 1;
      if (i1 == 0) {
        break label98;
      }
      i2 = 0;
      label24:
      paramMediaView.setVisibility(i2);
      if (i1 == 0) {
        break label105;
      }
    }
    label98:
    label105:
    for (int i3 = 8;; i3 = 0)
    {
      paramAvatarGroupView.setVisibility(i3);
      if (i1 == 0) {
        break label111;
      }
      paramMediaView.b(true);
      paramMediaView.b(r, r);
      if (!TextUtils.isEmpty(paramString1)) {
        paramMediaView.a(ipf.a(this.aM, paramString1, ipm.a));
      }
      return;
      i1 = 0;
      break;
      i2 = 8;
      break label24;
    }
    label111:
    paramAvatarGroupView.removeAllViews();
    int i4 = paramList1.size();
    if (i4 == 1) {}
    for (int i5 = 2;; i5 = 1) {
      for (int i6 = 0; i6 < i4; i6++)
      {
        bpx localbpx2 = (bpx)paramList1.get(i6);
        paramAvatarGroupView.a(localbpx2.c, hdo.b(localbpx2.d), i5, false, true);
      }
    }
    paramAvatarGroupView.setOnClickListener(new cqu(this, paramList2, paramString2, paramInt, paramIntent, paramString3, paramList1));
    if (i4 == 1)
    {
      bpx localbpx1 = (bpx)paramList1.get(0);
      Context localContext = this.aM;
      int i7 = aau.cv;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localbpx1.b;
      paramAvatarGroupView.setContentDescription(localContext.getString(i7, arrayOfObject));
      return;
    }
    paramAvatarGroupView.setContentDescription(this.aM.getString(aau.lZ));
  }
  
  private final void a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.c == 0) && ((this.o == 0) || (!this.e))) {}
    for (boolean bool = true;; bool = false)
    {
      this.aN[1].a = bool;
      this.aP = false;
      return;
    }
  }
  
  static boolean b(Cursor paramCursor)
  {
    boolean bool1 = true;
    if ((paramCursor != null) && (!paramCursor.isClosed()))
    {
      if ((paramCursor != null) && (paramCursor.getColumnCount() == bri.a.length)) {}
      for (boolean bool2 = bool1; bool2; bool2 = false)
      {
        if ((paramCursor instanceof AbstractWindowedCursor)) {
          bool1 = ((AbstractWindowedCursor)paramCursor).hasWindow();
        }
        return bool1;
      }
    }
    return false;
  }
  
  private void c(Cursor paramCursor)
  {
    if ((b(paramCursor)) && (paramCursor.moveToFirst())) {
      do
      {
        long l1 = paramCursor.getLong(20);
        if (l1 > this.d) {
          this.d = l1;
        }
      } while (paramCursor.moveToNext());
    }
  }
  
  private final byte[] g()
  {
    if (this.e) {
      return this.q;
    }
    return this.p;
  }
  
  public final int a()
  {
    return 8;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    return paramInt1;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    case 4: 
    default: 
      return null;
    }
    return this.l.inflate(efj.uP, paramViewGroup, false);
  }
  
  protected final View a(Context paramContext, int paramInt, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    switch (paramInt)
    {
    case 2: 
    default: 
      return super.a(paramContext, paramInt, paramCursor, paramViewGroup);
    case 5: 
      return this.l.inflate(efj.wa, paramViewGroup, false);
    case 3: 
    case 6: 
      return this.l.inflate(efj.uB, paramViewGroup, false);
    case 0: 
    case 4: 
    case 7: 
      return this.l.inflate(efj.ut, paramViewGroup, false);
    }
    return this.l.inflate(efj.uO, paramViewGroup, false);
  }
  
  public final void a(int paramInt)
  {
    int i1 = f();
    Cursor localCursor = (Cursor)getItem(paramInt);
    int i2;
    int i3;
    if ((b(localCursor)) && (i1 != -1))
    {
      i2 = e(paramInt);
      i3 = a(localCursor);
      switch (i2)
      {
      }
    }
    do
    {
      String str;
      long l1;
      do
      {
        return;
        str = localCursor.getString(9);
        l1 = localCursor.getLong(20);
        int i4 = f();
        Bundle localBundle = new Bundle();
        localBundle.putString("extra_notification_id", str);
        gxx localgxx = (gxx)mbb.a(this.aM, gxx.class);
        gxw localgxw = new gxw(this.aM, i4);
        localgxw.c = gxz.bz;
        localgxw.d = gya.u;
        if (localBundle != null) {
          localgxw.h.putAll(localBundle);
        }
        localgxx.a(localgxw);
      } while (TextUtils.isEmpty(str));
      if ((localCursor instanceof dal))
      {
        dal localdal = (dal)localCursor;
        localdal.a.add(str);
        localdal.a();
        this.aP = false;
        notifyDataSetChanged();
      }
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(str);
      long[] arrayOfLong = { l1 };
      bnn localbnn = new bnn(this.aM, i1, localArrayList, arrayOfLong, true, true, false, "GPLUS_APP_V3");
      gzj.a(this.aM, localbnn);
    } while ((i3 != 1) || (i2 != 3));
    Context localContext = this.aM;
    Intent localIntent = EsService.e.a(localContext, EsService.class);
    localIntent.putExtra("op", 215);
    localIntent.putExtra("account_id", i1);
    localIntent.putExtra("read_state", 1);
    Integer.valueOf(EsService.a(localContext, localIntent));
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    Cursor localCursor = this.aN[paramInt].c;
    if ((localCursor instanceof dal))
    {
      dal localdal = (dal)localCursor;
      localdal.b = paramBoolean;
      localdal.a();
      this.aP = false;
      notifyDataSetChanged();
    }
  }
  
  public final void a(Context paramContext, int paramInt1, int paramInt2)
  {
    Cursor localCursor = (Cursor)getItem(paramInt2);
    if (!b(localCursor)) {}
    Intent localIntent;
    do
    {
      return;
      localIntent = dkk.a(paramContext, paramInt1, localCursor, null, false);
    } while (localIntent == null);
    if (localCursor.getInt(11) == 0) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        String str2 = localCursor.getString(9);
        long l1 = localCursor.getLong(20);
        ArrayList localArrayList = new ArrayList(1);
        localArrayList.add(str2);
        long[] arrayOfLong = { l1 };
        bnn localbnn = new bnn(this.aM, paramInt1, localArrayList, arrayOfLong, false, true, false, "GPLUS_APP_V3");
        gzj.a(this.aM, localbnn);
      }
      try
      {
        paramContext.startActivity(localIntent);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException) {}
      if (!Log.isLoggable("HostNotifBarAdapter", 6)) {
        break;
      }
      String str1 = String.valueOf(localIntent);
      Log.e("HostNotifBarAdapter", 24 + String.valueOf(str1).length() + "Cannot launch activity: " + str1, localActivityNotFoundException);
      return;
    }
  }
  
  public final void a(Cursor paramCursor, int paramInt, Bundle paramBundle)
  {
    a(paramBundle);
    int i1 = this.c;
    this.aP = false;
    f(false);
    this.aN[0].a = false;
    this.aP = false;
    this.aN[6].a = false;
    this.aP = false;
    a(6, null);
    boolean bool1 = b();
    this.aN[3].a = bool1;
    this.aP = false;
    if (paramInt == 4) {
      a(2, paramCursor);
    }
    while (paramInt != 2)
    {
      this.c = a(this.aN[2].c);
      this.o = a(this.aN[3].c);
      if (i1 != this.c)
      {
        int i2 = this.c;
        if (i2 != i1)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("extra_prev_num_unread_notifi", i1);
          localBundle.putInt("extra_num_unread_notifi", i2);
          int i3 = f();
          gxx localgxx = (gxx)mbb.a(this.aM, gxx.class);
          gxw localgxw = new gxw(this.aM, i3);
          localgxw.c = gxz.bo;
          localgxw.d = gya.u;
          if (localBundle != null) {
            localgxw.h.putAll(localBundle);
          }
          localgxx.a(localgxw);
        }
      }
      a(5, new MatrixCursor(new String[0]));
      c(paramCursor);
      a(false);
      d();
      f(true);
      return;
    }
    a(3, paramCursor);
    if ((paramCursor == null) || (a(paramCursor) == 0))
    {
      this.e = false;
      this.f = false;
    }
    if (!this.e) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      a(3, bool2);
      break;
    }
  }
  
  public final void a(Cursor paramCursor1, Cursor paramCursor2, Bundle paramBundle)
  {
    a(paramBundle);
    f(false);
    this.aN[0].a = false;
    this.aP = false;
    a(2, null);
    this.aN[3].a = false;
    this.aP = false;
    a(3, null);
    boolean bool1 = b();
    this.aN[6].a = bool1;
    this.aP = false;
    a(6, paramCursor2);
    a(5, paramCursor1);
    if (a(paramCursor2) == 0)
    {
      this.e = false;
      this.f = false;
    }
    boolean bool2 = this.e;
    boolean bool3 = false;
    if (!bool2) {
      bool3 = true;
    }
    a(6, bool3);
    a(1, null);
    d();
    f(true);
  }
  
  final void a(Bundle paramBundle)
  {
    int i1 = 1;
    if (paramBundle == null) {
      return;
    }
    byte[] arrayOfByte;
    switch (this.a)
    {
    default: 
      this.p = paramBundle.getByteArray("next_unread_high_fetch_param");
      this.q = paramBundle.getByteArray("next_unread_low_fetch_param");
      arrayOfByte = paramBundle.getByteArray("unread_low_summary");
      label58:
      if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
        if (arrayOfByte == null) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        if (this.j == null)
        {
          if (i1 != 0)
          {
            this.e = false;
            this.f = false;
          }
          this.j = ((noj)qat.b(new noj(), arrayOfByte, 0, arrayOfByte.length));
          if (Log.isLoggable("HostNotifBarAdapter", 3))
          {
            String str = String.valueOf(this.j);
            new StringBuilder(29 + String.valueOf(str).length()).append("Update low priority summary: ").append(str);
          }
          if ((this.j != null) && (!this.j.e.booleanValue())) {
            break;
          }
          this.e = false;
          this.f = false;
          return;
          this.p = paramBundle.getByteArray("next_read_high_fetch_param");
          this.q = paramBundle.getByteArray("next_read_low_fetch_param");
          arrayOfByte = paramBundle.getByteArray("read_low_summary");
          break label58;
        }
        boolean bool = Arrays.equals(qat.a(this.j), arrayOfByte);
        if (bool)
        {
          i1 = 0;
          continue;
          this.j = null;
        }
      }
      catch (qas localqas)
      {
        Log.e("HostNotifBarAdapter", "Failed to deserialize the low-priority summmary ", localqas);
      }
    }
  }
  
  protected final void a(View paramView, int paramInt, Cursor paramCursor)
  {
    int i1 = 8;
    switch (paramInt)
    {
    case 2: 
    default: 
    case 4: 
    case 7: 
    case 1: 
      TextView localTextView4;
      ImageView localImageView;
      MediaView localMediaView;
      do
      {
        do
        {
          return;
          View localView6 = paramView.findViewById(aaw.hU);
          TextView localTextView5 = (TextView)paramView.findViewById(aaw.ls);
          if (this.t)
          {
            localView6.setVisibility(i1);
            localTextView5.setText(aau.lB);
            this.t = false;
            return;
          }
          localView6.setVisibility(0);
          localTextView5.setText(aau.jn);
        } while (this.s == null);
        if (this.e)
        {
          if (this.a == 2)
          {
            this.s.a(g(), 2, 2);
            return;
          }
          this.s.a(g(), 1, 2);
          return;
        }
        if (this.a == 2)
        {
          this.s.a(g(), 2, 4);
          return;
        }
        this.s.a(g(), 1, 4);
        return;
        TextView localTextView3 = (TextView)paramView.findViewById(aaw.fX);
        if (localTextView3 != null) {
          localTextView3.setTextAppearance(this.aM, efj.yM);
        }
        localTextView4 = (TextView)paramView.findViewById(aaw.fX);
        localImageView = (ImageView)paramView.findViewById(aaw.fW);
        localMediaView = (MediaView)paramView.findViewById(aaw.fs);
      } while ((localTextView4 == null) || (localImageView == null) || (localMediaView == null));
      String str = brg.a(this.aM);
      if (TextUtils.isEmpty(str))
      {
        localImageView.setVisibility(0);
        localMediaView.setVisibility(i1);
        localImageView.setOnClickListener(new cqp(this, localImageView));
        localTextView4.setOnClickListener(new cqq(this, localImageView));
        return;
      }
      localImageView.setVisibility(i1);
      localMediaView.setVisibility(0);
      localMediaView.a(ipf.a(this.aM, str, ipm.d));
      localMediaView.o = false;
      localMediaView.e(4);
      localMediaView.a(1);
      localMediaView.S = false;
      localMediaView.a(new ColorDrawable(0));
      int i6 = efj.qK;
      Bitmap localBitmap = BitmapFactory.decodeResource(localMediaView.getContext().getResources(), i6);
      if (localBitmap == null) {
        localBitmap = (Bitmap)MediaView.j.b();
      }
      localMediaView.C = localBitmap;
      localMediaView.setOnClickListener(new cqr(this, localMediaView));
      localTextView4.setOnClickListener(new cqs(this, localMediaView));
      return;
    case 5: 
      View localView4 = paramView.findViewById(aaw.dX);
      View localView5 = paramView.findViewById(aaw.hW);
      int i5;
      if (this.g)
      {
        i5 = 0;
        localView5.setVisibility(i5);
        if (!this.g) {
          break label557;
        }
      }
      for (;;)
      {
        localView4.setVisibility(i1);
        paramView.setOnClickListener(new cqn(this));
        return;
        i5 = i1;
        break;
        label557:
        i1 = 0;
      }
    }
    TextView localTextView1 = (TextView)paramView.findViewById(aaw.eb);
    TextView localTextView2 = (TextView)paramView.findViewById(aaw.cu);
    View localView1 = paramView.findViewById(aaw.dZ);
    View localView2 = paramView.findViewById(aaw.dY);
    View localView3 = paramView.findViewById(aaw.hW);
    int i2;
    label664:
    int i3;
    label689:
    int i4;
    if (this.j != null)
    {
      if (this.f)
      {
        localTextView1.setText(this.j.d);
        localTextView2.setVisibility(i1);
      }
    }
    else
    {
      if ((!this.e) || (this.h)) {
        break label767;
      }
      i2 = 0;
      localView1.setVisibility(i2);
      if ((!this.e) && (!this.h)) {
        break label774;
      }
      i3 = i1;
      localView2.setVisibility(i3);
      boolean bool = this.h;
      i4 = 0;
      if (!bool) {
        break label780;
      }
    }
    for (;;)
    {
      localView3.setVisibility(i4);
      paramView.setOnClickListener(new cqo(this, localView1, localView2));
      return;
      localTextView1.setText(this.j.b);
      localTextView2.setText(this.j.c);
      localTextView2.setVisibility(0);
      break;
      label767:
      i2 = i1;
      break label664;
      label774:
      i3 = 0;
      break label689;
      label780:
      i4 = i1;
    }
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    if (!b(paramCursor)) {
      return;
    }
    switch (paramInt1)
    {
    case 4: 
    default: 
      return;
    }
    String str1 = paramCursor.getString(9);
    paramCursor.getLong(6);
    int i1;
    int i2;
    label86:
    String str2;
    String str3;
    String str4;
    int i7;
    label245:
    View localView;
    int i9;
    label274:
    int i10;
    label284:
    label417:
    int i11;
    label428:
    TextView localTextView1;
    TextView localTextView2;
    if (paramCursor.getInt(24) > 0)
    {
      i1 = 1;
      if (i1 == 0) {
        break label548;
      }
      i2 = 2;
      int i3 = paramCursor.getPosition();
      int i4 = paramCursor.getInt(13);
      paramCursor.getInt(12);
      str2 = paramCursor.getString(3);
      str3 = paramCursor.getString(1);
      str4 = paramCursor.getString(4);
      List localList1 = bpw.a(paramCursor.getBlob(15));
      paramCursor.getLong(20);
      String str5 = paramCursor.getString(5);
      String str6 = paramCursor.getString(19);
      List localList2 = bpw.a(paramCursor.getBlob(26));
      int i5 = f();
      Intent localIntent = dkk.a(this.aM, i5, paramCursor, null, false);
      ArrayList localArrayList1 = dkk.a(paramCursor);
      int i6 = i3 + g(paramInt1);
      if (!this.aN[paramInt1].b) {
        break label561;
      }
      i7 = 1;
      int i8 = i6 + i7;
      localView = paramView.findViewById(aaw.gt);
      lvp.d(localView);
      if (i2 != 0) {
        break label567;
      }
      i9 = 1;
      if (i9 == 0) {
        break label573;
      }
      i10 = efj.qU;
      localView.setBackgroundResource(i10);
      cqt localcqt = new cqt(this, i8);
      localView.setOnClickListener(new gxn(localcqt));
      ArrayList localArrayList2 = new ArrayList(1);
      localArrayList2.add(str1);
      efj.a(localView, new kvh(pjt.b, localArrayList2, localArrayList1));
      MediaView localMediaView = (MediaView)paramView.findViewById(16908294);
      a(localList1, str5, (AvatarGroupView)paramView.findViewById(aaw.au), localMediaView, str1, i4, localIntent, str6, localList2);
      if ((i2 != 0) && (i2 != 2)) {
        break label581;
      }
      localView.setOnTouchListener(this.k);
      if (i9 == 0) {
        break label590;
      }
      i11 = this.n;
      localTextView1 = (TextView)paramView.findViewById(aaw.gq);
      localTextView2 = (TextView)paramView.findViewById(aaw.gh);
      if (!TextUtils.isEmpty(str4)) {
        break label599;
      }
      localTextView2.setVisibility(8);
      localTextView1.setMaxLines(2);
    }
    for (;;)
    {
      TextView localTextView3 = (TextView)paramView.findViewById(aaw.gy);
      localTextView3.setText(str2);
      localTextView3.setTextColor(i11);
      localTextView1.setText(str3);
      localTextView1.setTextColor(i11);
      paramView.setContentDescription(this.aM.getString(aau.lV, new Object[] { str2, str3 }));
      return;
      i1 = 0;
      break;
      label548:
      i2 = paramCursor.getInt(11);
      break label86;
      label561:
      i7 = 0;
      break label245;
      label567:
      i9 = 0;
      break label274;
      label573:
      i10 = efj.qT;
      break label284;
      label581:
      localView.setOnTouchListener(null);
      break label417;
      label590:
      i11 = this.m;
      break label428;
      label599:
      localTextView2.setVisibility(0);
      localTextView2.setText(str4);
      localTextView1.setMaxLines(1);
    }
  }
  
  protected final boolean a(Cursor paramCursor1, Cursor paramCursor2)
  {
    if ((paramCursor1 != paramCursor2) && ((paramCursor1 instanceof dal)) && ((paramCursor2 instanceof dal)))
    {
      dal localdal1 = (dal)paramCursor1;
      dal localdal2 = (dal)paramCursor2;
      return localdal1.getWrappedCursor() != localdal2.getWrappedCursor();
    }
    return super.a(paramCursor1, paramCursor2);
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  final boolean b()
  {
    return (this.p == null) && (this.j != null) && (!this.j.e.booleanValue());
  }
  
  protected final boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == 2;
  }
  
  public final void c()
  {
    switch (this.a)
    {
    }
    for (int i1 = e_(4);; i1 = e_(4))
    {
      if (i1 > 0)
      {
        this.t = true;
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  final void d()
  {
    if (((this.e) && (this.q != null)) || ((!this.e) && (this.p != null))) {}
    for (boolean bool = true;; bool = false) {
      switch (this.a)
      {
      default: 
        this.aN[4].a = bool;
        this.aP = false;
        return;
      }
    }
    this.aN[7].a = bool;
    this.aP = false;
  }
  
  final void e()
  {
    f(false);
    switch (this.a)
    {
    }
    for (int i1 = 3;; i1 = 6)
    {
      boolean bool1 = this.e;
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      a(i1, bool2);
      if (this.a == 1)
      {
        a(this.e);
        notifyDataSetChanged();
      }
      f(true);
      return;
    }
  }
  
  final int f()
  {
    return ((git)mbb.a(this.aM, git.class)).c();
  }
  
  public final long getItemId(int paramInt)
  {
    Cursor localCursor = (Cursor)getItem(paramInt);
    int i1 = e(paramInt);
    if ((i1 == 2) || (i1 == 5) || (i1 == 3) || (i1 == 6)) {}
    for (int i2 = 1; f(paramInt) == -1; i2 = 0) {
      return -9223372036854775808L + i1;
    }
    if ((b(localCursor)) && (i2 != 0)) {
      return localCursor.getInt(20);
    }
    return 9223372036854775807L - i1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    A();
    if (e(paramInt) == 1) {
      return 1;
    }
    return super.getItemViewType(paramInt);
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqm
 * JD-Core Version:    0.7.0.1
 */