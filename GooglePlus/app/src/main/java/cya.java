import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.views.AutoBackupBarView;
import com.google.android.apps.plus.views.FastScrollContainer;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executor;

public final class cya
  extends deo
  implements View.OnClickListener, cmi<ipf>
{
  private static cyb J;
  private String A;
  private final boolean B;
  private boolean C;
  private int D;
  private long E;
  private boolean F;
  private cyr G;
  private final cpu H;
  private final bwn I;
  private boolean K = true;
  public final String f;
  String g;
  public final boolean h;
  public int i = 6;
  public int j;
  public lb<String> k;
  public SparseIntArray l;
  public SparseIntArray m;
  public lb<String> n;
  public int o;
  public int p = 1;
  public View q;
  public boolean r;
  public boolean s = true;
  private final int z;
  
  public cya(Context paramContext, Cursor paramCursor, int paramInt, String paramString, boolean paramBoolean1, cpu paramcpu, bwn parambwn, boolean paramBoolean2, boolean paramBoolean3, FastScrollContainer paramFastScrollContainer)
  {
    super(paramContext, null);
    this.y.a = null;
    this.z = paramInt;
    this.f = paramString;
    if (J == null) {
      J = new cyb();
    }
    this.h = true;
    this.H = paramcpu;
    this.B = false;
    this.I = parambwn;
    this.F = false;
    if ("TRUE".equalsIgnoreCase(dun.h.a())) {
      this.G = new cyr(paramContext);
    }
  }
  
  private final void a(int paramInt, cyb paramcyb)
  {
    lb locallb = this.k;
    if (locallb.b) {
      locallb.a();
    }
    int i1 = locallb.e;
    int i2 = this.k.f(paramInt);
    if (i2 < 0)
    {
      for (int i5 = i2 ^ 0xFFFFFFFF; (i5 < i1) && (this.k.d(i5) < paramInt); i5++) {}
      for (i2 = Math.min(i5, i1 - 1); (i2 >= 0) && (this.k.d(i2) > paramInt); i2--) {}
    }
    int i3 = i2;
    if (i3 >= 0)
    {
      str1 = (String)this.k.e(i3);
      str2 = (String)this.n.e(i3);
      this.m.valueAt(i3);
      i4 = paramInt - this.k.d(i3);
      paramcyb.a = str2;
      paramcyb.b = str1;
      paramcyb.c = i4;
    }
    while (!Log.isLoggable("EsTile", 6))
    {
      String str1;
      String str2;
      int i4;
      return;
    }
    Log.e("EsTile", 58 + "Unable to find cluster ID for photo: cursorPos=" + paramInt);
  }
  
  private final void a(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean, ipf paramipf)
  {
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView.findViewById(aaw.fo);
    a(paramCursor.getPosition(), J);
    paramView.setTag(aaw.le, Boolean.valueOf(true));
    TextView localTextView;
    isq localisq1;
    int i1;
    int i2;
    if (!f(paramCursor))
    {
      localPhotoTileView.a(paramipf);
      localPhotoTileView.a(true);
      String str1 = paramContext.getResources().getString(aau.kZ);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = J.a;
      localPhotoTileView.setContentDescription(String.format(str1, arrayOfObject));
      localTextView = (TextView)paramView.findViewById(aaw.jC);
      localisq1 = this.t.b;
      String str2 = J.b;
      i1 = paramCursor.getPosition();
      paramCursor.move(0);
      isq localisq2 = this.t.b;
      i2 = 0;
      label153:
      if ((!paramCursor.moveToPrevious()) || (!e(paramCursor))) {
        break label227;
      }
      ipf localipf = g(paramCursor);
      if ((jpu)localisq2.a(new jpy(str2), new jpw(localipf)) == null) {
        break label292;
      }
    }
    label292:
    for (int i5 = i2 + 1;; i5 = i2)
    {
      i2 = i5;
      break label153;
      localPhotoTileView.a(null);
      break;
      label227:
      paramCursor.moveToPosition(i1);
      int i3 = localisq1.a(new jpy(J.b)) - i2;
      localTextView.setText(String.valueOf(i3));
      int i4 = 0;
      if (i3 > 0) {}
      for (;;)
      {
        localTextView.setVisibility(i4);
        return;
        i4 = 8;
      }
    }
  }
  
  private final void a(View paramView, Cursor paramCursor, ipf paramipf)
  {
    int i1 = 2;
    String str1 = paramCursor.getString(1);
    long l1 = paramCursor.getLong(15);
    switch (paramCursor.getInt(i1))
    {
    default: 
      i1 = 0;
    case 110: 
      switch (i1)
      {
      }
      break;
    }
    for (;;)
    {
      paramView.setTag(aaw.ln, str1);
      paramView.setTag(aaw.lo, Integer.valueOf(i1));
      paramView.setTag(aaw.la, Long.valueOf(l1));
      paramView.setOnClickListener(this.w);
      return;
      i1 = 1;
      break;
      i1 = 3;
      break;
      paramView.setOnLongClickListener(this.x);
      String str3 = paramCursor.getString(3);
      paramView.setTag(aaw.lc, paramipf);
      paramView.setTag(aaw.kX, str3);
      continue;
      String str2 = paramCursor.getString(4);
      paramView.setTag(aaw.kX, str2);
    }
  }
  
  private final void a(ViewGroup paramViewGroup, int paramInt)
  {
    int i1 = this.j;
    int i2 = this.D;
    int i3 = paramInt - i2 * i1;
    int i4;
    int i5;
    int i8;
    int i9;
    label116:
    int i10;
    if (i3 > 0)
    {
      i4 = 1;
      i5 = i2 + i4;
      View localView1 = this.u.inflate(efj.sG, paramViewGroup, false);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i5, i5);
      localLayoutParams1.rightMargin = this.i;
      localLayoutParams1.bottomMargin = this.i;
      localView1.setLayoutParams(localLayoutParams1);
      localView1.setVisibility(8);
      paramViewGroup.addView(localView1);
      int i6 = i1 - 1;
      int i7 = i3;
      i8 = i6;
      i9 = i4;
      if (i8 < 0) {
        break label234;
      }
      View localView4 = this.u.inflate(efj.vS, paramViewGroup, false);
      LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(i2 + i9, i2 + i9);
      if (i8 != 0) {
        break label225;
      }
      i10 = 0;
      label162:
      localLayoutParams4.rightMargin = i10;
      localLayoutParams4.bottomMargin = this.i;
      localView4.setLayoutParams(localLayoutParams4);
      localView4.setVisibility(8);
      paramViewGroup.addView(localView4);
      i7--;
      if (i7 != 0) {
        break label359;
      }
    }
    label225:
    label359:
    for (int i11 = 0;; i11 = i9)
    {
      i8--;
      i9 = i11;
      break label116;
      i4 = 0;
      break;
      i10 = this.i;
      break label162;
      label234:
      View localView2 = this.u.inflate(efj.sT, paramViewGroup, false);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(i5, i5);
      localLayoutParams2.rightMargin = 0;
      localLayoutParams2.bottomMargin = this.i;
      localView2.setLayoutParams(localLayoutParams2);
      localView2.setVisibility(8);
      paramViewGroup.addView(localView2);
      View localView3 = this.u.inflate(efj.uu, paramViewGroup, false);
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(i2, i2);
      localLayoutParams3.rightMargin = 0;
      localLayoutParams3.bottomMargin = this.i;
      localView3.setLayoutParams(localLayoutParams3);
      localView3.setVisibility(8);
      paramViewGroup.addView(localView3);
      return;
    }
  }
  
  private final boolean a(Cursor paramCursor, String paramString)
  {
    int i1 = this.j * this.p;
    int i2 = paramCursor.getPosition();
    int i3 = 0;
    try
    {
      while ((paramCursor.moveToNext()) && ((i3 < i1) || (e(paramCursor))))
      {
        long l1 = paramCursor.getLong(14);
        if ((l1 & 0x20000000) != 0L) {
          return true;
        }
        i3++;
      }
      return false;
    }
    finally
    {
      paramCursor.moveToPosition(i2);
    }
  }
  
  private final int c(int paramInt)
  {
    if ((!this.a) || (this.c == null)) {
      return -1;
    }
    if (this.l.indexOfKey(paramInt) >= 0) {
      return this.l.get(paramInt);
    }
    int i1 = this.c.getPosition();
    int i2 = Math.max(paramInt, 15 + this.o);
    int i3 = this.o;
    int i4 = -1 + this.o;
    int i5 = -1;
    this.c.moveToPosition(-1 + this.l.get(this.o, 0));
    if (this.c.moveToNext())
    {
      this.c.getString(3);
      this.c.moveToPrevious();
    }
    int i6 = 0;
    Object localObject = null;
    while ((this.c.moveToNext()) && ((i4 < i2) || ((this.h) && (TextUtils.equals(this.c.getString(3), (CharSequence)localObject)))))
    {
      int i7 = this.c.getPosition();
      boolean bool1 = d(this.c);
      if ((bool1) || (i7 >= i5))
      {
        int i8 = 0;
        int i9 = 0;
        int i11;
        if (!bool1)
        {
          i9 = b(i7);
          String str2 = this.c.getString(3);
          boolean bool2 = this.h;
          i8 = 0;
          if (bool2)
          {
            i8 = 0;
            if (str2 != null)
            {
              boolean bool3 = jrf.m(str2);
              i8 = 0;
              if (!bool3)
              {
                i11 = this.c.getPosition();
                if ((i6 <= 0) || ((this.c.move(i9 - 1)) && (this.c.getInt(2) != 2) && (TextUtils.equals(str2, this.c.getString(3))))) {
                  break label466;
                }
              }
            }
          }
        }
        label466:
        for (i8 = 1;; i8 = 0)
        {
          this.c.moveToPosition(i11);
          if (i8 == 0)
          {
            i5 = -1;
            i4++;
            i6++;
            this.l.put(i4, i7);
          }
          if (!bool1) {
            break label472;
          }
          localObject = this.c.getString(4);
          String str1 = this.c.getString(5);
          int i10 = this.c.getInt(9);
          this.k.a(i7, localObject);
          this.m.put(i4, i10);
          this.n.a(i7, str1);
          i6 = 0;
          break;
        }
        label472:
        i5 = i7 + i9;
      }
    }
    this.o = Math.max(0, i4);
    if (i3 != this.o) {
      notifyDataSetChanged();
    }
    this.c.moveToPosition(i1);
    return this.l.get(paramInt, -1);
  }
  
  public static boolean d(Cursor paramCursor)
  {
    if (paramCursor.getInt(2) == 2) {}
    for (int i1 = 1;; i1 = 0)
    {
      boolean bool1;
      if ((i1 == 0) && (!i(paramCursor)))
      {
        boolean bool2 = j(paramCursor);
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public static boolean e(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 4;
  }
  
  public static boolean f(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 101;
  }
  
  private final void h(Cursor paramCursor)
  {
    if (paramCursor == null)
    {
      this.y.a(null);
      return;
    }
    SparseArray localSparseArray = new SparseArray();
    int i1 = paramCursor.getPosition();
    if (paramCursor.moveToFirst())
    {
      for (int i2 = 0; (!paramCursor.isAfterLast()) && (paramCursor.getInt(2) != 4); i2++) {
        paramCursor.moveToNext();
      }
      Calendar localCalendar1 = Calendar.getInstance();
      int i3 = i2;
      Calendar localCalendar2 = localCalendar1;
      int i4 = 0;
      deu localdeu = null;
      do
      {
        if (i4 % this.j == 0)
        {
          localCalendar2.setTimeInMillis(paramCursor.getLong(16));
          if ((localdeu == null) || (!localdeu.a(localCalendar2)))
          {
            localdeu = new deu(this.d, localCalendar2);
            localSparseArray.put(i3, localdeu);
            localCalendar2 = Calendar.getInstance();
          }
          i3++;
        }
        i4++;
      } while (paramCursor.moveToNext());
    }
    paramCursor.moveToPosition(i1);
    this.y.a(localSparseArray);
  }
  
  private static boolean i(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 110;
  }
  
  private static boolean j(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 666;
  }
  
  public final int a(int paramInt)
  {
    while (paramInt > 0)
    {
      if (this.l.indexOfKey(paramInt) >= 0) {
        return this.l.get(paramInt);
      }
      paramInt--;
    }
    return 0;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.u.inflate(efj.sS, paramViewGroup, false);
  }
  
  public final List<ipf> a(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt1 < paramInt2)
    {
      if (getItemViewType(paramInt1) == 1)
      {
        int i1 = c(paramInt1);
        for (int i2 = i1; i2 < i1 + this.j; i2++)
        {
          this.c.moveToPosition(i2);
          if (e(this.c)) {
            localArrayList.add(g(this.c));
          }
        }
      }
      paramInt1++;
    }
    return localArrayList;
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final int b(int paramInt)
  {
    if (this.k.f(paramInt) >= 0) {
      return 0;
    }
    return this.j;
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    Bundle localBundle;
    int i1;
    label57:
    int i2;
    label140:
    lb locallb1;
    label369:
    SparseIntArray localSparseIntArray1;
    label382:
    SparseIntArray localSparseIntArray2;
    label395:
    lb locallb2;
    if (paramCursor == null)
    {
      localBundle = Bundle.EMPTY;
      this.A = localBundle.getString("resume_token");
      long l1 = localBundle.getLong("last_refresh_time");
      this.j = new jrh(this.d).a;
      if (this.E == l1) {
        break label435;
      }
      i1 = 1;
      if ((!this.B) && (paramCursor != null) && (this.a) && (this.c != null) && (!this.c.isClosed()) && (this.c.getCount() != 0) && (i1 == 0) && ((paramCursor == this.c) || (paramCursor.getCount() >= this.c.getCount()))) {
        break label441;
      }
      i2 = 1;
      this.E = l1;
      this.C = false;
      if ((this.s) && (paramCursor != null))
      {
        hqr localhqr2 = new hqr(cyd.r);
        Object[] arrayOfObject2 = new Object[cyd.r.length];
        arrayOfObject2[0] = Integer.valueOf(0);
        arrayOfObject2[2] = Integer.valueOf(110);
        arrayOfObject2[1] = "~promo";
        arrayOfObject2[4] = "~promo";
        localhqr2.a(arrayOfObject2);
        paramCursor = new MergeCursor(new Cursor[] { localhqr2, paramCursor });
      }
      if ((this.s) && (paramCursor != null) && (paramCursor.getCount() > 0))
      {
        hqr localhqr1 = new hqr(cyd.r);
        Object[] arrayOfObject1 = new Object[cyd.r.length];
        arrayOfObject1[0] = Integer.valueOf(0);
        arrayOfObject1[2] = Integer.valueOf(666);
        arrayOfObject1[1] = "~autobackup";
        arrayOfObject1[4] = "~autobackup";
        localhqr1.a(arrayOfObject1);
        paramCursor = new MergeCursor(new Cursor[] { localhqr1, paramCursor });
      }
      if (this.y.a != null) {
        h(paramCursor);
      }
      if (i2 == 0) {
        break label507;
      }
      if (paramCursor != null) {
        break label447;
      }
      locallb1 = null;
      this.k = locallb1;
      if (paramCursor != null) {
        break label459;
      }
      localSparseIntArray1 = null;
      this.l = localSparseIntArray1;
      if (paramCursor != null) {
        break label477;
      }
      localSparseIntArray2 = null;
      this.m = localSparseIntArray2;
      locallb2 = null;
      if (paramCursor != null) {
        break label495;
      }
    }
    for (;;)
    {
      this.n = locallb2;
      this.o = 0;
      return super.b(paramCursor);
      localBundle = paramCursor.getExtras();
      break;
      label435:
      i1 = 0;
      break label57;
      label441:
      i2 = 0;
      break label140;
      label447:
      locallb1 = new lb();
      break label369;
      label459:
      localSparseIntArray1 = new SparseIntArray(paramCursor.getCount());
      break label382;
      label477:
      localSparseIntArray2 = new SparseIntArray(paramCursor.getCount());
      break label395;
      label495:
      locallb2 = new lb();
    }
    label507:
    return super.b(paramCursor);
  }
  
  public final int[] b()
  {
    int[] arrayOfInt = new int[this.m.size()];
    for (int i1 = -1 + arrayOfInt.length; i1 >= 0; i1--) {
      arrayOfInt[i1] = this.m.valueAt(i1);
    }
    return arrayOfInt;
  }
  
  public final void c()
  {
    if (this.G != null) {
      this.G.a();
    }
    super.c();
  }
  
  public final ipf g(Cursor paramCursor)
  {
    long l1 = paramCursor.getLong(15);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(7);
    Object localObject;
    ipm localipm;
    if (paramCursor.isNull(19))
    {
      localObject = null;
      localipm = jrf.a(l1);
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break label141;
      }
      if (!((String)localObject).startsWith("content")) {
        break label103;
      }
    }
    label103:
    for (Uri localUri = Uri.parse((String)localObject);; localUri = Uri.fromFile(new File(((ifj)mbb.a(this.d, ifj.class)).f().b((String)localObject))))
    {
      return ipf.a(this.d, str1, str2, localUri, localipm);
      localObject = paramCursor.getString(19);
      break;
    }
    label141:
    if ((0x40000 & l1) != 0L)
    {
      String str3 = paramCursor.getString(20);
      return ipf.a(this.d, Uri.parse(str2), localipm, str3);
    }
    return ipf.a(this.d, str1, str2, localipm);
  }
  
  public final int getCount()
  {
    int i1 = 1;
    boolean bool1 = this.a;
    int i2 = 0;
    if (bool1)
    {
      Cursor localCursor = this.c;
      i2 = 0;
      if (localCursor != null)
      {
        int i3 = this.c.getCount();
        i2 = 0;
        if (i3 != 0)
        {
          boolean bool2 = this.r;
          i2 = 0;
          if (bool2) {
            break label59;
          }
        }
      }
    }
    return i2;
    label59:
    int i4 = this.l.get(this.o, 0);
    int i5 = this.c.getCount();
    if ((this.h) && (this.o > 0))
    {
      int i10 = b(i4);
      if (i4 + (i10 << 1) > this.c.getCount()) {
        i5 = Math.min(this.c.getCount(), i10 + i4);
      }
    }
    int i6;
    label154:
    int i7;
    label164:
    int i8;
    if (this.o == 0)
    {
      i6 = 0;
      if (this.A != null) {
        break label279;
      }
      i7 = 0;
      i8 = i5 + i7;
      if (i8 - i4 <= i6) {
        break label285;
      }
    }
    for (;;)
    {
      int i9 = 0;
      if (i1 != 0) {
        i9 = i8 - i4 - i6;
      }
      i2 = i9 + 1 + this.o;
      if (!Log.isLoggable("EsTile", 3)) {
        break;
      }
      new StringBuilder(48).append("#getCount; curCnt: ").append(i8).append(", cnt: ").append(i2);
      return i2;
      if (this.k.f(i4) >= 0)
      {
        i6 = i1;
        break label154;
      }
      i6 = b(i4);
      break label154;
      label279:
      i7 = i1;
      break label164;
      label285:
      i1 = 0;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    int i1 = c(paramInt);
    if (Log.isLoggable("EsTile", 3))
    {
      if ((!this.a) || (this.c == null)) {
        break label115;
      }
      int i2 = this.c.getCount();
      new StringBuilder(68).append("#getItem; pos: ").append(paramInt).append(", curPos: ").append(i1).append(", curCnt: ").append(i2);
    }
    while ((this.a) && (this.c != null) && (i1 >= 0))
    {
      this.c.moveToPosition(i1);
      return this.c;
      label115:
      boolean bool = this.a;
      new StringBuilder(30).append("#getItem; is data valid? ").append(bool);
    }
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    long l1 = 0L;
    int i1 = c(paramInt);
    if ((this.a) && (this.c != null) && (i1 >= 0) && (this.c.moveToPosition(i1))) {
      l1 = this.c.getLong(this.e);
    }
    return l1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    int i1 = c(paramInt);
    if (Log.isLoggable("EsTile", 3))
    {
      if ((!this.a) || (this.c == null)) {
        break label101;
      }
      int i2 = this.c.getCount();
      new StringBuilder(76).append("#getItemViewType; pos: ").append(paramInt).append(", curPos: ").append(i1).append(", curCnt: ").append(i2);
    }
    while ((!this.a) || (this.c == null) || (i1 < 0))
    {
      return -1;
      label101:
      boolean bool = this.a;
      new StringBuilder(38).append("#getItemViewType; is data valid? ").append(bool);
    }
    Cursor localCursor = (Cursor)getItem(paramInt);
    if ((e(localCursor)) || (f(localCursor))) {
      return 1;
    }
    if (i(localCursor)) {
      return 2;
    }
    if (j(localCursor)) {
      return 3;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi", "NewApi"})
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    int i1;
    int i3;
    int i4;
    cyc localcyc;
    label267:
    int i5;
    if (paramViewGroup == null)
    {
      i1 = 0;
      int i2 = this.D;
      if ((i2 == 0) && (i1 > 0)) {
        this.D = ((i1 - this.i * (-1 + this.j)) / this.j);
      }
      if (Log.isLoggable("EsTile", 3))
      {
        int i40 = this.j;
        new StringBuilder(56).append("#calcColumnCount; count: ").append(i40).append(", width: ").append(i2);
      }
      i3 = c(paramInt);
      i4 = this.c.getCount();
      if (Log.isLoggable("EsTile", 3)) {
        new StringBuilder(49).append("#getView; pos: ").append(paramInt).append(", curStart: ").append(i3);
      }
      if ((this.K) && (this.A != null) && (i4 - i3 < 100) && (!TextUtils.equals(this.g, this.A)))
      {
        this.g = this.A;
        localcyc = new cyc(this.d, this.z, this.f, this);
        if (Build.VERSION.SDK_INT >= 11) {
          break label332;
        }
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = this.A;
        localcyc.execute(arrayOfString3);
      }
      i5 = getItemViewType(paramInt);
      if (i5 != 3) {
        break label364;
      }
      if (paramView != null) {
        break label2604;
      }
    }
    label905:
    label1051:
    label1187:
    label1450:
    label1834:
    label2604:
    for (View localView6 = this.u.inflate(efj.sN, paramViewGroup, false);; localView6 = paramView)
    {
      AutoBackupBarView localAutoBackupBarView = (AutoBackupBarView)localView6;
      this.I.a(this.d, localAutoBackupBarView);
      return localAutoBackupBarView;
      i1 = paramViewGroup.getMeasuredWidth();
      break;
      label332:
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.A;
      localcyc.executeOnExecutor(localExecutor, arrayOfString2);
      break label267;
      label364:
      int i6;
      int i7;
      label381:
      ViewGroup localViewGroup3;
      ViewGroup localViewGroup1;
      if (i5 == 0)
      {
        i6 = 1;
        if (i5 != 2) {
          break label1075;
        }
        i7 = 1;
        if (paramView != null) {
          break label1103;
        }
        localViewGroup3 = (ViewGroup)this.u.inflate(efj.sS, paramViewGroup, false);
        if (i6 == 0) {
          break label1081;
        }
        localViewGroup3.addView(this.u.inflate(efj.sR, localViewGroup3, false));
        localViewGroup1 = localViewGroup3;
      }
      for (;;)
      {
        label434:
        AvatarView localAvatarView;
        ImageView localImageView1;
        ImageView localImageView2;
        ImageView localImageView3;
        String str2;
        boolean bool8;
        label701:
        boolean bool9;
        int i34;
        label836:
        String str5;
        int i35;
        label862:
        int i36;
        if (i6 != 0)
        {
          View localView5 = localViewGroup1.getChildAt(0);
          Cursor localCursor2 = this.c;
          TextView localTextView2 = (TextView)localView5.findViewById(aaw.bA);
          localAvatarView = (AvatarView)localView5.findViewById(aaw.as);
          localImageView1 = (ImageView)localView5.findViewById(aaw.jO);
          localImageView2 = (ImageView)localView5.findViewById(aaw.jr);
          localImageView3 = (ImageView)localView5.findViewById(aaw.ar);
          localTextView2.setText(localCursor2.getString(5));
          StyleSpan localStyleSpan = new StyleSpan(1);
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
          if (!localCursor2.isNull(9))
          {
            int i38 = localCursor2.getInt(9);
            Resources localResources = this.d.getResources();
            int i39 = efj.xc;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(i38);
            String str7 = localResources.getQuantityString(i39, i38, arrayOfObject2).toUpperCase();
            localSpannableStringBuilder.append(str7);
            localSpannableStringBuilder.setSpan(localStyleSpan, 0, str7.length(), 33);
          }
          long l3 = localCursor2.getLong(14);
          str2 = localCursor2.getString(4);
          boolean bool6 = jrf.m(str2);
          boolean bool7 = "PLUS_EVENT".equals(jrf.g(str2));
          if (((l3 & 0x200) != 0L) && (!bool7))
          {
            bool8 = true;
            bool9 = a(localCursor2, str2);
            i34 = this.v.b;
            if (i34 == 1) {
              break label1187;
            }
            if ((i34 != 0) || ((!bool9) && (!bool8)) || (bool6)) {
              break label1118;
            }
            int i37 = localCursor2.getInt(9);
            localImageView1.setOnClickListener(this.w);
            localImageView1.setOnLongClickListener(this.x);
            localImageView1.setTag(aaw.kW, Integer.valueOf(i37));
            localImageView1.setTag(aaw.kX, str2);
            localImageView1.setTag(aaw.kV, Boolean.valueOf(bool8));
            localImageView1.setTag(aaw.kY, Integer.valueOf(paramInt));
            localImageView1.setVisibility(0);
            localImageView2.setVisibility(8);
            if (bool6)
            {
              str5 = jrf.j(str2);
              if ((i34 == 0) || (i34 == 5)) {
                break label1204;
              }
              i35 = 1;
              if ((!this.F) || (i35 != 0)) {
                break label1254;
              }
              String str6 = (String)localImageView3.getTag(aaw.kU);
              if ((str6 != null) && (str6.equals(str5))) {
                break label1210;
              }
              i36 = 1;
              if (i36 != 0)
              {
                TextView localTextView3 = (TextView)localView5.findViewById(aaw.ak);
                localTextView3.clearAnimation();
                localTextView3.setVisibility(8);
              }
              localImageView3.setVisibility(0);
              localImageView3.setTag(aaw.kU, str5);
              localImageView3.setTag(aaw.kX, str2);
              localImageView3.setOnClickListener(this.w);
              if (!jrf.l(str2)) {
                break label1216;
              }
              localImageView3.setImageResource(efj.pe);
            }
            label986:
            String str3 = localCursor2.getString(17);
            String str4 = localCursor2.getString(18);
            if ((TextUtils.isEmpty(str3)) || (TextUtils.isEmpty(str4))) {
              break label1264;
            }
            localAvatarView.a(str3, str4);
            localAvatarView.setVisibility(0);
            localAvatarView.setClickable(true);
            localAvatarView.setOnClickListener(this);
            a(localView5, localCursor2, null);
            localView5.setVisibility(0);
          }
        }
        for (;;)
        {
          return localViewGroup1;
          i6 = 0;
          break;
          label1075:
          i7 = 0;
          break label381;
          label1081:
          if (i7 != 0) {
            break label2597;
          }
          a(localViewGroup3, paramViewGroup.getMeasuredWidth());
          localViewGroup1 = localViewGroup3;
          break label434;
          label1103:
          localViewGroup1 = (ViewGroup)paramView;
          break label434;
          bool8 = false;
          break label701;
          label1118:
          if (((i34 == 0) || (i34 == 2) || (i34 == 4)) && (bool9))
          {
            localImageView2.setOnClickListener(this.w);
            localImageView2.setTag(aaw.kX, str2);
            localImageView2.setTag(aaw.kY, Integer.valueOf(paramInt));
            localImageView2.setVisibility(0);
            localImageView1.setVisibility(8);
            break label836;
          }
          localImageView2.setVisibility(8);
          localImageView1.setVisibility(8);
          break label836;
          label1204:
          i35 = 0;
          break label862;
          label1210:
          i36 = 0;
          break label905;
          label1216:
          if (null.c(str5))
          {
            if (i36 == 0) {
              break label986;
            }
            localImageView3.setImageResource(efj.os);
            break label986;
          }
          localImageView3.setImageResource(efj.or);
          break label986;
          label1254:
          localImageView3.setVisibility(8);
          break label986;
          label1264:
          localAvatarView.setVisibility(8);
          break label1051;
          if (i7 == 0) {
            break label1367;
          }
          View localView3 = localViewGroup1.getChildAt(0);
          if ((localView3 != null) && (!localView3.equals(this.q)))
          {
            localViewGroup1.removeViewAt(0);
            localView3 = null;
          }
          if ((this.q != null) && (localView3 == null))
          {
            ViewGroup localViewGroup2 = (ViewGroup)this.q.getParent();
            if (localViewGroup2 != null) {
              localViewGroup2.removeView(this.q);
            }
            View localView4 = this.q;
            localViewGroup1.addView(localView4);
          }
        }
        label1367:
        int i8 = this.j;
        int i9 = -1 + localViewGroup1.getChildCount();
        int i10 = i9 - 1;
        int i11 = 1;
        int i12;
        int i32;
        int i13;
        if ((this.h) && (i3 < i4))
        {
          int i33 = -1 + this.l.size();
          if ((paramInt == i33) || (this.k.a(this.l.get(paramInt + 1)) != null))
          {
            i12 = 1;
            if (i12 == 0) {
              break label2588;
            }
            if (paramInt < 0) {
              break label2588;
            }
            int i31 = this.l.get(paramInt);
            if (this.k.f(i31) < 0) {
              break label1609;
            }
            i32 = this.m.get(paramInt);
            i13 = i31;
          }
        }
        for (int i14 = i32;; i14 = 0)
        {
          int i15 = 0;
          int i16 = 0;
          int i17 = 0;
          int i18;
          label1609:
          boolean bool2;
          ipf localipf;
          label1648:
          View localView1;
          label1740:
          int i20;
          int i21;
          int i22;
          label1856:
          label1898:
          label1904:
          label1911:
          int i27;
          Context localContext;
          Cursor localCursor1;
          PhotoTileView localPhotoTileView1;
          int i28;
          label2020:
          label2035:
          Integer localInteger;
          long l1;
          long l2;
          boolean bool4;
          label2121:
          jpu localjpu1;
          String[] arrayOfString1;
          if (i17 < i8)
          {
            int i19 = i3 + i17;
            this.c.moveToPosition(i19);
            if ((i19 == i4) || (i19 < 0))
            {
              if (this.A == null) {
                break label2575;
              }
              i18 = 1;
              localViewGroup1.getChildAt(i9).setVisibility(0);
              if (i15 == 0) {
                localViewGroup1.getChildAt(0).setVisibility(8);
              }
            }
            for (;;)
            {
              if (i11 <= i8)
              {
                localViewGroup1.getChildAt(i11).setVisibility(8);
                i11++;
                continue;
                i12 = 0;
                break;
                paramInt--;
                break label1450;
                boolean bool1 = e(this.c);
                bool2 = f(this.c);
                int i25;
                int i26;
                int i30;
                if (bool1)
                {
                  localipf = g(this.c);
                  if (!bool1) {
                    break label2494;
                  }
                  a(this.c.getPosition(), J);
                  boolean bool3 = TextUtils.equals(this.c.getString(1), "~folders");
                  int i23 = -1 + this.j;
                  if (i17 == i23) {}
                  int i24 = i8 - 1;
                  if ((i17 != i24) || (i12 == 0) || (i14 <= i19 - i13)) {
                    break label1898;
                  }
                  i25 = 1;
                  i26 = i25 | 0x0;
                  if (!bool3) {
                    break label1911;
                  }
                  View localView2 = localViewGroup1.getChildAt(0);
                  PhotoTileView localPhotoTileView2 = (PhotoTileView)localView2.findViewById(aaw.dD);
                  localView2.setTag(aaw.kS, Boolean.valueOf(true));
                  localPhotoTileView2.a(localipf);
                  TextView localTextView1 = (TextView)localView2.findViewById(aaw.jC);
                  int i29 = this.t.b.c;
                  localTextView1.setText(String.valueOf(i29));
                  if (i29 <= 0) {
                    break label1904;
                  }
                  i30 = 0;
                  localTextView1.setVisibility(i30);
                  localView1 = localView2;
                  i20 = i16;
                  i21 = 1;
                }
                for (i22 = i11;; i22 = i11)
                {
                  a(localView1, this.c, localipf);
                  localView1.setVisibility(0);
                  i17++;
                  i16 = i20;
                  i15 = i21;
                  i11 = i22;
                  break;
                  localipf = null;
                  break label1648;
                  i25 = 0;
                  break label1740;
                  i30 = 8;
                  break label1834;
                  if (i26 == 0) {
                    break label1956;
                  }
                  localView1 = localViewGroup1.getChildAt(i10);
                  a(localView1, this.d, this.c, true, localipf);
                  i20 = 1;
                  i21 = i15;
                }
                i27 = i11 + 1;
                localView1 = localViewGroup1.getChildAt(i11);
                localContext = this.d;
                localCursor1 = this.c;
                localPhotoTileView1 = (PhotoTileView)localView1;
                localPhotoTileView1.e(65536);
                localPhotoTileView1.a(localipf);
                if (localCursor1.isNull(10))
                {
                  i28 = 0;
                  if (i28 <= 0) {
                    break label2382;
                  }
                  localPhotoTileView1.b(Integer.valueOf(i28));
                  if (!localCursor1.isNull(11)) {
                    break label2391;
                  }
                  localInteger = null;
                  localPhotoTileView1.a(localInteger);
                  localPhotoTileView1.a(false);
                  l1 = localCursor1.getLong(15);
                  l2 = localCursor1.getLong(14);
                  if (((0x0 & l2) == 0L) && (((0x20000000 & l2) == 0L) || ((0x4000 & l1) == 0L))) {
                    break label2408;
                  }
                  bool4 = true;
                  a(localCursor1.getPosition(), J);
                  localjpu1 = (jpu)this.t.b.a(new jpy(J.b), new jpw(localipf));
                  if (localjpu1 != null) {
                    break label2581;
                  }
                  arrayOfString1 = new String[1];
                  arrayOfString1[0] = this.f;
                }
              }
            }
          }
          for (jpu localjpu2 = new jpu(jrf.a(0, arrayOfString1), J.b, localipf, l1, l2);; localjpu2 = localjpu1)
          {
            boolean bool5;
            label2232:
            Object localObject;
            if ((0x100 & l1) != 0L)
            {
              bool5 = true;
              if (localjpu2.a != null) {
                break label2420;
              }
              localObject = null;
              label2243:
              localPhotoTileView1.a(localipf, (ioy)localObject, true);
              localPhotoTileView1.a(localjpu2);
              localPhotoTileView1.d = bool5;
              localPhotoTileView1.H = bool4;
              localPhotoTileView1.invalidate();
              if (this.G != null)
              {
                localPhotoTileView1.e = 1;
                localPhotoTileView1.invalidate();
                this.G.a(localPhotoTileView1, localipf);
              }
              if (!jrf.l(J.b)) {
                break label2437;
              }
              localPhotoTileView1.setContentDescription(localCursor1.getString(5));
            }
            for (;;)
            {
              if (this.H != null) {
                this.H.a(localipf, localPhotoTileView1);
              }
              i20 = i16;
              i21 = i15;
              i22 = i27;
              break;
              i28 = localCursor1.getInt(10);
              break label2020;
              label2382:
              localPhotoTileView1.b(null);
              break label2035;
              label2391:
              localInteger = Integer.valueOf(localCursor1.getInt(11));
              break label2050;
              label2408:
              bool4 = false;
              break label2121;
              bool5 = false;
              break label2232;
              label2420:
              localObject = new jpt(localjpu2.a);
              break label2243;
              String str1 = localContext.getResources().getString(aau.nt);
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = J.a;
              arrayOfObject1[1] = Integer.valueOf(J.c);
              localPhotoTileView1.setContentDescription(String.format(str1, arrayOfObject1));
            }
            label2494:
            if (bool2)
            {
              localView1 = localViewGroup1.getChildAt(i10);
              a(localView1, this.d, this.c, true, localipf);
              i20 = 1;
              i21 = i15;
              i22 = i11;
              break label1856;
              if (i16 == 0) {
                localViewGroup1.getChildAt(i10).setVisibility(8);
              }
              if (i18 != 0) {
                break;
              }
              localViewGroup1.getChildAt(i9).setVisibility(4);
              break;
            }
            i18 = 0;
            break label1562;
          }
          i13 = 0;
        }
        localViewGroup1 = localViewGroup3;
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 5;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
  
  public final void onClick(View paramView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cya
 * JD-Core Version:    0.7.0.1
 */